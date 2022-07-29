package carros;

import vagas.VagaNormal;

public class CarroNormal extends Carro {
    VagaNormal vaga;
    public boolean isIdoso = false;
    public boolean isPCD = false;
    
    public CarroNormal(String placa) {
        super(placa);
        this.isIdoso = false;
        this.isPCD = false;
    }
    
}