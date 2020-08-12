public class Exercicio3 
{
    public static void main(String[]args)
    {
       java.util.Scanner entrada = new java.util.Scanner(System.in);
       System.out.println("Quantos potes grandes você vendeu ?");
       double potesG = entrada.nextDouble();
       System.out.println("Quantos potes pequenos você vendeu ?");;
       double potesP = entrada.nextDouble();
       double pG = potesG * 3.00;
       double pP = potesP * 2.50;
       double  potesGP = pG + pP ;
       System.out.println("Você ganhou no total " + potesGP+ " com a suas vendas ");
       
       
    }
}