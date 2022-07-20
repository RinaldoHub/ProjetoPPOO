public class VagaNormal extends Vaga {
    boolean ocupada;
    CarroNormal carro;

    public VagaNormal(String id) {
        super(id);
    }
    
    void setCarro(CarroNormal carro){
        this.carro = carro;
    }
}