public class Turnos
{
    public static void main ( String [] args)
    {
        java.util.Scanner entrada = new java.util.Scanner(System.in);
        System.out.println("Digite o numero de turnos que voce trabalha durante o mes inteiro?");
        int nT = entrada.nextInt();
        if ( nT == 1)
        {
            System.out.println(" Digite quantos dias trabalhou aproximadamente ?");
            double WW = entrada.nextInt();

            System.out.println(" Digite a sua hora de entrada em qualquer dia da semana( utilize a virgula para separar a hora s minutos)");
            double HE = entrada.nextDouble();

            System.out.println(" Digite a sua hora de saida ");
            double HS = entrada.nextDouble();

            System.out.println(" Digite seu tempo de intervalo");
            double HI = entrada.nextDouble();

            System.out.println("Qual a sua hora padrão de saida");
            double HP = entrada.nextDouble();

            double Calc = (((HS - HE )* nT) - HI)-HP;

            System.out.println(Calc);

        }
        else if ( nT == 2)
        {
            System.out.println(" Digite quantos dias trabalhou aproximadamente ?");
            double WW = entrada.nextInt();

            System.out.println(" Digite a sua hora de entrada em qualquer dia da semana( utilize a virgula para separar a hora s minutos)");
            double HE = entrada.nextDouble();

            System.out.println(" Digite a sua hora de saida ");
            double HS = entrada.nextDouble();

            System.out.println(" Digite seu tempo de intervalo");
            double HI = entrada.nextDouble();

            System.out.println("Qual a sua hora padrão de saida");
            double HP = entrada.nextDouble();

            double Calc = (((HS - HE )* nT) - HI)-HP;

            System.out.println(Calc);
        }
        else if ( nT == 3)
        {
            System.out.println(" Digite quantos dias trabalhou aproximadamente ?");
            double WW = entrada.nextInt();

            System.out.println(" Digite a sua hora de entrada em qualquer dia da semana( utilize a virgula para separar a hora s minutos)");
            double HE = entrada.nextDouble();

            System.out.println(" Digite a sua hora de saida ");
            double HS = entrada.nextDouble();

            System.out.println(" Digite seu tempo de intervalo");
            double HI = entrada.nextDouble();

            System.out.println("Qual a sua hora padrão de saida");
            double HP = entrada.nextDouble();

            double Calc = (((HS - HE )* nT) - HI)-HP;

            System.out.println(Calc);
        }
        else 
        {
            System.out.println(" Valor exede o permitido");
        }
    }
}
