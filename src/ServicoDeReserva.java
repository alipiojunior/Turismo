class ServicoDeReserva {
    private static ServicoDeReserva instancia;

    private ServicoDeReserva() {
        // Construtor privado impede instanciamento externo
    }

    public static ServicoDeReserva getInstancia() {
        if (instancia == null) {
            instancia = new ServicoDeReserva();
        }
        return instancia;
    }

    public Reserva criarReserva(Usuario usuario, Pacotes pacote) {
        Reserva reserva = new Reserva(usuario, pacote);
        reserva.setStatus("Pendente");
        System.out.println("Reserva criada com status: " + reserva.getStatus());
        usuario.adicionarReserva(reserva); 
        System.out.println("Status da reserva após confirmação: " + reserva.getStatus());
        return reserva;
    }

    public void cancelarReserva(Reserva reserva) {
        reserva.cancelarReserva();
    }
}
