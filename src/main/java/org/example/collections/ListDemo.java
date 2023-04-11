package org.example.collections;

import org.example.collections.entity.RandomPerson;
import org.example.collections.enums.Order;
import org.example.collections.tools.PersonRandomComparator;

import static org.example.collections.entity.RandomPerson.affichePerson;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.Collections;
import java.util.List;

public class ListDemo {

    public static List<RandomPerson> listeDemo = new ArrayList<>();
    public static List<RandomPerson> listeDemo2 = new ArrayList<>();
    public static List<RandomPerson> listeDemo3 = new ArrayList<>();

    public static void main() {

        List<String> liste = new ArrayList<>();
        liste.add("Michel");
        liste.add("Paul");
        liste.add("Jacques");

        String prenom1 = liste.get(0);
        String prenom2 = liste.get(1);

        Object obj = liste.get(0);
        System.out.println(liste);
        System.out.println(liste.get(0));

        List<Integer> liste1 =new ArrayList<>(Arrays.asList(2,3,5,8,912,454,8));
        List<Integer> liste2 =new ArrayList<>(Arrays.asList(9,6,7,8,564,879,3));
        Integer min = Collections.min(liste1);

        System.out.println("Le nombre minimum de la liste est : " +min);

//        for (int i = 0; i < liste1.size(); i++) {
//            System.out.println(liste.get(i));
//        }

//        for (Integer i: liste1){
//            System.out.println("le nombre est : "+i);
//        }

        liste1.addAll(liste2);
        liste1.add(5);

//        for (Integer i: liste2){
//            System.out.println("le nombre est : "+i);
//        }

        RandomPerson.addData(5, listeDemo);
        RandomPerson.affichePerson(listeDemo);

        RandomPerson randomPerson = new RandomPerson();
        randomPerson.firstName = "Michel";
        listeDemo.add(2, randomPerson);

        RandomPerson randomPerson2 = new RandomPerson();
        randomPerson2.firstName = "Michel";
        listeDemo.add(listeDemo.indexOf(randomPerson), randomPerson2);

        listeDemo.remove(randomPerson);
        listeDemo.remove(2);


        RandomPerson.addData(7, listeDemo2);
        RandomPerson.affichePerson(listeDemo2);
        listeDemo.addAll(listeDemo2);

        System.out.println(" ----contain---- ");


        System.out.println("Est-ce que la liste listeDemo contient listeDemo2?" + listeDemo.containsAll(listeDemo2));

        listeDemo.remove(9);

        System.out.println("Est-ce que la liste listeDemo contient listeDemo2?" + listeDemo.containsAll(listeDemo2));

        System.out.println(" ----sous-liste---- ");

        System.out.println("sous-liste de la liste demo de l'index 3 à 9");

        listeDemo3 = listeDemo.subList(3,9);

        affichePerson(listeDemo3);

        triOrderRandomPerson(Order.FIRSTNAME, listeDemo);
       // System.out.println("liste ordonnée avec les 'enum' : "+listeDemo);
    }

    public static void triOrderRandomPerson(Order order, List<RandomPerson> liste) {
        PersonRandomComparator personRandomComparator = new PersonRandomComparator();
        personRandomComparator.setOrder(order);
        Collections.sort(liste, personRandomComparator);
    }




}
