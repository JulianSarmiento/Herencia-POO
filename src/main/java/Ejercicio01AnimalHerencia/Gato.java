/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio01AnimalHerencia;

/**
 *
 * @author Julian
 */
public class Gato extends Animal{

   public Gato(String nombre, String alimento, String raza, int edad) {
      super(nombre, alimento, raza, edad);
   }

   public Gato() {
   }
   
   
   @Override
   public void alimentar(){
      System.out.println("El gato se alimenta de " + alimento);
   }
}
