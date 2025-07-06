package com.tw.service;

import com.tw.bean.SplitwiseBean;
import com.tw.dao.SplitwiseDao;

import java.util.List;

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
    public boolean splitBillAndPrint(List<SplitwiseBean> splitwiseList) {
        return splitDao.splitBillAndPrint(splitwiseList);
    }
}
