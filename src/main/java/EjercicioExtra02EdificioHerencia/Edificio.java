/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioExtra02EdificioHerencia;

import java.util.Scanner;

/**
 *Crear una superclase llamada Edificio con los siguientes atributos: ancho, alto y largo. La clase
edificio tendrá como métodos:
• Método calcularSuperficie(): calcula la superficie del edificio.
• Método calcularVolumen(): calcula el volumen del edifico.
 * @author Julian
 */
public abstract class Edificio {
   protected double ancho, alto, largo;
   protected Scanner keyboard = new Scanner(System.in).useDelimiter("\n");
   
   public Edificio(double ancho, double alto, double largo) {
      this.ancho = ancho;
      this.alto = alto;
      this.largo = largo;
   }

   public Edificio() {
   }

   public double getAncho() {
      return ancho;
   }

   public void setAncho(double ancho) {
      this.ancho = ancho;
   }

   public double getAlto() {
      return alto;
   }

   public void setAlto(double alto) {
      this.alto = alto;
   }

   public double getLargo() {
      return largo;
   }

   public void setLargo(double largo) {
      this.largo = largo;
   }
   
   // METODOS
   
   public abstract void calcularSuperficie();
   
   public abstract void calcularVolumen();
   
}
