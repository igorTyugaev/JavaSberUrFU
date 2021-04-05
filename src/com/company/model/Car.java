package com.company.model;

public class Car {
    private String codeCar = null;
    private String regNumberCar = null;
    private int mileageCar = 0;
    private int moreOptionCar = 0;

    public Car() {

    }

    public Car(String codeCar, String regNumberCar, int mileageCar, int moreOptionCar) {
        this.codeCar = codeCar;
        this.regNumberCar = regNumberCar;
        this.mileageCar = mileageCar;
        this.moreOptionCar = moreOptionCar;
    }

    public Car(String codeCar, String regNumberCar, int mileageCar) {
        this.codeCar = codeCar;
        this.regNumberCar = regNumberCar;
        this.mileageCar = mileageCar;
    }

    public String getCodeCar() {
        return codeCar;
    }

    public String getRegNumberCar() {
        return regNumberCar;
    }

    public Integer getMileageCar() {
        return mileageCar;
    }

    public Integer getMoreOptionCar() {
        return moreOptionCar;
    }

    public void setCodeCar(String codeCar) {
        this.codeCar = codeCar;
    }

    public void setRegNumberCar(String regNumberCar) {
        this.regNumberCar = regNumberCar;
    }

    public void setMileageCar(int mileageCar) {
        this.mileageCar = mileageCar;
    }

    public void setMoreOptionCar(int moreOptionCar) {
        this.moreOptionCar = moreOptionCar;
    }
}
