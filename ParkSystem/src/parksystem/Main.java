package parksystem;


import carros.*;
import vagas.*;

public class Main
{
    public static void main(String[] args) {
        System.out.println("PARK-SYSTEM v0.5\n");

        /* TESTE DE CRIAÇÃO DE OBJETOS */
        //IMPLEMENTAR A CRIAÇÃO COM FLYWEIGHT
        //Aqui é a parte para testar a criação de objetos
        Carro carro1 = new CarroNormal("AND1337");
        //Carro carro2 = new CarroIdoso("RFB2303");
        //Carro carro3 = new CarroPCD("LUC1234");

        /* SINGLETON */
        //Implementação do SINGLETON, criando apenas UM objeto do seu tipo
        Estacionamento park = Estacionamento.getEstacionamento("Recife");
                
        /* TESTE DE LINKAGEM ENTRE OBJETOS CARRO-VAGA */
        //setando os carros às vagas
        park.estacionar(carro1, "a1"); //o estacionamento que DEVE OBSERVAR SE UM CARRO FOI
        //park.estacionar(carro2, a1); //ESTACIONADO
        //park.estacionar(carro3, c4);
        
        System.out.println("///// Dados do carro /////");
        System.out.println("Placa: " + carro1.getPlaca());
        System.out.println("Estacionado? " + carro1.estacionado);
        System.out.println("Vaga: " + carro1.getVaga());
        System.out.println("Idoso? " + carro1.isIdoso);
        System.out.println("PCD? " + carro1.isPCD);
        
        //deslinkando os carros às vagas
        //park.sair(a1);
        //park.sair(a2);
        //park.sair(a3);
    }
}
