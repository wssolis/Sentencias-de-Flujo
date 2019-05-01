package ec.edu.vista;

public class Aplicacion {
    public static void main(String[] args) {
        
        //Aplicacion.metodoA();
        System.out.println("NUMERO RANDOMICO\n"+metodoA());    
    }
    public  static int metodoA()
    { //return 5;
    return (int) (Math.random()*100) ;
       
    }
    public void metodoB(){
    System.out.println("ESTUDIEN");
    }
}
