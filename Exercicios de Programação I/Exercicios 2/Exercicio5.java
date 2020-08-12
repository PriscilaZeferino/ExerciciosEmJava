public class Exercicio5
{
    public static void main (String [] args)
    {
        java.util.Scanner entrada = new java.util.Scanner(System.in);
        System.out.println ("\fPor favor digite somente quantos quilogramas voce tem de trigo ?");
        int Kg = entrada.nextInt();
        int paes = Kg * 23;
        System.out.println("Voce ira produzir " + paes + " paes franceses ");

    }
}