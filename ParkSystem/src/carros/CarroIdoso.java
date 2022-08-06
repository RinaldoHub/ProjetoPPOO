package carros;

import vagas.VagaIdoso;

public class CarroIdoso extends Carro{
    VagaIdoso vaga;
    
    public CarroIdoso(String placa) {
        super(placa);
        this.isIdoso = true;
    }
        
}
