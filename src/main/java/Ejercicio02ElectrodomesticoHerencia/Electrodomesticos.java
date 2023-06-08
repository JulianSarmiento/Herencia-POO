/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio02ElectrodomesticoHerencia;

/**
 *
 * @author Julian
 */

import java.util.Scanner;

public class Electrodomesticos {
  protected Scanner leer = new Scanner(System.in).useDelimiter("\n");

    protected double precio;
    protected String color;
    protected char consumoEnergetico;

    protected double peso;

    public Electrodomesticos() {
        this.precio = 1000;
    }

    public Electrodomesticos(double precio, String color, char consumoEnergetico, int peso) {
        this.precio = precio;
        this.color = color;
        if (!(this.color.equalsIgnoreCase("Blanco")
                || this.color.equalsIgnoreCase("Negro")
                || this.color.equalsIgnoreCase("Rojo")
                || this.color.equalsIgnoreCase("Azul")
                || this.color.equalsIgnoreCase("Gris"))) {
            this.color = "Blanco";
        }
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
        if (!(this.consumoEnergetico <= 'A' && this.consumoEnergetico >= 'F')) {
            this.consumoEnergetico = 'F';

        }
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Electrodomesticos{" + "precio=" + precio + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso + '}';
    }

    //Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta, 
// sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el 
// objeto y no será visible. 
//     protected void comprobarConsumoEnergetico(char letra){
//         if (!(this.consumoEnergetico<='A'&& this.consumoEnergetico>='F')) {
//             this.consumoEnergetico='F';
    //• Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es, 
// usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son 
// blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en 
// minúsculas. Este método se invocará al crear el objeto y no será visible.
//    private void comprobarColor(String color) {
//        if (!(this.color.equalsIgnoreCase("Blanco")
//                || this.color.equalsIgnoreCase("Negro")
//                || this.color.equalsIgnoreCase("Rojo")
//                || this.color.equalsIgnoreCase("Azul")
//                || this.color.equalsIgnoreCase("Gris"))) {
//            this.color = "Blanco";
//        }
//
//    }
// • Metodo crearElectrodomestico(): le pide la información al usuario y llena el 
// electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al 
// precio se le da un valor base de $1000. 
    protected void crearElectrodomestico() {
        Electrodomesticos E1 = new Electrodomesticos();
        System.out.println("Ingrese el color de su preferencia");
        this.color = leer.next();
        System.out.println("Ingrese el Consumo Energético de su preferencia");
        this.consumoEnergetico = leer.next().toUpperCase().charAt(0);
        System.out.println("Ingrese el peso de su preferencia");
        this.peso = leer.nextInt();

    }

// • Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del 
// precio. Esta es la lista de precios: 
//A $1000 B $800 C $600 D $500 E $300 F $100
//Entre 1 y 19 kg $100
//Entre 20 y 49 kg $500 Entre 50 y 79 kg $800 Mayor que 80 kg $1000
    protected void precioFinal() {

        switch (this.consumoEnergetico) {
            case 'A':
                this.precio += 1000;
                break;
            case 'B':
                this.precio += 800;
                break;
            case 'C':
                this.precio += 600;
                break;
            case 'D':
                this.precio += 500;
                break;
            case 'E':
                this.precio += 300;
                break;
            case 'F':
                this.precio += 100;

                break;

        }
        if (this.peso >= 1 && this.peso <= 19) {

            this.precio += 100;
        }
        if (this.peso >= 20 && this.peso <= 49) {

            this.precio += 500;

        }
        if (this.peso >= 50 && this.peso <= 79) {

            this.precio += 800;

            if (this.peso > 80) {

                this.precio += 1000;
            }
        }
    }
}
