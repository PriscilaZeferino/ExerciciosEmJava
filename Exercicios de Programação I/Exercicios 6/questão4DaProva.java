public class questão4DaProva
{
    public static void main (String [] args)
    {
        java.util.Scanner teclado = new java.util.Scanner(System.in);
       
        System.out.println("Digite a quantidade de burguers:");
        int qburguer = teclado.nextInt();
        
          
        System.out.println("Digite a quantidade de batatas fritas:");
        int qfritas = teclado.nextInt();
        
          
        System.out.println("Digite a quantidade de refrigerantes:");
        int qrefris = teclado.nextInt();
        
          
        System.out.println("Digite a quantidade de sucos:");
        int qsucos= teclado.nextInt();
    
        double total = qburguer * 10 + qfritas * 3 + qrefris * 4 + qsucos * 5;
        System.out.println("O valor total eh R$" + total);
    } 
    
}