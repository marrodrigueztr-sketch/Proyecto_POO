/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VISTA;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Principal {
    
    public static void menu(){
        Scanner leerDatos = new Scanner (System.in);
        System.out.println("#######################################");
        System.out.println("Digite su opcion");
        System.out.println("1. Administrar productos");
        System.out.println("2. Administrar Usuarios");
        System.out.println("3. Administrar Almacenes");
        System.out.println("4. Administrar Pais");
        System.out.println("5. Administrar Ciudad");
        System.out.println("6. Administrar Movimientos Logisticos");
        System.out.println("#######################################");
        int var=leerDatos.nextInt();
        switch (var){
            case 1:
                
                
                break;
            default:
               throw new AssertionError();
        }
    }
    
    public static void main(String[] args) {
        Principal.menu();
    }
}
