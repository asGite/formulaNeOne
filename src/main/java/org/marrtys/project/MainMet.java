package org.marrtys.project;

public class MainMet {

    public static void main (String[] args) {

        FormulaParser fpr = new FormulaParser();

        double result = fpr.pars(" 5.6 + 5 - 2");

        System.out.println("" + result);

    }


}
