/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioExtra02EdificioHerencia;

/**
 *Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de personas
por oficina y número de pisos. Esta clase implementará los dos métodos abstractos y
los atributos del padre.
 * @author Julian
 */
public class Edificiodeoficina extends Edificio{
   protected int numeroDeOficinas, cantidadDePersonasPorOficina, numeroDePisos;
   
   //CONSTRUCTORES HEREDADOS

   public Edificiodeoficina(int numeroDeOficinas, int cantidadDePersonasPorOficina, int numeroDePisos, double ancho, double alto, double largo) {
      super(ancho, alto, largo);
      this.numeroDeOficinas = numeroDeOficinas;
      this.cantidadDePersonasPorOficina = cantidadDePersonasPorOficina;
      this.numeroDePisos = numeroDePisos;
   }


   public Edificiodeoficina() {
   }

   public int getNumeroDeOficinas() {
      return numeroDeOficinas;
   }

   public void setNumeroDeOficinas(int numeroDeOficinas) {
      this.numeroDeOficinas = numeroDeOficinas;
   }

   public int getCantidadDePersonasPorOficina() {
      return cantidadDePersonasPorOficina;
   }

   public void setCantidadDePersonasPorOficina(int cantidadDePersonasPorOficina) {
      this.cantidadDePersonasPorOficina = cantidadDePersonasPorOficina;
   }

   public int getNumeroDePisos() {
      return numeroDePisos;
   }

   public void setNumeroDePisos(int numeroDePisos) {
      this.numeroDePisos = numeroDePisos;
   }

//METODOS
   
   
   public Edificiodeoficina crearEdificioDeOficina(){
      Edificiodeoficina oficina = new Edificiodeoficina();
      System.out.println("Cuantas oficinas hay por piso:");
      numeroDeOficinas = keyboard.nextInt();
      System.out.println("Cuantas personas por oficina:");
      cantidadDePersonasPorOficina = keyboard.nextInt();
      System.out.println("Cuanto pisos tiene el edificio:");
      numeroDePisos = keyboard.nextInt();
            
    System.out.println("Indique el ancho del edificio:");
      ancho = keyboard.nextDouble();
      System.out.println("Indique el alto del edificio:");
      alto = keyboard.nextDouble();
      System.out.println("Indique el largo del edificio:");
      largo = keyboard.nextDouble();
      
      calcularSuperficie();
      calcularVolumen();
      cantPersonas();
      
      return oficina;
   }

   @Override
   public void calcularSuperficie() {
      System.out.println("La superficie es: " + (ancho * largo));
   }

   @Override
   public void calcularVolumen() {
      System.out.println("El volumen es: " + (ancho * largo * alto));
   }
   
   
   public void cantPersonas(){
      System.out.println(" La cantidad de personas por piso es "+ (cantidadDePersonasPorOficina * numeroDeOficinas));
      System.out.println("La cantidad de personas en el edificio " + (cantidadDePersonasPorOficina * numeroDeOficinas * numeroDePisos));
   }
   
   
   
}
