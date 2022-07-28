package parksystem;


import vagas.Vaga;
import java.util.ArrayList;
import java.util.List;

public class Estacionamento {    
    List<Vaga> vagas = new ArrayList();
    private static Estacionamento uniqueInstance;
    
    private Estacionamento(){
        
    }
    
    public synchronized static Estacionamento getEstacionamento(){
        if (uniqueInstance == null)
            uniqueInstance = new Estacionamento();
        return uniqueInstance;
    }
    
    public void setVagas(Vaga vaga){
        vagas.add(vaga);
    }
    
    //implementar a QUANTIDADE LIMITE DO ESTACIONAMENTO
    
    /*
    public void setVagas(){
        for(int j = 0; j <= this.vagas[0].length; j++){
            vagas[2][j].especial = true;
        }
    }*/
}