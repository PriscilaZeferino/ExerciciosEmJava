public class Exercicio09
{
    public static void main (String [] args)
    {
        java.util.Scanner entrada = new java.util.Scanner (System.in);
        System.out.println("Digite a senha");
        int senha = entrada.nextInt ();
        if ( senha != 1234 )
        {
              System.out.println("Acesso negado");
        }
        else
        {            
             System.out.println("Acesso permitido");
        }
    }
}