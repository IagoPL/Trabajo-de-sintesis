import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.Objects;

public class ContactPanel {

    //SE CREA JPANEL

    JPanel contactPanel = new JPanel();

    //SE CREA BOTÓN DE REGISTRO
    JTextField straightEmail = new JTextField(20);
    JTextArea straightMessage = new JTextArea(10,20);

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
    straightEmail.setBounds(464, 270, 660, 55);
    straightEmail.setFont(Font.createFont(Font.TRUETYPE_FONT, Objects.requireNonNull(getClass().getClassLoader().getResourceAsStream("fonts/Quicksand-Regular.ttf"))));
    straightEmail.setFont(straightEmail.getFont().deriveFont(Font.PLAIN, 25));
    straightEmail.setOpaque(false);
    straightEmail.setBorder(null);

    //PERSONALIZAMOS EL PLACEHOLDER
    TextPrompt placeholderCorreoDirecto = new TextPrompt("Tema:", straightEmail);
    placeholderCorreoDirecto.changeAlpha(0.50f);
    placeholderCorreoDirecto.changeStyle(Font.BOLD);


    // SETEAMOS EL JTEXTAREA
    straightMessage.setBounds(456, 381, 681, 276);
    straightMessage.setFont(Font.createFont(Font.TRUETYPE_FONT, Objects.requireNonNull(getClass().getClassLoader().getResourceAsStream("fonts/Quicksand-Regular.ttf"))));
    straightMessage.setFont(straightEmail.getFont().deriveFont(Font.PLAIN, 25));
    straightMessage.setOpaque(false);
    straightMessage.setBorder(null);
    straightMessage.setWrapStyleWord(true);
    straightMessage.setLineWrap(true);

    //CREAR BOTONES EN LA FUNCIÓN

    submitButton = utilities.crearBotonesNavBar(460,696,236,48, "ENVIAR");

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


}



