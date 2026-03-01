package list4;

public class funcao {
    //Funções da primeira questao da atividade de revisão de estruturas de dados
    //Media: receber um vetor de notas, no qual realiza uma soma e a media
    public static double media(double[] notas) {
        double soma = 0,media = 0;
        for (double nota : notas) {
            soma += nota;
        }
        media = soma / notas.length;
        return media;
    }
    //acimaMedia: receber um vetor de notas e a media, verifica quantos alunos estao acima dessa media
    public static double acimaMedia(double[] notas, double media){
        double acimaMedia = 0;
        for (int i = 0; i < notas.length; i++){
            if (notas[i]>=media) {
                acimaMedia++;
            }
        }
        return acimaMedia;
    }
    //maiorNota: receber um vetor de notas, verifica qual e a maior dentro desse vetor
    public static double maiorNota(double[] notas){
        double maiorNota=0;
        for(int i = 0; i < notas.length; i++){
            if(notas[i]>maiorNota)maiorNota=notas[i];
        }
        return maiorNota;
    }

    //Questão 2
    //Recebe um valor inteiro e calcula quantas notas de 50, 20, 10 sao necessaria com base no valor total
    public static void calcularQuantNotas(int valorTotal){
        int notas50=0, notas20=0, notas10=0;
        notas50=valorTotal/50;
        valorTotal=valorTotal%50;
        notas20=valorTotal/20;
        valorTotal=valorTotal%20;
        notas10=valorTotal/10;
        System.out.println("Notas de 50: " + notas50+"\nNotas de 20: " + notas20+"\nNotas de 10: " + notas10+"\n");
    }

    //Questao 3
    public static void validarSenha(String senha){
        if(senha.length()<8){
            System.out.println("Senha contem menos de 8 caracteres!\n");
        }
        else if(senha.contains("@") || senha.contains("#") || senha.contains("$") ||
                senha.contains("%") || senha.contains("&") || senha.contains("*")){
            System.out.println("Válida!\n");
        }
        else {
            System.out.println("Inválida!\nA senha deve conter pelo menos um caractere especial (@, #, $, %, & ou *).\n");
        }
    }

    //Questao 3
    public static void corverteHMS (int segundosTotais){
        int t = segundosTotais;
        int horas = segundosTotais/3600;
        segundosTotais = segundosTotais % 3600;
        int minutos = segundosTotais/60;
        segundosTotais = segundosTotais % 60;

        System.out.println(t+" segundos resulta em "+horas+"h, "+minutos+"min e "+segundosTotais+"seg\n");
    }
    public static void inverterVetor(int[] vetor) {
        int inicio = 0;
        int fim = vetor.length-1;
        while (inicio < fim){
            int temp = vetor[fim];
            vetor[fim] = vetor[inicio];
            vetor[inicio] = temp;
            inicio++;
            fim--;
        }


    }
}
