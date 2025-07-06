package com.tw.dao;

import com.tw.bean.SplitwiseBean;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SplitwiseDaoImpl implements SplitwiseDao {

    Logger logger = Logger.getLogger(SplitwiseDaoImpl.class.getName());


    @Override
    public List<SplitwiseBean> readInputFromResource(String filePath) {
        List<SplitwiseBean> splitwiseList = null;
        try (Stream<String> lines = Files.lines(Paths.get(filePath))) {
            splitwiseList = lines.map(line -> {
                String[] record = line.split(",", 4);
                String splitByString = record[3].replace("[", "").replace("]", "");
                return new SplitwiseBean(record[0], Double.parseDouble(record[1]), record[2], Arrays.asList(splitByString.split(",")));
            }).collect(Collectors.toList());

        } catch (IOException e) {
            logger.log(Level.INFO, e.getMessage(), e);
        }
        return splitwiseList;
    }

    @Override
    public boolean splitBillAndPrint(List<SplitwiseBean> splitwiseList) {

        try {
            for (SplitwiseBean sb : splitwiseList) {
                double moneyAfterSplit = Math.round(sb.getMoneySpent() / (sb.getAmountSplitBy().size() + 1));
                sb.getAmountSplitBy().forEach((s) -> System.out.println(s + " pays " + sb.getName() + " Rs." + moneyAfterSplit + " For " + sb.getExpenseDescription()));
                System.out.println("----------------------------------");
            }
            return true;
        } catch (Exception e) {
            logger.log(Level.INFO, e.getMessage(), e);
            return false;
        }
    }
}
