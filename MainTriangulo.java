import java.util.Scanner;

public class MainTriangulo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do primeiro cateto:");
        double c1 = sc.nextDouble();

        System.out.println("Digite o valor do segundo cateto:");
        double c2 = sc.nextDouble();

        TrianguloRetangulo triangulo = new TrianguloRetangulo(c1, c2);

        double hipotenusa = triangulo.calculaHipotenusa();
        double area = triangulo.calculaArea();

        System.out.println("Hipotenusa: " + hipotenusa);
        System.out.println("Área do triângulo: " + area);

        sc.close();
    }
}