package com.singleton.sample;

import java.util.Vector;

public class PopulationManagement {
    private Vector<Citizen> Population = new Vector<Citizen>();
    private static PopulationManagement instance;

    private PopulationManagement(){}

    public static PopulationManagement getInstance(){
        if ( instance == null ) instance = new PopulationManagement();
        return instance;
    }

    public void addNewCitizen(Citizen newCitizen) {
        Population.add(newCitizen);
    }

    public void showPopulation() {
        System.out.println("Population: " + Population.size());
        for(Citizen citizen: Population){
            System.out.println(citizen.getData());
        }
    }
}
