public class Exercicios04
{
    public static void mai (String[]args )
{
java.util.Scanner entrada = new java.util.Scanner(System.in);
System.out.println("Digite um valor inteiro");
int num1 = entrada.nextInt();
System.out.println("Digite um valor inteiro");
int num2 = entrada.nextInt();
if ( num1 > num2)
System.out.println(" O numero maior eh " + num1);
else
System.out.println(" O numero maior eh " + num2);
}   
}