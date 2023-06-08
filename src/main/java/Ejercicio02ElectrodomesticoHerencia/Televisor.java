/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio02ElectrodomesticoHerencia;

import java.util.Scanner;

/**
 *
 * @author Julian
 */
public class Televisor extends Electrodomesticos {

    protected int resolucion;
    protected boolean sintonizador;

//    Método crearTelevisor(): este método llama a crearElectrodomestico() de la clase padre, lo utilizamos para llenar los atributos heredados del 
//padre y después llenamos los atributos del televisor.
//    
    public Televisor() {
    }

    public Televisor(double precio, String color, char consumoEnergetico, int peso) {
        super(precio, color, consumoEnergetico, peso);
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizador() {
        return sintonizador;
    }

    public void setSintonizador(boolean sintonizador) {
        this.sintonizador = sintonizador;
    }

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    @Override
    public double getPrecio() {
        return precio;
    }

    @Override
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    @Override
    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    @Override
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

//     Método crearTelevisor(): este método llama a crearElectrodomestico() de la clase padre, lo utilizamos para llenar los atributos heredados del 
//padre y después llenamos los atributos del televisor.
    public void crearTelevidor() {
        crearElectrodomestico();
        System.out.println("Ingrese la resolución preferida para su televisor");
        this.resolucion = leer.nextInt();
        System.out.println("Desea una televión con sintonizador?");

        String op = leer.next();

        if (op.equalsIgnoreCase("Si")) {
            this.sintonizador = true;

        }else{
            this.sintonizador = false;
        }

    }

//    Método precioFinal(): este método será heredado y se le sumará la siguiente funcionalidad. Si el televisor tiene una resolución mayor de 
//40 pulgadas, se incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará $500. Recuerda que las condiciones que 
//hemos visto en la clase Electrodomesticos también deben afectar al precio.
    @Override
    public void precioFinal() {
        super.precioFinal();
        if (this.resolucion > 40) {
            this.precio = this.precio * 1.30;

        }
        if (this.sintonizador) {
            this.precio += 500;
        }

    }
}
