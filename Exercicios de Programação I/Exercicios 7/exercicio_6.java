public class exercicio_6
{ public static void main(String [] args)
{
    java.util.Scanner teclado = new java.util.Scanner(System.in);
   //Pergunta a distancia percorrida
    System.out.println(" Qual a distancia entre as duas cidades ?");
    double distancia = teclado.nextDouble();
    //pergunta quantos litros de gasolina foram gastos na viagem
    System.out.println(" Quantos litros de gasolina você gastou ?");
    double Lgasolina = teclado.nextDouble();
    //Calcula o custo total da viagem 
    double total = (distancia/Lgasolina) * 3.20;
    //Diz ao quanto ele gastou na viagem
    System.out.println("Você gastou na viagem " + total + " reais " );
    

    
}
}