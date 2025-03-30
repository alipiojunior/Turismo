enum Pacotes {
    Economico(899.90, "Pacote Econômico - 3 dias e 2 noites, hospedagem simples, café da manhã incluso"),
    Intermediario(1499.90, "Pacote Intermediário - 5 dias e 4 noites, hotel 3 estrelas, café da manhã e passeios"),
    Luxo(2999.90, "Pacote Luxo - 7 dias e 6 noites, resort 5 estrelas, all-inclusive, passeios guiados"),
    Aventura(1799.90, "Pacote Aventura - 5 dias e 4 noites, trilhas, rafting e atividades radicais"),
    Internacional(4999.90, "Pacote Internacional - 10 dias e 9 noites, voo incluso, city tours, hotel 4 estrelas");

    private final double preco;
    private final String descricao;

    Pacotes(double preco, String descricao) {
        this.preco = preco;
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public String getDescricao() {
        return descricao;
    }
}
