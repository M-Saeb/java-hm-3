import Engines.CombustionEngine;
import Engines.ElectricEngine;
import Engines.HybridEngine;

import Manufacture.Manufacture;

import Vehicles.Vehicle;
import Vehicles.BEV;
import Vehicles.HybridV;
import Vehicles.ICEV;

public class Main{
    public static void main(String args[]){
        Vehicle vehicles[] = {
            new BEV(
                new Manufacture(
                "brand 01",
                "model AA",
                2010,
                "blue",
                "111"
                ),
                new ElectricEngine("ID-001")
            ),
            new HybridV(
                new Manufacture(
                "brand 02",
                "model BB",
                2020,
                "red",
                "222"
                ),
                new HybridEngine("ID-002")
            ),
            new ICEV(
                new Manufacture(
                "brand 03",
                "model CC",
                2023,
                "black",
                "333"
                ),
                new CombustionEngine("ID-003")
            ),
        };
        for (Vehicle veh: vehicles){
            veh.ShowCharacteristics();
        }
    }
}