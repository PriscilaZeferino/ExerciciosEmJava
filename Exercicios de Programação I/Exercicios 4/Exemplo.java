public class Exemplo
{
    public static void main( String [] args)
    {
        java.util.Scanner entrada = new java.util.Scanner(System.in);
        System.out.println("Digite sua nota: ");
        int num = entrada.nextInt();
        
        if (num >= 7.0)
        {
            System.out.println("Aprovado");
        }
        else if (num >= 3)
        {
             System.out.println("Exame");
        }
         else if (num < 3)
        {
             System.out.println("Reprovado");
        }
    }
}
