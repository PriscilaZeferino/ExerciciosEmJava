
public class Exercicios02
{
    public static void main (String[] args)
    {
        java.util.Scanner teclado = new java.util.Scanner(System.in);

        System.out.println("Digite um valor inteiro");
        int num = teclado.nextInt();

        if (num <= 0)
        {
            num = num * (-1) ;

        }
        System.out.println("O valor digitado positivo foi " + num );

    }
}

