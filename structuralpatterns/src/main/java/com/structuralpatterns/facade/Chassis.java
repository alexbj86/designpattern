package com.structuralpatterns.facade;

import java.util.ArrayList;

public class Chassis {

    private ArrayList deviceList = new ArrayList();
    private ArrayList connectionList = new ArrayList();

    public void add(Device device) {
        deviceList.add(device);
    }

    public void connection(Device device){
        connectionList.add(device);
    }
}
