package org.example.collections.tools;

import org.example.collections.entity.RandomPerson;
import org.example.collections.enums.Order;

import java.util.Comparator;



    public class PersonRandomComparator implements Comparator<RandomPerson>{

        Order order;

        @Override
        public int compare(RandomPerson o1, RandomPerson o2) {


            switch (order){
                case FIRSTNAME:
                    return o1.firstName.compareTo(o2.firstName);
                case LASTNAME:
                    return o1.lastName.compareTo(o2.lastName);
                case CITY:
                    return o1.city.compareTo(o2.city);
                default:
                    return o1.firstName.compareTo(o2.lastName);
            }

        }

        public void setOrder(Order order) {this.order = order;}

    }
