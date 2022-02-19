import java.util.Stack;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Vista{

    CalcuPostfix cp = new CalcuPostfix();
    Stack<Integer> stack2;

    String contenido = " ";
    
    public void leerOperacion(){
        
        File datos = new File("datos.txt");
        Scanner sc;
        
        
        try {
            
            sc = new Scanner(new File("datos.txt"));
            FileReader leer = new FileReader(datos);
            BufferedReader operaciones = new BufferedReader(leer);

            while(sc.hasNext()){
                contenido = sc.next();
                if(contenido.isEmpty()){
                    System.out.println("Stack Vacio");
                } else{
                    cp.Evaluar(contenido);
                    System.out.println(cp.Evaluar(contenido));
                }
            }
        
        
        
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
}
