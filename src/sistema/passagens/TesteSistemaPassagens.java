package sistema.passagens;

import java.util.Scanner;

import sistema.Cartao;
import sistema.ContasTestes;
import sistema.PassagemInteira;
import sistema.Pessoa;
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
	
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		ContasTestes contasTestes = new ContasTestes();
		
		RegistraVooTeste rvt = new RegistraVooTeste();
		
		//ESCOLHA DO VOO 
		System.out.println("Escolha do Voo");
		System.out.print("Voo: "); //no caso aeroporto
		String vooEscolhido = sc.nextLine();
		System.out.print("Horario do voo(dd/MM/yyyy HH:MM:ss): ");
		String horario = sc.nextLine();
		
		System.out.println();
		System.out.println("Quantidade de Assentos");
		System.out.print("Inteiras: ");
		int qtdInteira = sc.nextInt();
		System.out.print("Meias: ");
		int qtdMeia = sc.nextInt();
		
		int qtdPassagens = qtdInteira + qtdMeia;
		
		//ESCOLHA DO VOO
		
		//horario voo SP: (2020, 12, 04, 15, 30, 00)  04/12/2020 15:30:00
		
		//ESCOLHA DOS ASSENTOS
		System.out.println();
		System.out.println("Escolha dos Assentos");
		for (Voo voo : rvt.voos) {
			if(vooEscolhido.equals(voo.getDestino().getNome()) && horario.equals(voo.getHoraDeSaida())) {
				
				for(int i = 0 ; i < qtdPassagens ;i++) {
					System.out.print("Assento([linha][coluna]): ");
					int linha = sc.nextInt();
					int coluna = sc.nextInt();
					sc.nextLine();
					if(voo.getAssentosVoo()[linha][coluna] == null) {
						System.out.println("Assento desocupado! ");
						voo.registraAssento(linha, coluna);
					} else {
						System.out.println("Assento ocupado! ");
					}
					
					System.out.println();
					PassagemInteira pI = new PassagemInteira(null, null);
					pI.setAssento(voo.getAssentosVoo()[linha][coluna]);
	
					
					System.out.println("Registro de Passagens: ");
					System.out.println("Passagem ID: " + pI.getId() + " - Assento " + pI.getAssento().getPosicao());
					System.out.print("Nome: ");
					String nome = sc.nextLine();
					System.out.print("CPF: ");
					String cpf = sc.nextLine();
					System.out.print("Data de Nascimento(dd/MM/yyyy): ");
					@SuppressWarnings("unused")
					String data = sc.nextLine();
					System.out.print("Numero do passaporte: ");
					String numPassaporte = sc.nextLine();
					
					
					//A Pessoa tem que ter registro
					for (Pessoa pessoas : contasTestes.pessoas) {
						
						if(cpf.equals(pessoas.getCpf()) && numPassaporte.equals(pessoas.getPassaporte().getNumPassaporte())) {	
							pI.setAssento(voo.getAssentosVoo()[linha][coluna]);
							pI.setTitular(pessoas);
							pI.setVoo(voo);
							
							
							System.out.println("Registro bem sucedido!");
							System.out.println();
							System.out.println(pI);
							
							
						} 
					}
				}
				
				
			} else {
				System.out.println("Nao deu certo");
			}
		}
		//ESCOLHA DOS ASSENTOS
		
		
		//PAGAMENTO
		System.out.println();
		System.out.print("Pagamento cartao(CRED/DEB): ");
		String tipoPagamento = sc.nextLine();
		
		if(tipoPagamento.equals("CRED")) {
			System.out.println("PAGAMENTO NO CREDITO!");
			System.out.print("Nome do Titular: ");
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
			}	
		}
		//PAGAMENTO
		
		
		
		
	}
}
		//LocalDateTime.of(ano, mes, dia, horas, minutos).format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
		


