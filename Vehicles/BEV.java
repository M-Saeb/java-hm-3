package Vehicles;

import Engines.ElectricEngine;
import Manufacture.Manufacture;

public class BEV extends Vehicle {

    public BEV(Manufacture manufacture, ElectricEngine engine){
        super(manufacture, engine);
    }

    public void ShowCharacteristics(){
        System.out.println("BEV Vehicel");
        System.out.println("Engine ID: " + this.engine.id);
        System.out.println("Manufactoring Brand: " + this.manufacture.getMake());
        System.out.println("Manufactoring Model: " + this.manufacture.getModel());
        System.out.println("Manufactoring Year: " + this.manufacture.getYear());
        System.out.println("Manufactoring Color: " + this.manufacture.getColor());
        System.out.println("Manufactoring registration number: " + this.manufacture.getRegistration_number());
        System.out.println();        
    };
}
