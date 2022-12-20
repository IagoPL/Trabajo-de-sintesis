import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.util.Objects;

public class AdminUserPanel {

    //SE CREA JPANEL

    JPanel adminUserPanel = new JPanel();



    double posY = -59;

    JLabel listaEmpresas = new JLabel();

    JPanel bussinesPanelContainer = new JPanel ();

    JList businessJList = new JList();
    JScrollPane tableContainer = new JScrollPane();

    String NombreTrabajadores [] = {"Ángel Petro", "Alba Ortiz", "Nerea Baixu", "Gabriel Pilluán", "Oriol Vallverda", "Santiago Gallardo", "Andrea Gonzalez", "Albert Dalmar",
                                    " Núria Roca", "Iratxe Muriana", "Matías Cayetano", "Iván Prim", "Alma Estrada", "Adoració Norteny", "José Martín Juez", "María Lago" };



    //SE CREAN JLABELS PARA LA LOSTA DE TRABAJADORES

    JLabel label1 = new JLabel();
    JLabel label2 = new JLabel();
    JLabel label3 = new JLabel();
    JLabel label4 = new JLabel();
    JLabel label5 = new JLabel();
    JLabel label6 = new JLabel();
    JLabel label7 = new JLabel();
    JLabel label8 = new JLabel();



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

    JButton createUserButton = new JButton();
    JButton adelante = new JButton();
    JButton atras = new JButton();
    //Instancia Utlities

    Utilities utilities = new Utilities();

    public AdminUserPanel() throws IOException, FontFormatException {

        //JLABEL PARA ESTABLECER IMAGEN DE FONDO
        JLabel adminUserPanelBackground = new JLabel(
                new ImageIcon(Objects.requireNonNull(getClass().getResource("images/Fondo_UsuarioAdmin.png"))));

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

        //JLABELS DÓNDE COLOCAR LA INFORMACIÓN DE LOS USUARIOS

        adminName = utilities.crearLabelParaPanelesDeInfoDeUsuario(210, 40, 150,56, "");

        adminID = utilities.crearLabelParaPanelesDeInfoDeUsuario(160, 104, 100, 56, "");

        adminNumber = utilities.crearLabelParaPanelesDeInfoDeUsuario(230, 168, 170,56, "");

        adminEmail = utilities.crearLabelParaPanelesDeInfoDeUsuario(220, 232, 160,56, "");

        adminTotalAds = utilities.crearLabelParaPanelesDeInfoDeUsuario(360, 296, 300,56, "");

        //JLABEL PANEL ES EDITADO





        tableContainer.setBounds(0,0,772, 465);
        //tableContainer.setLayout(new ScrollPaneLayout());
        tableContainer.setLayout(null);
        tableContainer.setVisible(false);



        //LLAMAMOS LOS BOTONES PERTINENTES

        adminUserButton = utilities.crearBotonesNavBarActive(128, 322, 129, 47, "Usuario");

        adsButton = utilities.crearBotonesNavBar(112, 458, 152, 47, "Anuncios");

        contactButton = utilities.crearBotonesNavBar(122, 593, 160, 47, "Contacto");

        adelante.setBounds(439, 698,45, 51);

        //LISTENER USER PANEL adsButton
        adelante.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                for (int i = 8; i < 16; i++ ) {


                    listaEmpresas = new JLabel(NombreTrabajadores[i], SwingConstants.CENTER);
                    try {
                        listaEmpresas.setFont(
                                Font.createFont(Font.TRUETYPE_FONT, Objects.requireNonNull(getClass().getClassLoader().getResourceAsStream("fonts/BebasNeue-Regular.ttf")))); // Añadimos
                    } catch (FontFormatException ex) {
                        throw new RuntimeException(ex);
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
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

            }
        });

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








        adminUserPanelBackground.add(adelante);
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

        infoContainer.add(adminName);
        infoContainer.add(adminID);
        infoContainer.add(adminNumber);
        infoContainer.add(adminEmail);
        infoContainer.add(adminTotalAds);

        adminUserPanelBackground.add(infoContainer);
        adminUserPanel.add(adminUserPanelBackground);




    }


}
