public class Exercicio11
{
    public static void main ( String [] args)
    {
        java.util.Scanner entrada = new java.util.Scanner(System.in);
        System.out.println("Digite um numero inteiro e positivo");
        int num = entrada.nextInt();
       
        if (num % 2 == 0)
        {
            System.out.println("O numero eh par");
        }
        else 
        {
         System.out.println("O numero eh impar ");
        }
        }
}