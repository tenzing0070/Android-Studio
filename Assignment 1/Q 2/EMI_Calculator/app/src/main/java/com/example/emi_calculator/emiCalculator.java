package com.example.emi_calculator;

public class emiCalculator {

    private  Double emi;
    emiCalculator(Double principle, Double rate, Double years){

        emi = (principle*rate*Math.pow(1+rate, years)) / (Math.pow(1+rate, years) - 1);
    }

    Double getEmi(){

        return emi;
    }
}
