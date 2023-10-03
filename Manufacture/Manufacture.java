package Manufacture;
public class Manufacture {
    private String _make;
    private String _model;
    private int _year;
    private String _color;
    private String _registrationNumber;

    public Manufacture(
        String make,
        String model,
        int year,
        String color,
        String registrationNumber
    ){
        this.setMake(make);;
        this.setModel(model);
        this.setYear(year);
        this.setColor(color);
        this.setRegistrationNumber(registrationNumber);
    }

    public void setMake(String value){
        this._make = value;
    }

    public void setModel(String value){
        this._model = value;
    }

    public void setYear(int value){
        this._year = value;
    }

    public void setColor(String value){
        this._color = value;
    }

    public void setRegistrationNumber(String value){
        this._registrationNumber = value;
    }

    public String getMake(){
        return this._make;
    }

    public String getModel(){
        return this._model;
    }

    public int getYear(){
        return this._year;
    }

    public String getColor(){
        return this._color;
    }

    public String getRegistration_number(){
        return this._registrationNumber;
    }

}
