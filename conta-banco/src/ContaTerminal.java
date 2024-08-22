import java.util.Scanner;

import model.Account;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Account account = new Account();

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número da conta: ");
        account.setAccountNumber(sc.nextLong());

        System.out.print("Por favor, digite o número da Agência: ");
        account.setAgency(sc.next());

        System.out.print("Por favor, digite seu nome: ");
        account.setCustomer(sc.next());

        System.out.print("Por favor, digite insira seu saldo inicial: ");
        account.setAmount( sc.nextDouble());
        
        sc.close();

        System.out.println("## Parabens " + account.getCustomer() + " sua conta foi criada com sucesso! ##");

        System.out.println("### Dados da Conta ####");
        System.out.println("## Número da Conta: " + account.getAccountNumber() + " ##");
        System.out.println("## Código da Agência: " + account.getAgency() + " ##");
        System.out.println("## Cliente: " + account.getCustomer() + " ##");
        System.out.println("## Saldo: " + account.getAmount() + " ##");
        System.out.println("########################");

    }
}
