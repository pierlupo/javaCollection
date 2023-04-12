package org.example.stream;

import java.util.*;

public class Demo1 {

    public static void main() {
        List<String> prenoms = Arrays.asList("Michel","Jacques","Paul","Louis","Michel");

        System.out.println("Filter + Count  : ");
        prenoms.stream()
                .filter(p-> p.startsWith("k"))
                .forEach(System.out::println);
        System.out.println();
        System.out.println("Le nombre de personnes qui commence par un t est de : "+prenoms.stream().filter(p->p.startsWith("t")).count());
        System.out.println();

        System.out.println("Distinct :");
        System.out.println();
        prenoms.stream().distinct().forEach(System.out::println);
        System.out.println();
        System.out.println("Limit :");
        System.out.println();
        prenoms.stream().limit(2).forEach(System.out::println);
        System.out.println();

        System.out.println("Sorted :");
        System.out.println();
        prenoms.stream().sorted().forEach(System.out::println);
        System.out.println();

        System.out.println("Sorted inversé:");
        System.out.println();
        prenoms.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
        System.out.println();


        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee(1, Genre.NONBINAIRE, 176, 3400));
        employeeList.add(new Employee(2, Genre.HOMME, 186, 3300));
        employeeList.add(new Employee(3, Genre.FEMME, 195, 3600));
        employeeList.add(new Employee(4, Genre.FEMME, 178, 3200));
        employeeList.add(new Employee(5, Genre.HOMME, 165, 3700));

        double totalSalaire = employeeList.stream().mapToDouble(e-> e.getSalaire()).sum();
        System.out.println("Le total des salaires est de " + totalSalaire+"€");
        System.out.println();

        Optional<Employee> employee = employeeList.stream().filter(e-> e.getTaille()>=175).findFirst();
        System.out.println("Le premier employé qui fait au moins 175 cm est : " + employee.get());

    }
}
