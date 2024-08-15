import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    // Função para verificar se houve queda de conexão
    public static String verificarQuedaConexao(String[] velocidades) {
        for (String valorStr : velocidades) {
            valorStr = valorStr.trim(); // Remove espaços em branco
            try {
                int valor = Integer.parseInt(valorStr);
                if (valor == 0) {
                    return "Queda de Conexao"; // Retorna se encontrar uma velocidade igual a 0
                }
            } catch (NumberFormatException e) {
                // Ignora valores inválidos
            }
        }
        return "Sem Quedas"; // Retorna se não encontrar nenhum valor igual a 0
    }

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            // Solicitando ao usuário a lista de velocidades de conexão
            String input = br.readLine();

            // Convertendo a entrada em uma lista de strings
            String[] velocidades = input.split(",");

            // Verificando se houve queda de conexão
            String resultado = verificarQuedaConexao(velocidades);

            // Exibindo o resultado
            System.out.println(resultado);
        } catch (IOException e) {
            // Trata exceções de entrada/saída
            System.out.println("Erro ao ler a entrada.");
        }
    }
}
