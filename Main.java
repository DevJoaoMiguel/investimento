import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int control;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Poupança");
            System.out.println("2 - Renda Fixa");
            System.out.println("3 - Renda Variável");
            System.out.println("4 - Tesouro Direto");
            System.out.println("5 - LCI/LCA");
            System.out.println("6 - CDB");
            System.out.println("0 - Sair");

            control = sc.nextInt();

            if (control == 0) {
                System.out.println("Saindo do programa...");
                break;
            }

            switch (control) {
                case 1: {
                    poupanca poup = new poupanca();
                    System.out.println("Você escolheu poupança:");
                    System.out.print("Digite um valor: ");
                    poup.setValor(sc.nextDouble());

                    System.out.print("Digite um tempo (em anos): ");
                    poup.setTempo(sc.nextInt());

                    System.out.print("Digite a taxa de juros anual (em %): ");
                    poup.setJuros(sc.nextDouble());

                    System.out.println("O resultado é: R$ " + poup.calcRenda());
                    break;
                }
                case 2: {
                    Rendafixa refi = new Rendafixa();
                    System.out.println("Você escolheu renda fixa:");

                    System.out.print("Informe o valor inicial (capital): R$ ");
                    refi.setValor(sc.nextDouble());

                    System.out.print("Informe a taxa de juros anual (em %): ");
                    refi.setJuros(sc.nextDouble() / 100);

                    System.out.print("Informe o número de anos: ");
                    refi.setTempo(sc.nextInt());

                    System.out.print("Informe o valor dos aportes mensais (se não houver, informe 0): R$ ");
                    refi.setAporteMensal(sc.nextDouble());

                    System.out.println("O resultado com aporte é: R$ " + refi.calcRenda());
                    System.out.println("O resultado sem aporte é: R$ " + refi.calcRendaSemAporte());
                    break;
                }
                case 3: {
                    Rendavariavel rv = new Rendavariavel();
                    System.out.print("Digite o valor inicial do investimento (R$): ");
                    rv.setValorInicial(sc.nextDouble());

                    System.out.print("Digite o valor final do investimento (R$): ");
                    rv.setValorFinal(sc.nextDouble());

                    System.out.print("Digite o valor total recebido em dividendos (R$): ");
                    rv.setDividendos(sc.nextDouble());
                    double retorno = rv.calcRenda();
                    System.out.printf("O retorno do investimento foi de: %.2f%%\n", retorno);
                    break;
                }
                case 4: {
                    Tesourodireto td = new Tesourodireto();
                    System.out.print("Digite o valor inicial  (R$): ");
                    td.setValorInicial(sc.nextDouble());

                    System.out.print("Digite o valor final  (R$): ");
                    td.setValorFinal(sc.nextDouble());
                    System.out.println("O resultado é: R$ " + td.calcRenda());
                    break;
                }
                case 5: {
                    LCILCA lciLca = new LCILCA();
                    System.out.println("Você escolheu LCI/LCA:");

                    System.out.print("Informe o valor inicial (capital): R$ ");
                    lciLca.setValorInicial(sc.nextDouble());

                    System.out.print("Informe a taxa de juros anual (em %): ");
                    lciLca.setTaxaJuros(sc.nextDouble());

                    System.out.print("Informe o número de anos: ");
                    lciLca.setTempo(sc.nextInt());

                    System.out.println("O resultado é: R$ " + lciLca.calcRenda());
                    break;
                }
                case 6: {
                    CDB cdb = new CDB();
                    System.out.println("Você escolheu CDB:");

                    System.out.print("Informe o valor inicial (capital): R$ ");
                    cdb.setValorInicial(sc.nextDouble());

                    System.out.print("Informe a taxa de juros anual (em %): ");
                    cdb.setTaxaJuros(sc.nextDouble());
                    System.out.print("Informe o número de anos: ");
                    cdb.setTempo(sc.nextInt());

                    System.out.println("O resultado é: R$ " + cdb.calcRenda());
                    break;
                }
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
                    break;
            }
        }

        sc.close();
    }
}
