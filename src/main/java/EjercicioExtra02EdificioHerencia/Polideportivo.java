/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioExtra02EdificioHerencia;

/**
 *Clase Polideportivo con su nombre y tipo de instalación que puede ser Techado o
Abierto, esta clase implementará los dos métodos abstractos y los atributos del padre
 * @author Julian
 */
public class Polideportivo extends Edificio {
   
   
   protected String nombre;
   protected boolean techado;

   public Polideportivo() {
   }

   public Polideportivo(String nombre, boolean techado, double ancho, double alto, double largo) {
      super(ancho, alto, largo);
      this.nombre = nombre;
      this.techado = techado;
   }

   

   public String getNombre() {
      return nombre;
   }

   public void setNombre(String nombre) {
      this.nombre = nombre;
   }

   public boolean isTechado() {
      return techado;
   }

   public void setTechado(boolean techado) {
      this.techado = techado;
   }

   
   public Polideportivo crearPolideportivo(){
      Polideportivo poli1 = new Polideportivo();
      System.out.println("Ingrese el nombre del polideportivo");
      nombre = keyboard.next();
      System.out.println("El polideportivo es techado o abierto?");
      String respuesta = keyboard.next();
      if (respuesta.equalsIgnoreCase("techado")) {
         techado = true;
      }else{
         techado = false;
      }
      
      System.out.println("Indique el ancho del polideportivo:");
      ancho = keyboard.nextDouble();
      System.out.println("Indique el alto del polideportivo:");
      alto = keyboard.nextDouble();
      System.out.println("Indique el largo del polideportivo:");
      largo = keyboard.nextDouble();
      
      calcularSuperficie();
      calcularVolumen();
      
      if (techado) {
         System.out.println(" El polideportivo es techado.");
      }else{
         System.out.println("El polideportivo es abierto.");
      }
      
            return poli1; 
      
   }
   
   @Override
   public void calcularSuperficie() {
     System.out.println("La superficie es: " + (ancho * largo));
   }

   @Override
   public void calcularVolumen() {
       System.out.println("El volumen es: " + (ancho * largo * alto));
   }
   
   
}
