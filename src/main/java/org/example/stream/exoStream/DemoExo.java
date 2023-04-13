package org.example.stream.exoStream;

import org.example.stream.Employee;
import org.example.stream.Product;

import java.util.*;
import java.util.stream.Collectors;

import static org.apache.commons.collections.CollectionUtils.collect;

public class DemoExo {

    public static void main() {

//        System.out.println(" --- Traders ---");
//
//        Trader abdallah = new Trader("Abdallah", "Cambridge");
//        Trader audrey = new Trader("Audrey", "Milan");
//        Trader corentin = new Trader("Corentin", "Cambridge");
//        Trader tristan = new Trader("Tristan", "Cambridge");


//        List<Transaction> transactions = new ArrayList<>(Arrays.asList(
//                new Transaction(abdallah, 2011, 400),
//                new Transaction(abdallah, 2012, 300),
//                new Transaction(audrey, 2012, 1000),
//                new Transaction(audrey, 2011, 400),
//                new Transaction(corentin, 2012, 710),
//                new Transaction(corentin, 2012, 700),
//                new Transaction(tristan, 2012, 950),
//                new Transaction(tristan, 2022, 900)));


//                System.out.println("---1---");
//                System.out.println();
//                transactions.forEach(System.out::println);
//                transactions.stream();
//                System.out.println();
//                List<Transaction> transactionsModifie = transactions.stream()
//                .filter(t->t.getYear() == 2011).sorted(Comparator.comparing(Transaction::getValue)).collect(Collectors.toList());
//                transactionsModifie.forEach(System.out::println);
//                System.out.println();
//                System.out.println();
//                System.out.println("---2---");
//                System.out.println();
//                List<String> cities = transactions.stream()
//                        .map(t->t.getTrader().getCity())
//                        .distinct()
//                        .collect(Collectors.toList());
//                        System.out.println(cities);
//                System.out.println();
//                System.out.println("---3---");
//                System.out.println();
//                List<String> prenoms = Arrays.asList("Abdallah","Audrey","Corentin","Tristan");
//                prenoms.stream().sorted().forEach(System.out::println);
//                List<Transaction> listModifie3 = transactions.stream()
//                System.out.println();
//                System.out.println("---4---");
//                System.out.println();

        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");
        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 400),
                new Transaction(brian, 2012, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950));

        System.out.println();
        System.out.println("Question 1 -");
        //Trouvez toutes les transactions en 2011 et les trier par valeur (petite à élevée): stocker ces données dans une liste de transactions.
        List<Transaction> tr2011 =
                transactions.stream()
                        .filter(transaction -> transaction.getYear() == 2011)
                        .sorted(Comparator.comparing(Transaction::getValue))
                        .collect(Collectors.toList());
        System.out.println(tr2011);
        System.out.println();
        System.out.println("Question 2 -");
        //ville unique où travaillent les traders
        List<String> cities =
                transactions.stream()
                        .map(transaction -> transaction.getTrader().getCity())
                        .distinct()
                        .collect(Collectors.toList());
        System.out.println(cities);
        //version 2 :

        Set<String> citie2s =
                transactions.stream()
                        .map(Transaction::getTrader)
                        .map(Trader::getCity)
                        .collect(Collectors.toSet());

        System.out.println(citie2s);
        System.out.println();
        System.out.println("Question 3 -");
        //traders noms triés par ordre alphabétique
        String traderStr =
                transactions.stream()
                        .map(transaction -> transaction.getTrader().getName())
                        .distinct()
                        .sorted()
                        .reduce("", (n1, n2) -> n1 + n2);
        System.out.println(traderStr);
        System.out.println();
        System.out.println("Question 4 -");
        boolean milanBased =
                transactions.stream()
                        .anyMatch(transaction -> transaction.getTrader()
                                .getCity()
                                .equals("Milan"));
        System.out.println(milanBased);
        System.out.println("Question 5 -");
        System.out.println();
        System.out.println("Version 1 -");

        OptionalInt highestValue =
                transactions.stream()
                        .mapToInt(Transaction::getValue)
                        .max();
        System.out.println(highestValue.getAsInt());
        Integer value = highestValue.getAsInt();

        System.out.println();
        System.out.println("Version 2 -");

        Optional<Integer> highestValue2 =
                transactions.stream()
                        .map(Transaction::getValue)
                        .max(Comparator.comparing(Integer::intValue));
        System.out.println(highestValue2.get());
        System.out.println();
        System.out.println("Version 3 -");

        Optional<Integer> highestValue3 =
                transactions.stream()
                        .map(Transaction::getValue)
                        .reduce(Integer::max);

        System.out.println(highestValue3.get());
        System.out.println();
        System.out.println("Question 6 -");

        List<Trader> traders =
                transactions.stream()
                        .map(transaction -> transaction.getTrader())
                        .filter(trader -> trader.getCity().equals("Cambridge"))
                        .distinct()
                        .sorted(Comparator.comparing(Trader::getName)).collect(Collectors.toList());

        System.out.println(traders);
        System.out.println();
        System.out.println("Question 7 -");

        List<Integer> values =
                transactions.stream()
                        .filter(t -> "Cambridge".equals(t.getTrader().getCity()))
                        .map(Transaction::getValue)
                        .collect(Collectors.toList());

        System.out.println(values);
        System.out.println();
        System.out.println("Question 8 -");

        Optional<Transaction> smallestTransaction =
                transactions.stream()
                        .min(Comparator.comparing(Transaction::getValue));
        System.out.println(smallestTransaction);
    }
}