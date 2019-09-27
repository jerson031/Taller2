/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

public class Vendedor {
    private String nombre;
    private String apellido;
    private int rut;

    public Vendedor(String nombre, String apellido, int rut) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Vendedor{" + "nombre=" + nombre + ", apellido=" + apellido + '}';
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public Vendedor(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
            
    
    
    
}
