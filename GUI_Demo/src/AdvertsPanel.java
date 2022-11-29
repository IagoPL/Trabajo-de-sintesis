import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
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

    //JLABELS PARA LOS ANUNCIOS

    JLabel add1 = new JLabel();
    JLabel add2 = new JLabel();
    JLabel add3 = new JLabel();

    //JLABELS PARA LOS ANUNCIOS CADUCADOS

    JLabel add1C = new JLabel();
    JLabel add2C = new JLabel();
    JLabel add3C = new JLabel();

    //CREAR BOTÓN DE TOOLPIT

    JButton newAdd = new JButton();







    public AdvertsPanel () throws IOException, FontFormatException {

        //JLABEL PARA ESTABLECER IMAGEN DE FONDO
        JLabel fondoPanelAds = new JLabel(
                new ImageIcon(Objects.requireNonNull(getClass().getResource("images/Fondo_Anuncios-admin.png"))));

        fondoPanelAds.setLayout(null);// Ningun Layout en Especial

        // BOTONES DE MENÚ LATERAL

        userButton = utilities.crearBotonesNavBar(128, 322, 129,47, "USUARIO");

        adsButtons = utilities.crearBotonesNavBarActive(112, 450, 152, 63, "ANUNCIOS");

        contactButton = utilities.crearBotonesNavBar(122, 593, 160, 47, "CONTACTO");



        //JLABELS PARA LOS ANUNCIOS

        add1.setBounds(697, 199, 150, 223);
        add1.setBackground(Color.lightGray);
        add1.setOpaque(true);




        add2.setBounds(529, 196, 139, 201);
        add2.setBackground(Color.lightGray);
        add2.setOpaque(true);

        add3.setBounds(875, 197, 139, 202);
        add3.setBackground(Color.lightGray);
        add3.setOpaque(true);

        //JLABELS PARA LOS ANUNCIOS FINALIZADOS

        add1C.setBounds(697, 509, 150, 223);
        add1C.setBackground(Color.lightGray);
        add1C.setOpaque(true);


        add2C.setBounds(529, 506, 139, 201);
        add2C.setBackground(Color.lightGray);
        add2C.setOpaque(true);

        add3C.setBounds(875, 509, 139, 202);
        add3C.setBackground(Color.lightGray);
        add3C.setOpaque(true);

        //BOTÓN DE CREACIÓN DE NUEVOS ANUNCIOS

        newAdd.setBounds(1068, 24, 55,55 );
        newAdd.setToolTipText("Añadir Nuevo Anuncio");
        newAdd.setContentAreaFilled(false);
        newAdd.setFocusable(false);
        newAdd.setBorder(null);
        newAdd.setVisible(true);
        //SE AÑADEN LOS LABELS Y BOTONES AL PANEL

        fondoPanelAds.add(add1);
        fondoPanelAds.add(add2);
        fondoPanelAds.add(add3);
        fondoPanelAds.add(add1C);
        fondoPanelAds.add(add2C);
        fondoPanelAds.add(add3C);
        fondoPanelAds.add(userButton);
        fondoPanelAds.add(adsButtons);
        fondoPanelAds.add(contactButton);
        fondoPanelAds.add(newAdd);


        adsPanel.add(fondoPanelAds);





    }



}
