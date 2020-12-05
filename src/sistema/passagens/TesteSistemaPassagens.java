package sistema.passagens;

import java.util.Scanner;

import sistema.Assento;
import sistema.Cartao;
import sistema.ContasTestes;
import sistema.Voo;

public class TesteSistemaPassagens {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		/*Uma mulher irá tentar realizar uma compra de passagens
		 * de Goiânia para São Paulo, junto com seu filho de 10 anos.
		 * A data de ida é 05/12/2020 e a data de volta é dia 12/12/2020.
		 * 
		 * Nome : Ana
		 * Filho : Gustavo
		 * 
		 */
	
		Scanner sc = new Scanner(System.in);
		
		ContasTestes contasTestes = new ContasTestes();
		
		RegistraVooTeste rvt = new RegistraVooTeste();
		
		//ESCOLHA DO VOO 
		System.out.print("Voo: "); //no caso aeroporto
		String vooEscolhido = sc.nextLine();
		
		System.out.println("Horario do voo: dd/MM/yyyy HH:MM:ss");
		String horario = sc.nextLine();
		
		System.out.print("Inteiras: ");
		int qtdInteira = sc.nextInt();
		System.out.print("Meias: ");
		int qtdMeia = sc.nextInt();
		
		int qtdPassagens = qtdInteira + qtdMeia;
	
		//horario voo SP: (2020, 12, 04, 15, 30, 00)  04/12/2020 15:30:00
		System.out.println(horario);
		
		for (Voo voo : rvt.voos) {
			if(vooEscolhido.equals(voo.getDestino().getNome()) && horario.equals(voo.getHoraDeSaida())) {
				System.out.println("Deu Certo");
				
				
//				for(int i = 0; i < voo.getAssentosVoo().length ; i++) {
//					System.out.println("linha");
//					for(int j = 0; j < voo.getAssentosVoo()[i].length ; j++) {
//						System.out.println("coluna");
//					}
//				}
				
			} else {
				System.out.println("Nao deu certo");
			}
			
			//System.out.println(voo.getDestino().getNome());
		}
		//ESCOLHA DO VOO
		
		//PAGAMENTO
		System.out.print("Pagamento cartao: CRED/DEB ");
		String tipoPagamento = sc.nextLine();
		
		if(tipoPagamento.equals("CRED")) {
			System.out.println("PAGAMENTO NO CREDITO!");
			System.out.print("Nome do Titular : ");
			String nomeTitular = sc.nextLine();
			
			for (Cartao cartao: contasTestes.cartoesCredito) {
				String nome = cartao.getConta().getNomeTitular();
				if(nome.equals(nomeTitular)) {
					System.out.print("Valor da Passagem: ");
					double valor = sc.nextDouble(); //vai depender do Voo
					System.out.print("Numero do cartao: ");
					int numeroCartao = sc.nextInt();
					System.out.print("Digite a senha: ");
					int senha = sc.nextInt();
					String local = "Aeroporto de Goiania";
					
					valor = valor*qtdInteira + valor*qtdMeia/2;
					if(cartao.autentica(nome, numeroCartao, senha)) {
						cartao.compraCredito(nome, numeroCartao, valor, local);
					} else {
						System.out.println("Dados Invalidos!");
					}
			
				} else {
					System.out.println("erro");
				}
			}
			
		} else if(tipoPagamento.equals("DEB")) {
			System.out.println("PAGAMENTO NO DEBITO!");
			System.out.print("Nome do Titular : ");
			String nomeTitular = sc.nextLine();
			
			for (Cartao cartao: contasTestes.cartoesDebito) {
				String nome = cartao.getConta().getNomeTitular();
				if(nome.equals(nomeTitular)) {
					System.out.print("Valor da Passagem: ");
					double valor = sc.nextDouble(); //vai depender do Voo
					System.out.print("Numero do cartao: ");
					int numeroCartao = sc.nextInt();
					System.out.print("Digite a senha: ");
					int senha = sc.nextInt();
					String local = "Aeroporto de Goiania";
					
					valor = valor*qtdInteira + valor*qtdMeia/2;
					if(cartao.autentica(nome, numeroCartao, senha)) {
						cartao.compraDebito(valor, local);
					} else {
						System.out.println("Dados Invalidos!");
					}
			
				} else {
					System.out.println("erro");
				}
			//PAGAMENTO
				
				
			}	
		}
		
		System.out.println("Escolha dos assentos: [linha][coluna]");
		int i = sc.nextInt();
		int j = sc.nextInt();
		
		
	}
}
		//LocalDateTime.of(ano, mes, dia, horas, minutos).format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
		


