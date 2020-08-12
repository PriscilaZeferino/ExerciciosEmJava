public class Calculadora
{
    public static void main( String [] args)
    {
        java.util.Scanner entrada = new java.util.Scanner(System.in);
        
        int num1 = 0 ;
        int num2 = 0 ;
        int opt = 0 ;
        boolean execute = true;
        System.out.println("Tabela de operações");
        System.out.println(" 1. Adição ");
        System.out.println(" 2. Subtração ");
        System.out.println(" 3. Multiplicação ");
        System.out.println(" 4. Divisão ");
        System.out.println(" 5. Potenciação");
        System.out.println(" 6. radiação");
        System.out.println(" 7. Exit");
        
        while (execute)
        {

            System.out.println("Digite o primeiro numero clique enter e digite o segundo numero ou (expoenciação):  ");
            num1 = entrada.nextInt();
            num2 = entrada.nextInt();

            System.out.println("Digite o numero da operação a ser realizada:");
            opt = entrada.nextInt();

            if ( opt == 1 )
            {
                System.out.println("The answer is " + num1 + num2);
            }
            if( opt == 2 )
            {
                System.out.println("The answer is " + (num1 - num2));
            }
            if( opt == 3 )
            {
                System.out.println("The answer is " + num1 * num2);
            }
            if ( opt == 4 )
            {
                System.out.println("The answer is " + num1 / num2);
            }
            if ( opt == 5 )
            {
                System.out.println("The answer is " + Math.pow(num1,num2));
            }
            if( opt == 6 )
            {
                System.out.println("The answer is " + Math.sqrt(num1));
            }
            if(opt == 7)
            {
                execute = false;
            }
        }
    }
}

