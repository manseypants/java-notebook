package com.personal;

import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
//        String name = "Amigoscode";
//        System.out.println(name.contains("code"));

//        int age = 18;
//        String message = age >= 18 ? "I am an adult" : "I am not an adult";
//        System.out.println(message);

        int[] oldNumbers = new int[3];
        oldNumbers[0] = 0;
        oldNumbers[1] = 1;
        oldNumbers[2] = 2;
        System.out.println(Arrays.toString(oldNumbers));

        int[] newNumbers = {2, 3, 4, 234, 53453};
        System.out.println(Arrays.toString(newNumbers));
        System.out.println(newNumbers.length);

        int numberFour = newNumbers[2];
        int length = newNumbers[newNumbers.length - 1];
        System.out.println(numberFour);
        System.out.println(length);

        int anotherOldNumber = 0;
        anotherOldNumber++;
        System.out.println(anotherOldNumber);

        int[] numbers = {2, 0, 1, 4, 100, 4, 90, 78, 77};
        String[] newName = {"Ryan", "Cara"};

        Arrays.stream(numbers).forEach(System.out::println);
        Arrays.stream(newName).forEach(System.out::println);

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        System.out.println("Enhanced for loop");

        for (int number : numbers) {
            System.out.println(number);
        }

        String[] names = {"Anna", "Ali", "Bob", "Mike"};
        for (String name : names) {
            if (name.startsWith("A")) {
                continue;
            }
            System.out.println(name);
        }

//        int count = 0;
//
//        do {
//            System.out.println("Count = " + count);
//            count++;
//        }
//
//        while (count <= 20);

        //Scanner
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("What is your name?");
//        String userName = scanner.nextLine();
//        System.out.println("Hello " + userName + "!");
//
//        System.out.println("How old are you?");
//        int age = scanner.nextInt();
//        int year = LocalDate.now().minusYears(age).getYear();
//        System.out.println("You were born in " + year);
//
//        if (age < 18) {
//            System.out.println("You are not quite an adult");
//        } else {
//            System.out.println("You are an adult.");
//        }

        //Methods
//        System.out.println("Hello");
//        String brand = "Samsung";
//        System.out.println(brand.toUpperCase());
//        System.out.println(brand.startsWith("S"));
//        System.out.println(brand.endsWith("g"));

        char [] letters = {'A', 'A', 'A', 'B', 'C', 'D', 'D', 'D'};
        int count = countOccurrences(letters, 'A');
        System.out.println(count);
    }

    public static int countOccurrences(char [] letters, char searchLetter) {
        int count = 0;
        for (char letter : letters) {
            if (letter == searchLetter) {
                count++;
            }
        }
        return count;
    }

    Lens lensOne = new Lens("Sony", "85mm", true);
    Lens lensTwo = new Lens("Sony", "30mm", true);
    Lens lensThree = new Lens("Cannon", "24-70mm", false);

    // Classes
     static class Lens {
        String brand;
        String focalLength;
        boolean isPrime;

        Lens(String brand, String focalLength, boolean isPrime) {
            this.brand = brand;
            this.focalLength = focalLength;
            this.isPrime = isPrime;
        }
    }
}
