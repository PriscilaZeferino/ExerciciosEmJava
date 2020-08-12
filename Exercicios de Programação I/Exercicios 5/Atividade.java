public class Atividade
{
    public static void main (String[]args)
    {
    java.util.Scanner teclado = new java.util.Scanner(System.in);    
    double salario = 1000.00;
    System.out.println("Digite o valor do aumento");
    double aumento = teclado.nextDouble();
    double novosalario = salario + aumento ;
    System.out.print("O novo salario eh  ");
    System.out.print(novosalario);
     System.out.println ("Digite a sua idade ");
     int idade = teclado.nextInt();




}

}