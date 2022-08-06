package parksystem;

import carros.*;
import vagas.*;
import java.util.ArrayList;
import java.util.List;

public class Estacionamento {    
    public List<Vaga> vagas;
    private static Estacionamento uniqueInstance;
    
    private Estacionamento(String filial){
        Filial fabrica;
        
        fabrica = new FilialFactory().construirFilal(filial);
        vagas = fabrica.construirVagas();
            
    }
    
    //Implementação do SINGLETON
    public synchronized static Estacionamento getEstacionamento(String filial){
        if (uniqueInstance == null)
            uniqueInstance = new Estacionamento(filial);
        return uniqueInstance;
    }
    
    //linka a vaga ao carro
    public void estacionar(Carro carro, String vaga){
        
        int index = getIndexVaga(vaga);

        if (!carro.isIdoso & !carro.isPCD && vagas.get(index).isIdoso | vagas.get(index).isPCD){
            System.out.println("O Carro de placa: |" + carro.getPlaca() + 
                "| NÃO TEM PERMISSÃO PARA ESTACIONAR na vaga: |" + vaga + "|" );
            return;
        } else if (carro.isIdoso && !carro.isPCD && vagas.get(index).isPCD){
            System.out.println("O Carro de placa: |" + carro.getPlaca() + 
                "| NÃO TEM PERMISSÃO PARA ESTACIONAR na vaga: |" + vaga + "|" );
            return;
        } else if (carro.isPCD && !carro.isIdoso && vagas.get(index).isIdoso) {
            System.out.println("O Carro de placa: |" + carro.getPlaca() + 
                "| NÃO TEM PERMISSÃO PARA ESTACIONAR na vaga: |" + vaga + "|" );
            return;
        }
        
        System.out.println("O Carro de placa: |" + carro.getPlaca() + 
                "| ESTACIONOU na vaga: |" + vaga + "|" );
        
        carro.vaga = vagas.get(index);
        carro.estacionado = true;
        carro.vaga.setCarro(carro);
          
    }

    public void sair(Carro carro){
        carro.sairVaga();
        
    }
    
    public int getIndexVaga(String id) {
        int index = 0;
        for (int i = 0; i < vagas.size(); i++) {
            String tmp = vagas.get(i).id;
            if (tmp.equals(id)) {
                index = i;
            }    
            
        }
        
        return index;
    }
    
}