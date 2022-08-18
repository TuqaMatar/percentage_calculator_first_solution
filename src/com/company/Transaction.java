package com.company;

import java.util.List;

public class Transaction {
    private String userName ;
    private String operation;

    public Transaction(String userName,  String operation) {
        this.userName = userName;
        this.operation = operation;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getOperation() {
        return operation;
    }

    public void setTransactions(String operation) {
        this.operation = operation;
    }
}