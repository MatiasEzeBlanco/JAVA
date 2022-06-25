package practicajava2;
import java.util.Scanner;

public class PracticaJava2 {

    public static void main(String[] args) {
        
        System.out.println("Inserte la nota del alumno");
        Scanner consola= new Scanner(System.in);
        
        var nota =Integer.parseInt(consola.nextLine());
        var valor="nota desconocida";
        
        
        switch(nota){
            case 1: case 2: case 3: case 4: case 5:
                valor = "F";
                break;
                
            case 6:
                valor = "D";
                break;
                
            case 7: 
                valor = "C";
            break;
            
            case 8:
                valor= "B";
                break;
                
            case 9: case 10:
                valor= "A";
                break;         
          }     
        System.out.println("La nota del alumno es :" + valor);
        
    }
}