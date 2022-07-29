/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carros;

import vagas.VagaIdoso;

/**
 *
 * @author Administrator
 */
public class CarroIdoso extends Carro{
    VagaIdoso vaga;
    
    public CarroIdoso(String placa) {
        super(placa);
        this.isIdoso = true;
    }
    
    
    
}
