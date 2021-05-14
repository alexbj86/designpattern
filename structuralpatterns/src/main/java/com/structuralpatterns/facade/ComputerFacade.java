package com.structuralpatterns.facade;

public class ComputerFacade {

    public Chassis createComputer() {
        Motherboard motherboard = new Motherboard();
        motherboard.add(new Cpu());
        motherboard.add(new Ram());
        motherboard.add(new Videoboard());
        Chassis chassis = new Chassis();
        chassis.add(motherboard);
        chassis.connection(new Monitor());

        return chassis;
    }
}
