package com.singleton.sample;

import java.util.Vector;

public class PopulationManagement {
    private Vector<Citizen> Population = new Vector<Citizen>();
    
    public PopulationManagement(){

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
