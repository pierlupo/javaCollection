package org.example.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DemoException {

    public static void main() {
        System.out.println("****** division ******");
        Scanner scanner = new Scanner(System.in);

        try{
            System.out.println("Donner moi un nombre : ");
            Integer valeur = scanner.nextInt();
            System.out.println("Donner moi un diviseur : ");
            Integer diviseur = scanner.nextInt();
            Double resultat = (double) (valeur/diviseur);
            System.out.println("résultat : " + resultat);
        }catch (ArithmeticException e){ // "on pourrait faire :catch (ArithmeticException | InputMismatchException e)"
            //e.printStackTrace();
            System.out.println("C'est une exception de type ArithmeticException , désolé, recommencer s.v.p.");
            DemoException.main();
        }catch (InputMismatchException e) {
            //e.printStackTrace();
            System.out.println("C'est une exception de type InputMismatchException, désolé, recommencer s.v.p.");
            DemoException.main();
        }catch (Exception e) {
            e.printStackTrace();
            DemoException.main();
        }
    }
}

