import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Objects;

public class AdminUserPanel {

    //SE CREA JPANEL

    JPanel adminUserPanel = new JPanel();

    //SE CREA JTABLE

        //ARRAY DE DATOS DE LA JTABLE

    //Cabeceras de la Tabla
     String[] columns = new String[] {
            "Id", "Empresa",
     };
    double posY = -59;


     Object [][] datos = new Object[][] {
             {"01", "Netflix"},
             {"02", "Mercadona" },
             {"02", "Mercadona" },
             {"02", "Mercadona" },
             {"02", "Mercadona" },
             {"02", "Mercadona" },
             {"02", "Mercadona" },
             {"02", "Mercadona" },




     };

    //JTable adminTable  = new JTable(datos, columns);
    JLabel listaEmpresas = new JLabel();

    JPanel bussinesPanelContainer = new JPanel ();

    JList businessJList = new JList();
    JScrollPane tableContainer = new JScrollPane();




    //SE CREAN JTEXTFIELDS

    JLabel adminName = new JLabel();
    JLabel adminID = new JLabel();
    JLabel adminNumber = new JLabel();
    JLabel adminEmail = new JLabel();
    JLabel adminTotalAds = new JLabel();

    JLabel adminNameTitle = new JLabel("NOMBRE: ");
    JLabel adminIDTitle = new JLabel("ID: ");
    JLabel adminNumberTitle = new JLabel("TELÉFONO: ");
    JLabel adminEmailTitle = new JLabel("CORREO: ");
    JLabel adminTotalAdsTitle = new JLabel("ANUNCIOS TOTALES: ");


    //SE CREAN LOS BOTONES

    JButton userInfo = new JButton();

            //VARIABLE PARA MOSTRAR UNA INFO O LA TABLA
              int numInfo = 1;

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


        //JLABELS TITLE


        adminNameTitle = utilities.crearLabelParaPaneles(60, 40, 150,56, "NOMBRE:");

        adminIDTitle = utilities.crearLabelParaPaneles(60, 104, 100, 56, "ID:");

        adminNumberTitle = utilities.crearLabelParaPaneles(60, 168, 170,56, "TELÉFONO:");

        adminEmailTitle = utilities.crearLabelParaPaneles(60, 232, 160,56, "CORREO:");

        adminTotalAdsTitle = utilities.crearLabelParaPaneles(60, 296, 300,56, "ANUNCIOS TOTALES:");



        //JSCROLL PANEL ES EDITADO






        for (int i = 0; i < datos.length; i++ ) {


           listaEmpresas = new JLabel("Netflix", SwingConstants.CENTER);
            listaEmpresas.setFont(
                    Font.createFont(Font.TRUETYPE_FONT, Objects.requireNonNull(getClass().getClassLoader().getResourceAsStream("fonts/BebasNeue-Regular.ttf")))); // Añadimos
            // fuente
            // personalizada
            listaEmpresas.setFont(listaEmpresas.getFont().deriveFont(Font.PLAIN, 48)); // Añadimos el tamaño de la fuente
            listaEmpresas.setVisible(true);
            listaEmpresas.setOpaque(true);
            listaEmpresas.setBorder(BorderFactory.createRaisedSoftBevelBorder());
            listaEmpresas.setBackground(Color.decode("#D2D9FE"));
            listaEmpresas.setLayout(null);



           listaEmpresas.setBounds((int) -1.8, (int) (posY + 59), 773, 56);
           posY = posY + 58;


           tableContainer.add(listaEmpresas);


        }

        tableContainer.setBounds(0,0,772, 465);
        //tableContainer.setLayout(new ScrollPaneLayout());
        tableContainer.setLayout(null);
        tableContainer.setVisible(false);


       // bussinesPanelContainer.setBackground(Color.ORANGE);
        // bussinesPanelContainer.setVisible(true);
       // tableContainer.add(bussinesPanelContainer);



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
        infoContainer.add(adminNameTitle);
        infoContainer.add(adminIDTitle);
        infoContainer.add(adminNumberTitle);
        infoContainer.add(adminEmailTitle);
        infoContainer.add(adminTotalAdsTitle);
        adminUserPanelBackground.add(infoContainer);
        adminUserPanel.add(adminUserPanelBackground);




    }


}
