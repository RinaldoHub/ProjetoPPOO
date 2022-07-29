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
    
}
