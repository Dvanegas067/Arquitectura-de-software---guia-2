package ejercicio_conversion;
import java.util.Scanner;


public class EJERCICIO_CONVERSION {

    
    public static void main(String[] args) {
                
        int medidas;
        double C, L, Y, P, numero;        
        double pulgada_pies = 0.0833;
        double pulgada_centimetros = 2.54;
        double legua_pulgada = 190080.22;
        double yarda_pulgadas = 36;
        
        Scanner conversion = new Scanner(System.in);
        
        System.out.println("Escoge la unidad de medida que quieres convertir en pulgadas teniendo en cuenta que C=centimetros, L=leguas, Y=yardas. P=pies");
        System.out.println("1. C");
        System.out.println("2. L");
        System.out.println("3. Y");
        System.out.println("4. P");        
        medidas = conversion.nextInt();
        
        switch(medidas){
            case 1:
                System.out.println("ingresa la cantidad de centimetros a convertir");
                numero = conversion.nextDouble();                               
                C = numero / pulgada_centimetros;
                System.out.println("los "+numero+ " centimetros a pulgadas es "+C);
                break;                                 
            case 2:
                System.out.println("ingresa la cantidad de leguas a convertir ");
                numero = conversion.nextDouble();                               
                L = numero * legua_pulgada;
                System.out.println("los "+numero+ " centimetros a pulgadas es "+L);
                break;                
            case 3:
                System.out.println("ingresa la cantidad de yardas a convertir ");
                numero = conversion.nextDouble();                               
                Y = numero * yarda_pulgadas;
                System.out.println("los "+numero+ " centimetros a pulgadas es "+Y);
                break;
            case 4:
                System.out.println("ingresa la cantidad de pies a convertir ");
                numero = conversion.nextDouble();                               
                P = numero * pulgada_pies;
                System.out.println("los "+numero+ " centimetros a pulgadas es "+P);
                break;
                     
                
        }
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
