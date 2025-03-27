class ServicoDeReserva {
    public Reserva criarReserva(Usuario usuario, Pacotes pacote) {
        Reserva reserva = new Reserva(usuario, pacote);
        reserva.setStatus("Pendente");
        System.out.println("Reserva criada com status: " + reserva.getStatus());
        usuario.adicionarReserva(reserva); // Usuário agora gerencia suas reservas
        System.out.println("Status da reserva após confirmação: " + reserva.getStatus());
        return reserva;
    }

    public void cancelarReserva(Reserva reserva) {
        reserva.cancelarReserva();
    }
}