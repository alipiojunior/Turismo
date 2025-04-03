import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ServicoDeReserva servicoDeReserva = new ServicoDeReserva();
        ServicoDePagamento servicoDePagamento = new ServicoDePagamento();

        System.out.print("Digite o país do destino: ");
        String paisDestino = scanner.nextLine();

        System.out.print("Digite o nome da cidade: ");
        String nomeDestino = scanner.nextLine();

        Destino destino = new Destino(nomeDestino, paisDestino);

        System.out.println("\nEscolha um pacote de turismo (digite o número correspondente):");
        Pacotes[] pacotes = Pacotes.values();
        for (int i = 0; i < pacotes.length; i++) {
            System.out.println((i + 1) + " - " + pacotes[i].getNomeFormatado() + " (R$" + pacotes[i].getPreco() + ") - " + pacotes[i].getDescricao());
        }

        int escolhaPacote;
        Pacotes pacoteEscolhido = null;
        while (pacoteEscolhido == null) {
            System.out.print("\nDigite o número do pacote desejado: ");
            if (scanner.hasNextInt()) {
                escolhaPacote = scanner.nextInt();
                if (escolhaPacote >= 1 && escolhaPacote <= pacotes.length) {
                    pacoteEscolhido = pacotes[escolhaPacote - 1];
                    scanner.nextLine(); 
                    System.out.println("\nVocê escolheu o pacote: " + pacoteEscolhido.getNomeFormatado() + " - " + pacoteEscolhido.getDescricao());
                } else {
                    System.out.println("Opção inválida. Digite um número entre 1 e " + pacotes.length + ".");
                }
            } else {
                System.out.println("Entrada inválida. Digite um número.");
                scanner.next(); 
            }
        }

        System.out.print("\nDigite o seu nome: ");
        String nomeUsuario = scanner.nextLine();

        System.out.print("Digite o seu e-mail: ");
        String emailUsuario = scanner.nextLine();

        System.out.print("Digite o seu telefone: ");
        String telefoneUsuario = scanner.nextLine();

        Usuario usuario = new Usuario(nomeUsuario, emailUsuario, telefoneUsuario);

        Reserva reserva = servicoDeReserva.criarReserva(usuario, pacoteEscolhido);

        System.out.print("Digite o método de pagamento (ex: Cartão de Crédito): ");
        String metodoPagamento = scanner.nextLine();

        Pagamento pagamento = new Pagamento(reserva, metodoPagamento, pacoteEscolhido.getPreco());

        servicoDePagamento.processarPagamento(pagamento);

        scanner.close();
    }
}