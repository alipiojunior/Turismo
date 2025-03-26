class Reserva {
    private Usuario usuario;
    private String status;
    private Pacotes pacote; 
    
    public Reserva(Usuario usuario, Pacotes pacote) {
        this.usuario = usuario;
        this.status = "Pendente";
        this.pacote = pacote; 
    }
    
    public void cancelarReserva() {
        if (this.status.equals("Confirmada")) {
            this.status = "Cancelada";
            System.out.println("Reserva cancelada com sucesso.");
        } else {
            System.out.println("Reserva não pode ser cancelada.");
        }
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Pacotes getPacote() {
        return pacote;
    }

    public void setPacote(Pacotes pacote) {
        this.pacote = pacote;
    }
}