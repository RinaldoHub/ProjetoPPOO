package carros;

import vagas.Vaga;

public abstract class Carro {
    public String placaCarro; //identificador do carro
    public boolean estacionado = false; //atributo que determina se está estacionado
    public Vaga vaga; //vaga ocupada pelo carro
    public boolean isIdoso;
    public boolean isPCD;
    
    //construtor que atribui a string à vaga
    public Carro(String placa){
        this.placaCarro = placa;
    }
    
    //RESPONSABILIDADE DE ESTACIONAR MOVIDA PARA "ESTACIONAMENTO"
    
    //retorna a placa do carro
    public String getPlaca(){
        return placaCarro;
    }
    
    //retorna a vaga ocupada pelo carro
    public String getVaga(){
        return vaga.getId();
    }
    
    //esvazia a vaga, atribuindo null para o carro da vaga e vice-versa
    public void sairVaga(){
        
        if(this.vaga == null){
            System.out.println("O carro de placa: |" + this.getPlaca() +
                    "| não está ocupando nenhuma vaga");
        }
        else {
            System.out.println("O carro de placa: |" + this.getPlaca() +
                    "| saiu da vaga: |" + this.getVaga() + "|");
            this.vaga.carro = null;
            this.vaga = null;
        }

    }
    
    public void getAtributos() {
        System.out.println("\n///// Dados do carro /////");
        System.out.println("Placa: " + this.getPlaca());
        System.out.println("Idoso? " + this.isIdoso);
        System.out.println("PCD? " + this.isPCD);
        System.out.println("Estacionado? " + this.estacionado);
        
        if (this.estacionado) {
            System.out.println("Vaga: " + this.getVaga());
        }

    }
    
}