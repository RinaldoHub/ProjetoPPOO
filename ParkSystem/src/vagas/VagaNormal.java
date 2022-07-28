package vagas;

import carros.Carro;

public class VagaNormal extends Vaga {
    boolean especial = false; //atributo de vaga especial
    
    public VagaNormal(String id) {
        super(id);
    }

    //linka o carro à vaga e vice-versa
    public void setCarro(Carro carro){
        this.carro = carro;
        this.ocupada = true;
    }
}