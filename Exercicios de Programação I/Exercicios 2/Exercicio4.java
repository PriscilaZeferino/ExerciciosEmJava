public class Exercicio4
{
public static void main (String[] args)
{
    
    java.util.Scanner teclado = new java.util.Scanner(System.in);
    // imprime uma mensagem na tela
    System.out.println("Digite quantos pontos você teve na prova de matematica : ");  
    int pontos = teclado.nextInt();
    //Calcula as questoes certas e erradas
    int questoesC = pontos*10/50;
    int questoeE = 10 - questoesC;
    //mostra ao usuario quantas questoes acertou e errou
    System.out.println("Voce acertou " + questoesC + " questoes ");
    System.out.println("Voce errou " +  questoeE + " questoes " );
    
}
}