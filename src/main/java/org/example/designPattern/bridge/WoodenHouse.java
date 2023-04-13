package org.example.designPattern.bridge;

public class WoodenHouse extends House{


    public WoodenHouse(Construction construction) {
        super(construction);
    }

    @Override
    public void build() {
        construction.constructionWalls();
        construction.constructionFoundation();
        construction.constructionRoof();

    }
}
