/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia07.actividad3;

/**
 *
 * @author pc
 */
public class Persona {
    // Atributos
    private String nombre;
    private int edad;

    // Constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método para obtener el nombre
    public String obtenerNombre() {
        return nombre;
    }

    // Método para calcular la edad en meses
    public int calcularEdadEnMeses() {
        return edad * 12;
    }

    public static void main(String[] args) {
        // Crear un objeto de la clase Persona
        Persona persona = new Persona("Juan", 25);

        // Usar los métodos
        String nombre = persona.obtenerNombre();
        int edadEnMeses = persona.calcularEdadEnMeses();

        // Imprimir resultados
        System.out.println("Nombre: " + nombre); // Salida: Nombre: Juan
        System.out.println("Edad en meses: " + edadEnMeses); // Salida: Edad en meses: 300
    }
}