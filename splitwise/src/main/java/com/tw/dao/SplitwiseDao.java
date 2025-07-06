package com.tw.dao;

import com.tw.bean.SplitwiseBean;

import java.util.List;

public interface SplitwiseDao {

    List<SplitwiseBean> readInputFromResource(String filePath);

    boolean splitBillAndPrint(List<SplitwiseBean> splitwiseList);
}
