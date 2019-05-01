package ec.edu.intsuperior.vista;

import ec.edu.intsuperior.controlador.Calculos;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Wilson
 */
public class Aplicacion {
    public static void main(String[] args) {
        menu();
    }
    public static void menu(){
        Scanner entrada = new Scanner(System.in);
        int opcion=0;
        boolean salir = false;
        while(!salir){
            Calculos operacion = new Calculos();
        System.out.printf("\tMenú\n1.- Número aleatorio\n2.- Par o Impar de un número aleatorio\n3.- Factorial de un número aleatorio\n4.- Salir\n\nIngresa una opcion --> ");
            try {
                opcion=entrada.nextInt();
                while(opcion>=5){
                    System.out.println("Solo ingresa una opcion del menú");
                    opcion=entrada.nextInt();
                }
            switch (opcion){
                    case 1:
                        System.out.printf("El número aleatorio es %d\n",operacion.meta());
                        break;
                    case 2:
                        operacion.validarParidad();
                        break;
                    case 3:
                        operacion.factorial();
                        break;
                    case 4:
                        salir=true;
                        System.out.println("Gracias por usar el software");
            }
            } catch (InputMismatchException e) {
                System.out.println("Se debe ingresar solo números");
                entrada.next();
            }
        }     
    }
}