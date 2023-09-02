package umb;



public class Estudiante {
    
    private String nombre, apellido, celular, codigo;
    

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
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

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
   
    public Estudiante(String codigo, String nombre, String apellido, String celular) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
    }
    @Override
    public String toString() {
        return "Estudiante{" + "codigo=" + codigo + ", nombre=" + nombre + ", apellido=" +apellido + ", celular=" + celular +'}';
    }
    
    
}
