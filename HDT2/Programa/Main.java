public class Main {
    public static void main(String[] args)  {
        
        Vista vista = new Vista();
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
