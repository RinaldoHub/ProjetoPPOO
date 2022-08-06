package vagas;

import carros.Carro;

public abstract class Vaga {
    public Carro carro = null; //variavel que armazenará um carro estacionado
    public String id; //identificação da vaga
    public boolean isIdoso;
    public boolean isPCD;
    public boolean isParked;
    
    //construtor que atribui a string à vaga
    public Vaga(String id){
        this.id = id;
    }
    
    //linka o carro à vaga e vice-versa
    public void setCarro(Carro carro){
        this.carro = carro;
    }

    //retorna a id da vaga
    public String getId(){
        return this.id;
    }
    
    //retorna a placa do carro que está ocupando a vaga
    public String getCarro(){
        return this.carro.getPlaca();
    }
}
