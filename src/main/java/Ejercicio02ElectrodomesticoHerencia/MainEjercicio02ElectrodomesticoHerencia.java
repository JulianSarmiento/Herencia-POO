/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio02ElectrodomesticoHerencia;

/**
 *
 * @author Julian
 * 
 * 
 */


import java.util.Scanner;

public class MainEjercicio02ElectrodomesticoHerencia {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
     Scanner leer = new Scanner(System.in).useDelimiter("\n");

        Lavadora lav = new Lavadora();
        Televisor tele = new Televisor();
        

        String op;
     
        do {
            System.out.println("-----MENU-------");
        System.out.println("Ingrese si quiere comprar un televisor o una lavadora: ");

        System.out.println("A - Lavadora");
        System.out.println("B - Televisor");
         System.out.println("C - Salir");
             op = leer.next().toUpperCase();

            switch (op) {

                case "A":
                    lav.crearLavadora();
                    lav.precioFinal();
                    System.out.println("El precio de su lavadora es: " + lav.getPrecio());
                    break;
                case "B":

                    tele.crearTelevidor();
                    tele.precioFinal();
                    System.out.println("El precio de su televisor es: " + tele.getPrecio());
                    break;
             case "C":
                 System.out.println("chauuuuuu....");
                  break;

                default:
                    System.out.println("Ingrese opoción válida");
            }
           

        } while (!(op.equalsIgnoreCase("C")));

    }
   }
   
