/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio01AnimalHerencia;

/**
 *
 * @author Julian
 */
public class Caballo extends Animal {

   public Caballo(String nombre, String alimento, String raza, int edad) {
      super(nombre, alimento, raza, edad);
   }

   public Caballo() {
   }
   
   @Override
   public void alimentar(){
      System.out.println("El caballo se alimenta de " + alimento);
   }
   
   
}
