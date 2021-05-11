package com.behavioralpatterns.template;

public abstract class House {

    public final void buildHouse() {

        constructBase();
        constructRoof();
        constructWalls();
        constructWindows();
        constructDoors();
        paintHouse();
        decoreteHouse();
    }

    public abstract void decoreteHouse();

    public abstract void paintHouse();

    public abstract void constructDoors();

    public abstract void constructWindows();

    public abstract void constructWalls();

    public final void constructRoof() {
        System.out.println("Roof has been constrcted.");
    }

    public final void constructBase() {
        System.out.println("Base has been constructed");
    }
}
