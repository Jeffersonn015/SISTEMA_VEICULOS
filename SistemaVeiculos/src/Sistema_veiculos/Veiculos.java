package Sistema_veiculos;

// superclasse para veículos
class Veiculos {
    private String modelo; // modelo do veículo
    private int anodeFabricacao; // ano de fabricação do veículo
    private String montadora; // montadora do veículo
    private String cor; // cor do veículo
    private double kilometragem; // quilometragem do veículo

    // construtor que recebe todos os parâmetros
    Veiculos(String modelo, int anodeFabricacao, String montadora, String cor, double kilometragem) {
        setModelo(modelo); // setando modelo
        setAnodeFabricacao(anodeFabricacao); // setando ano de fabricação
        setMontadora(montadora); // setando montadora
        setCor(cor); // setando cor
        setKilometragem(kilometragem); // setando quilometragem
    }

    // método para pegar o modelo
    public String getModelo() {
        return modelo; // devolve o modelo
    }

    // método para setar o modelo
    public void setModelo(String modelo) {
        if (modelo == null || modelo.isEmpty()) { // checando se modelo tá vazio
            throw new IllegalArgumentException("Modelo não pode ser vazio."); // se estiver vazio joga erro
        }
        this.modelo = modelo; // se não estiver vazio, setamos o modelo
    }

    // método para pegar o ano de fabricação
    public int getAnodeFabricacao() {
        return anodeFabricacao; // devolve o ano de fabricação
    }

    // método para setar o ano de fabricação
    public void setAnodeFabricacao(Integer anodeFabricacao) {
        if (anodeFabricacao == null || String.valueOf(anodeFabricacao).length() != 4) { // checando se ano é válido
            throw new IllegalArgumentException("Ano de fabricação inválido."); // se não for válido joga erro
        }
        this.anodeFabricacao = anodeFabricacao; // setamos o ano se tudo ok
    }

    // método para pegar a montadora
    public String getMontadora() {
        return montadora; // devolve a montadora
    }

    // método para setar a montadora
    public void setMontadora(String montadora) {
        if (montadora == null || montadora.isEmpty()) { // checando se montadora tá vazia
            throw new IllegalArgumentException("Montadora não pode ser vazia."); // se estiver vazia joga erro
        }
        this.montadora = montadora; // se não estiver vazia, setamos a montadora
    }

    // método para pegar a cor
    public String getCor() {
        return cor; // devolve a cor
    }

    // método para setar a cor
    public void setCor(String cor) {
        if (cor == null || cor.isEmpty()) { // checando se cor tá vazia
            throw new IllegalArgumentException("Cor não pode ser vazia."); // se estiver vazia joga erro
        }
        this.cor = cor; // se não estiver vazia, setamos a cor
    }

    // método para pegar a kilometragem
    public double getKilometragem() {
        return kilometragem; // devolve a kilometragem
    }

    // método para setar a quilometragem
    public void setKilometragem(double kilometragem) {
        if (kilometragem < 0) { // checando se quilometragem é negativa
            throw new IllegalArgumentException("Kilometragem não pode ser negativa."); // se for negativa joga erro
        }
        this.kilometragem = kilometragem; // se não for negativa, setamos a quilometragem
    }

    // método que descreve o veículo
    String descricao() {
        return "Modelo: " + modelo + "\nAno de Fabricação: " + anodeFabricacao +
               "\nMontadora: " + montadora + "\nCor: " + cor + "\nKilometragem: " + kilometragem;
    }

    // método que gera um comando de inserção 
    String gerarInsert() {
        return String.format("INSERT INTO Veiculos(modelo, anodeFabricacao, montadora, cor, kilometragem) " +
                             "VALUES ('%s', '%d', '%s', '%s', '%.2f');",
                             modelo, anodeFabricacao, montadora, cor, kilometragem);
    }
}
