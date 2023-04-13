package org.example.designPattern.bridge;

public class DemoBridge {

    public static void main() {

        WoodenConstruction woodenConstruction = new WoodenConstruction();
        WoodenHouse woodenHouse = new WoodenHouse(woodenConstruction);
        woodenHouse.build();

        ConcreteConstruction concreteConstruction = new ConcreteConstruction();
        ConcreteHouse concreteHouse = new ConcreteHouse(concreteConstruction);
        concreteHouse.build();

    }
}
