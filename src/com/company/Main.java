package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kundun atyn jazynyz!  : ");
        Days days = Days.valueOf(scanner.nextLine());
        switch (days){
            case DYISHOMBY -> System.out.println("Duishombu kunu 9 ga kurska baram.");
            case SHEISHEMBI -> System.out.println("Sheishembe kunu soft skill jana java praktika bolot.");
            case SHARSHEMBI -> System.out.println("Sharshembi kunu kechinde kino korom.");
            case BEISHEMBI -> System.out.println("Beishembi kunu praktika jana english sabagyna baram.");
            case JUMA -> System.out.println("Erte turush kerek.");
            case ISHEMBI -> System.out.println("Ishembi kunu futbol bar.");
            case JEKSHEMBI -> System.out.println("Jekshembi kunu generalnyi uborka.");
        }

    }
}
