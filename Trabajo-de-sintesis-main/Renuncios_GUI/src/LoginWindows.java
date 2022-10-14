import javax.swing.*;

/**
 * La clase frame gestiona el frame
 */
public class LoginWindows extends JFrame {

    /**
     * Iniciamos el frame del juego
     */
    LoginWindows() {
        setSize(1157, 790);//Tamaño Marco
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Posibilita cerrar marco
        setTitle("Renuncios");//Le da un nombre
        //Lo hace visible
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
    }



}