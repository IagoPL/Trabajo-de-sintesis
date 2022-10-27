import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.Objects;

public class AdminUserPanel {

    //SE CREA JPANEL

    JPanel adminUserPanel = new JPanel();

    //SE CREA JTABLE

    JTable adminTable  = new JTable();

    //SE CREAN JTEXTFIELDS

    JTextField adminName = new JTextField(10);
    JTextField adminID = new JTextField(10);
    JTextField adminNumber = new JTextField(10);
    JTextField adminEmail = new JTextField(10);
    JTextField adminTotalAds = new JTextField(10);


    //SE CREAN LOS BOTONES

    JButton userInfo = new JButton();
    JButton buissnesListSection = new JButton();
    JButton adminUserButton = new JButton();
    JButton adsButton = new JButton();
    JButton contactButton = new JButton();

    //Instancia Utlities

    Utilities utilities = new Utilities();

    public AdminUserPanel() throws IOException, FontFormatException {

        //JLABEL PARA ESTABLECER IMAGEN DE FONDO
        JLabel adminUserPanelBackground = new JLabel(
                new ImageIcon(Objects.requireNonNull(getClass().getResource("images/Fondo_Usuario_Admin.png"))));

        //JLABEL REDUCIDO PARA CONTENER DISTINTOS TIPOS DE INFORMACIÓN, TAMBIÉN LO CARACTERIZAMOS
        JLabel infoContainer = new JLabel();

        infoContainer.setBounds(354, 225, 772, 465);
        infoContainer.setBackground(Color.decode("#D2D9FE"));
        infoContainer.setOpaque(true);
        infoContainer.setVisible(true);



        //LLAMAMOS LOS BOTONES PERTINENTES

        adminUserButton = utilities.crearBotonesNavBarActive(128, 322, 129, 47, "Usuario");

        adsButton = utilities.crearBotonesNavBar(112, 458, 152, 47, "Anuncios");

        contactButton = utilities.crearBotonesNavBar(122, 593, 160, 47, "Contacto");

        userInfo.setBounds(358, 169, 372,57);
        userInfo.setContentAreaFilled(false);
        userInfo.setBorderPainted(true);



        buissnesListSection.setBounds(744, 169, 372,57);
        buissnesListSection.setOpaque(false);
        buissnesListSection.setBorderPainted(true);


        adminUserPanelBackground.add(adminUserButton);
        adminUserPanelBackground.add(adsButton);
        adminUserPanelBackground.add(contactButton);
        adminUserPanelBackground.add(userInfo);
        adminUserPanelBackground.add(buissnesListSection);
        adminUserPanelBackground.add(infoContainer);
        adminUserPanel.add(adminUserPanelBackground);




    }


}
