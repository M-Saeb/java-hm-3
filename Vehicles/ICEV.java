package Vehicles;

import Engines.CombustionEngine;
import Manufacture.Manufacture;

public class ICEV extends Vehicle {

    public ICEV(Manufacture manufacture, CombustionEngine engine) {
        super(manufacture, engine);
    }

    public void ShowCharacteristics(){
        System.out.println("ICEV Vehicel");
        System.out.println("Engine ID: " + engine.id);
        System.out.println("Manufactoring Brand: " + manufacture.getMake());
        System.out.println("Manufactoring Model: " + manufacture.getModel());
        System.out.println("Manufactoring Year: " + manufacture.getYear());
        System.out.println("Manufactoring Color: " + manufacture.getColor());
        System.out.println("Manufactoring registration number: " + manufacture.getRegistration_number());
        System.out.println();
    };
}
