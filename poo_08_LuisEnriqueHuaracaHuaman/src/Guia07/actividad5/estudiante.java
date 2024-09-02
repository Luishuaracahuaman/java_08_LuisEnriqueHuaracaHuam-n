/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia07.actividad5;

/**
 *
 * @author pc
 */
public class estudiante {
    // Atributos
    private String nombre;
    private int edad;

    // Constructor
    public estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método para obtener el nombre del estudiante
    public String obtenerNombre() {
        return nombre;
    }

    // Método para obtener la edad del estudiante
    public int obtenerEdad() {
        return edad;
    }

    // Método para cambiar la edad del estudiante
    public void cambiarEdad(int nuevaEdad) {
        this.edad = nuevaEdad;
    }

    // Método para mostrar información del estudiante
    public String mostrarInformacion() {
        return "Estudiante: " + nombre + ", Edad: " + edad;
    }

    public static void main(String[] args) {
        // Crear un objeto de la clase Estudiante
        estudiante estudiante = new estudiante("Ana", 20);

        // Usar los métodos para obtener el nombre y la edad
        String nombre = estudiante.obtenerNombre();
        int edad = estudiante.obtenerEdad();

        // Imprimir resultados
        System.out.println("Nombre del estudiante: " + nombre); // Salida: Nombre del estudiante: Ana
        System.out.println("Edad del estudiante: " + edad); // Salida: Edad del estudiante: 20

        // Cambiar la edad del estudiante
        estudiante.cambiarEdad(21);

        // Mostrar información actualizada
        String informacion = estudiante.mostrarInformacion();
        System.out.println(informacion); // Salida: Estudiante: Ana, Edad: 21
    }
}