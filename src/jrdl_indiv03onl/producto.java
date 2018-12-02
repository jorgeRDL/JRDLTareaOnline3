
package jrdl_indiv03onl;


public class producto {//Creo la clase producto
    private String referencia = Long.toString(1234);//Creo los atributos
    private String nombre;
    private int unidades;
    
    
    
    public producto(String referencia,String nombre,int unidades) {//Creo un constructor con todos los datos
    this.referencia=referencia;
    this.nombre=nombre;
    this.unidades=unidades;
    
}
    
    


    public String getreferencia() {//Creo todos los get y set de los atributos
        return referencia;
    }

    public void setreferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getnombre() {
        return nombre;
    }

    public void setnombre(String nombre) {
        this.nombre = nombre;
    }

    public int unidades() {
        return unidades;
    }

    public void setunidades(int unidades) {
        this.unidades = unidades;
    }

    
    //Creo el método toString para imprimir la información del objeto
    @Override
    public String toString() {//Método toString que devuelve todos los datos
        return "Producto{" + "Referencia=" + referencia + ", Nombre=" + nombre + ", Unidades=" + unidades +  '}';
    } 
    
}
