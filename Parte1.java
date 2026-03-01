package list4;
import java.util.Scanner;
public class Parte1 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double[] notas = {7.5, 4.0, 9.2, 5.5, 8.0, 6.5, 3.2, 10.0, 7.0, 5.8};

        System.out.println("QUESTÃO 1");
        System.out.println("Notas: ");
        for (double nota:notas){
            System.out.printf(nota+"  ");
        }
        System.out.println("\nA media: "+ funcao.media(notas));
        System.out.println("Alunos acima da media: "+ funcao.acimaMedia(notas, funcao.media(notas)));
        System.out.println("A maior nota: "+ funcao.maiorNota(notas)+"\n");

        System.out.println("QUESTÃO 2");
        System.out.println("Digite o valor total: ");
        int valorTotal=0;
        valorTotal = sc.nextInt();
        sc.nextLine();
        funcao.calcularQuantNotas(valorTotal);

        System.out.println("Questão 3");
        System.out.print("Digite uma senha: ");
        String senha = sc.nextLine();;
        funcao.validarSenha(senha);

        System.out.println("Questão 4");
        int segundosTotais = sc.nextInt();
        funcao.corverteHMS(segundosTotais);

        System.out.println("Questão 4");
        int[] vetor = {10,20,30,40,50};
        System.out.println("Vetor original: ");
        for (int i=0; i<vetor.length; i++){
            System.out.print(vetor[i]+" ");
        }
        funcao.inverterVetor(vetor);
        System.out.println("\nVetor invertido: ");
        for (int i=0; i<vetor.length; i++){
            System.out.print(vetor[i]+" ");
        }
    }
}
