import java.util.Scanner;

public class Calculo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite nota 1");
        int nota1 = sc.nextInt();
        System.out.println("Digite nota 2");
        int nota2 = sc.nextInt();
        System.out.println("Digite nota 3");
        int nota3 = sc.nextInt();
        System.out.println("Digite nota 4");
        int nota4 = sc.nextInt();

        int media = (nota1 + nota2 + nota3 + nota4) / 4;

        if (media >= 7) {
            System.out.println("Aprovado");
        } else if (media >= 5){
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }


        System.out.println("Media:" + media);


        sc.close();
    }

}
