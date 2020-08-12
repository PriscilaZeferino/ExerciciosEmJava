public class exercicio_1
{   public static void main (String [] args)
   
    {
    //inicia a entrada de dados
    java.util.Scanner  teclado = new java.util.Scanner(System.in);
    //Diz para o usuario executar uma ação
    System.out.println("Digite um numero inteiro"); 
    //cria uma variavel a partir do valor que o usuario digitou
    int number = teclado.nextInt();
    //Diz o resultado da multiplicação para o usuario
    System.out.println("O resultado do valor multiplicado por 2 e  " + number * 2);

        
    }
}
