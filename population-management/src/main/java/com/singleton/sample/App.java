package com.singleton.sample;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        client1();
        client2();
    }
    
    static private void client1() { // Want to add new Citizen
        PopulationManagement pm = PopulationManagement.getInstance();

        System.out.println("\n\rClient 1: want to add add new citizen");
        
        // Adding
        pm.addNewCitizen(new Citizen("Joe", "Biden", "20/11/1942"));
        pm.addNewCitizen(new Citizen("Kamala", "Harris", "20/10/1964"));
        
        // Test from client 1
        pm.showPopulation();
    }

    static private void client2() { // Want to receive population infos
        PopulationManagement pm = PopulationManagement.getInstance();
        System.out.println("\n\rClient 2: Want to receive population infos");
        pm.showPopulation();
    }
    
}
