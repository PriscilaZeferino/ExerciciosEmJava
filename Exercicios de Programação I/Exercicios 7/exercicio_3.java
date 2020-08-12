public class exercicio_3
{
    public static void main (String [] args)
    {
        //inicia a entrada de dados
        java.util.Scanner teclado = new java.util.Scanner(System.in);
        //Diz para o usuario digitar um numero
        System.out.println("Digite um numero");
        //cria variaveis a partir do numero digitado
        int num = teclado.nextInt();
        int num1 = num + 1;
        int num2 = num1 + 1;
        //imprime na tela os numeros que sucedem o numero digitado
        System.out.println("O numeros que sucedem este numero são respectivamente ");
        System.out.print(num1 +" e "+ num2);
    }
}
