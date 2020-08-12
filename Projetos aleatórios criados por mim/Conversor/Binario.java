public class Binario
{
    public static void main(String [] args)
    {
        java.util.Scanner entrada = new java.util.Scanner(System.in);

        System.out.println(" 1. Binario:     0 e 1");
        System.out.println(" 2. Decimal:     0, 1, 2, 3, 4, 5, 6, 7, 8, 9");
        System.out.println(" 3. Octal:       0, 1, 2, 3, 4, 5, 6, 7");
        System.out.println(" 4. Hexadecimal: 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, A, B, C, D, E, F ");

        System.out.println("Digite o numero da conversão que deseja realizar: ");
        int con = entrada.nextInt();

        System.out.println("Digite o numero que deseja converter ( maximo 4 digitos)");
        int num = entrada.nextInt();

        System.out.println("Digite a base do numero que sera convertido ");
        int conE = entrada.nextInt();

        int number1 = num/1000 % 10;
        int number2 = num/100 % 10;
        int number3 = num/10 % 10 ;
        int number4 = num/1 % 10;
        int numb = 0;

        if ( con == 1 && conE == 2)
        {
            numb = number1 * 8 + number2 * 4 + number3 * 2 + number4 * 1;
            System.out.println(numb);
        }

    }
}

