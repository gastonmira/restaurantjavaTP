package tprestaurant.model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author jmdapice
 */
public class Restaurant implements Serializable{
    
    private ArrayList<Menu> menus;
    private ArrayList<Producto> productos;
    private ArrayList<Ingrediente> ingredientes;
    
    public Restaurant()
    {
        menus = new ArrayList<Menu>();
        productos = new ArrayList<Producto>();
        ingredientes = new ArrayList<Ingrediente>();
    }

    public Restaurant(ArrayList<Menu> menus, ArrayList<Producto> productos, ArrayList<Ingrediente> ingredientes) {
        this.menus = menus;
        this.productos = productos;
        this.ingredientes = ingredientes;
    }
}
