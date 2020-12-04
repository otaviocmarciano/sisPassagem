package sistema.passagens;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

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
		
		ContasTestes contas = new ContasTestes();
		
		//Comprando passagem 
		
		RegistraVooTeste rvt = new RegistraVooTeste();
		
		System.out.println(rvt.voos.get(0).getDestino().getNome());
		
		System.out.println("Voo: "); //no caso aeroporto
		String vooEscolhido = sc.nextLine();
		
		//codigo para pegar o numero do voo
		
		System.out.println("Pagamento cartao: CRED/DEB");
		String tipoPagamento = sc.nextLine();
		
		System.out.println("Dados do cartao: ");
		String nomeTitular = sc.nextLine();
		int numero = sc.nextInt();
		
		System.out.println("Assento: ");
		
		//LocalDateTime.of(ano, mes, dia, horas, minutos).format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
		

	}

}
