package Views;
import Controlles.MotoristaController;
import Models.Motorista;

import java.util.ArrayList;

public class ListarMotoristas {
    public static void listMotoristas(){
        ArrayList<Motorista> motora = MotoristaController.listarMotoristas();

        for (Motorista m: motora){
            System.out.println(m.getNome());
            System.out.println(m.getCpf());
            System.out.println(m.getTelefone());
            System.out.println("############################");
        }
    }
}
