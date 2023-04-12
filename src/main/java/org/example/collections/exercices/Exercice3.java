package org.example.collections.exercices;

import java.util.ArrayList;
import java.util.List;

public class Exercice3 {

    public static <ListeTriee> void main(){
        List<String> newList = new ArrayList<>();

        newList.add("Une");
        newList.add("phrase");
        newList.add("avec");
        newList.add("des");
        newList.add("mots");

        ListTriee list = new ListTriee (newList);
        list.affiche();

        list.add("autre");
        list.affiche();

        list.add("encore");
        list.affiche();

        list.add("et");
        list.affiche();

        }
    }
