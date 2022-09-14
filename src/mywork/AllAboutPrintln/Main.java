package mywork.AllAboutPrintln;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String name = "Ilim";
        int age = 23;
        double height = 1.82;

        System.out.printf("Name: %s \nAge: %d \nHeight: %f", name, age, height);

        Scanner sc = new Scanner(System.in);
        System.out.println("What the weather like today>?");
        String weather = sc.nextLine();
        System.out.println("What do you think about book Game of thrones ");
        String book = sc.nextLine();
        System.out.printf("weather today the: %s \nAbout book: %s", weather, book);
        sc.close();
    }



}
