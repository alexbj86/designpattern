package com.creationalpatterns.factory;

/**
 * Pattern creazionale: viene utilizzato per creare oggetti senza conoscerne i dettagli ma delegando una class Factory
 * che in base alle informazioni ricevute, restituisce l'oggetto.
 */

public class TestFactoryPattern {

    public static void main(String[] args) {
        System.out.println(CarFactory.buildCar(CarType.SMALL));
        System.out.println(CarFactory.buildCar(CarType.SEDAN));
        System.out.println(CarFactory.buildCar(CarType.LUXURY));
    }
}
