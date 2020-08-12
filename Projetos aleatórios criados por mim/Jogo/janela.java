
import javax.swing.JFrame;
import javax.swing.JButton;

public class janela extends JFrame
{
    public janela()
    {
        //add( new JButton ("inicio"));

        setTitle("Meu jogo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setSize(500,500);
        setVisible(true);
    }

    public static void main ( String [] args )
    {
        new janela ();
        
    }
}