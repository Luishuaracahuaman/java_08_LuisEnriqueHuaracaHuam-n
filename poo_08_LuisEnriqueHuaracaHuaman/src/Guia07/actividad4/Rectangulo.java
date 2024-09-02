/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia07.actividad4;

/**
 *
 * @author pc
 */
public class Rectangulo {
    // Atributos
    private double base;
    private double altura;

    // Constructor
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // Método para calcular el área del rectángulo
    public double calcularArea() {
        return base * altura;
    }

    // Método para calcular el perímetro del rectángulo
    public double calcularPerimetro() {
        return 2 * (base + altura);
    }

    // Método para cambiar la base
    public void cambiarBase(double nuevaBase) {
        this.base = nuevaBase;
    }

    // Método para cambiar la altura
    public void cambiarAltura(double nuevaAltura) {
        this.altura = nuevaAltura;
    }

    public static void main(String[] args) {
        // Crear un objeto de la clase Rectangulo
        Rectangulo rectangulo = new Rectangulo(5.0, 3.0);

        // Usar los métodos para calcular área y perímetro
        double area = rectangulo.calcularArea();
        double perimetro = rectangulo.calcularPerimetro();

        // Imprimir resultados
        System.out.println("Área del rectángulo: " + area); // Salida: Área del rectángulo: 15.0
        System.out.println("Perímetro del rectángulo: " + perimetro); // Salida: Perímetro del rectángulo: 16.0

        // Cambiar base y altura
        rectangulo.cambiarBase(7.0);
        rectangulo.cambiarAltura(4.0);

        // Calcular nuevamente el área y el perímetro
        area = rectangulo.calcularArea();
        perimetro = rectangulo.calcularPerimetro();

        // Imprimir resultados actualizados
        System.out.println("Nuevo área del rectángulo: " + area); // Salida: Nuevo área del rectángulo: 28.0
        System.out.println("Nuevo perímetro del rectángulo: " + perimetro); // Salida: Nuevo perímetro del rectángulo: 22.0
    }
}