public abstract class Carro {
    String placaCarro; //identificador do carro
    boolean estacionado = false; //atributo que determina se está estacionado
    Vaga vaga; //vaga ocupada pelo carro
    
    //construtor que atribui a string à vaga
    public Carro(String placa){
        this.placaCarro = placa;
    }
    
    //linka a vaga ao carro
    public void estacionar(Vaga vaga){
        System.out.println("O Carro de placa: |" + this.getPlaca() + 
                "| ESTACIONOU na vaga: |" + vaga.id + "|" );
        this.vaga = vaga;
        this.estacionado = true;
        this.vaga.setCarro(this);
    }
    
    //retorna a placa do carro
    public String getPlaca(){
        return placaCarro;
    }
    
    //retorna a vaga ocupada pelo carro
    public String getVaga(){
        return vaga.getId();
    }
    
    public void sair(){
        System.out.println("O Carro de placa: |" + this.getPlaca() + 
                "| SAIU da vaga: |" + this.vaga.id + "|" );
        vaga.liberarVaga();
        this.vaga = null;
        this.estacionado = false;
    }
    
}
