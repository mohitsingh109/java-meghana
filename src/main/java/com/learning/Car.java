package com.learning;

public class Car {

    private String name;

    public Car(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        Car car = (Car) o;
        // this == car1
        // o == car2
        if(this.name.equals(car.getName())) {
            return true;
        } else {
            return false;
        }
    }

}
