package Sistema_veiculos;

// classe bicicletas
class Bicicletas {
    private String modelo; // modelo da bicicleta
    private String marca; // marca da bicicleta
    private String cor; // cor da bicicleta
    private String material; // material da bicicleta
    private int quantidadeMarchas; // quantidade de marchas da bicicleta
    private String amortecedor; // tipo de amortecedor da bicicleta

    // construtor que recebe todos os parâmetros
    public Bicicletas(String modelo, String marca, String cor, String material, int quantidadeMarchas, String amortecedor) {
        this.modelo = modelo; // setando o modelo
        this.marca = marca; // setando a marca
        this.cor = cor; // setando a cor
        this.material = material; // setando o material
        setQuantidadeMarchas(quantidadeMarchas); // setando a quantidade de marchas
        this.amortecedor = amortecedor; // setando o amortecedor
    }

    // método para pegar o modelo
    public String getModelo() {
        return modelo; // devolve o modelo
    }

    // método para setar o modelo
    public void setModelo(String modelo) {
        if (modelo == null || modelo.isEmpty()) { // checando se o modelo é válido
            throw new IllegalArgumentException("Modelo não pode ser vazio."); // se não for válido joga erro
        }
        this.modelo = modelo; // se for válida
    }

    // método para pegar a marca
    public String getMarca() {
        return marca; // devolve a marca
    }

    // método para setar a marca
    public void setMarca(String marca) {
        if (marca == null || marca.isEmpty()) { // checando se a marca é válida
            throw new IllegalArgumentException("Marca não pode ser vazia."); // se não for válida joga erro
        }
        this.marca = marca; // se for válida
    }

    // método para pegar a cor
    public String getCor() {
        return cor; // devolve a cor
    }

    // método para setar a cor
    public void setCor(String cor) {
        if (cor == null || cor.isEmpty()) { // checando se a cor é válida
            throw new IllegalArgumentException("Cor não pode ser vazia."); // se não for válida joga erro
        }
        this.cor = cor; // se for válida
    }

    // método para pegar o material
    public String getMaterial() {
        return material; // devolve o material
    }

    // método para setar o material
    public void setMaterial(String material) {
        if (material == null || material.isEmpty()) { // checando se o material é válido
            throw new IllegalArgumentException("Material não pode ser vazio."); // se não for válido joga erro
        }
        this.material = material; // se for válida, setamos
    }

    // método para pegar a quantidade de marchas
    public int getQuantidadeMarchas() {
        return quantidadeMarchas; // devolve a quantidade de marchas
    }

    // método para setar a quantidade de marchas
    public void setQuantidadeMarchas(int quantidadeMarchas) {
        if (quantidadeMarchas <= 0) { // checando se a quantidade de marchas é válida
            throw new IllegalArgumentException("A quantidade de marchas deve ser maior que zero."); // se não for válido joga erro
        }
        this.quantidadeMarchas = quantidadeMarchas; // se for válida
    }

    // método para pegar o amortecedor
    public String getAmortecedor() {
        return amortecedor; // devolve o tipo de amortecedor
    }

    // método para setar o amortecedor
    public void setAmortecedor(String amortecedor) {
        if (amortecedor == null || amortecedor.isEmpty()) { // checando se o amortecedor é válido
            throw new IllegalArgumentException("O amortecedor não pode ser vazio."); // se não for válido joga erro
        }
        this.amortecedor = amortecedor; // se for válida
    }

    // método que descreve a bicicleta
    String descricao() {
        return "\nModelo: " + modelo + "\nMarca: " + marca + "\nCor: " + cor + "\nMaterial: " + material +
               "\nQuantidade de Marchas: " + quantidadeMarchas + "\nAmortecedor: " + amortecedor; // retorna a descrição da bicicleta
    }

    String gerarInsert() {
        return String.format("INSERT INTO Bicicletas(modelo, marca, cor, material, quantidadeMarchas, amortecedor) " +
                             "VALUES ('%s', '%s', '%s', '%s', '%d', '%s');",
                             modelo, marca, cor, material, quantidadeMarchas, amortecedor); // formata o comando de inserção com os dados da bicicleta
    }
}
