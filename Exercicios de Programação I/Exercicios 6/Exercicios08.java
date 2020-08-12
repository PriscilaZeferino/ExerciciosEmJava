public class Exercicios08
{
    public static void main (String [] args)
    {
        java.util.Scanner entrada = new java.util.Scanner (System.in);

        System.out.println("digite o numeros de macas: ");
        double num = entrada.nextDouble();
       
        if ( num >= 12)
        {
            System.out.println(" Total de custo R$ " + ( num * 0.25) );
        }
        else 
        {
            System.out.println(" Total de custo R$ " + ( num * 0.30) );
        }
    }
}