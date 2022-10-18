import javax.jws.soap.SOAPBinding;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.Objects;

public class AdvertsPanel {

    //SE CREA JPANEL

    JPanel adsPanel = new JPanel();

    //SE CREA BOTÓN DE ANUNCIOS

    JButton userButton = new JButton();
    JButton adsButtons = new JButton();

    JButton contactButton = new JButton();

    //Instancia Utlities

    Utilities utilities = new Utilities();

    //INSTANCIA DE OTROS PANELES




    public AdvertsPanel () throws IOException, FontFormatException {

        //JLABEL PARA ESTABLECER IMAGEN DE FONDO
        JLabel fondoPanelAds = new JLabel(
                new ImageIcon(Objects.requireNonNull(getClass().getResource("images/Fondo_Anuncios.png"))));

        fondoPanelAds.setLayout(null);// Ningun Layout en Especial

        // BOTONES DE MENÚ LATERAL

        userButton = utilities.crearBotonesNavBar(128, 322, 129,47, "USUARIO");

        adsButtons = utilities.crearBotonesNavBarActive(112, 450, 152, 63, "ANUNCIOS");

        contactButton = utilities.crearBotonesNavBar(122, 593, 160, 47, "CONTACTO");

        //SE AÑADEN LOS LABELS Y BOTONES AL PANEL

        fondoPanelAds.add(userButton);
        fondoPanelAds.add(adsButtons);
        fondoPanelAds.add(contactButton);

        adsPanel.add(fondoPanelAds);





    }



}
