package com.company;

import javax.xml.namespace.QName;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        method(name);
        System.out.println(name.toUpperCase(Locale.ROOT));
        System.out.println(name.trim());
        if (name.equals("a")){
            System.out.println(name.substring(1));
        }else {
            System.out.println("jok");
        }



        }static void method (String...a){


    }
    }
            





////    String names[]={"Bek", "Dastan", "Kanybek"};
//       for (String a:names) {
//          System.out.println(a + " men seni jakwy korom");