/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio01AnimalHerencia;

/**
 *
 * @author Julian
 */
public class MainEjercicio01AnimalHerencia {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      Animal perro1 = new Perro("Spike", "Concentrado", "Bull terrier", 15);
      perro1.alimentar();
      
      Animal gato1 = new Gato("Michico", "Salmon", "Siames", 12);
      gato1.alimentar();
      
      Animal caballo1 = new Caballo("Spirit", "Heno", "Mustang", 10);
      caballo1.alimentar();
   }
   
}
