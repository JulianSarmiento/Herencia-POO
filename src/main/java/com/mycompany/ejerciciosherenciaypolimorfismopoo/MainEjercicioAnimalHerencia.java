/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ejerciciosherenciaypolimorfismopoo;

import java.util.ArrayList;

/**
 *
 * @author Julian
 */
public class MainEjercicioAnimalHerencia {

   public static void main(String[] args) {
      ArrayList<Animal> animales = new ArrayList();

      Animal b = new Perro();
      Animal c = new Gato();

      animales.add(b);
      animales.add(c);

      for (Animal animale : animales) {
         animale.hacerRuido();

      }
   }
}
