package org.example.designPattern.bridge;

public class ConcreteHouse extends House{
    public ConcreteHouse(Construction construction) {
        super(construction);
    }

    @Override
    public void build() {
        construction.constructionWalls();
        construction.constructionFoundation();
        construction.constructionRoof();
    }
}
