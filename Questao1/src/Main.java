import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Aluno a = new Aluno();

        System.out.println("Digite o nome do aluno: ");
        a.setNome(sc.nextLine());

        System.out.println("Digite a primeira nota do aluno: ");
        a.setNota1(sc.nextDouble());

        System.out.println("Digite a segunda nota do aluno: ");
        a.setNota2(sc.nextDouble());

        System.out.println("Digite a terceira nota do aluno: ");
        a.setNota3(sc.nextDouble());

        a.exibirDetalhes();

    }
}