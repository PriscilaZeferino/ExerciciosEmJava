public class Desafio
{
    public static void main (String[] args)
    {
        java.util.Scanner teclado = new java.util.Scanner(System.in);
        System.out.println("Digite um numero entre 1000 e 9999  : ");
        int number = teclado.nextInt();
        //     int number1 = number ; 
        int number1 = number/1000 % 10;
        int number2 = number/100 % 10;
        int number3 = number/10 % 10 ;
        int number4 = number/1 % 10;
        System.out.print("   " + number1);
        System.out.print("   " + number2);
        System.out.print("   " + number3);
        System.out.print("   " + number4);
        
    }
    }

  