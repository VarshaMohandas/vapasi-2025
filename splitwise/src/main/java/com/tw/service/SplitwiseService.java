package com.tw.service;

import com.tw.bean.SplitwiseBean;

import java.util.List;

public interface SplitwiseService {

    List<SplitwiseBean> readInputFromResource(String filePath);

    boolean splitBillAndPrint(List<SplitwiseBean> splitwiseList);


}
