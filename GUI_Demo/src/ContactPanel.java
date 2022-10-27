import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.Objects;

public class ContactPanel {

    //SE CREA JPANEL

    JPanel contactPanel = new JPanel();

    //SE CREAN JTEXTFIELDS
    JTextField straightEmail = new JTextField(20);
    JTextArea straightMessage = new JTextArea(10,10);

    //SE CREA BOTÓN DE USUARIO

    JButton userButton = new JButton();

    JButton adsButton = new JButton();
    JButton contactButton = new JButton();
    JButton submitButton = new JButton();

    //Utilities

    Utilities utilities = new Utilities();

public ContactPanel () throws IOException, FontFormatException {

    //JLABEL PARA ESTABLECER IMAGEN DE FONDO
    JLabel contactPanelBackground = new JLabel(
            new ImageIcon(Objects.requireNonNull(getClass().getResource("images/Fondo_Contacto.png"))));


    //SETEAMOS JTEXTFIELD
    straightEmail.setBounds(414, 250, 660, 55);
    straightEmail.setFont(Font.createFont(Font.TRUETYPE_FONT, Objects.requireNonNull(getClass().getClassLoader().getResourceAsStream("fonts/Quicksand-Regular.ttf"))));
    straightEmail.setFont(straightEmail.getFont().deriveFont(Font.PLAIN, 25));
    straightEmail.setOpaque(false);
    straightEmail.setBorder(null);

    //PERSONALIZAMOS EL PLACEHOLDER
    TextPrompt placeholderCorreoDirecto = new TextPrompt("Tema:", straightEmail);
    placeholderCorreoDirecto.changeAlpha(0.50f);
    placeholderCorreoDirecto.changeStyle(Font.BOLD);


    // SETEAMOS EL JTEXTAREA
    straightMessage.setBounds(414, 369, 681, 276);
    straightMessage.setFont(Font.createFont(Font.TRUETYPE_FONT, Objects.requireNonNull(getClass().getClassLoader().getResourceAsStream("fonts/Quicksand-Regular.ttf"))));
    straightMessage.setFont(straightEmail.getFont().deriveFont(Font.PLAIN, 25));
    straightMessage.setOpaque(false);
    straightMessage.setWrapStyleWord(true);
    straightMessage.setLineWrap(true);

    //PERSONALIZAMOS EL PLACEHOLDER 2
    TextPrompt placeholderStraightMessage = new TextPrompt("Message:", straightMessage);
    placeholderStraightMessage.changeAlpha(0.50f);
    placeholderStraightMessage.changeStyle(Font.BOLD);

    //CREAR BOTONES EN LA FUNCIÓN

    submitButton.setBounds(460, 659, 236, 48);
    submitButton.setContentAreaFilled(false);
    submitButton.setBorder(null);



    userButton = utilities.crearBotonesNavBar(128, 322, 129,47, "USUARIO");

    adsButton = utilities.crearBotonesNavBar(112, 450, 152, 63, "ANUNCIOS");

    contactButton = utilities.crearBotonesNavBarActive(122, 593, 160, 47, "CONTACTO");


    contactPanelBackground.add(userButton);
    contactPanelBackground.add(adsButton);
    contactPanelBackground.add(contactButton);

    contactPanelBackground.add(submitButton);
    contactPanelBackground.add(straightMessage);
    contactPanelBackground.add(straightEmail);
    contactPanel.add(contactPanelBackground);
}

    public JButton crearBotonSubmit (int x, int y, int width, int height, String text)
            throws IOException, FontFormatException {

        JButton button = new JButton(text); // Texto
        button.setFont(
                Font.createFont(Font.TRUETYPE_FONT, Objects.requireNonNull(getClass().getClassLoader().getResourceAsStream("fonts/BebasNeue-Regular.ttf")))); // Añadimos
        // fuente
        // personalizada

        button.setFont(button.getFont().deriveFont(Font.PLAIN, 50)); // Añadimos el tamaño de la fuente
        button.setBounds(x, y, width, height);// Se establece su posición y tamaño
        button.setBackground(Color.decode("#4F8D86")); // Color del texto
        button.setBorder(null); // Seteamos el borde a null
        button.setOpaque(true); // No lo ponemos opaco
        button.setContentAreaFilled(true); // No ponemos el contenido del area
        button.setBorderPainted(false); // Seteamos el borde en false
        button.setFocusable(false);

        return button;

    }


}



