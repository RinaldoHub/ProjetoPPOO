package parksystem;

import carros.*;

public class Main
{
    public static void main(String[] args) {
        System.out.println("PARK-SYSTEM v0.5\n");

        /* TESTE DE CRIAÇÃO DE OBJETOS */
        //IMPLEMENTAR A CRIAÇÃO COM FLYWEIGHT
        //Aqui é a parte para testar a criação de objetos
        Carro carro1 = new CarroNormal("AND1337");

        /* SINGLETON */
        //Implementação do SINGLETON, criando apenas UM objeto do seu tipo
        Estacionamento park = Estacionamento.getEstacionamento("Recife");
                
        /* TESTE DE LINKAGEM ENTRE OBJETOS CARRO-VAGA */
        //setando os carros às vagas
        //park.estacionar(carro1, "c1"); //O estacionamento que DEVE OBSERVAR SE UM CARRO FOI
        park.estacionar(carro1, "a1"); //ESTACIONADO
        
        carro1.getAtributos();
        
        //deslinkando os carros às vagas
        park.sair(carro1);
    }
}
