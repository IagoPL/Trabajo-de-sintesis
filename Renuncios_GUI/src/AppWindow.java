import javax.swing.*;

public class AppWindow extends JFrame {

    AppWindow () {
        setSize(1157, 790);//Tamaño Marco
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Posibilita cerrar marco
        setTitle("Renuncios");//Le da un nombre
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);//Lo hace visible
    }
}
