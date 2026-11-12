/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CONTROLADOR;
import java.util.ArrayList;
import MODELO.Productos;

/**
 *
 * @author Usuario
 */
public class ControladorProductos implements ICRUD{

    public static ArrayList<Productos> arregloProductos = new ArrayList<Productos>();
    
    @Override
    public boolean insertar(Object obj) {
        
        Productos pp = (Productos) obj;
        if(arregloProductos.isEmpty()){
            arregloProductos.add(pp);
            return true;
        }
        else if(arregloProductos.contains(pp)){
            arregloProductos.add(pp);
            return true;
        }
        else
            return false;
     }

    @Override
    public void consultarTodos() {
        //Recorrido con indices
        for(int i=0; i<arregloProductos.size();i++){
            System.out.println(arregloProductos.get(i).toString());
        }
        //For each
        for(Productos p:arregloProductos){
            System.out.println(p.toString());
        }
    }

    @Override
    public void consultarUno(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void ordenar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void ordenar(int descendente) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object update(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean delete(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
