import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;


public class TheGreatPanel {

    //CREAR INSTANCIA DEL JFRAME

    AppFrame Window = new AppFrame();

    //CREAR INSTANCIA DEL PANEL DE PANELES

    JPanel GreatPanel = new JPanel();

    //SE CREAN LAS INSTANCIAS DE LOS PANELES
    LoginPanel loginPanel = new LoginPanel();
    AdminUserPanel adminUserPanel = new AdminUserPanel();
    LimitedUserPanel limitedUserPanel = new LimitedUserPanel();
    AdvertsPanel adsPanel = new AdvertsPanel();
    AdvertInformationPanel adsInfoPanel = new AdvertInformationPanel();
    ContactPanel contactPanel = new ContactPanel();




    //CREAR EL MANAGER DE PANELES/LAYOUT
    CardLayout cardLayout = new CardLayout();




    public TheGreatPanel() throws IOException, FontFormatException {

        // SE ESTABLECE EL TIPO DE LAYOUT EN EL PANEL DE CONTENIDO

       GreatPanel.setLayout(cardLayout);


       // EL GREATPANEL AÑADE LOS OTROS PANELES
       GreatPanel.add(loginPanel.loginPanel, "Login Panel");
       GreatPanel.add(adminUserPanel.adminUserPanel, "Admin User Panel");
       GreatPanel.add(limitedUserPanel.userPanel,"User Panel");
       GreatPanel.add(adsPanel.adsPanel, "Ads Panel");
       GreatPanel.add(contactPanel.contactPanel, "Contact Panel");
       GreatPanel.add(adsInfoPanel.adsPanelInfo,"Ads Info");
        Window.add(GreatPanel);


        //  LISTENERS PARA MOVERSE ENTRE PANELES  //

        //LISTENER singIn

        loginPanel.singIn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (loginPanel.userLevel == 0) {

                    cardLayout.show(GreatPanel, "Admin User Panel");
                } else {
                    cardLayout.show(GreatPanel, "User Panel");

                }

            }

        });

        //LISTENER USER PANEL adsButton
        limitedUserPanel.adsButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //call another method in the same class which will close this Jframe
                cardLayout.show(GreatPanel, "Ads Panel");

            }
        });

        //LISTENER USER PANEL contactButton
        limitedUserPanel.contactButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //call another method in the same class which will close this Jframe
                cardLayout.show(GreatPanel, "Contact Panel");

            }
        });

        //LISTENER ADS PANEL userButton
        adsPanel.userButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //call another method in the same class which will close this Jframe
                cardLayout.show(GreatPanel, "Admin User Panel");

            }
        });

        //LISTENER ADS PANEL userButton
        adsPanel.contactButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //call another method in the same class which will close this Jframe
                cardLayout.show(GreatPanel, "Contact Panel");

            }
        });

        //LISTENER ADS PANEL userButton
        contactPanel.userButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //call another method in the same class which will close this Jframe
                cardLayout.show(GreatPanel, "Admin User Panel");

            }
        });

        //LISTENER ADS PANEL userButton
        contactPanel.adsButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //call another method in the same class which will close this Jframe
                cardLayout.show(GreatPanel, "Ads Panel");

            }
        });



        //LISTENER ADMIN USER PANEL adsButton
        adminUserPanel.adsButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //call another method in the same class which will close this Jframe
                cardLayout.show(GreatPanel, "Ads Panel");

            }
        });

        //LISTENER ADMIN USER PANEL contactButton
        adminUserPanel.contactButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //call another method in the same class which will close this Jframe
                cardLayout.show(GreatPanel, "Contact Panel");

            }
        });

        //LISTENER ADS PANEL ADD1
        adsPanel.add1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                //call another method in the same class which will close this Jframe
                cardLayout.show(GreatPanel, "Ads Info");

            }
        });

        //LISTENER ADS PANEL ADD1
        adsPanel.add2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                //call another method in the same class which will close this Jframe
                cardLayout.show(GreatPanel, "Ads Info");

            }
        });

        //LISTENER ADS PANEL ADD1
        adsPanel.add3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                //call another method in the same class which will close this Jframe
                cardLayout.show(GreatPanel, "Ads Info");

            }
        });

        //LISTENER ADS PANEL userButton
        adsInfoPanel.pageBackButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //call another method in the same class which will close this Jframe
                cardLayout.show(GreatPanel, "Ads Panel");

            }
        });










    }

}
