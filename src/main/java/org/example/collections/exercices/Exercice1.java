package org.example.collections.exercices;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class Exercice1 {

    public static ArrayList <Integer> tab = new ArrayList<>();

    public static void main() {
        tab.add(2);
        tab.add(5);
        tab.add(214);
        tab.add(9);
        tab.add(15);
        tab.add(-55);
        tab.add(-66);
        tab.add(-3);

        System.out.println("Première solution : ");
        System.out.println(tab);
        System.out.println("Deuxième solution : ");
        for (int i = 0; i < tab.size(); i++) {
            System.out.println(tab.get(i));
        }
        System.out.println("troisième solution : ");
        Iterator iter = tab.iterator();
        while (iter.hasNext()){
            System.out.println("Iterator : "+iter.next());
        }
        System.out.println("Quatrième solution : ");
        ListIterator i = tab.listIterator();
        while(i.hasNext()){
            System.out.println("nombre : "+i.next());
        }
        System.out.println();
        System.out.println("Affichage en sens inverse");
        System.out.println();
        System.out.println("Première solution : ");
        System.out.println();
        while(i.hasPrevious()){
            System.out.println("nombre sens inverse : "+i.previous());
        }
        System.out.println();
        System.out.println("Deuxième solution : ");
        Collections.reverse(tab);
        System.out.println();
        System.out.println(tab);
        System.out.println();
        System.out.println("Affichage des éléments de rang pair");
        System.out.println();
        System.out.println("Les nombres pairs de tab sont : ");
        System.out.println("Première solution : ");
        for (Integer k: tab){
            if (k % 2 == 0) {
                System.out.println("le nombre pair est : "+k);
            }
        }
        System.out.println();
        System.out.println("Les nombres pairs de tab sont : ");
        System.out.println("Deuxième solution : ");
        for (Integer l: tab) {
            if (l % 2 == 0) {
                System.out.println("le nombre pair est : "+l);
            }
        }
        System.out.println();
        System.out.println("Remise à zéro des valeurs négatives");
        System.out.println();
        System.out.println("Première solution : ");
        for (Integer l: tab) {
            System.out.println(l = l < 0 ? 0 : l);
    }
        System.out.println();
        System.out.println("Deuxième solution : ");
        for (Integer l: tab) {
                System.out.println(Math.max(0,l));
        }
    }
}
