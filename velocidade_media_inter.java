import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    // Função para calcular a velocidade média de conexão de internet
    public static double calcularVelocidadeMedia(String[] velocidades) {
        int soma = 0;
        int quantidade = 0;

        // Somar todas as velocidades registradas e contar o número de registros
        for (String valorStr : velocidades) {
            valorStr = valorStr.trim(); // Remover espaços em branco
            try {
                int valor = Integer.parseInt(valorStr);
                soma += valor;
                quantidade++;
            } catch (NumberFormatException e) {
                // Ignorar valores inválidos e continuar
                System.out.println("Valor inválido encontrado e ignorado: " + valorStr);
            }
        }

        // Verificar se há valores válidos para evitar divisão por zero
        if (quantidade == 0) {
            return 0; // Retornar 0 se não houver valores válidos
        }

        // Calcular a média
        return (double) soma / quantidade;
    }

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            // Solicitando ao usuário a lista de velocidades de conexão registradas a cada hora
            String input = br.readLine();

            // Convertendo a entrada em uma lista de strings
            String[] velocidades = input.split(",");

            // Calculando a velocidade média de conexão
            double velocidadeMedia = calcularVelocidadeMedia(velocidades);

            // Exibindo a velocidade média de conexão arredondada
            System.out.println((int) Math.round(velocidadeMedia) + " Mbps");
        } catch (IOException e) {
            // Trata exceções de entrada/saída
            System.out.println("Erro ao ler a entrada.");
        }
    }
}
