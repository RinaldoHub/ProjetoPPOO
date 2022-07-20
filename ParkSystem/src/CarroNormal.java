public class CarroNormal extends Carro {
    boolean estacionado;
    String placa;
    Vaga vaga;
    
    public CarroNormal(String placa){
        this.placa = placa;
    }
    
    @Override
    public String getPlaca(){
        return placa;
    }
    
    @Override
    public void estacionar(Vaga vaga){
        this.vaga = vaga;
    }
    
    @Override
    public void sair(){
        
    }
}