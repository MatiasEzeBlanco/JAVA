package javaejercicios;
public class JavaEjercicios {
    public static void main(String[] args) {
        int a=3 , b=2 ;
        var resultado = a + b;
        System.out.println("resultado de la suma = " + resultado);
        
        resultado = a - b ;
        System.out.println("resultado de la resta =" + resultado);
        
        resultado = a * b ;
        System.out.println("resultado de la multiplicacion =" + resultado);
        
        resultado = a / b ;
        System.out.println("resultado de la division =" + resultado);
        
        var resultado2 = 3.0 / b ;
        System.out.println("resultado de la division flotante =" + resultado2);
        
        resultado = a % b ;
        System.out.println("resultado de la la operacion de modulo =" + resultado);
        
        if (a % 2 == 0)
            System.out.println("Es par");
        else System.out.println("Es impar");
        
    }
    
}
