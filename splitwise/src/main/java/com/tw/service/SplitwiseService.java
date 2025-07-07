package com.tw.service;

import com.tw.bean.SplitwiseBean;

import java.util.List;
import java.util.Map;

public interface SplitwiseService {

    List<SplitwiseBean> readInputFromResource(String filePath);

    Map<String, Map<String, Double>> createBalanceSheet(List<SplitwiseBean> splitwiseList);

    boolean showExpenses(Map<String, Map<String, Double>> balances);


}
