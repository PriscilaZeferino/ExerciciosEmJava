import java.util.ArrayList;
public class Dicionario
{
    private ArrayList <String> palavrasIngles;//Guarda as palavras em Inglês
    private ArrayList <String> palavrasPortugues;//Guarda as palavras em Português
    public Dicionario()
    {
        palavrasIngles    = new ArrayList<String>();
        palavrasPortugues = new ArrayList<String>();
    }
    //Para prenecher nosso Dicionário temos que colocar a palavra em Potuguês
    // e a Palavra equivalente em Inglês.
    //Assim a palavra e sua tradução fica sempre com o mesmo Nº de índice. 
    public void preencheDicionario(String palavraPort, String palavraIng)
    {
        palavrasPortugues.add (palavraPort);
        palavrasIngles.add (palavraIng);      
    }
    public ArrayList getArrayPalavrasIng()//retorna Array de palavras em Inglês 
    {
        return palavrasIngles;
    }
    public ArrayList getArrayPalavrasPort()//retorna array de palavras em Português
    {
        return palavrasPortugues;
    }
}