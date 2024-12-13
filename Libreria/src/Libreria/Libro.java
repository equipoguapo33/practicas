package Libreria;
import java.time.LocalDate;
public class Libro {
    float precio;
    String titulo, autor, fechapub, editorial;
    LocalDate fechapublicacion;

    //setters
    public void setPrecio( float precioSet){
        this.precio=precioSet;
    }
    public void setTitulo(String tituloSet) {
        this.titulo = tituloSet;
    }
    public void setAutor(String autorSet) {
        this.autor = autorSet;
    } 
    public void setFechapub(String fechapubSet) {
        this.fechapub = fechapubSet;
    }
    public void setEditorial(String editorialSet) {
        this.editorial = editorialSet;
    }
    
    //getters
    public float getPrecio() {
        return this.precio;
    }
    public String getTitulo() {
        return this.titulo;
    }
    public String getAutor() {
        return this.autor;
    }
    public String getFechapub() {
        return this.fechapub;
    }
    public String getEditorial() {
        return this.editorial;
    }
    //metodos personalizados
    public void adquirirLibro(){
        
    }
    public void modificarPrecio(){

    }
    public void eliminarLibro(){
        
    }
}   
