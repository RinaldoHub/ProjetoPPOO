/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ALUNO
 */
public abstract class Vaga {
    Carro carro;
    boolean especial;
    String id;
    
    public Vaga(String id){
        this.id = id;
    }
    
    public void setCarro(Carro carro){
        this.carro = carro;
    }
    
    public void liberarVaga(){
        this.carro = null;
    }
    
    public boolean isSpecial(){
        return this.especial;
    }
    
    public String getId(){
        return this.id;
    }
}
