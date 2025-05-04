class ServicoDePagamento {
    private static ServicoDePagamento instancia;

    private ServicoDePagamento() {
        // Construtor privado impede instanciamento externo
    }

    public static ServicoDePagamento getInstancia() {
        if (instancia == null) {
            instancia = new ServicoDePagamento();
        }
        return instancia;
    }

    public void processarPagamento(Pagamento pagamento) {
        pagamento.processarPagamento();
    }
}