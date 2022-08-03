package parksystem;

import java.util.ArrayList;
import java.util.List;
import vagas.*;

public class FactoryVagasRecife implements FactoryVagas{

    @Override
    public List<Vaga> construirVagas() {
        List<Vaga> vagas = new ArrayList<Vaga>();
        
        String id;
        
        for (int i = 97; i <= 100; i++){
            for (int j = 1; j <=4; j++){
                StringBuilder nomeVaga = new StringBuilder();
                nomeVaga.append((char) i);
                nomeVaga.append(j);
                Vaga tmp = new VagaNormal((nomeVaga).toString());
                System.out.println(nomeVaga);
                vagas.add(tmp);
            }
        }
        
        return vagas;
    }
    
}
