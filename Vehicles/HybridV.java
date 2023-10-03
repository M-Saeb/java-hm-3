package Vehicles;

import Engines.HybridEngine;
import Manufacture.Manufacture;

public class HybridV extends Vehicle {

    public HybridV(Manufacture manufacture, HybridEngine engine) {
        super(manufacture, engine);
    }

    public void ShowCharacteristics(){
        System.out.println("HybridV Vehicel");
        System.out.println("Engine ID: " + engine.id);
        System.out.println("Manufactoring Brand: " + manufacture.getMake());
        System.out.println("Manufactoring Model: " + manufacture.getModel());
        System.out.println("Manufactoring Year: " + manufacture.getYear());
        System.out.println("Manufactoring Color: " + manufacture.getColor());
        System.out.println("Manufactoring registration number: " + manufacture.getRegistration_number());
        System.out.println();        
    };
}
