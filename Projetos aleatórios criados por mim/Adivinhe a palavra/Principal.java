public class Principal
{    public static void main(String [] args)
    {
        java.util.Scanner entrada = new java.util.Scanner(System.in);

        String Resp1;
        String Resp2;
        String Resp3; 
        String Resp4;
        System.out.println("Peça para uma pessoa digitar uma palvra de até 5 letras sem voce ver, a cada letra ela devera dar um enter");
        String L1 = entrada.next();
        String L2 = entrada.next();
        String L3 = entrada.next();
        String L4 = entrada.next();
        String L5 = entrada.next();
        System.out.println("\f");
        System.out.println("Digite uma letra,(caso erre alguma letra tera que reiniciar o jogo)");
        String Resp = entrada.next();
        if ( Resp.equals(L1)||Resp.equals(L2)||Resp.equals(L3)||Resp.equals(L4)||Resp.equals(L5))
        {
            System.out.println("Good,digite outra letra");
            Resp1 = entrada.next();
            if ( Resp.equals(L1)||Resp.equals(L2)||Resp.equals(L3)||Resp.equals(L4)||Resp.equals(L5))
            {
                System.out.println("Good,digite outra letra");
                Resp2 = entrada.next();
                if ( Resp.equals(L1)||Resp.equals(L2)||Resp.equals(L3)||Resp.equals(L4)||Resp.equals(L5))
                {
                    System.out.println("Good,digite outra letra");
                    Resp3 = entrada.next();
                    if ( Resp.equals(L1)||Resp.equals(L2)||Resp.equals(L3)||Resp.equals(L4)||Resp.equals(L5))
                    {
                        System.out.println("Good,digite outra letra");
                        Resp4 = entrada.next();
                        if (Resp.equals(L1)&&Resp1.equals(L2)&&Resp2.equals(L3)&&Resp3.equals(L4)&&Resp4.equals(L5))
                        {
                            System.out.println("Palavra correta, reinicie o joo se quiser jogar novamente");
                        }

                        else 
                        {
                            System.out.println("Palavra incorreta");
                        }

                    }
                    else 
                    {
                        System.out.println("Letra incorreta");
                    }
                } 
            }
            else 
            {
                System.out.println("Letra incorreta");
            }
        }
        else 
        {
            System.out.println("Letra incorreta");
        }

    }
}
