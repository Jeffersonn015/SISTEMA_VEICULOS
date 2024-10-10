package Sistema_veiculos;

// subclasse automóvel doméstico
class AutomovelDomestico extends Veiculos {
    private int quantidadePassageiros; // quantidade de passageiros no carro
    private String tipoFreio; // tipo de freio do carro
    private String airbag; // tipo de airbag do carro

    // construtor que recebe todos os parâmetros
    public AutomovelDomestico(String modelo, int anodeFabricacao, String montadora, String cor, double kilometragem, int quantidadePassageiros, String tipoFreio, String airbag) {
        super(modelo, anodeFabricacao, montadora, cor, kilometragem); // chamando o construtor da superclasse
        setQuantidadePassageiros(quantidadePassageiros); // setando quantidade de passageiros
        setTipoFreio(tipoFreio); // setando tipo de freio
        setAirbag(airbag); // setando tipo de airbag
    }

    // método para pegar a quantidade de passageiros
    public int getQuantidadePassageiros() {
        return quantidadePassageiros; // devolve a quantidade de passageiros
    }

    // método para setar a quantidade de passageiros
    public void setQuantidadePassageiros(int quantidadePassageiros) {
        if (quantidadePassageiros <= 0) { // checando se a quantidade é válida
            throw new IllegalArgumentException("A quantidade de passageiros deve ser maior que zero."); // se não for válida joga erro
        }
        this.quantidadePassageiros = quantidadePassageiros; // se for válida, setamos a quantidade
    }

    // método para pegar o tipo de freio
    public String getTipoFreio() {
        return tipoFreio; // devolve o tipo de freio
    }

    // método para setar o tipo de freio
    public void setTipoFreio(String tipoFreio) {
        if (tipoFreio == null || tipoFreio.isEmpty()) { // checando se o tipo de freio tá vazio
            throw new IllegalArgumentException("O tipo de freio não pode ser vazio."); // se estiver vazio joga erro
        }
        this.tipoFreio = tipoFreio; // se não estiver vazio, setamos o tipo de freio
    }

    // método para pegar o airbag
    public String getAirbag() {
        return airbag; // devolve o tipo de airbag
    }

    // método para setar o airbag
    public void setAirbag(String airbag) {
        if (airbag == null || airbag.isEmpty()) { // checando se o airbag tá vazio
            throw new IllegalArgumentException("O airbag não pode ser vazio."); // se estiver vazio joga erro
        }
        this.airbag = airbag; // se não estiver vazio, setamos o airbag
    }

    @Override
    String descricao() {
        return super.descricao() + "\nQuantidade de Passageiros: " + quantidadePassageiros +
                "\nTipo de Freio: " + tipoFreio + "\nAirbag: " + airbag; // chama a descrição da superclasse e adiciona as informações específicas
    }

    @Override
    String gerarInsert() {
        return String.format("INSERT INTO AutomovelDomestico(modelo, anodeFabricacao, montadora, cor, kilometragem, " +
                             "quantidadePassageiros, tipoFreio, airbag) VALUES ('%s', '%d', '%s', '%s', '%.2f', '%d', '%s', '%s');",
                             getModelo(), getAnodeFabricacao(), getMontadora(), getCor(), getKilometragem(),
                             quantidadePassageiros, tipoFreio, airbag); // formata o comando de inserção com os dados do veículo
    }
}
