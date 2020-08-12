public class Exercicio10
{
    public static void main (String [] args)
    {
        java.util.Scanner entrada = new java.util.Scanner( System.in );
        System.out.println("Digite 1 se voce eh mulher ou 2 se voce eh homem ");
        int sexo = entrada.nextInt();
        System.out.println("Digite a sua altura ");
        double h = entrada.nextDouble();
        if ( sexo == 1 )
        {
            double pesoI = (62.1 * h)- 44.7 ;
            System.out.println("O seu peso ideal " + pesoI);
        }
        else
        {
          double pesoI = ( 72.7 * h ) - 58;
          System.out.println("O seu peso ideal eh " + pesoI);
    }
}
}