package com.tw.dao;

import com.tw.bean.SplitwiseBean;
import com.tw.service.SplitwiseService;
import com.tw.service.SplitwiseServiceImpl;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SplitwiseDaoImplTest {

    static SplitwiseService splitService;
    public static List<SplitwiseBean> splitwiseList;
    public final static String FILE_PATH = "src/main/resources/splitwise_input_data.txt";

    @BeforeAll
    static void setUp() {
        SplitwiseDao splitDao = new SplitwiseDaoImpl();
        splitService = new SplitwiseServiceImpl(splitDao);
        splitwiseList = splitService.readInputFromResource(FILE_PATH);
    }

    @Test
    void testReadInputFromResourceSuccess() {
        assertEquals(4, splitService.readInputFromResource(FILE_PATH).size());
    }

    @Test
    void testReadInputFromResourceFailure() {
        assertNull(splitService.readInputFromResource("src/main/resources/splitwise_input_data1.txt"));
    }

    @Test
    void testSplitBillAndPrintSuccess() {
        assertTrue(splitService.splitBillAndPrint(splitwiseList));
    }

    @Test
    void testSplitBillAndPrintFailure() {
        assertFalse(splitService.splitBillAndPrint(null));
    }
}