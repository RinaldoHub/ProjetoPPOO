public abstract class Vaga {
    Carro carro; //variavel que armazenará um carro estacionado
    boolean ocupada = false; //teste para saber se está ocupada
    boolean especial; //atributo de vaga especial
    String id; //identificação da vaga
    
    //construtor que atribui a string à vaga
    public Vaga(String id){
        this.id = id;
    }
    
    //linka o carro à vaga e vice-versa
    public void setCarro(Carro carro){
        this.carro = carro;
        this.ocupada = true;
    }
    
    //esvazia a vaga, atribuindo null para o carro da vaga e vice-versa
    public void liberarVaga(){
        this.carro = null;
        this.ocupada = false;
    }
    
    //retorna a id da vaga
    public String getId(){
        return this.id;
    }
    
    //retorna a placa do carro que está ocupando a vaga
    public String getCarro(){
        return this.carro.getPlaca();
    }
    
    //retorna se o carro está estacionado
    public boolean isParked(){
        return this.ocupada;
    }
}
