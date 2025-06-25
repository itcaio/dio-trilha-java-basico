import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

        System.out.println("-----------------------------------------");
        System.out.println("    -Seja Bem Vindo ao Nosso Banco! ;) \n -Para abrir sua conta, siga os passos a seguir: ");
        System.out.println(" -Nos diga seu nome completo: ");
        String nome = scanner.nextLine();
        System.out.printf(" -Ok, %s! Agora crie um número de 4 dígitos para sua conta: \n", nome);
        int nDaConta = scanner.nextInt();
        System.out.printf(" -conta %s criada com sucesso! \n -Agora crie um numero de agencia + digito: [ex: 123-4]\n", nDaConta);
        String agencia = scanner.next();
        System.out.printf(" -Agência %s criada com sucesso! \n -Agora digite o seu Saldo Bancário:\n ", agencia);
        double saldo = scanner.nextDouble();
        System.out.println(" -Tudo certo! Obrigado por abrir sua conta em nosso Banco!");
        System.out.printf(Locale.forLanguageTag("pt-BR"), "-SEGUE SEUS DADOS: \n NOME: %s \n NÚMERO DA CONTA: %s\n AGÊNCIA: %S\n SALDO: R$ %.2f%n \n ", nome, nDaConta, agencia, saldo);


    }
    }
