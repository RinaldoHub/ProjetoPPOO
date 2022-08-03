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
        Carro carro2 = new CarroIdoso("RFB2303");
        Carro carro3 = new CarroPCD("LUC1234");
        //Vaga a1 = new VagaNormal("A1");
        //Vaga a2 = new VagaIdoso("A2");
        //Vaga a3 = new VagaPcd("A3");

        /* SINGLETON */
        //Implementação do SINGLETON, criando apenas UM objeto do seu tipo
        Estacionamento park = Estacionamento.getEstacionamento("Recife");
        
        //park.criaVagas();
        
        System.out.println(carro3.isIdoso + " " + carro3.isPCD);
        
        //ATRIBUINDO AS VAGAS CRIADAS À LISTA VAGAS
        //Vaga tmp = park.vagas.contains(a2)
        //park.setVagas(a1);
        //park.setVagas(a2);

        /* TESTE DE LINKAGEM ENTRE OBJETOS CARRO-VAGA */
        //setando os carros às vagas
        park.estacionar(carro3, a2); //o estacionamento que DEVE OBSERVAR SE UM CARRO FOI
        //park.estacionar(carro2, a1); //ESTACIONADO
        //park.estacionar(carro3, c4);
        
        //deslinkando os carros às vagas
        park.sair(a1);
        park.sair(a2);
        park.sair(a3);
    }
}
