public class Exercicio1
{ 
    public static void main (String [] args)
{
    java.util.Scanner teclado = new java.util.Scanner(System.in);
System.out.println("\fDigite quantas calorias voce ingeriu no cafe da manha : ");
double cafe = teclado.nextDouble();
System.out.println("Digite quantas calorias voce ingeriu no lanche da manha : ");
double lancheM = teclado.nextDouble();
System.out.println("Digite quantas calorias voce ingeriu no almoco : ");
double almoco = teclado.nextDouble();
System.out.println("Digite quantas calorias voce ingeriu no lanche da tarde : ");
double lancheT = teclado.nextDouble();
System.out.println("Digite quantas calorias voce ingeriu no jantar : ");
double jantar = teclado.nextDouble();
double soma =  cafe + lancheM + almoco + lancheT + jantar;
System.out.println("Você ingeriu no total " + soma );
}
}
