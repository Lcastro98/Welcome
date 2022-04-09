package com.sofka.welcome;

import java.util.Scanner;

public class WelcomeMessage {
    public static void main(String[] args) {
        Scanner capture = new Scanner(System.in);
        System.out.println("Nombre de usuario: ");
        String user = capture.nextLine();
        System.out.println("Celular: ");
        String phone = capture.nextLine();
        System.out.println("Edad: ");
        int age = capture.nextInt();
        System.out.println("Bienvenido señor " + user + ", es un placer para nosotros contar con una persona de "
                        + age + " años.\nPróximamente nos comunicaremos con usted al numero " + phone + ".\nFeliz día.");
    }
}
