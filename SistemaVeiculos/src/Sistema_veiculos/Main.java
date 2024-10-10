package Sistema_veiculos;

public class Main { // classe main

    public static void main(String[] args) {

        try {
            // Objeto Automóvel Doméstico
            AutomovelDomestico carro = new AutomovelDomestico("Civic", 2024, "Honda", "Prata", 9000, 5, "ABS", "Sim");
            System.out.println("Automóvel Doméstico:");
            System.out.println(carro.descricao());
            System.out.println("Comando INSERT:"); 
            System.out.println(carro.gerarInsert());
        } catch (IllegalArgumentException deuErro) {
            System.out.println("Erro ao criar o Automóvel Doméstico: " + deuErro.getMessage());
        }

        try {
            // Objeto Motocicleta
            Motocicletas moto = new Motocicletas("MT-09", 2022, "Yamaha", "Preta", 1000, 847, 8);
            System.out.println("\nMotocicleta:");
            System.out.println(moto.descricao());
            System.out.println("Comando INSERT:");
            System.out.println(moto.gerarInsert());
        } catch (IllegalArgumentException deuErro) {
            System.out.println("Erro ao criar a Motocicleta: " + deuErro.getMessage());
        }

        try {
            // Objeto Caminhão
            Caminhoes caminhao = new Caminhoes("Scania 620S V8", 2022, "Scania", "Branco", 200000, 6, 16000);
            System.out.println("\nCaminhão:");
            System.out.println(caminhao.descricao());
            System.out.println("Comando INSERT:");
            System.out.println(caminhao.gerarInsert());
        } catch (IllegalArgumentException deuErro) {
            System.out.println("Erro ao criar o Caminhão: " + deuErro.getMessage());
        }

        try {
            // Objeto Bicicleta
            Bicicletas bicicleta = new Bicicletas("Gios FRX", "Gios", "Prata chumbo", "Alumínio", 21, "Sim");
            System.out.println("\nBicicleta:");
            System.out.println(bicicleta.descricao());
            System.out.println("Comando INSERT:");
            System.out.println(bicicleta.gerarInsert());
        } catch (IllegalArgumentException deuErro) {
            System.out.println("Erro ao criar a Bicicleta: " + deuErro.getMessage());
        }

        try {
            // Objeto Skate
            Skates skate = new Skates("LONGBOARD", "Mormaii", "Preto", "Revenge");
            System.out.println("\nSkate:");
            System.out.println("Modelo: " + skate.getModelo());
            System.out.println("Marca: " + skate.getMarca());
            System.out.println("Cor: " + skate.getCor());
            System.out.println("Tipo das Rodas: " + skate.getTipoRodas());
        } catch (IllegalArgumentException deuErro) {
            System.out.println("Erro ao criar o Skate: " + deuErro.getMessage());
        }
    }
}
