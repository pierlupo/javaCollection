package org.example.collections.map;

import org.example.collections.entity.Product;
import org.example.collections.entity.User;

import java.util.*;

public class Mapdemo {
    public static void main() {
        Map<Integer, String> map = new HashMap<>();

        map.put(2, "Maison");
        map.put(3, "Chalet");
        map.put(5, "Appartement");
        map.put(8, "Caravane");
        map.put(15, "Immeuble");

        System.out.println("get un élément de la map :  "+map.get(5));

        System.out.println("Itération dans la map pour les clés :");

        for(Integer key: map.keySet()){
            System.out.println("key "+ key);
        }

        System.out.println("Itération dans la map pour récuperer les valeurs et  les clés :");

        for(Map.Entry<Integer, String> entry: map.entrySet()){
            System.out.println("Entry key : "+entry.getKey()+System.getProperty("line.separator" )+"Entry value : "+entry.getValue());
        }
        System.out.println();
        Map<User, Product> userProductMap = new HashMap<>();

        User user = new User();
        user.setFirstName("Bob");
        user.setLastName("De Niro");

        Product product = new Product();

        userProductMap.put(user, product);
        System.out.println("get product by user :"+userProductMap.get(user));

        User user1 = new User("Alain", "Bashung",1234,"alain@gmail.com");
        User user2 = new User("Bernard", "Lavilliers",1234,"bernard@gmail.com");
        User user3 = new User("Serge", "Gainsbourg",1234,"serge@gmail.com");


        List<User> users = new ArrayList<>();

        users.addAll(Arrays.asList(user1,user2,user3));

    List<Product> products;

        Map<Integer, List<Product>> map2 = new HashMap<>();

        for (int i = 0; i < users.size() ; i++) {
            products = new ArrayList<>();
            Product.addProduct(10, products);
            map2.put(users.get(i).getId(), products);
        }
        for(Map.Entry<Integer, List<Product>> entry: map2.entrySet()){
           // System.out.println("Entry key : "+entry.getKey()+System.getProperty("line.separator" )+"Entry value : "+entry.getValue());
        for(Product p : entry.getValue()){
            System.out.println("User id "+" : " +entry.getKey()+System.getProperty("line.separator" )+p);
        }

        }
       // System.out.println("Products : ) "+products);
    }
}
