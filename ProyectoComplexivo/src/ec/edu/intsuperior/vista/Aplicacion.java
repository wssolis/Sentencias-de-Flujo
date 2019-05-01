package ec.edu.intsuperior.vista;



public class Aplicacion {
    public static void main(String[] args) {
        factorial();
        
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
    public static void factorial(){
        int x=metA();
        int acu=1;
        for (int i = 1; i <= x; i++) {
           acu *=i; 
        }
        System.out.println("el factorial de: "+x+"es: "+acu);
    }
    
}
