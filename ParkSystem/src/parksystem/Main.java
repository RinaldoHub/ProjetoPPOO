package parksystem;


import carros.*;
import vagas.*;

public class Main
{
    public static void main(String[] args) {
        System.out.println("PARK-SYSTEM v0.3\n");

        /* TESTE DE CRIAÇÃO DE OBJETOS */
        //IMPLEMENTAR A CRIAÇÃO COM FLYWEIGHT
        //Aqui é a parte para testar a criação de objetos
        Carro carro1 = new CarroNormal("AND1337");
        Carro carro2 = new CarroNormal("RFB2303");
        Vaga a1 = new VagaNormal("A1");
        Vaga a2 = new VagaNormal("A2");

        /* SINGLETON */
        //Implementação do SINGLETON, criando apenas UM objeto do seu tipo
        Estacionamento park = Estacionamento.getEstacionamento();
        
        //ATRIBUINDO AS VAGAS CRIADAS À LISTA VAGAS
        park.setVagas(a1);
        park.setVagas(a2);

        /* TESTE DE LINKAGEM ENTRE OBJETOS CARRO-VAGA */
        //setando os carros às vagas
        carro1.estacionar(a1); //o estacionamento que DEVE OBSERVAR SE UM CARRO FOI
        carro2.estacionar(a2); //ESTACIONADO
        
        //deslinkando os carros às vagas
        carro1.sair();
        carro2.sair();
    }
}
