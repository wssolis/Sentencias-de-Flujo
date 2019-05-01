package ec.edu.intsuperior.vista;

/**
 *
 * @author Wilson
 */
public class Aplicacion {
    public static void main(String[] args) {
        validarParidad();
        
    }
    public static int meta(){
        return (int)(Math.random()*100);
    }
    public static void validarParidad(){
        int x =meta();
        if (meta()%2==0) {
            System.out.println(x+" Es par");
            
        } else {
            System.out.println(x+" Es impar");
        }
    }
}
