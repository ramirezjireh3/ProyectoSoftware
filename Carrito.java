package avoluxe.model;
import java.util.*;import avoluxe.model.Producto;
public class Carrito {private ArrayList<Producto> productos=new ArrayList<>();
public void agregarProducto(Producto p){productos.add(p);}
public ArrayList<Producto> getProductos(){return productos;}
public double getTotal(){return productos.stream().mapToDouble(Producto::getPrecio).sum();}
public void limpiar(){productos.clear();}}