/**
 * Esta clase es el controlador del programa.
 * @author: Linda Ines Jimenez Vides
 * @version: 19 - febrero - 2022
 */

public class Main {
    public static void main(String[] args)  {
        
        //Objeto tipo vista
        Vista vista = new Vista();
        //Objeto tipo calculadora postfix
        CalcuPostfix cp = new CalcuPostfix(); 

        int opcion = 0;

       while (opcion != 3){

           opcion = vista.menu();

           if (opcion == 1){

            cp.leerOperacion();

           } else if (opcion == 2){

            vista.insertarExpresion();

           } else if (opcion == 3){

                vista.salir();

           }
        }   
    }
}
