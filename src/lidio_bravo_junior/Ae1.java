package lidio_bravo_junior;

import java.util.Scanner;

/**
 *
 * @author Lidio Bravo
 */
public class Ae1 {

    /**
     * @param args the command line arguments
     */
    
    public static float soma(float num1, float num2){
        return(num1 + num2);
    }
    
    public static float sub(float num1, float num2){
        return (num1 - num2);
    }
    
    public static float mult(float num1, float num2){
        return(num1 * num2);
    }
    
    public static float div(float num1, float num2){
        return (num1 / num2);
    }
    
    public static float quad(float num1){
    return(num1 * num1);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        float n1;
        float n2;
        boolean finalizar = false;
        
        while (finalizar == false){
            Scanner input = new Scanner(System.in);
            System.out.println("1 - Somar\n2 - Subtrair\n3 - Multiplicar\n4 - Dividir\n5 - Elevar ao quadrado\n0 - Finalizar o programa");
            System.out.print("Digite sua opção: ");
            int opcao = input.nextInt();

            switch(opcao){

                case 1:
                    System.out.print("Digite o primeiro número: ");
                    n1 = input.nextFloat();
                    System.out.print("Digite o segundo número: ");
                    n2 = input.nextFloat();
                    System.out.println("");
                    System.out.printf("O resultado da soma: %.2f + %.2f = %.2f\n", n1, n2, soma(n1,n2));
                    double n = Math.pow(8,2);
                    System.out.println(n);
                    break;
                /*case 2:
                    System.out.print("Digite o numerador: ");
                    n1 = input.nextFloat();
                    System.out.print("Digite o denominador: ");
                    n2 = input.nextFloat();
                    System.out.printf("O resultado da subtração: %.2f - %.2f = %.2f\n", n1, n2, sub(n1, n2));
                    System.out.println("");
                    break;
                case 3:
                    System.out.print("Digite o numerador: ");
                    n1 = input.nextFloat();
                    System.out.print("Digite o denominador: ");
                    n2 = input.nextFloat();
                    System.out.printf("O resultado da Multiplicação: %.2f x %.2f = %.2f\n", n1, n2, mult(n1, n2));
                    System.out.println("");
                    break;
                case 4:
                    System.out.print("Digite o numerador: ");
                    n1 = input.nextFloat();
                    System.out.print("Digite o denominador: ");
                    n2 = input.nextFloat();
                    System.out.printf("O resultado da divisão: %.2f / %.2f = %.2f\n", n1, n2, div(n1, n2));
                    System.out.println("");
                    break;
                case 5:
                    System.out.print("Digite o numero que desejar elevar ao quadrado: ");
                    n1 = input.nextFloat();
                    System.out.printf("O número %.2f elevado ao quadrado é: %.2f", n1, quad(n1));
                    System.out.println("");
                    break;
                case 0:
                    System.out.println("PROGRAMA FINALIZADO!!!");
                    finalizar = true;
                    break;
                default:
                    System.out.println("Digite uma opção válida!");
                    System.out.println("");*/
            }
        }
    }   
}
