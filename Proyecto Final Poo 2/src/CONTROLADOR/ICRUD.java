/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package CONTROLADOR;

/**
 *
 * @author Usuario
 * Todos sus metodos son abstractos
 */
public interface ICRUD {
    
    public boolean insertar(Object obj); //Create
    public void consultarTodos(); //Read
    public void consultarUno(Object obj); //Read
    public void ordenar(); //Read
    public void ordenar(int descendente); //Read
    public Object update (Object obj); //Update
    public boolean delete (Object obj); //Delete
    
}
