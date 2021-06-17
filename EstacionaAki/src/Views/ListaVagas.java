package Views;

import Controlles.VagaController;
import Controlles.VagaController;
import Models.VagaEstacionamento;
import java.util.*;
import java.util.ArrayList;

public class ListaVagas {

    public static void imprimirVagas(){
        ArrayList<VagaEstacionamento> est = VagaController.listarvagas();
        for(VagaEstacionamento Vaga : est){
            System.out.println(Vaga);
        }

    }

}