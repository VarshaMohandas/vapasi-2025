package com.tw.bean;

import java.util.List;

public class SplitwiseBean {

    private final String name;
    private final double moneySpent;
    private final String expenseDescription;
    private final List<String> amountSplitBy;

    public SplitwiseBean(String name, double moneySpent, String expenseDescription, List<String> amountSplitBy) {
        this.name = name;
        this.moneySpent = moneySpent;
        this.expenseDescription = expenseDescription;
        this.amountSplitBy = amountSplitBy;
    }


    @Override
    public String toString() {
        return "SplitwiseBean{" +
                "name='" + name + '\'' +
                ", moneySpent=" + moneySpent +
                ", expenseDescription='" + expenseDescription + '\'' +
                ", amountSplitBy=" + amountSplitBy +
                '}';
    }


    public String getName() {
        return name;
    }

    public double getMoneySpent() {
        return moneySpent;
    }

    public List<String> getAmountSplitBy() {
        return amountSplitBy;
    }

}
