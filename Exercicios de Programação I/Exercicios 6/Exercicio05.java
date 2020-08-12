public class Exercicio05
{
    public static void main (String [] args)
    {
        java.util.Scanner entrada = new java.util.Scanner(System.in);
        
        System.out.println("Digite um numero maior que 100 ");
        int num = entrada.nextInt();
        
        if (num > 100)
        {
            System.out.println("O valor está na faixa permitida");
        }   
        else
        {
            System.out.println("O valor está fora da faixa permitida");
        }   
    }
}
