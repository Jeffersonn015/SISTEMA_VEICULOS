package Sistema_veiculos;

// classe caminhões
class Caminhoes extends Veiculos {
    private int eixos; // quantidade de eixos do caminhão
    private int pesoBruto; // peso bruto do caminhão

    // construtor que recebe todos os parâmetros
    public Caminhoes(String modelo, int anodeFabricacao, String montadora, String cor, double kilometragem, int eixos, int pesoBruto) {
        super(modelo, anodeFabricacao, montadora, cor, kilometragem); // chamando o construtor da superclasse
        setEixos(eixos); // setando a quantidade de eixos
        setPesoBruto(pesoBruto); // setando o peso bruto
    }

    // método para pegar a quantidade de eixos
    public int getEixos() {
        return eixos; // devolve a quantidade de eixos
    }

    // método para setar a quantidade de eixos
    public void setEixos(int eixos) {
        if (eixos <= 0) { // checando se a quantidade de eixos é válida
            throw new IllegalArgumentException("A quantidade de eixos deve ser maior que zero."); // se não for válida joga erro
        }
        this.eixos = eixos; // se for válida, setamos
    }

    // método para pegar o peso bruto
    public int getPesoBruto() {
        return pesoBruto; // devolve o peso bruto
    }

    // método para setar o peso bruto
    public void setPesoBruto(int pesoBruto) {
        if (pesoBruto <= 0) { // checando se o peso bruto é válido
            throw new IllegalArgumentException("O peso bruto deve ser maior que zero."); // se não for válida joga erro
        }
        this.pesoBruto = pesoBruto; // se for válida
    }

    @Override
    String descricao() {
        return super.descricao() + "\nEixos: " + eixos + "\nPeso Bruto: " + pesoBruto; // chama a descrição da superclasse e adiciona as informações específicas
    }

    @Override
    String gerarInsert() {
        return String.format("INSERT INTO Caminhoes(modelo, anodeFabricacao, montadora, cor, kilometragem, eixos, pesoBruto) " +
                             "VALUES ('%s', '%d', '%s', '%s', '%.2f', '%d', '%d');",
                             getModelo(), getAnodeFabricacao(), getMontadora(), getCor(), getKilometragem(), eixos, pesoBruto); // formata o comando de inserção com os dados do caminhão
    }
}
