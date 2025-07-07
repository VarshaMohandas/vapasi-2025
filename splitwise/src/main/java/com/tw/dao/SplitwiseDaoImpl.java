package com.tw.dao;

import com.tw.bean.SplitwiseBean;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
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

    public Map<String, Map<String, Double>> createBalanceSheet(List<SplitwiseBean> splitwiseList) {
        try {
            Map<String, Map<String, Double>> balances = new HashMap<>();
            for (SplitwiseBean sb : splitwiseList) {
                double moneyAfterSplit = Math.round(sb.getMoneySpent() / (sb.getAmountSplitBy().size() + 1));
                for (String splitBy : sb.getAmountSplitBy()) {
                    balances.computeIfAbsent(sb.getName(), _ -> new HashMap<>())
                            .merge(splitBy, moneyAfterSplit, Double::sum);
                }

            }
            return balances;
        } catch (Exception e) {
            logger.log(Level.INFO, e.getMessage(), e);
            return null;
        }

    }

    public boolean showExpenses(Map<String, Map<String, Double>> balances) {
        try {
            System.out.println("----- Expenses -----");
            for (Map.Entry<String, Map<String, Double>> paidBy : balances.entrySet()) {
                String paidByUser = paidBy.getKey();
                for (Map.Entry<String, Double> splitByEntry : paidBy.getValue().entrySet()) {
                    String debtor = splitByEntry.getKey();
                    double amountToBePaid = splitByEntry.getValue();

                    System.out.println(debtor + " pays " + paidByUser + " " + Math.round(amountToBePaid));
                }
            }
            System.out.println("------------------------");
            return true;
        } catch (Exception e) {
            logger.log(Level.INFO, e.getMessage(), e);
            return false;
        }

    }


}
