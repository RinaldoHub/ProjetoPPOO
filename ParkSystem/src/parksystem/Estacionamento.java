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
        /*
        if (!carro.isIdoso & !carro.isPCD && vaga.isIdoso | vaga.isPCD){
            System.out.println("O Carro de placa: |" + carro.getPlaca() + 
                "| NÃO TEM PERMISSÃO PARA ESTACIONAR na vaga: |" + vaga.id + "|" );
            return;
        } else if (carro.isIdoso && !carro.isPCD && vaga.isPCD){
            System.out.println("O Carro de placa: |" + carro.getPlaca() + 
                "| NÃO TEM PERMISSÃO PARA ESTACIONAR na vaga: |" + vaga.id + "|" );
            return;
        } else if (carro.isPCD && !carro.isIdoso && vaga.isIdoso) {
            System.out.println("O Carro de placa: |" + carro.getPlaca() + 
                "| NÃO TEM PERMISSÃO PARA ESTACIONAR na vaga: |" + vaga.id + "|" );
            return;
        }
        
        System.out.println("O Carro de placa: |" + carro.getPlaca() + 
                "| ESTACIONOU na vaga: |" + vaga.id + "|" );
        */
        
        int index = getIndexVaga(vaga);
        carro.vaga = vagas.get(index);
        carro.estacionado = true;
        carro.vaga.setCarro(carro);
                       
    }

    public void sair(Vaga vaga){
        if (vaga.carro == null){
            System.out.println("NÃO HÁ CARRO NA VAGA");
            return;
        }
            
        System.out.println("O Carro de placa: |" + vaga.carro.getPlaca() + 
                "| SAIU da vaga: |" + vaga.id + "|" );
        vaga.liberarVaga();
        vaga.isParked = false;
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