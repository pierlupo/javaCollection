package org.example.designPattern.bridge;

public class ConcreteConstruction implements Construction{



    @Override
    public void constructionWalls() {
        System.out.println("murs en béton");

    }

    @Override
    public void constructionRoof() {
        System.out.println("toit en bois");

    }

    @Override
    public void constructionFoundation() {
        System.out.println("fondation en béton");
    }
}
