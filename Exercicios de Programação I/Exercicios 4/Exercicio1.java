/*
1. Elabore um programador que dada a idade de um nadador classifique-o em uma das seguintes
categorias. Mostrar na tela a idade e a categoria digitada pelo usuário:
Infantil A = 5 a 7 anos
Infantil B = 8 a 10 anos
Juvenil A = 11 a 13 anos
Juvenil B = 14 a 17 anos
Adulto = maiores de 18 anos
 */
public class Exercicio1
{
    public static void main (String [] args)
    {
        java.util.Scanner entrada =  new java.util.Scanner(System.in);
        System.out.println("Pr favor, digite sua idade");
        int idade = entrada.nextInt();
        if (idade >= 18)
        {
            System.out.println("Categoria: Adulto");
        }
        else if (idade >= 14)
        {
            System.out.println("Categotia: Juvenil B");
        }
        else if (idade >= 11 )
        {
            System.out.println("Categoria: Juvenil A");
        }
        else if (idade >= 8)
        {
            System.out.println("Categoria: Infantil B");
        }
        else if (idade >= 5)
        {
            System.out.println("Categoria: Infantil A");     
        }
        else 
        {
            System.out.println("Categoria: não encontrada");
        }
    }
}