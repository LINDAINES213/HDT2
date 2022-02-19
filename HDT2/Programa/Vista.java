/**
 * Esta clase es la vista del programa.
 * @author: Linda Ines Jimenez Vides
 * @version: 19 - febrero - 2022
 */

import java.util.Stack;
import java.util.Scanner;

public class Vista{

    CalcuPostfix cp = new CalcuPostfix();
    Stack<Integer> stack2;
    Scanner sn = new Scanner(System.in);

    String contenido = " ";

    /**
     * Metodo que muestra el menu
    */
    public int menu(){
        
        int opcion;

        System.out.println();
        System.out.println();
        System.out.println("------------ CALCULADORA DE EXPRESIONES POSTFIX ------------");
        System.out.println();
        System.out.println("Bienvendo a la calculadora de expresiones postfix");
        System.out.println("Puedes calcular una expresion postfix insertandola o utilizando un documento txt");
        System.out.println("Hora de Empezar! Elija una opcion:");
        System.out.println("\n---------------------------------------------------------------------------------------------------------------------");

        String menuPrincipal = "1. Leer documento (txt) con expresiones postfix\n" + 
                                "2. Insertar expresion postfix\n" + 
                                "3. Salir\n";

        System.out.println(menuPrincipal);
        opcion = sn.nextInt();
        return opcion;
    }

    /**
     * Metodo que muestra el mensaje de despedida
    */
    public void salir(){
        System.out.println("Gracias por utilizar la calculadora!");
    }
    
    /**
     * Metodo que permite al usuario insertar una expresiones
    */
    public void insertarExpresion(){
        String s;
        Scanner sn = new Scanner(System.in);

        System.out.println("Inserte la expresion: ");
        s = sn.nextLine();
        System.out.println("\nResultado: " + cp.evaluarOperacion(s));
    }
    
}
