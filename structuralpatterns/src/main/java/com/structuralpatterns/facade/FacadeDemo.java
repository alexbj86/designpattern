package com.structuralpatterns.facade;

/**
 * Pattern strutturale: viene utilizzato per nascondere la complessità del sistema e ridurre la dipendenza dal client.
 */
public class FacadeDemo {

    public static void main(String[] args) {
        Chassis chassis = new ComputerFacade().createComputer();
    }
}
