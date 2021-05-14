package com.structuralpatterns.facade;

import java.util.ArrayList;

public class Motherboard implements Device {

    private ArrayList deviceList = new ArrayList();

    public void add(Device device) {
        deviceList.add(device);
    }
}
