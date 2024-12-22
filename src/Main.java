import java.util.Scanner;

//Faça um programa que leia um número e imprima qual dia da semana de acordo
//com o número lido usando Switch(1-Domingo, 2-Segunda, 3-Terça, 4-Quarta,
//5-Quinta, 6-Sexta, 7-Sábado)
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcao = sc.nextInt();
        System.out.println("Digite um número de 1 a 7");

        switch(opcao){
            case 1:
                System.out.println("1 - Domingo");
                break;
            case 2:
                System.out.println("2 - Segunda");
                break;
            case 3:
                System.out.println("3 - Terça");
                break;
            case 4:
                System.out.println("4 -Quarta");
                break;
            case 5:
                System.out.println("5 - Quinta");
                break;
            case 6:
                System.out.println("6 - Sexta");
                break;
            case 7:
                System.out.println("7 - Sábado");
                break;

        }
    }
}