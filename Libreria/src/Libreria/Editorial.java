package Libreria;

public class Editorial {
    String nombre, direccion, telefono, contacto;
    
    public void setNombre(String nombreSet){
        this.nombre =nombreSet;
    }

    public void setDireccion(String direccionSet) {
        this.direccion = direccionSet;
    }

    public void setTelefono(String telefonoSet) {
        this.telefono = telefonoSet;
    }

    public void setContacto(String contactoSet) {
        this.contacto = contactoSet;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getContacto() {
        return contacto;
    }
    
    public void eliminarEditorial(){
        
    }
    
}
