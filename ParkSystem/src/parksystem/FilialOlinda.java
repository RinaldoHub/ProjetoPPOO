package parksystem;

import java.util.ArrayList;
import java.util.List;
import vagas.*;

public class FilialOlinda implements Filial{
    
    public List<Vaga> construirVagas() {
        List<Vaga> vagas = new ArrayList<Vaga>();
                
        for (int j = 1; j <=6; j++){
            StringBuilder idVaga = new StringBuilder();
            idVaga.append("a");
            idVaga.append(j);
            Vaga tmp = new VagaNormal((idVaga).toString());
            System.out.println(idVaga);
            vagas.add(tmp);
        }
        
        for (int j = 1; j <=3; j++){
            StringBuilder idVaga = new StringBuilder();
            idVaga.append("b");
            idVaga.append(j);
            Vaga tmp = new VagaIdoso((idVaga).toString());
            System.out.println(idVaga);
            vagas.add(tmp);
        }
        
        for (int j = 1; j <=3; j++){
            StringBuilder idVaga = new StringBuilder();
            idVaga.append("c");
            idVaga.append(j);
            Vaga tmp = new VagaPcd((idVaga).toString());
            System.out.println(idVaga);
            vagas.add(tmp);
        }
        
        return vagas;
    }
    
}
