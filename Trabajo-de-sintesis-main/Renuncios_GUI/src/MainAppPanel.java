import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.Objects;

public class MainAppPanel {




    // FRAME QUE ENMARCA LA PANTALLA DE LOGIN

    static AppWindow MainAppWindow = new AppWindow();

//TODO: borrar esto mas adelante    LoginPanel LoginPanel = new LoginPanel();

    // PANELES CON LAS PANTALLAS DEL LOGIN

    JPanel PanelContenedor = new JPanel();
    JPanel panelUsuario = new JPanel();


    // BOTONES NECESARIOS PARA EL LOGIN

    JButton Usuario = new JButton();


    // MANAGER DE LAYOUTS

    CardLayout CardLayout = new CardLayout();

    //LLAMAR UTILITIES

    Utilities Utilities = new Utilities();



        public MainAppPanel() throws IOException, FontFormatException {

            // SE ESTABLECE EL TIPO DE LAYOUT EN EL PANEL DE CONTENIDO
            PanelContenedor.setLayout(CardLayout);

            //Se establece color de fondo para el JPanel

            JLabel fondoPanelUsuario = new JLabel(
                    new ImageIcon(Objects.requireNonNull(getClass().getResource("images/Login.png"))));// Imagen de
            // FONDO

            fondoPanelUsuario.setLayout(null);// Ningun Layout en Especial


            // BOTÓN DE Usuario

            Usuario = crearBotonLogin(462, 566, 233, 63, "singIn");


            //Fondo se alade a usuario + JButton

            fondoPanelUsuario.add(Usuario);
            panelUsuario.add(fondoPanelUsuario);

            //PANEL CONTENEDOR AÑADE EL PANEL USUARIO
            PanelContenedor.add(panelUsuario, "PanelUsuario");

            //LAYOUT MUESTRA PRIMERA PAGINA
            CardLayout.show(PanelContenedor,"PanelUsuario");

            //LA VENTANA AÑADE PANEL CONTENEDOR
            MainAppWindow.add(PanelContenedor);







        }

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



