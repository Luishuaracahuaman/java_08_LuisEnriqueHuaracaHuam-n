/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia07.actividad2;

/**
 *
 * @author pc
 */
public class Libro {
    private String titulo;
    private String autor;
    private String resumen;

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public void mostrarInfo() {
        System.out.println("Título: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Resumen: " + this.resumen);
    }

    public void escribirResumen(String resumen) {
        this.resumen = resumen;
    }
}
