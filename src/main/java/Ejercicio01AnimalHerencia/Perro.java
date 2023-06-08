/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio01AnimalHerencia;

/**
 *
 * @author Julian
 */
public class Perro extends Animal {

   public Perro(String nombre, String alimento, String raza, int edad) {
      super(nombre, alimento, raza, edad);
   }

   public Perro() {
   }

     
   
   @Override
   public void alimentar() {
      System.out.println("El perro se alimenta de " + alimento); 
   }
   
}
