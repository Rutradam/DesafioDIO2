package candidatura;

import java.util.Scanner;

public class ControleFluxo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o primeiro numero");
        int parametro1 = scanner.nextInt();
        System.out.println("Insira o segundo parametro");
        int parametro2 = scanner.nextInt();

        contar(parametro1,parametro2);
    }

    static void contar(int param1, int param2) {
        int contagem = 0;
        if (param1 > param2) {
            contagem = param1 - param2;
        } else if (param1 < param2) {
            contagem = param2 - param1;
        } else {
            System.out.println("Ambos parâmetros se anulam");
            return;
        }
        for (int i = 0; i <= contagem; i++) {
            System.out.println("Imprimindo " + i);
        }
    }
}
