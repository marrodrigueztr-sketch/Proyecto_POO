/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package VISTA;
import CONTROLADOR.ControladorProductos;
import MODELO.Productos;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class VistaProductos {
   
    public ControladorProductos contProductos;
    private Scanner leerDatos;

    public void insertarProductosDefecto(){
         Productos p1 = new Productos(1, "CMB123", "CAMISA BLANCA MUJER", "CAMISA ESTAMPADA PAJARO", 12500f, 12, "temu","No perecedero" );
         contProductos.insertar(p1);
         if(contProductos.insertar(p1))
             System.out.println("Producto insertado");
         Productos p2 = new Productos(2, "PTL234", "PANTALON HOMBRE ", "PANTALON JEAN", 16500f, 30 , "Adidas","No perecedero" );
         contProductos.insertar(p2);
         if(contProductos.insertar(p2))
             System.out.println("Producto insertado");
         
    }
    
    public void menuVista(){
        System.out.println("Digite su opcion");
        System.out.println("1. Insertar Productos");
        System.out.println("2. Consultar todos los productos");
        System.out.println("3. Consultar un producto");
        System.out.println("4. ordenar ascendente productos");
        System.out.println("5. ordenar descendente productos");
        System.out.println("6. Actualizar Productos");
        System.out.println("7. Borrar producto");
        System.out.println("##################################");
        int var = leerDatos.nextInt();
        switch (var){
            case 1:
                insertarProductos();
                break;
            case 2:
                contProductos.consultarTodos();
                break;
            default:
        }
    }

    public VistaProductos() {
        contProductos = new ControladorProductos();
        leerDatos = new Scanner(System.in);
        insertarProductos();
    }

    private void insertarProductos() {
        System.out.println("No esta implementado");
    }
    
}
