package parksystem;


import carros.*;
import vagas.*;
import java.util.ArrayList;
import java.util.List;

public class Estacionamento {    
    List<Vaga> vagas = new ArrayList();
    private static Estacionamento uniqueInstance;
    
    private Estacionamento(){
        
    }
    
    //Implementação do SINGLETON
    public synchronized static Estacionamento getEstacionamento(){
        if (uniqueInstance == null)
            uniqueInstance = new Estacionamento();
        return uniqueInstance;
    }
    
    //linka a vaga ao carro
    public void estacionar(Carro carro, Vaga vaga){
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
        carro.vaga = vaga;
        carro.estacionado = true;
        carro.vaga.setCarro(carro);
    }
    
    //Esse método
    public void criaVagas(){
        for (int i = 97; i <= 100; i++){
            for (int j = 1; j <=4; j++){
                StringBuilder nomeVaga = new StringBuilder();
                nomeVaga.append((char) i);
                nomeVaga.append(j);
                Vaga tmp = new VagaNormal((nomeVaga).toString());
                setVagas(tmp);
                System.out.println(nomeVaga);
            }
        }
    }
    
    public void setVagas(Vaga vaga){
        if (vagas.size() == 16){
            System.out.println("Estacionamento CHEIO!");
            return;
        }
        vagas.add(vaga);
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
    
    //implementar a QUANTIDADE LIMITE DO ESTACIONAMENTO
    
    /*
    public void setVagas(){
        for(int j = 0; j <= this.vagas[0].length; j++){
            vagas[2][j].especial = true;
        }
    }*/
}