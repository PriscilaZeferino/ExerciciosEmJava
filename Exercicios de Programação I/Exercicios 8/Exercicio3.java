/**
3. Faça um programa capaz de ler um número de faltas de um aluno. Caso forem mais que sete faltas, o
aluno estará automaticamente reprovado. Portanto, deve-se mostrar a mensagem reprovado por
freqüência. Senão mostrar a mensagem “Frequência suficiente para aprovação!”.
 */
public class Exercicio3
{
    public static void main (String [] args)
    {
        java.util.Scanner entrada = new java.util.Scanner(System.in);
        System.out.println("Digite o seu numero de faltas");
        int falta = entrada.nextInt();
        if (falta > 7)
        {
            System.out.println("Reprovado por frequencia");
        }
        else if (falta < 7)
        {
            System.out.println("Frequencia suficiente para aprovação");
        }
        
    }
}
