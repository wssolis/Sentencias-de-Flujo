package ec.edu.intsuperior.vista;



public class Aplicacion {
    public static void main(String[] args) {
        validarParidad();
        
    }
    
    public static int metA(){
        return (int)(Math.random()*10);
    }
    public static void validarParidad(){
        int x=metA();
        if (x%2==0) {
            System.out.println("El numero"+x+"Es par");
        } else {
             System.out.println("El numero"+x+"Es impar");
        }
        
        
    }
}
