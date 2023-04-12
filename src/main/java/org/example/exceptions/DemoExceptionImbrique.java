package org.example.exceptions;

public class DemoExceptionImbrique {

    public static void main() {

        try{

            try{
                int num = Integer.parseInt("9");
                System.out.println(num);
            }catch(NumberFormatException e){
                System.out.println("INVALID FORMAT NUMBER");
            }
            try{
                int[] a = new int[5];
                a[0] = 5;
                System.out.println(a[19]);
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Array out of limits");
            }

            int a =0;
            int b = 2;
            int c = b/a;

        }catch(Exception e){

            System.out.println("Exception globale");
        }
    }


    public static void main2() {
        try{
            int[] a = new int[5];
            a[0] = 5;
            System.out.println(a[19]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array out of limits");
        }catch(Exception e){

            System.out.println("Exception globale");
        }finally {
            System.out.println(" Fin du match ");
        }
    }
}


