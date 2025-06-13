import java.util.Scanner;

public class Bubblesort {

    public static void main(String[] args) {
        //Declaração de variáveis;
        int[] num = new int[4];

        //Cunstrução do objeto de entrada
         Scanner entrada = new Scanner(System.in);

        //Apresentação
        System.out.println("n\t\t\t -- Bubble Sort --\n");

        //Entrada
        for(int i = 0; i < 4; i++){
            System.out.print("Informe o n" + (i + 1) + ": ");
            num[i] = entrada.nextInt();
        }
        //Processamento
        for(int i = 0; i < 3;i++){
            for(int j = (i+1); j < 4; j++){
                if(num[i] > num[j]){
                    int swap = num[j];
                    num[j] = num[i];
                    num[i] = swap;
                }                
            }
        }

        //Saída
        System.out.println("\n");
        for(int n: num){
            System.out.print(n + ", ");
        }
    }
}