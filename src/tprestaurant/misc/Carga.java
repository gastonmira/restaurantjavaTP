package tprestaurant.misc;

import tprestaurant.model.enums.UnidadesDeMedida;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeSet;

import tprestaurant.model.ExcepcionLogica;
import tprestaurant.model.Ingrediente;

public class Carga {

    public static TreeSet<Ingrediente> cargaIngredientes(String ubicacion) throws ExcepcionLogica {
        File archivo = new File(ubicacion);
        TreeSet<Ingrediente> listIngredientes = new TreeSet<Ingrediente>();
        try {
            BufferedReader in = new BufferedReader(new FileReader(archivo));
            String data;
            String linea[] = new String[7];
            while ((data = in.readLine()) != null) {
                Ingrediente ingr = new Ingrediente();
                linea = data.split(",");
                ingr.setDescripcion(linea[0]);
                ingr.setUnidad(UnidadesDeMedida.valueOf(linea[1]));
                ingr.setCostoPorUnidad(Float.parseFloat(linea[2]));
                listIngredientes.add(ingr);
            }
            in.close();
        } catch (IOException e) {
            throw new ExcepcionLogica(e.getMessage());
        }
        
        return listIngredientes;
    }
}
