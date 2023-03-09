package com.stewie;


public class MortgageCalc {
    private final static byte MONTH_IN_YEARS = 12;
    private final static byte PERCENT = 100;

    private int principle;
    private float annualInterest;
    private byte years;

    public MortgageCalc(int principle, float annualInterest, byte years) {
        this.principle = principle;
        this.annualInterest = annualInterest;
        this.years = years;
    }

    public double calculateBalance(short numberOfPaymentsMade) {
        float monthlyInterest = getMonthlyInterest();
        short numberOfPayments = getNumberOfPayments();

        return principle
                * (Math.pow(1 + monthlyInterest, numberOfPayments) - Math.pow(1 + monthlyInterest, numberOfPaymentsMade))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
    }

    public double calculateMortgage() {
        float monthlyInterest = getMonthlyInterest();
        short numberOfPayments = getNumberOfPayments();

        return principle
                * (monthlyInterest * (Math.pow(1 + monthlyInterest, numberOfPayments)))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
    }

    public double[] getRemainingBalances() {
        var balances = new double[getNumberOfPayments()];
        for (short month = 1; month <= balances.length; month++)
            balances[month - 1] = calculateBalance(month);
        return balances;
    }

    private short getNumberOfPayments() {
        return (short) (years * MONTH_IN_YEARS);
    }

    private float getMonthlyInterest() {
        return annualInterest / PERCENT / MONTH_IN_YEARS;
    }
}
