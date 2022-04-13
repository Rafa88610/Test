package modelo;

public class CEjemplo001 {

    public static void main(String[] args) {
        CPersona empleado1;
        empleado1= new CPersona();
        
       empleado1.asignarNombre("Ana");
       empleado1.asignarApPaterno("Saavedra");
       empleado1.asignarApMaterno("Talledo");
       
        System.out.println(empleado1.obtenerNombre());
        System.out.println(empleado1.obtenerApPaterno());
        System.out.println(empleado1.obtenerApMaterno());
        empleado1.obtenerNombreCompleto();       
    }
    
}
