package org.example.designPattern.bridge;

public class WoodenConstruction implements Construction{
    @Override
    public void constructionWalls() {
        System.out.println("murs en bois");
    }

    @Override
    public void constructionRoof() {
        System.out.println("toit en chaume");
    }

    @Override
    public void constructionFoundation() {
        System.out.println("fondation en bois");
    }
}
