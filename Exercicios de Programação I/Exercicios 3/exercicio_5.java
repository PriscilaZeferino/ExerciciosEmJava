public class exercicio_5
{
    public static void main (String[] args)
    {
    java.util.Scanner teclado = new java.util.Scanner(System.in);
    //pergunta o nome da pessoa
    System.out.println("Digite o seu nome");
    String name= teclado.nextLine();
    //pergunta o peso da pessoa
    System.out.println("Digite o seu peso");
    double peso = teclado.nextDouble();
    //pergunta a altura da pessoa
    System.out.println("Digite a sua altura");
    double altura = teclado.nextDouble();
    //calcula o imc
    double imc = peso/(altura*altura)  ;
    //exibe o nome da pessoa na tela
    System.out.println(name);
    //exibe o imc
    System.out.println("Seu indice de massa corporal(imc)é " + imc);
    
}
}
