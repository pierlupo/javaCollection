package org.example.collections.exercices;

import org.example.collections.entity.RandomPerson;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercice2 {


    public static List<Cercle> cercles = new ArrayList<>();

    public static void main() {
        List<Cercle> cercles = new ArrayList<>();

        cercles.add(new Cercle(5, 3, 2.5));
        cercles.add(new Cercle(1, 7, 2.9));
        cercles.add(new Cercle(1, 7, 5.8));
        cercles.add(new Cercle(15, 10, 3.5));
        cercles.add(new Cercle(-3, 1, 2.4));

        for (Cercle c: cercles) {
            System.out.println(c);
        }

        Collections.sort(cercles, Cercle.ComparatorAbscisse);
        System.out.println();
        System.out.println("Tableau trié selon absciss");
        System.out.println();

        for (Cercle c: cercles) {
            System.out.println(c);
        }


        Collections.sort(cercles, Cercle.ComparatorRayon);
        System.out.println();
        System.out.println("Tableau trié selon rayon");
        System.out.println();

        for (Cercle c: cercles) {
            System.out.println(c);
        }

    }

}
