
package ciclosfor;

public class CiclosFor {

    public static void main(String[] args) {
        for ( var contador=0; contador < 3 ; contador++){
            System.out.println("contador= "+ contador);    
        }
        
        
        for ( var contador=0; contador < 3 ; contador++){
            if (contador % 2 == 0 ){
                break;
            }
            System.out.println("contador= "+ contador);
            }
    }
    
}
