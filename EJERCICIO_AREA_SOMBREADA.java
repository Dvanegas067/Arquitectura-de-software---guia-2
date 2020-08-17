package ejercicio_area_sombreada;
import java.util.Scanner;

public class EJERCICIO_AREA_SOMBREADA {

   
    public static void main(String[] args) {
        
        double radio, lados, area_circulo, area_cuadrado, area_sombreada;
        
        Scanner sombreada = new Scanner(System.in);
        
        System.out.println("Ingre el radio del circulo ");
        radio = sombreada.nextDouble();
        System.out.println("ingrese la longitud de los lados del cuadrado");
        lados = sombreada.nextDouble();
        
        area_circulo = (Math.PI * Math.pow(radio, 2));
        area_cuadrado = Math.pow(lados, 2);
        area_sombreada = area_circulo - area_cuadrado;
        
        System.out.println("el area sombreada es "+(area_sombreada)+ " cm²");
        
        
        
        
        
        
    }
    
}
