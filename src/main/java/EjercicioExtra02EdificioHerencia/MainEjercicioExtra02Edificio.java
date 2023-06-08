/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjercicioExtra02EdificioHerencia;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * en el main vamos a crear un ArrayList de tipo Edificio. El ArrayList debe contener dos polideportivos y dos edificios de oficinas. Luego, recorrer este array y
 * ejecutar los métodos calcularSuperficie y calcularVolumen en cada Edificio. Se deberá mostrar la superficie y el volumen de cada edificio.
 *
 * @author Julian
 */
public class MainEjercicioExtra02Edificio {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      List<Edificio> edificios = new ArrayList();
      int opcion = 0, cantP = 0, cantO = 0;

      Scanner keyboard = new Scanner(System.in).useDelimiter("\n");

      do {
         System.out.println("---- MENU----");
         System.out.println("Que desea crear?");
         System.out.println("1- Polideportivo");
         System.out.println("2- Edificio de oficina");
         System.out.println("3 - Salir");
         opcion = keyboard.nextInt();

         switch (opcion) {
            case 1:
               edificios.add(new Polideportivo().crearPolideportivo());
               cantP++;
               break;

            case 2:
               edificios.add(new Edificiodeoficina().crearEdificioDeOficina());
               cantO++;
               break;

            case 3:
               System.out.println("Saliendo...");
               break;
            default:
               System.out.println("Opcion no válida.");

         }
         System.out.println("---------------");
         System.out.println("Existen " + cantP + " polideportivos y " + cantO + " de edificios de oficinas.");
         System.out.println("---------------");

      } while (opcion != 3);

//      edificios.add(new Polideportivo("Poli1", true, 50, 15, 20));
//      edificios.add(new Polideportivo("Poli2", false, 150, 60, 70));
//
//      edificios.add(new Edificiodeoficina(10, 5, 10, 50, 150, 60));
//
//      edificios.add(new Edificiodeoficina(20, 10, 15, 70, 200, 40));
//      for (Edificio aux : edificios) {
//         aux.calcularSuperficie();
//         aux.calcularVolumen();
//
//         if (aux instanceof Polideportivo) {
//            if (((Polideportivo) aux).isTechado()) {
//               System.out.println("Es techado.");
//            } else {
//               System.out.println("Es abierto.");
//            }
//         } else {
//            ((Edificiodeoficina) aux).cantPersonas();
//         }
//
//      }
   }

}
