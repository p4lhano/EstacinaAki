package Views;
import Controlles.VeiculoController;
import Models.Veiculo;

import java.util.ArrayList;

public class ListarVeiculos {
    public static void ListVeiculos(){
        ArrayList<Veiculo> veiculo =  VeiculoController.listarVeiculos();
        System.out.println(veiculo);
        for(Veiculo v : veiculo){
            System.out.println("Placa: "+v.getPlaca());
            System.out.println("Cor: "+v.getCor());
            System.out.println("Modelo: "+v.getModelo());
        }
    }
}
