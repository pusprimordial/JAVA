package estruturasDeControle;
import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String faixa;
        System.out.print("Digite a cor da faixa: ");
        faixa = entrada.nextLine();

        switch (faixa.toLowerCase()) {
            case "preta":
                System.out.println("Sei o bassai-dai...");
            case "marrom":
                System.out.println("Sei o tekki shodan");
            case "roxa":
                System.out.println("Sei o heian godan");
            case "verde":
                System.out.println("Sei o heian yodan");
            case "laranja":
                System.out.println("Sei o heian sandan");
            case "vermelha":
                System.out.println("Sei o heian nidan");
            case "amarela":
                System.out.println("Sei o heian shodan");
            
    
        }
        entrada.close();
    }
}
