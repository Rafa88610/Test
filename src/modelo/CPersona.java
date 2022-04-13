package modelo;

public class CPersona {
    //Declaración de Atributos privados de la Clase
    private String nombre;
    private String apPaterno;
    private String apMaterno;
    
    //Métodos Publicos de la Clase
    
    public void asignarNombre(String nuevoNombre){
        nombre = nuevoNombre;
    }    
    public String obtenerNombre(){
        return nombre;
    }
    public void asignarApPaterno(String nuevoApPaterno){
        apPaterno = nuevoApPaterno;
    }    
    public String obtenerApPaterno(){
        return apPaterno;
    }    
    public void asignarApMaterno(String nuevoApMaterno){
        apMaterno = nuevoApMaterno;
    }    
    public String obtenerApMaterno(){
        return apMaterno;
    }   

    public void obtenerNombreCompleto(){
        System.out.println(nombre + " " +  apPaterno + " " + apMaterno);        
    }       
}
