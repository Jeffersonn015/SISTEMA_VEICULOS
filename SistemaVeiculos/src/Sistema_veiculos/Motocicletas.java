package Sistema_veiculos;

// classe motocicletas
class Motocicletas extends Veiculos {
    private int cilindradas; // cilindrada da motocicleta
    private int torque; // torque da motocicleta

    // construtor que recebe todos os parâmetros
    public Motocicletas(String modelo, int anodeFabricacao, String montadora, String cor, double kilometragem, int cilindradas, int torque) {
        super(modelo, anodeFabricacao, montadora, cor, kilometragem); // chamando o construtor da superclasse
        setCilindradas(cilindradas); // setando cilindradas
        setTorque(torque); // setando torque
    }

    // método para pegar as cilindradas
    public int getCilindradas() {
        return cilindradas; // devolve as cilindradas
    }

    // método para setar as cilindradas
    public void setCilindradas(int cilindradas) {
        if (cilindradas <= 0) { // checando se as cilindradas são válidas
            throw new IllegalArgumentException("As cilindradas devem ser maiores que zero."); // se não for válida joga erro
        }
        this.cilindradas = cilindradas; // se for válida, setamos
    }

    // método para pegar o torque
    public int getTorque() {
        return torque; // devolve o torque
    }

    // método para setar o torque
    public void setTorque(int torque) {
        if (torque <= 0) { // checando se o torque é válido
            throw new IllegalArgumentException("O torque deve ser maior que zero."); // se não for válida joga erro
        }
        this.torque = torque; // se for válida, setamos
    }

    @Override
    String descricao() {
        return super.descricao() + "\nCilindradas: " + cilindradas + "\nTorque: " + torque; // chama a descrição da superclasse e adiciona as informações específicas
    }

    @Override
    String gerarInsert() {
        return String.format("INSERT INTO Motocicletas(modelo, anodeFabricacao, montadora, cor, kilometragem, cilindradas, torque) " +
                             "VALUES ('%s', '%d', '%s', '%s', '%.2f', '%d', '%d');",
                             getModelo(), getAnodeFabricacao(), getMontadora(), getCor(), getKilometragem(),
                             cilindradas, torque); // formata o comando de inserção com os dados da motocicleta
    }
}
