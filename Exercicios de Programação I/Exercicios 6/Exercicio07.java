public class Exercicio07
{
    public static void main (String [] args )
    {
        java.util.Scanner entrada = new java.util.Scanner(System.in);

        System.out.println("\fCódigo  Nome                Preço " );
        System.out.println("123     Balas               0,20 " );
        System.out.println("124     Barra de chocolate  2,50");
        System.out.println("125     Chicletes           0,25");

        System.out.println("Digite o codigo do produto");
        int code = entrada.nextInt();

        System.out.println("Digite a quantidade do produto");
        double quant = entrada.nextDouble();
     
        double preco = 0 ;

        if ( code == 123 )

        {
            preco = 0.20 * quant ;

        }
        if (code == 124)
        {
            preco = 2.50 * quant ;

        }
        if (code == 125)
        {
            preco = 0.25 * quant ;

        }
        System.out.println("Voce deve pagar " + preco );
        if ( code != 123 )
            if (code  != 124 )
                if (code != 125 )
                {
                    System.out.println("Ccodigo não encontrado ");
        }
    }
}