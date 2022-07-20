/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ALUNO
 */
public abstract class Carro {
    String placaCarro;
    boolean estacionado = false;
    Vaga vaga;
    
    public void estacionar(Vaga vaga){
        this.vaga = vaga;
    }
    public String getPlaca(){
        return placaCarro;
    }
    public void sair(){
        this.vaga = null;
    }
    
}
