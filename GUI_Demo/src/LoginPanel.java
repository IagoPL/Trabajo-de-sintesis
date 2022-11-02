import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.Objects;
import javax.swing.JComponent;


public class LoginPanel {

    //SE CREA JPANEL

    JPanel loginPanel = new JPanel();

    JLabel bevLoader = new JLabel();

    JLabel fondoPanelLogin = new JLabel();




    //SE CREA BOTÓN DE REGISTRO

    JButton singIn = new JButton();

    //SE CREA NIVEL DE USUARIO

    int userLevel = 0;



    public LoginPanel() throws IOException, FontFormatException {

        //JPANEL LAYOUT


        //JLABEL PARA ESTABLECER IMAGEN DE FONDO
       fondoPanelLogin = new JLabel(new ImageIcon(Objects.requireNonNull(getClass().getResource("images/Fondo_Login.png"))));

        fondoPanelLogin.setLayout(null);// Ningun Layout en Especial

        bevLoader = new JLabel( new ImageIcon(Objects.requireNonNull(getClass().getResource("images/BEV_Loading.png"))));
        bevLoader.setVisible(false);

        //JTEXT FIELD PARA INTRODUCIR NOMBRE DE USUARIO Y CONTRASEÑA

        JTextField enterName = new JTextField(20);
        JPasswordField enterPassword = new JPasswordField(20);




        //CARACTERIZAMOS EL JTEXTFIELD ENTERNAME
        enterName.setBounds(446, 364, 262, 34);
        enterName.setFont(
                Font.createFont(Font.TRUETYPE_FONT, Objects.requireNonNull(getClass().getClassLoader().getResourceAsStream("fonts/BebasNeue-Regular.ttf"))));
        enterName.setFont(enterName.getFont().deriveFont(Font.PLAIN, 25));
        enterName.setOpaque(false);
        enterName.setBorder(null);

        //CARACTERIZAMOS EL JPASSWORDFIELD

        enterPassword.setBounds(446, 454, 262, 31);
        enterPassword.setFont(
                Font.createFont(Font.TRUETYPE_FONT, Objects.requireNonNull(getClass().getClassLoader().getResourceAsStream("fonts/BebasNeue-Regular.ttf"))));
        enterPassword.setFont(enterName.getFont().deriveFont(Font.PLAIN, 25));
        enterPassword.setOpaque(false);
        enterPassword.setBorder(null);

        // BOTÓN DE singIn

        singIn = crearBotonLogin(462, 566, 233, 63, "ENTRAR");


       //AÑADIMOS EN EL JLABEL EL BOTÓN. LUEGO EL JLABEL LO AÑADIMOS AL JPANEL
        fondoPanelLogin.add(enterName); // Lo añadimos al fondo
        fondoPanelLogin.add(enterPassword);
        fondoPanelLogin.add(singIn);

        loginPanel.add(bevLoader);
        loginPanel.add(fondoPanelLogin);





    }

    public JButton crearBotonLogin (int x, int y, int width, int height, String text)
            throws IOException, FontFormatException {

        JButton button = new JButton(text); // Texto
        button.setFont(
                Font.createFont(Font.TRUETYPE_FONT, Objects.requireNonNull(getClass().getClassLoader().getResourceAsStream("fonts/BebasNeue-Regular.ttf")))); // Añadimos
        // fuente
        // personalizada

        button.setFont(button.getFont().deriveFont(Font.PLAIN, 50)); // Añadimos el tamaño de la fuente
        button.setBounds(x, y, width, height);// Se establece su posición y tamaño
        button.setBackground(Color.decode("#7572FF")); // Color del texto
        button.setBorder(null); // Seteamos el borde a null
        button.setOpaque(true); // No lo ponemos opaco
        button.setContentAreaFilled(true); // No ponemos el contenido del area
        button.setBorderPainted(false); // Seteamos el borde en false
        button.setFocusable(false);

        return button;

    }
}
