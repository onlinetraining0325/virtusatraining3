package com.java.ex;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CheckedEx {

    public void show(String strDate) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(strDate);
        System.out.println("Date : "+date);
    }
    public static void main(String[] args) {
        String strDate = "2025-12-31";
        CheckedEx checkedEx = new CheckedEx();
        try {
            checkedEx.show(strDate);
        } catch (ParseException e) {
          System.err.println(e.getMessage());
        }
    }
}
