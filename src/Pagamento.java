class Pagamento {
    private Reserva reserva;
    private String metodo;
    private double valor;
    private String status;
    
    public Pagamento(Reserva reserva, String metodo, double valor) {
        this.reserva = reserva;
        this.metodo = metodo;
        this.valor = valor;
        status = "Pendente";
    }
    
    public void processarPagamento() {
        if (this.reserva.getStatus().equals("Confirmada")) {
            this.status = "Pago";
            System.out.println("Pagamento de R$" + valor + " realizado via " + metodo);
        } else {
            System.out.println("Não é possível processar o pagamento, a reserva não está confirmada.");
        }
    }
}
