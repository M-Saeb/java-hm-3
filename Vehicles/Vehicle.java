package Vehicles;
abstract public class Vehicle {

    Manufacture.Manufacture manufacture;
    Engines.Engine engine;

    abstract public void ShowCharacteristics();

    public Vehicle(
        Manufacture.Manufacture manufacture,
        Engines.Engine engine
    ){
        this.manufacture = manufacture;
        this.engine = engine;
    }
}
