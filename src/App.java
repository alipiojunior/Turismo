import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o país do destino: ");
        String paisDestino = scanner.nextLine();

        System.out.print("Digite o nome da cidade: ");
        String nomeDestino = scanner.nextLine();

        Destino destino = new Destino(nomeDestino, paisDestino);

        System.out.println("\nEscolha um pacote de turismo:");
        for (Pacotes pacote : Pacotes.values()) {
            System.out.println(pacote.ordinal() + 1 + " - " + pacote.name() + " (R$" + pacote.getPreco() + ") - " + pacote.getDescricao());
        }

        System.out.print("\nDigite o nome do pacote desejado (exemplo: ECONOMICO): ");
        String pacoteEscolhidoNome = scanner.nextLine().toUpperCase();

        Pacotes pacoteEscolhido = null;
        try {
            pacoteEscolhido = Pacotes.valueOf(pacoteEscolhidoNome);
            System.out.println("\nVocê escolheu o pacote: " + pacoteEscolhido.name() + " - " + pacoteEscolhido.getDescricao());
        } catch (IllegalArgumentException e) {
            System.out.println("Pacote inválido. Encerrando o programa.");
            scanner.close();
            return;
        }

        System.out.print("\nDigite o seu nome: ");
        String nomeUsuario = scanner.nextLine();
        
        System.out.print("Digite o seu e-mail: ");
        String emailUsuario = scanner.nextLine();
        
        System.out.print("Digite o seu telefone: ");
        String telefoneUsuario = scanner.nextLine();

        Usuario usuario = new Usuario(nomeUsuario, emailUsuario, telefoneUsuario);

        Reserva reserva = new Reserva(usuario, pacoteEscolhido);
        System.out.println("Reserva criada com status: " + reserva.getStatus());
        
        usuario.fazerReserva(reserva);  
        System.out.println("Status da reserva após confirmação: " + reserva.getStatus());
    
        System.out.print("Digite o método de pagamento (ex: Cartão de Crédito): ");
        String metodoPagamento = scanner.nextLine();

        Pagamento pagamento = new Pagamento(reserva, metodoPagamento, pacoteEscolhido.getPreco());
        pagamento.processarPagamento();
        
        scanner.close();
    }
}
