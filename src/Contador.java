import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int parametroUm, parametroDois;

        System.out.print("Digite o primeiro parâmetro: ");
        parametroUm = sc.nextInt();
        System.out.print("Digite o segundo parâmetro: ");
        parametroDois = sc.nextInt();

        try {
            contar(parametroUm, parametroDois);

        } catch (ParametrosInvalidosException e) {
            System.out.println("\nO segundo parâmetro deve ser maior que o primeiro!");
        }
    }

    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {

        if (parametroDois < parametroUm) {
            throw new ParametrosInvalidosException();
        }

        System.out.println("Segue o controle de fluxo:");
        int contagem = parametroDois - parametroUm;
        for (int x = 1; x <= contagem; x++ ) {
            System.out.println(x);
        }
    }
}
