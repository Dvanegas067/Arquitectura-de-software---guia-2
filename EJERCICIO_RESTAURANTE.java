package ejercicio_restaurante;
import java.util.Scanner;

public class EJERCICIO_RESTAURANTE {

   
    public static void main(String[] args) {
            
        double costo_platos = 0, descuento, plato_iva;
        double sopa_vegetales, ensaladas, jugos, precio_total_compra = 0, precio_total2 = 0, precio_total3 = 0;
        double bandeja_carne, bandeja_pollo, precio_total1 = 0;
        double perros_calientes, hamburguesas;
        double iva, carta1 = 0, carta2 = 0, carta3 = 0;
        int carta;
         
               
        Scanner cuenta = new Scanner(System.in);
        
        
        
            System.out.println("ESCOJA LO QUE DESEA PEDIR");
            System.out.println("1. comida vegetariana");
            System.out.println("2. comida no vegetariana");
            System.out.println("3. comida rapida");
            
            carta = cuenta.nextInt();
            
            
            switch(carta){
                case 1:
                    do{
                        System.out.println("1.sopas de vegetales");
                        System.out.println("2. ensaladas");
                        System.out.println("3. jugos");
                        System.out.println("4. siguiente menu");
                        carta = cuenta.nextInt();
                        
                        switch(carta){
                            case 1:
                                System.out. println("Ingrese la cantidad Sopas de vegetales Consumidas");
                                sopa_vegetales = cuenta.nextInt();
                                costo_platos= sopa_vegetales *10000;
                                iva = costo_platos * 0.19;
                                plato_iva = costo_platos + iva;
                                descuento = (costo_platos + iva)*0.20;
                                carta1 = (costo_platos + iva)-descuento;
                                System.out.println("la sopas de vegetales cuestan " +costo_platos+ " el plato mas iva"
                                +"tiene un costo de" +plato_iva+ " y el plato con descuento es " +descuento+"para un "
                                +"total de "+carta1);
                                break;
                            case 2:
                                System.out. println("Ingrese la cantidad Ensaladas Consumidas");
                                ensaladas = cuenta.nextInt();
                                costo_platos = ensaladas * 25000;
                                iva = costo_platos *0.19;
                                plato_iva = costo_platos + iva;
                                descuento =(costo_platos +iva)*0.20;
                                carta2 =(costo_platos + iva)- descuento;
                                System.out.println("las ensaladas cuestan " +costo_platos+ " el plato mas iva "
                                +" tiene un costo de " +plato_iva+ " y el plato con descuento es de " +descuento+" para un "
                                +"total de "+carta2);
                                break;
                            case 3:
                                System.out. println("Ingrese la cantidad de jugos");
                                jugos = cuenta.nextInt();
                                costo_platos = jugos * 5000;
                                iva = costo_platos *0.19;
                                plato_iva = costo_platos + iva;
                                descuento =(costo_platos +iva)*0.20;
                                carta3 =(costo_platos + iva)- descuento;
                                System.out.println("las ensaladas cuestan " +costo_platos+ " el plato mas iva "
                                +" tiene un costo de " +plato_iva+ " y el plato con descuento es de " +descuento+" para un "
                                +"total de "+carta3);    
                                
                                break;
                                
                            case 4:
                            precio_total1 = carta1 + carta2 + carta3;
                            
                                
                           
                        }
                        System.out.println("1. repetir menu");
                        System.out.println("4. siguiente menu");                      
                        carta = cuenta.nextInt();
                    }while (carta != 4);
                    
                case 2:
                    do{
                        System.out.println("***** Menu No Vegetariano*****");
                        System.out.println("1. bandeja de carne");
                        System.out.println("2. bandeja de pollo");
                        System.out.println("3. siguiente menu");
                        carta = cuenta.nextInt();
                        
                        switch (carta){
                            case 1:
                                System.out. println("Ingrese las bandejas de carne llevar");
                                bandeja_carne = cuenta.nextInt();
                                costo_platos = bandeja_carne * 30000;
                                iva = costo_platos *0.19;
                                plato_iva = costo_platos + iva;
                                descuento =(costo_platos +iva)*0.10;
                                carta1 =(costo_platos + iva)- descuento;
                                System.out.println("las bandejas de carne cuestan " +costo_platos+ " el plato mas iva "
                                +" tiene un costo de " +plato_iva+ " y el plato con descuento es de " +descuento+" para un "
                                +"total de "+carta1);
                                break;
                            case 2:
                                System.out. println("Ingrese las bandejas de pollo que deseas llevar");
                                bandeja_pollo = cuenta.nextInt();
                                costo_platos = bandeja_pollo * 28000;
                                iva = costo_platos *0.19;
                                plato_iva = costo_platos + iva;
                                descuento =(costo_platos +iva)*0.10;
                                carta2 =(costo_platos + iva)- descuento;
                                System.out.println("las bandejas de pollo cuestan  " +costo_platos+ " el plato mas iva "
                                +" tiene un costo de " +plato_iva+ " y el plato con descuento es de " +descuento+" para un "
                                +"total de "+carta1);
                                break;
                                
                            case 3:
                                precio_total2 = carta1 + carta2;
                            
                             
                        }
                        System.out.println("1. repetir menu");
                        System.out.println("4. siguiente menu");                      
                        carta = cuenta.nextInt();
                    }while (carta != 4);
                    
                case 3:
                    do{
                        System.out.println("***** Menu Comidas Rapidas******");
                        System.out.println("1. perros calientes ");
                        System.out.println("2. hamburguesas");
                        System.out.println("3. Menu principal");
                        carta = cuenta.nextInt();
                        
                        switch(carta){
                            case 1:
                                System.out. println("Ingrese los perros calientes que deseas llevar");
                                perros_calientes = cuenta.nextInt();
                                costo_platos = perros_calientes * 5000;
                                iva = costo_platos *0.19;
                                plato_iva = costo_platos + iva;                                
                                carta1 =(costo_platos + iva);
                                System.out.println("los perros calientes cuestan " +costo_platos+ " el costo total"
                                +" con iva incluido es " +carta1);
                                break;
                            case 2:
                                System.out. println("Ingrese las hamburguesas que deseas llevar");
                                hamburguesas = cuenta.nextInt();
                                costo_platos = hamburguesas * 7000;
                                iva = costo_platos *0.19;
                                plato_iva = costo_platos + iva;                                
                                carta2 =(costo_platos + iva);
                                System.out.println("los hambuguesas cuestan " +costo_platos+ " el costo total "
                                +" con iva incluido es " +carta2);
                                break;
                            case 3:
                                precio_total3 = carta1 + carta2;
                                precio_total_compra = precio_total1 + precio_total2 + precio_total3;
                                System.out.println("el precio total de tu compra es "+ precio_total_compra);
                                
                                break;
                                
                                
                        }
                        
                        System.out.println("4. para ir al menu principal");  
                        }while (carta != 4);
                
                case 4:
                    precio_total_compra = precio_total1 + precio_total2 + precio_total3;
                    System.out.println("el precio total de tu compra es "+ precio_total_compra);
                    break;
                            
                    
                    }             
                            
          
                    
    }                
                   
                      
                                                     
                                       
                                                             
                           
                
                       
        
                 
        
      
        
       
        
        
            }         
            
        
        
        
    
    


