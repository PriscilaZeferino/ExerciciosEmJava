public class Exemplo1IFandELSE
{
    public static void main (String[]args)
    {
        java.util.Scanner teclado =  new java.util.Scanner(System.in);
        System.out.println("digite o valor da sua nota final ");
        double nota = teclado.nextDouble();
        if (nota >= 7.0)
        {
            System.out.println("Parabens.");
            System.out.println("Voce foi aprovado");
        }
        else
        {
            System.out.println("você precisa estudar mais."); 
        }
        System.out.println("Feliz ano novo !");
       
    }
}