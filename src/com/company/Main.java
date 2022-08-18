package com.company;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        TransactionExtractor transactionExtractor =
                new TransactionExtractor("./res/files/trackFile2015-03-08.log");
        List<Transaction> transactions = transactionExtractor.getTransactionList();
        PercentageCalculator percentageCalculator = new PercentageCalculator(transactions);

        percentageCalculator.showTopPercentage(2); //gets the top two most used operation and their percentages
        
        percentageCalculator.showTopPercentage(3); //gets the top three most used operation and their percentages
    }
}