public class Main
{
    public static void main(String[] args) {
        System.out.println("PARK-SYSTEM v0.1\n");

        /* TESTE DE CRIAÇÃO DE OBJETOS */
        //Aqui é a parte para testar a criação de objetos
        CarroNormal carro1 = new CarroNormal("AND1337");
        CarroNormal carro2 = new CarroNormal("RFB2303");
        VagaNormal a1 = new VagaNormal("A1");
        VagaNormal a2 = new VagaNormal("A2");

        /* SINGLETON */
        //Implementação do SINGLETON, criando apenas UM objeto do seu tipo
        Estacionamento park = Estacionamento.getEstacionamento();
        
        //ATRIBUINDO AS VAGAS CRIADAS À LISTA VAGAS
        park.setVagas(a1);
        park.setVagas(a2);

        /* TESTE DE LINKAGEM ENTRE OBJETOS CARRO-VAGA */
        //setando os carros às vagas
        carro1.estacionar(a1);
        carro2.estacionar(a2);
        
        //deslinkando os carros às vagas
        carro1.sair();
        carro2.sair();
    }
}
