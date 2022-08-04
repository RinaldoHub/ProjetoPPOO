package parksystem;

import java.util.ArrayList;
import java.util.List;
import vagas.*;

public class FactoryVagasRecife implements FactoryVagas{
    
    public List<Vaga> construirVagas() {
        List<Vaga> vagas = new ArrayList<Vaga>();
                
        for (int i = 97; i <= 100; i++){
            for (int j = 1; j <=4; j++){
                StringBuilder idVaga = new StringBuilder();
                idVaga.append((char) i);
                idVaga.append(j);
                Vaga tmp = new VagaNormal((idVaga).toString());
                System.out.println(idVaga);
                vagas.add(tmp);
            }
        }
        
        return vagas;
    }
    
}
