package Views;
import Controlles.MarcaController;
import Models.Marca;

import java.util.ArrayList;

public class ListarMarcas {
    public static void ListarTodasMarcas(){
        ArrayList<Marca> marca = MarcaController.listaMarcas();
        for (Marca m : marca ){
            System.out.println(m.getNome());
        }
    }
}
