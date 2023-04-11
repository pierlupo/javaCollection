package org.example.collections;

import org.example.collections.entity.RandomPerson;

import java.util.LinkedList;

public class LinkedListDemo {


    public static LinkedList<RandomPerson> linkedList = new LinkedList<>();

    public static void main() {
        System.out.println("Demo liste chaînée");

        RandomPerson.addData(5, linkedList);
        RandomPerson.affichePerson(linkedList);

        RandomPerson randomPerson = new RandomPerson();
        randomPerson.firstName = "Michel";

        linkedList.addFirst(randomPerson);

        //linkedList.removeFirst();
        //RandomPerson.affichePerson(linkedList);

        RandomPerson randomPerson2 = new RandomPerson();
        randomPerson = randomPerson2;

        linkedList.addFirst(randomPerson2);
        RandomPerson.affichePerson(linkedList);

        linkedList.removeFirstOccurrence(randomPerson2);
        System.out.println("Le premier est : "+ linkedList.getFirst());





    }
}
