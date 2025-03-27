import java.util.ArrayList;
import java.util.List;

class Usuario {
    private String nome;
    private String email;
    private String telefone;
    private List<Reserva> reservas;

    public Usuario(String nome, String email, String telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.reservas = new ArrayList<>(); 
    }

    public void adicionarReserva(Reserva reserva) {
        System.out.println("Reserva feita por " + nome + " para o pacote " + reserva.getPacote().name());
        reserva.setStatus("Confirmada");
        this.reservas.add(reserva);
    }

    public List<Reserva> getReservas() {
        return reservas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}