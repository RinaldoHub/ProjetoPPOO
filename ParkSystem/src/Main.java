public class Main
{
	public static void main(String[] args) {
		System.out.println("PARK-SYSTEM v0.1\n");
		
		CarroNormal carro1 = new CarroNormal("AND1337");
                Estacionamento park = new Estacionamento();
		
		System.out.println(carro1.getPlaca());
		
                VagaNormal vaga1 = new VagaNormal("A1");
                carro1.estacionar(vaga1);
                park.setVagas(vaga1);
                System.out.println(park.vagas);
	}
}
