public class Exercicio06
{
    public static void main (String [] args)
    {
        java.util.Scanner entrada = new java.util.Scanner(System.in);
        System.out.println("Digite seu ano de nascimento");
        int ano = entrada.nextInt();
        int ano2 = 2016 - ano;
        if ( ano2 >= 18 )
        {
            System.out.println("Voce pode votar ");
        }else
        {
            System.out.println("Voce não pode votar");
        }    
    }
}

