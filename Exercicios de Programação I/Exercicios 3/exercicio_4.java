public class exercicio_4
{
    public static void main (String[]args)
    {
        //inicia a entrada de dados
        java.util.Scanner teclado = new java.util.Scanner(System.in);   
        //Diz para o usuario digitar sua primeira nota e cria uma variavel apartir dela
        System.out.println("\fDigite sua primeira nota");
        double nota1 = teclado.nextDouble();
        //Diz para o usuario digitar sua segunda nota e cria uma variaveis que caculam a media a partir dela
        System.out.println("Digite sua segunda nota");
        double nota2 = teclado.nextDouble();
        //Calcula e imprime na tela a media do aluno
        double media = (nota1 + nota2)/2.0 ;
        System.out.println("Sua media é " + media);
    }
}
