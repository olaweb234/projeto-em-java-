import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.println("BEM VINDO A BANCO ++");
        int opcao = 0;
        String nome = "gabriel" ;
        String conta = "Corrente";
        double saldo = 2500;

        System.out.println("Nome do cliente:" + nome);
        System.out.println("Tipo de conta:" + conta);
        System.out.println("Seu saldo :" + saldo);
        System.out.println(("\n*******************"));

        String menu = """
               ***Digite sua opção:***
                1-Consultar saldo atual
                2-Transferir valor 
                3-Receber valor 
                4-Sair 
        """;
        Scanner leitura = new Scanner(System.in);
        while (opcao!=4){
            System.out.println((menu));
            opcao=leitura.nextInt();
            if (opcao==1){
                System.out.println("O saldo atualizado é"  +saldo);
            }else if (opcao==2) {
                System.out.println(("Qual é o valor que você deseja transferir ?"));
                double valor = leitura.nextDouble();
                if (valor > saldo) {
                    System.out.println("Não há saldo suficiente");
                } else {
                    saldo -= valor;
                    System.out.println("Novo saldo " + saldo);
                }
            } else if(opcao==3){
                    System.out.println("Digite o valor a ser recebido :");
                    double valor = leitura.nextDouble();
                    saldo+=valor;
                System.out.println("Seu saldo agora é :"  + saldo);
                } else if (opcao!=4) {
                    System.out.println("Opção invalida");
                    
                }



        }


    }
}