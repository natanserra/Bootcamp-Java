import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class VerificarCombo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String entrada = scanner.nextLine().trim().toLowerCase();

        String[] serviços = entrada.split(",");
        Set<String> serviçosContratados = new HashSet<>();
        for (String serviço : serviços) {
            serviçosContratados.add(serviço.trim());
        }

        boolean comboCompleto = serviçosContratados.contains("movel")
                && serviçosContratados.contains("banda larga")
                && serviçosContratados.contains("tv");

        if (comboCompleto) {
            System.out.println("Combo Completo");
        } else {
            System.out.println("Combo Incompleto");
        }

        scanner.close();
    }
}
