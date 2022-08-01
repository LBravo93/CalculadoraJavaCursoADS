package lidio_bravo_junior;

import java.util.Scanner;

/**
 *
 * @author Lidio Bravo
 */
public class Ae1 {

    // Método usado para multiplicar números escolhidos pelo usuário
    public static float soma(float num1, float num2){
        return(num1 + num2);
    }
    
    // Método usado para Subtrair números escolhidos pelo usuário
    public static float sub(float num1, float num2){
        return (num1 - num2);
    }
    
    // Método usado para Multiplicar números escolhidos pelo usuário
    public static float mult(float num1, float num2){
        return(num1 * num2);
    }
    
    // Método usado para Dividir números escolhidos pelo usuário
    public static float div(float num1, float num2){
        return(num1 / num2);
    }
    
    // Método usado para elevar número ao quadrado
    public static float quad(float num1){
    return(num1 * num1);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        float n1;
        float n2;
        boolean finalizar = false;
        
        //Bloco de repetição para todo o programa, inicilamente com o menu para as opções ao usuário
        while (finalizar == false){
            Scanner input = new Scanner(System.in);
            System.out.println("1 - Somar\n2 - Subtrair\n3 - Multiplicar\n4 - Dividir\n5 - Elevar ao quadrado\n0 - Finalizar o programa");
            System.out.print("Digite sua opção: ");
            int opcao = input.nextInt();

            switch(opcao){

                //Caso 1 para SOMA de dois numeros inteiros ou reais
                case 1:
                    System.out.print("Digite o primeiro número: ");
                    n1 = input.nextFloat();
                    System.out.print("Digite o segundo número: ");
                    n2 = input.nextFloat();
                    System.out.println("");
                    System.out.printf("O resultado da soma: %.2f + %.2f = %.2f\n", n1, n2, soma(n1,n2));
                    System.out.println("");
                    break;
                
                //Caso 2 para SUBTRAÇÃO de dois numeros inteiros ou reais    
                case 2:
                    System.out.print("Digite o numerador: ");
                    n1 = input.nextFloat();
                    System.out.print("Digite o denominador: ");
                    n2 = input.nextFloat();
                    System.out.println("");
                    System.out.printf("O resultado da subtração: %.2f - %.2f = %.2f\n", n1, n2, sub(n1, n2));
                    System.out.println("");
                    break;
                
                //Caso 3 para MULTIPLICAR dois numeros inteiros ou reais
                case 3:
                    System.out.print("Digite o numerador: ");
                    n1 = input.nextFloat();
                    System.out.print("Digite o denominador: ");
                    n2 = input.nextFloat();
                    System.out.println("");
                    System.out.printf("O resultado da Multiplicação: %.2f x %.2f = %.2f\n", n1, n2, mult(n1, n2));
                    System.out.println("");
                    break;
                
                //Caso 4 para DIVIDIR dois numeros inteiros ou reais
                case 4:
                    System.out.print("Digite o numerador: ");
                    n1 = input.nextFloat();
                    System.out.print("Digite o denominador: ");
                    n2 = input.nextFloat();
                    System.out.println("");
                    System.out.printf("O resultado da divisão: %.2f / %.2f = %.2f\n", n1, n2, div(n1, n2));
                    System.out.println("");
                    break;
                
                //Caso 5 para ELEVAR AO QUADRADO um número
                case 5:
                    System.out.print("Digite o numero que desejar elevar ao quadrado: ");
                    n1 = input.nextFloat();
                    System.out.println("");
                    System.out.printf("O número %.2f elevado ao quadrado é: %.2f", n1, quad(n1));
                    System.out.println("");
                    break;
                    
                //Caso 0: Opção para FINALIZAR o programa 
                case 0:
                    System.out.println("");
                    System.out.println("PROGRAMA FINALIZADO!!!");
                    input.close();
                    finalizar = true;
                    break;
                
                // Opção para caso o usuário digitar alguma opção diferente de 1, 2, 3, 4, 5, 0.
                default:
                    System.out.println("");
                    System.out.println("Digite uma opção válida!");
                    System.out.println("");
            }
        }
    }
}
