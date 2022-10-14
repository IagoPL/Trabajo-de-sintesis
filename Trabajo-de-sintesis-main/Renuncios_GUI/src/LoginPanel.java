import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.Objects;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginPanel {


    // FRAME QUE ENMARCA LA PANTALLA DE LOGIN

    LoginWindows WindowGui = new LoginWindows();
//    AppWindow MainAppWindow = new AppWindow();



    // PANELES CON LAS PANTALLAS DEL LOGIN

    JPanel MasterPanel = new JPanel();
    JPanel panelLogin = new JPanel();


    // BOTONES NECESARIOS PARA EL LOGIN

    JButton singIn = new JButton();


    // MANAGER DE LAYOUTS

    CardLayout CardLayout = new CardLayout();

    //LLAMAR UTILITIES

    Utilities Utilities = new Utilities();


    public LoginPanel() throws IOException, FontFormatException {

        // SE ESTABLECE EL TIPO DE LAYOUT EN EL PANEL DE CONTENIDO
        MasterPanel.setLayout(CardLayout);

        // ELEMENTOS DEL PANEL DE LOGIN

        JLabel fondoPanelLogin = new JLabel(
                new ImageIcon(Objects.requireNonNull(getClass().getResource("images/Login.png"))));// Imagen de
        // FONDO

        fondoPanelLogin.setLayout(null);// Ningun Layout en Especial

        //JTEXT FIELD PARA INTRODUCIR NOMBRE DE USUARIO Y CONTRASEÑA

        JTextField enterName = new JTextField(20);
        JPasswordField enterPassword = new JPasswordField(20);


        fondoPanelLogin.add(enterName); // Lo añadimos al fondo
        fondoPanelLogin.add(enterPassword);
        enterName.setBounds(446, 364, 262, 34); // Introducimos las coordenadas


        enterName.setFont(
                Font.createFont(Font.TRUETYPE_FONT, Objects.requireNonNull(getClass().getClassLoader().getResourceAsStream("fonts/BebasNeue-Regular.ttf")))); // Añadimos
        // fuente

        // personalizada

        // personalizada
        enterName.setFont(enterName.getFont().deriveFont(Font.PLAIN, 25)); // Ponemos el
        // tamañlo de
        // la fuente
        enterName.setOpaque(false);
        enterName.setBorder(null);

        enterPassword.setBounds(446, 454, 262, 31); // Introducimos las coordenadas
        enterPassword.setFont(
                Font.createFont(Font.TRUETYPE_FONT, Objects.requireNonNull(getClass().getClassLoader().getResourceAsStream("fonts/BebasNeue-Regular.ttf")))); // Añadimos
        // fuente
        // personalizada
        enterPassword.setFont(enterName.getFont().deriveFont(Font.PLAIN, 25)); // Ponemos el
        // tamañlo de
        // la fuente
        enterPassword.setOpaque(false);
        enterPassword.setBorder(null);


        // BOTÓN DE singIn


        singIn = crearBotonLogin(462, 566, 233, 63, "singIn");


        fondoPanelLogin.add(singIn);
        panelLogin.add(fondoPanelLogin);


        // AÑADIMOS PANELES A PANEL MAESTRO

        MasterPanel.add(panelLogin, "Login");

        CardLayout.show(MasterPanel, "Login");

        WindowGui.add(MasterPanel);





        singIn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //call another method in the same class which will close this Jframe
                WindowGui.dispose();
                MainAppPanel.MainAppWindow.setVisible(true);




            }
        });



    }

    // Le pasamos los parametros necesarios para crear un boton

    public JButton crearBotonLogin(int x, int y, int width, int height, String text)
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

