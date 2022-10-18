import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.util.Objects;

public class
UserPanel {

    //SE CREA JPANEL

    JPanel userPanel = new JPanel();

    //SE CREAn los botones

    JButton userButton = new JButton();
    JButton adsButton = new JButton();
    JButton contactButton = new JButton();

    //Instancia Utlities

    Utilities utilities = new Utilities();

    public UserPanel() throws IOException, FontFormatException {

        //JLABEL PARA ESTABLECER IMAGEN DE FONDO
        JLabel userPanelBackground = new JLabel(
                new ImageIcon(Objects.requireNonNull(getClass().getResource("images/Fondo_Usuarios.png"))));

        userPanelBackground.setLayout(null);// Ningun Layout en Especial

        userButton = utilities.crearBotonesNavBarActive(128, 322, 129, 47, "Usuario");

        adsButton = utilities.crearBotonesNavBar(112, 458, 152, 47, "Anuncios");

        contactButton = utilities.crearBotonesNavBar(122, 593, 160, 47, "Contacto");



        userPanelBackground.add(contactButton);
        userPanelBackground.add(adsButton);
        userPanelBackground.add(userButton);
        userPanel.add(userPanelBackground);


    }


}
