package list4;
/*PARTE 2: Novo Algoritmo e Teste de Mesa
Questão 6.– Implemente uma função chamada inverter_lista(vetor) que receba um array de
inteiros e inverta a ordem de seus elementos sem utilizar um vetor auxiliar (estratégia in-place).*/
public class Parte2 {

    static void main(String[] args){

        int[] numeros = {10,20,30,40,50};
        System.out.println("Vetor original: ");
        for (int i=0; i<numeros.length; i++){
            System.out.print(numeros[i]+" ");
        }
        inverterlista(numeros);
        imprimirlista(numeros);
    }
    public static void inverterlista(int[] numeros) {
        int inicio = 0;
        int fim = numeros.length-1;

        while (inicio < fim){
            int temp = numeros[fim];
            numeros[fim] = numeros[inicio];
            numeros[inicio] = temp;
            inicio++;
            fim--;
        }

    }
    public static void imprimirlista(int[] numeros) {
        for(int numero : numeros){
            System.out.println(numero+" ");
        }
    }
}
