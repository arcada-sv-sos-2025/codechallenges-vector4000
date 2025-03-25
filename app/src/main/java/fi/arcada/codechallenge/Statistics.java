package fi.arcada.codechallenge;

import java.util.ArrayList;

public class Statistics {
    public static double calcMean(ArrayList<Double> values) {



        double add = 0;


        for (int i = 0; i < values.size(); i++) {


            add += values.get(i);


        }


        return add / values.size();


    }
}
