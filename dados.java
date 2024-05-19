
import java.util.Scanner;
public class dados {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        pessoa pessoa = new pessoa();

        System.out.println("digite seu nome");
        pessoa.nomeFunc = scan.nextLine();

        System.out.println("informe salario bruto");
        pessoa.salarioBruto = scan.nextDouble();

        System.out.println("informe imposto");
        pessoa.imposto = scan.nextDouble();

        System.out.println();
         System.out.println("funcionario: " + pessoa.nomeFunc + "salario liquido: " + pessoa.salarioLiquido());

         System.out.println();
         System.out.println("qual a porcentagem para o aumento salarial ? ");
         double porcentagem = scan.nextDouble();
         pessoa.aumentoSalarial(porcentagem);

         System.out.println(" ");
         System.out.println("atualização de dados " + pessoa);

         scan.close();




        
    }
    
}
