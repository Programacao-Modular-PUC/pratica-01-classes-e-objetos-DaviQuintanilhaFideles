import java.util.Scanner;

public class MainPessoa {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome:");
        String nome = sc.nextLine();

        System.out.println("Digite o sobrenome:");
        String sobrenome = sc.nextLine();

        System.out.println("Digite a idade:");
        int idade = sc.nextInt();

        System.out.println("Digite a altura:");
        double altura = sc.nextDouble();

        System.out.println("Digite o peso:");
        double peso = sc.nextDouble();

        Pessoa pessoa = new Pessoa(nome, sobrenome, idade, altura, peso);

        double imc = pessoa.calculaIMC();

        System.out.println("IMC: " + imc);
        System.out.println("Classificação: " + pessoa.informaObesidade());

        sc.close();
    }
}