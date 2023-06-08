/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio01AnimalHerencia;

/**
 *
 * @author Julian
 */
public class Animal {
  // atributos el nombre, alimento, edad y raza del Animal.
   
   //Atributos
   protected String nombre, alimento, raza;
   protected int edad ;
   //constructores

   public Animal(String nombre, String alimento, String raza, int edad) {
      this.nombre = nombre;
      this.alimento = alimento;
      this.raza = raza;
      this.edad = edad;
   }

   public Animal() {
   }
   
   
   //Metodos
   public void alimentar(){
      System.out.println("El animal se alimento se alimenta de: "+ this.alimento);
   }
   
}
