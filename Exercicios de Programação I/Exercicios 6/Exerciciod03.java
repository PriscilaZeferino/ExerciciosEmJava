public class Exerciciod03
{
    public static void main (String [] args)
    {
        java.util.Scanner entrada = new java.util.Scanner(System.in);
        System.out.println("Digite a nota da primeira avaliação:");
        double nota1 = entrada.nextDouble();
        System.out.println("Digite a nota da segunda avaliação:");
        double nota2 = entrada.nextDouble();
        double media = (nota1+nota2)/2;
        if (media >= 7.0 )
        {
            System.out.println("Voce esta APROVADO");
        }
        if (media < 7.0 )
            if(media >= 3.0)
            {
                System.out.println("EXAME");
        }
        if (media < 3.0)
        {
            System.out.println("Voce esta REPROVADO");
        }
    }
}