/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author victo
 */
public class libro {
    public int id;
    public String Nombre;
    public String categoria;
    public String autor;

    public libro(int id, String Nombre, String categoria, String autor) {
        this.id = id;
        this.Nombre = Nombre;
        this.categoria = categoria;
        this.autor = autor;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getAutor() {
        return autor;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
}
