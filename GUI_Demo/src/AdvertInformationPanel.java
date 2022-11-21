import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.Objects;

public class AdvertInformationPanel {

    //SE CREA JPANEL

    JPanel adsPanelInfo = new JPanel();

    //SE CREA BOTÓN DE ANUNCIOS

    JButton userButton = new JButton();
    JButton adsButtons = new JButton();

    JButton pageBackButton = new JButton();

    //Instancia Utlities

    Utilities utilities = new Utilities();


    public AdvertInformationPanel () throws IOException, FontFormatException {

        //JLABEL PARA ESTABLECER IMAGEN DE FONDO
        JLabel fondoPanelAds = new JLabel(
                new ImageIcon(Objects.requireNonNull(getClass().getResource("images/Fondo_AdsInfoPanel.png"))));

        fondoPanelAds.setLayout(null);// Ningun Layout en Especial

        // BOTONES DE MENÚ LATERAL

        pageBackButton.setBounds(23, 14, 91, 82);
        pageBackButton.setContentAreaFilled(false);
        pageBackButton.setFocusable(true);
        pageBackButton.setBorderPainted(true);


        fondoPanelAds.add(pageBackButton);



        adsPanelInfo.add(fondoPanelAds);



    }
}
