package org.example.collections;

import java.util.*;

public class IteratorDemo {

    public static void main() {

        List<Integer> liste = new ArrayList<>();

        liste.add(2);
        liste.add(5);
        liste.add(214);
        liste.add(9);
        liste.add(15);

        System.out.println();
        System.out.println(" ---- iterator ---- ");
        System.out.println();

        Iterator iter = liste.iterator();

        while (iter.hasNext()){
            System.out.println("Iterator : "+iter.next());
        }
        System.out.println();
        System.out.println(" ---- ListeIterator ---- ");
        System.out.println();

        ListIterator i = liste.listIterator();

        while(i.hasNext()){
            System.out.println("nombre : "+i.next());
        }
        System.out.println();
        while(i.hasPrevious()){
            System.out.println("nombre sens inverse : "+i.previous());
        }
        System.out.println();
        System.out.println(" ---- LinkedList ---- ");
        System.out.println();

//        LinkedListDemo listeChainee = new LinkedListDemo();
//        listeChainee.add("element 1");
//        listeChainee.add("element 2");
//        listeChainee.add("element 3");
//
//        Iterator iterator = listeChainee.iterator();
//
//        while (iterator.hasNext()) {
//            System.out.println("objet = "+iterator.next());
//        }
    }



}
