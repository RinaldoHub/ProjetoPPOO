package carros;

import vagas.VagaNormal;

public class CarroNormal extends Carro {
    VagaNormal vaga;

    public CarroNormal(String placa) {
        super(placa);
        this.isIdoso = false;
        this.isPCD = false;
    }
    
}