import java.util.Scanner;

public class VerificarServico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Leitura do serviço a ser verificado
        String servico = scanner.nextLine().trim().toLowerCase();
        
        // Leitura do nome do cliente e serviços contratados
        String entrada = scanner.nextLine().trim().toLowerCase();
        
        // Separar o nome do cliente e os serviços contratados
        String[] dados = entrada.split(",");
        
        // Nome do cliente (não utilizado diretamente)
        String cliente = dados[0];
        
        // Verificação se o serviço está entre os contratados
        boolean contratado = false;
        for (int i = 1; i < dados.length; i++) {
            if (dados[i].equals(servico)) {
                contratado = true;
                break;
            }
        }
        
        // Exibir resultado
        if (contratado) {
            System.out.println("Sim");
        } else {
            System.out.println("Nao");
        }
        
        scanner.close();
    }
}
