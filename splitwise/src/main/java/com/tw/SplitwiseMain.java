package com.tw;

import com.tw.dao.SplitwiseDao;
import com.tw.dao.SplitwiseDaoImpl;
import com.tw.service.SplitwiseService;
import com.tw.service.SplitwiseServiceImpl;

public class SplitwiseMain {

    public final static String FILE_PATH = "splitwise/src/main/resources/splitwise_input_data.txt";

    public static void main(String[] args) {

        SplitwiseDao splitDao = new SplitwiseDaoImpl();
        SplitwiseService splitService = new SplitwiseServiceImpl(splitDao);

        splitService.splitBillAndPrint(splitService.readInputFromResource(FILE_PATH));
    }
}
