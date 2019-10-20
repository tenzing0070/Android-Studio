package com.example.emicalculator;


    class emicalculator {


        private Double emi;

        emicalculator(Double principle, Double rate, Double years) {

            emi = (principle*rate*Math.pow(1+rate, years)) / (Math.pow(1+rate, years) - 1);

        }

        Double getEmi() {
            return emi;
        }

    }

