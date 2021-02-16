package com.creationalpatterns.factory;

public abstract class Car {

    private CarType model;

    public Car(CarType model) {
        this.model = model;
        this.arrangeParts();
    }

    private void arrangeParts(){
        // Do one time processing here
    }

    // Do subclass level processing in this method
    protected abstract void construct();

    public CarType getModel() {
        return model;
    }

    public void setModel(CarType model) {
        this.model = model;
    }
}
