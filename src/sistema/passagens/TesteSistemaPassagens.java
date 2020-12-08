package sistema.passagens;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;

import sistema.Cartao;
import sistema.Cidade;
import sistema.ContasTestes;
import sistema.Passagem;
import sistema.PassagemInteira;
import sistema.PassagemMeia;
import sistema.Passaporte;
import sistema.Pessoa;
import sistema.Voo;

/**
 * Classe Main
 *
 *
 *
 */
public class TesteSistemaPassagens {

    @SuppressWarnings("unlikely-arg-type")
    public static void main(String[] args) {

        loop:
        for (;;) {
            for (int i = 0; i < 100; i++) { 
                System.out.println("");
                
            }
            boolean t = true;
            @SuppressWarnings("resource")
            Scanner sc = new Scanner(System.in);

            ContasTestes contasTestes = new ContasTestes();

            RegistraVooTeste rvt = new RegistraVooTeste();
            List<Passagem> passagensCompra = new ArrayList<>();
            String menu = String.format("1 - Busca \n 2 - Listar Voos", "");
            int sel;
            for (;;) {
                sel = Integer.parseInt(JOptionPane.showInputDialog(menu));
                if (sel == 1 || sel == 2 || sel == 0) {
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "Digite opcao valida");
                }
            }
            System.out.println("Escolha do Voo");
            String men = String.format("[Lista de Voos]", "");
            switch (sel) {
                case 0:
                    JOptionPane.showMessageDialog(null, "Sistema Encerrado com sucesso!");
                    break loop;
                case 1:
                    String dest = JOptionPane.showInputDialog("Digite seu destino");
                    int i = 0;
                    for (Voo voo : rvt.voos) {
                        if (voo.getDestino().getNome().equals(dest)) {
                            men = String.format("Voo: %d - Destino:[%s - %s]\nHorario Partida:[%s] - Horario de Chegada:[%s]\n",
                                    rvt.voos.indexOf(voo), voo.getDestino().getNome(), voo.getDestino().getEstado(),
                                    voo.getHoraDeSaida(), voo.getHoraDeChegada());
                            men += "\n[Paradas]\n";
                            for (Cidade parada : voo.getParadas()) {
                                men += String.format("Cidade: [%s - %s]\n", parada.getNome(), parada.getEstado());

                            }
                            men += "------------------------------------------------------------------------------------------";
                            i++;

                        }
                    }
                    if (i == 0) {
                        JOptionPane.showMessageDialog(null, "Nenhum voo com esse destino encontrado");
                        t = false;
                    } else {
                        t = true;
                    }
                    break;
                case 2:
                    // ESCOLHA DO VOO

                    for (Voo voo : rvt.voos) {
                        men = String.format("Voo: %d - Destino:[%s - %s]\nHorario Partida:[%s] - Horario de Chegada:[%s]\n",
                                rvt.voos.indexOf(voo), voo.getDestino().getNome(), voo.getDestino().getEstado(),
                                voo.getHoraDeSaida(), voo.getHoraDeChegada());
                        men += "\n[Paradas]\n";
                        for (Cidade parada : voo.getParadas()) {
                            men += String.format("Cidade: [%s - %s]\n", parada.getNome(), parada.getEstado());

                        }
                        men += "------------------------------------------------------------------------------------------";
                    }
                    break;

            }
            if (t) {

                System.out.println(men);

                System.out.print("Voo: "); // no caso aeroporto
                int vooEscolhido = sc.nextInt();

                System.out.println();
                System.out.println("Quantidade de Assentos");
                System.out.print("Inteiras: ");
                int qtdInteira = sc.nextInt();
                System.out.print("Meias: ");
                int qtdMeia = sc.nextInt();

                int qtdPassagens = qtdInteira + qtdMeia;
                if (qtdPassagens == 0) {
                    JOptionPane.showMessageDialog(null, "Nenhuma passagem foi selecionada");
                    t = false;
                }
                if (t) {
                    // ESCOLHA DO VOO
                    // ESCOLHA DOS ASSENTOS
                    System.out.println();
                    System.out.println("Escolha dos Assentos");
                    for (Voo voo : rvt.voos) {
                        String ma = String.format("Assentos:\n", "");
                        if (vooEscolhido == rvt.voos.indexOf(voo)) {
                            for (int i = 0; i < voo.getAssentosVoo().length; i++) {
                                ma += String.format("%4s", i + " - ");
                                for (int j = 0; j < voo.getAssentosVoo()[i].length; j++) {

                                    if (!voo.getAssentosVoo()[i][j].getStatus()) {
                                        ma += String.format("%4s", "[V]");
                                    } else {
                                        ma += String.format("%4s", "[X]");
                                    }
                                }
                                ma += String.format("\n", "");
                            }
                            ma += String.format("%4s", "");
                            for (int i = 0; i < voo.getAssentosVoo()[0].length; i++) {
                                ma += String.format("%4s", i);
                            }
                            System.out.print(ma);

                            for (int i = 0; i < qtdPassagens; i++) {

                                System.out.print("\nAssento([linha][coluna]): ");
                                int linha = sc.nextInt();
                                int coluna = sc.nextInt();
                                sc.nextLine();
                                if (voo.getAssentosVoo()[linha][coluna].getStatus() == false) {
                                    System.out.println("Assento desocupado! ");
                                    voo.registraAssento(linha, coluna);
                                } else {
                                    System.out.println("Assento ocupado! ");
                                }

                                System.out.println();
                                Passagem pI = new Passagem(null, null);

                                System.out.println("Registro de Passagens: ");

                                System.out.print("CPF: ");
                                String cpf = sc.nextLine();
                                System.out.print("Numero do passaporte: ");
                                String numPassaporte = sc.nextLine();
                                if (!contasTestes.pessoaExiste(cpf)) {
                                    String nnome = JOptionPane.showInputDialog("Digite Seu nome");
                                    int nano = Integer.parseInt(JOptionPane.showInputDialog("Insira o seu ano de nascimento"));
                                    int nmes = Integer.parseInt(JOptionPane.showInputDialog("Insira o seu mes de nascimento"));
                                    int ndia = Integer.parseInt(JOptionPane.showInputDialog("Insira o seu dia de nascimento"));
                                    LocalDateTime dataN = LocalDateTime.of(nano, nmes, ndia, 0, 0, 0);

                                    contasTestes.inserePessoa(new Pessoa(nnome, cpf, dataN, new Passaporte(
                                            JOptionPane.showInputDialog("Pais Emissor do passaporte"), numPassaporte, true)));
                                }

                                System.out.print("Meia[S/N]: ");
                                String m = sc.nextLine();

                                for (Pessoa pessoa : contasTestes.pessoas) {
                                    if (cpf.equals(pessoa.getCpf())
                                            && numPassaporte.equals(pessoa.getPassaporte().getNumPassaporte())) {
                                        if ((m.equals("S") || m.equals("s"))) {
                                            if (pessoa.verificaCrianca()) {
                                                pI = new PassagemMeia(null, null);
                                                pI.setAssento(voo.getAssentosVoo()[linha][coluna]);
                                                pI.setTitular(pessoa);
                                                pI.setVoo(voo);
                                                System.out.println("Registro bem sucedido!");
                                                System.out.println();
                                                passagensCompra.add(pI);
                                                System.out.println(pI);

                                            } else {
                                                JOptionPane.showMessageDialog(null, "Pessoa Informada não é criança", "ERRO", 0);
                                                i--;
                                            }

                                        } else {
                                            pI = new PassagemInteira(null, null);
                                            pI.setAssento(voo.getAssentosVoo()[linha][coluna]);
                                            pI.setTitular(pessoa);
                                            pI.setVoo(voo);
                                            System.out.println("Registro bem sucedido!");
                                            System.out.println();
                                            passagensCompra.add(pI);
                                            System.out.println(pI);
                                        }

                                    }
                                }
                            }
                        } else {
                            System.out.println("Nao deu certo");
                        }
                    }
                    // ESCOLHA DOS ASSENTOS

                    // PAGAMENTO
                    System.out.println();
                    System.out.print("Pagamento cartao(CRED/DEB): ");
                    String tipoPagamento = sc.nextLine();

                    if (tipoPagamento.equals("CRED")) {
                        System.out.println("PAGAMENTO NO CREDITO!");
                        System.out.print("Nome do Titular: ");
                        String nomeTitular = sc.nextLine();

                        for (Cartao cartao : contasTestes.cartoesCredito) {
                            String nome = cartao.getConta().getNomeTitular();
                            if (nome.equals(nomeTitular)) {

                                double valor = 0;// vai depender do Voo
                                for (Passagem passagem : passagensCompra) {
                                    valor += passagem.defineValor();
                                }

                                System.out.print("Numero do cartao: ");
                                int numeroCartao = sc.nextInt();
                                System.out.print("Digite a senha: ");
                                int senha = sc.nextInt();
                                String local = "Aeroporto de Goiania";

                                System.out.println("-----------------------------------------------------");

                                if (cartao.autentica(nome, numeroCartao, senha)) {
                                    for (Passagem passagem : passagensCompra) {
                                        System.out.println(passagem);
                                    }
                                    cartao.compraCredito(nome, numeroCartao, valor, local);
                                } else {
                                    System.out.println("Dados Invalidos!");
                                }

                            } else {
                                System.out.println("erro");
                            }
                        }

                    } else if (tipoPagamento.equals("DEB")) {
                        System.out.println("PAGAMENTO NO DEBITO!");
                        System.out.print("Nome do Titular : ");
                        String nomeTitular = sc.nextLine();

                        for (Cartao cartao : contasTestes.cartoesDebito) {
                            String nome = cartao.getConta().getNomeTitular();
                            if (nome.equals(nomeTitular)) {

                                double valor = 0; // vai depender do Voo
                                // vai depender do Voo
                                for (Passagem passagem : passagensCompra) {
                                    valor += passagem.defineValor();
                                }
                                System.out.print("Numero do cartao: ");
                                int numeroCartao = sc.nextInt();
                                System.out.print("Digite a senha: ");
                                int senha = sc.nextInt();
                                String local = "Aeroporto de Goiania";
                                System.out.println("-----------------------------------------------------");

                                if (cartao.autentica(nome, numeroCartao, senha)) {
                                    for (Passagem passagem : passagensCompra) {
                                        System.out.println(passagem);
                                    }
                                    cartao.compraDebito(valor, local);

                                } else {
                                    System.out.println("Dados Invalidos!");
                                }

                            } else {
                                System.out.println("erro");
                            }
                        }

                    }
                } // PAGAMENTO

            }
        }
    }
}
