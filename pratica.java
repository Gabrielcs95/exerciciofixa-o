import java.util.Random;
import java.util.Scanner;
public class pratica {
    public static void main(String[] args) {

        Random rand = new Random();
        int numeroAleatorio = rand.nextInt(100) + 1;
        
      
        Scanner scanner = new Scanner(System.in);
        
        int tentativa = 0;
        int numeroTentativas = 0;
        boolean acertou = false;
        
        System.out.println("Bem-vindo ao jogo de adivinhação de números!");
        System.out.println("Tente adivinhar um número entre 1 e 100.");
        
        
        while (!acertou) {
            System.out.print("Digite sua tentativa: ");
            tentativa = scanner.nextInt();
            numeroTentativas++;
            
            if (tentativa < 1 || tentativa > 100) {
                System.out.println("Por favor, insira um número entre 1 e 100.");
            } else if (tentativa < numeroAleatorio) {
                System.out.println("O número é maior. Tente novamente.");
            } else if (tentativa > numeroAleatorio) {
                System.out.println("O número é menor. Tente novamente.");
            } else {
                acertou = true;
                System.out.println("Parabéns! Você adivinhou o número em " + numeroTentativas + " tentativas.");
            }
        }
        
        scanner.close();
        
    }
}