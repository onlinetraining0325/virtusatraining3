package com.java.ex;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {

    public void show(String strDate) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(strDate);
        System.out.println("Date : "+date);
    }
    public static void main(String[] args) {
        String strDate = "2026/11/14";
        DateExample dateExample = new DateExample();
        try {
            dateExample.show(strDate);
        } catch (ParseException e) {
           System.err.println(e.getMessage());
        }
    }
}
