package com.tw.service;

import com.tw.bean.SplitwiseBean;
import com.tw.dao.SplitwiseDao;

import java.util.List;
import java.util.Map;

public class SplitwiseServiceImpl implements SplitwiseService {


    SplitwiseDao splitDao;

    public SplitwiseServiceImpl(SplitwiseDao splitDao) {
        this.splitDao = splitDao;
    }

    @Override
    public List<SplitwiseBean> readInputFromResource(String filePath) {
        return splitDao.readInputFromResource(filePath);
    }

    @Override
    public Map<String, Map<String, Double>> createBalanceSheet(List<SplitwiseBean> splitwiseList) {
        return splitDao.createBalanceSheet(splitwiseList);
    }

    @Override
    public boolean showExpenses(Map<String, Map<String, Double>> balances) {
        return splitDao.showExpenses(balances);
    }


}
