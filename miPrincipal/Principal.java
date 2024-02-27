package miPrincipal;

import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) throws Exception {
        Scanner consola = new Scanner(System.in);
        int opc =0;
        do{
            System.out.println("*************************");
            System.out.println("       RECURSIVIDAD      ");
            System.out.println("*************************");
            System.out.println("1) LADRILLOS");
            System.out.println("2) FACTORIAL");
            System.out.println("0) SALIR");
            System.out.print("Selecciona opción:");
            opc=consola.nextInt();

            switch (opc){
            case 1:
               AppLadrillos.menu();
               break;
            case 2:
              AppFactorial.menu();
            case 3:
               AppNaturales.menu();
            case 4:
               AppSumaDigitos.menu();
            case 5:
               AppAlfabeto.menu();
            case 6:
             
            case 7:
               AppBuesquedaBinaria.menu();
            case 8:
               
            case 9:
               
            case 10:
               
            case 0:
               System.out.println("ADIOS!");
               consola.close();
               break;
               

            default:
               System.out.println("Valor incorrecto, intente de nuevo!");

        }
       
    }while (opc != 0);
		
    }
}