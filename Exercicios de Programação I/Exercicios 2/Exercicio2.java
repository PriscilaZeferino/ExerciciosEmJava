public class Exercicio2
{
    public static void main (String []args)
    {
        java.util.Scanner teclado = new java.util.Scanner (System.in);
        
        System.out.println("Digite quantas pasteis sua amiga comeu:");
        double amiga = teclado.nextDouble();
        
        double eat = amiga/3*4;
        
        System.out.println("Voces duas comeram " + eat );
        
        
}
}