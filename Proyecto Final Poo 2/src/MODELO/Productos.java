/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODELO;
import java.util.Objects;
import java.util.Scanner;
/**
 *
 * @author Marcelo
 */
public class Productos {
    
   //Atributos 
    
    int id;
    String codigoSKU;
    String nombre;
    String descripcion;
    float preciouniitario;
    int stockactual;
    String proveedor;
    String tipo; //perecedero, electronico, fragil
    
    //Constructores, tipos basicos de datos y clases

    public Productos() {
    }

    public Productos(int id, String codigoSKU, String nomnbre, String descripcion, float preciouniitario, int stockactual, String proveedor, String tipo) {
        this.id = id;
        this.codigoSKU = codigoSKU;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.preciouniitario = preciouniitario;
        this.stockactual = stockactual;
        this.proveedor = proveedor;
        this.tipo = tipo;
    }
    
    public Productos(String descripcion, int id, String tipo){
        this.descripcion = descripcion;
        this.id = id;
        this.tipo = tipo;
    }
  
    
    /*public static void main(String[] args) {
        Productos objPro = new Productos();
        objPro.id = 98;
        Productos objPro1 = new Productos( 1, "ROPB_123", "Camiseta Blanca", "camiseta mujer", 10000f, 20, "temu", "no perecedero");
        System.out.println("objPro= "+ objPro.toString());
        System.out.println("objPro1= "+ objPro1.toString());
        Productos objPro2 = new Productos("Camiseta negra de hombre",0,"No perecedero");
        System.out.println("objPro2= "+ objPro2.toString());
    }*/
    
    public static void main(String[] args){
        Productos objP = new Productos();
        Scanner leerDatos = new Scanner(System.in);
        System.out.println("Digite el id");
        objP.setId(leerDatos.nextInt());
        System.out.println("Digite el precio unitario");
        objP.setPreciouniitario(leerDatos.nextFloat());
        System.out.println("Digite el nombrre");
        objP.setNombre(leerDatos.next());
        System.out.println(objP.getId() + " " + objP.getPreciouniitario() + " " + objP.getNombre());
    }

    @Override
    public String toString() {
        return "Productos{" + "id=" + id + ", codigoSKU=" + codigoSKU + ", nomnbre=" + nombre + ", descripcion=" + descripcion + ", preciouniitario=" + preciouniitario + ", stockactual=" + stockactual + ", proveedor=" + proveedor + ", tipo=" + tipo + '}';
    }

    public void metodo1(){
    
    }
    
    //Getters y Setters

    public int getId() {
        return id;
    }

    public String getCodigoSKU() {
        return codigoSKU;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public float getPreciouniitario() {
        return preciouniitario;
    }

    public int getStockactual() {
        return stockactual;
    }

    public String getProveedor() {
        return proveedor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCodigoSKU(String codigoSKU) {
        this.codigoSKU = codigoSKU;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPreciouniitario(float preciouniitario) {
        this.preciouniitario = preciouniitario;
    }

    public void setStockactual(int stockactual) {
        this.stockactual = stockactual;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Productos other = (Productos) obj;
        return this.id == other.id;
    }
    
    
    
}

