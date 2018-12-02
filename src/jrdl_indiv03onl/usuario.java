
package jrdl_indiv03onl;


public class usuario {//Creo la clase usuario
    private String nombre;//Creo los atributos privados
    private String apellidos;
    private int edad;
    private String dni = Long.toString(123456789);
    
    
    public usuario(String nombre,String apellidos,int edad) {//Creo un primer constructor con 3 atributos
    this.nombre=nombre;
    this.apellidos=apellidos;
    this.edad=edad;
    
}
    
    
public usuario(String nombre,String apellidos,int edad,String dni) {//Creo un segundo constructor con todos los datos
    this.nombre=nombre;
    this.apellidos=apellidos;
    this.edad=edad;
    this.dni=dni;
}

    public String getNombre() {//Métodos get y set de cada atributo 
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getedad() {
        return edad;
    }

    public void setedad(int edad) {
        this.edad = edad;
    }

    public String getdni() {
        return dni;
    }

    public void setdni(String dni) {
        this.dni = dni;
    }
    //Creo el método toString para imprimir la información del objeto
    @Override
    public String toString() {//Método toString que devolverá todos los datos
        return "Usuario{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + ", dni=" + dni + '}';
    } 
    
}
