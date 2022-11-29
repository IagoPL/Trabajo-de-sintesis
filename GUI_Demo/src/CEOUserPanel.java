import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Objects;

public class CEOUserPanel {

    //SE CREA JPANEL

    JPanel ceoUserPanel = new JPanel();

    //SE CREA JTABLE

        //ARRAY DE DATOS DE LA JTABLE

    //Cabeceras de la Tabla
     String[] columns = new String[] {
            "Id", "Empresa",
     };

     Object [][] datos = new Object[][] {
             {"01", "Netflix"},
             {"02", "Mercadona" },

     };

    JTable ceoTable  = new JTable(datos, columns);
    JScrollPane tableContainer = new JScrollPane(ceoTable);


    //SE CREAN JTEXTFIELDS

    JTextField adminName = new JTextField(10);
    JTextField adminID = new JTextField(10);
    JTextField adminNumber = new JTextField(10);
    JTextField adminEmail = new JTextField(10);
    JTextField adminTotalAds = new JTextField(10);


    //SE CREAN LOS BOTONES

    JButton userInfo = new JButton();

            //VARIABLE PARA MOSTRAR UNA INFO O LA TABLA
              int numInfo = 1;

    JButton buissnesListSection = new JButton();
    JButton adminUserButton = new JButton();
    JButton adsButton = new JButton();
    JButton contactButton = new JButton();
    JButton requestNewUser = new JButton();


    //INSTANCIA UTILITIES

    Utilities utilities = new Utilities();

    //INSTANCIA UTILITIES

    public CEOUserPanel() throws IOException, FontFormatException {

        //JLABEL PARA ESTABLECER IMAGEN DE FONDO
        JLabel adminUserPanelBackground = new JLabel(
                new ImageIcon(Objects.requireNonNull(getClass().getResource("images/Fondo_Usuario_Admin.png"))));

        //JLABEL REDUCIDO PARA CONTENER DISTINTOS TIPOS DE INFORMACIÓN, TAMBIÉN LO CARACTERIZAMOS
        JLabel infoContainer = new JLabel();

        infoContainer.setBounds(354, 225, 772, 465);
        infoContainer.setBackground(Color.decode("#D2D9FE"));
        infoContainer.setOpaque(true);
        infoContainer.setVisible(true);


        //JTXTFIELDS

        adminName.setBounds(100, 100, 100,56);
        adminName.setBackground(Color.DARK_GRAY);

        //JSCROLL PANEL ES EDITADO

        tableContainer.setBounds(0,0,772, 465);
        tableContainer.setVisible(false);







        //LLAMAMOS LOS BOTONES PERTINENTES

        adminUserButton = utilities.crearBotonesNavBarActive(128, 322, 129, 47, "Usuario");

        adsButton = utilities.crearBotonesNavBar(112, 458, 152, 47, "Anuncios");

        contactButton = utilities.crearBotonesNavBar(122, 593, 160, 47, "Contacto");

        userInfo.setBounds(358, 169, 372,57);
        userInfo.setContentAreaFilled(false);
        userInfo.setBorderPainted(false);
        //LISTENER USER PANEL adsButton
        userInfo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //call another method in the same class which will close this Jframe
                tableContainer.setVisible(false);

            }
        });



        buissnesListSection.setBounds(744, 169, 372,57);
        buissnesListSection.setContentAreaFilled(false);
        buissnesListSection.setBorderPainted(false);
        buissnesListSection.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //call another method in the same class which will close this Jframe
                tableContainer.setVisible(true);



            }
        });



        adminUserPanelBackground.add(adminUserButton);
        adminUserPanelBackground.add(adsButton);
        adminUserPanelBackground.add(contactButton);
        adminUserPanelBackground.add(userInfo);
        adminUserPanelBackground.add(buissnesListSection);
        infoContainer.add(tableContainer);
        infoContainer.add(adminName);
        adminUserPanelBackground.add(infoContainer);
        ceoUserPanel.add(adminUserPanelBackground);




    }


}
