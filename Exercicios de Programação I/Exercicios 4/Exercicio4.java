/**
 *4. Faça um programa capaz de calcular a média final dadas as notas das 3 provas e produzir uma saída
com a média e a situação do aluno de acordo com o seguinte critério: média >= 7, aprovado; 3 <=
média < 7, recuperação; média < 3, reprovado. Considerar também o número de faltas do aluno: se
forem mais que sete faltas, o aluno estará automaticamente reprovado (o usuário deve fornecer o
numero de faltas). Se o aluno se encontrar em recuperação, solicitar a nota da quarta prova e, após
calcular a media final, informar se o aluno passou (media final >=5) ou não.

 */
public class Exercicio4
{
    public static void main(String [] args)
    {
        java.util.Scanner entrada = new java.util.Scanner(System.in);
        System.out.println("Digite a nota da primeira prova: ");
        double nota1 = entrada.nextDouble();
        System.out.println("Digite a nota da segunda prova: ");
        double nota2 = entrada.nextDouble();
        System.out.println("Digite a nota da terceira prova");
        double nota3 = entrada.nextDouble();
        System.out.println("Digite o seu numero de faltas: ");
        double falt = entrada.nextDouble();
        double media = (nota1 + nota2 + nota3)/3;

        if (falt > 7)
        {
            System.out.println("Voce esta reprovado por frequencia");   
        }
        else  if (media >= 7.0) 
        {
            System.out.println("Sua media foi " + media +", voce esta aprovado.");
        }
        else if (media >= 3.0)
        {
            System.out.println("Sua media foi " + media +", voce esta de recuperação");
            System.out.println("Digite a nota da quarta prova");
            double nota4 = entrada.nextDouble();
            double media1 = (nota1 + nota2 + nota3 + nota4 )/4;
            if (media1 >= 5)
            {
                System.out.println("Voce passou");
            }
            else
            {
                System.out.println("Voce esta reprovado ");
            }
        }
        else if ( media < 3)
        {
            System.out.println("Voce esta reprovado");
        }

    }
}
