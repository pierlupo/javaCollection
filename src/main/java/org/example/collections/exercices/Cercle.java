package org.example.collections.exercices;

import java.util.Comparator;

public class Cercle {
    private Integer  x, y;
    Double rayon;
    public Cercle(Integer x, Integer y, Double rayon) {
        this.x = x;
        this.y = y;
        this.rayon = rayon;
    }

    public void affiche(){
        System.out.println("Coordonnées : "+ x +","+ y +"; rayon : " +rayon);
    }
    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public Double getRayon() {
        return rayon;
    }

    public void setRayon(double rayon) {
        this.rayon = rayon;
    }


    @Override
    public String toString() {
        return "Coordonnées{" +
                "x=" + x +
                ", y=" + y +
                ", rayon=" + rayon +
                '}';
    }

    public static Comparator<Cercle> ComparatorRayon = new Comparator<Cercle>() {
        @Override
        public int compare(Cercle o1, Cercle o2) {
            return o1.rayon.compareTo(o2.rayon);
        }
    };

    public static Comparator<Cercle> ComparatorAbscisse = new Comparator<Cercle>() {
        @Override
        public int compare(Cercle o1, Cercle o2) {
            return o1.getX().compareTo(o2.getX());
        }
    };
}
