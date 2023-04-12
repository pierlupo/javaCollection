package org.example.collections.exercices;

import org.example.collections.entity.RandomPerson;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListTriee {

    public static List<String> listeTriee = new ArrayList<>();

    public ListTriee(List<String> listeTriee) {
        Collections.sort(listeTriee);
        this.listeTriee= listeTriee;
    }

    public ListTriee() {
    }

    public static void affiche()
    {
        for (String s: listeTriee){
            System.out.println(s);
        }
    }

    public static void add(String s)
    {
        ListIterator<String> it = listeTriee.listIterator();
        boolean check= false;


        while(it.hasNext()){
            String value = it.next();
            int comparaison = s.compareTo(value);
            if(comparaison<0){
                listeTriee.add(it.nextIndex()-1,s);
                check=true;
                break;
            }
        }
        if(!check)
        {
            listeTriee.add(s);
        }

    }


}
