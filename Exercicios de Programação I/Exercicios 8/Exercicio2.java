
/**
2. Faça um programa capaz de ler 3 notas de um aluno. Calcular a média final dadas as 3 notas das e
produzir uma saída com a média e a situação do aluno de acordo com o seguinte critério:
média >= 7, aprovado;
3 <= média < 7, recuperação;
média < 3, reprovado.

 */
public class Exercicio2
{
    public static void main (String [] args)
    {
        java.util.Scanner entrada = new java.util.Scanner(System.in);
        System.out.println("Digite sua primeira nota");
        double nota1 = entrada.nextDouble();
        System.out.println("Digite sua segunda nota");
        double nota2 = entrada.nextDouble();
        System.out.println("Digite sua terceira nota");
        double nota3 = entrada.nextDouble();
        double media = (nota1+nota2+nota3)/3;
        if (media >= 7.0)
        {
         System.out.println("Sua media foi " + media + ", voce esta APROVADO ");
        }
        else if(media >= 3)
        {
            System.out.println("Sua media foi " + media + ", voce esta em RECUPERAÇÃO");
        }
        else if (media < 3 )
        {
            System.out.println("Sua media foi " + media + ", voce esta REPROVADO");
        }
    }
}
