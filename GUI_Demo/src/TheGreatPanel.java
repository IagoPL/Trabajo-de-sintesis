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
    CEOUserPanel ceoUserPanel = new CEOUserPanel();
    LimitedUserPanel limitedUserPanel = new LimitedUserPanel();
    AdvertsPanel adsPanel = new AdvertsPanel();
    AdvertInformationPanel adsInfoPanel = new AdvertInformationPanel();
    ContactPanel contactPanel = new ContactPanel();
    ContractAddPanel contractAddPanel = new ContractAddPanel();
    BuyFlyerPanel buyFlyerPanel = new BuyFlyerPanel();
    BuyWebAddPanel buyWebAddPanel = new BuyWebAddPanel();
    UserListByBuissnesPanel userListByBuissnesPanel = new UserListByBuissnesPanel();



    //CREAR EL MANAGER DE PANELES/LAYOUT
    CardLayout cardLayout = new CardLayout();




    public TheGreatPanel() throws IOException, FontFormatException {

        // SE ESTABLECE EL TIPO DE LAYOUT EN EL PANEL DE CONTENIDO

       GreatPanel.setLayout(cardLayout);


       // EL GREAT PANEL AÑADE LOS OTROS PANELES

       GreatPanel.add(loginPanel.loginPanel, "Login Panel");
       GreatPanel.add(adminUserPanel.adminUserPanel, "Admin User Panel");
       GreatPanel.add(ceoUserPanel.ceoUserPanel, "Ceo User Panel");
       GreatPanel.add(limitedUserPanel.userPanel,"User Panel");
       GreatPanel.add(adsPanel.adsPanel, "Ads Panel");
       GreatPanel.add(contactPanel.contactPanel, "Contact Panel");
       GreatPanel.add(adsInfoPanel.adsPanelInfo,"Ads Info");
       GreatPanel.add(contractAddPanel.contractAddPanel,"Contract Add Panel");
       GreatPanel.add(userListByBuissnesPanel.userListPanel, "User List Panel");
       GreatPanel.add(buyFlyerPanel.buyFlyerPanel, "Buy Flyer Panel");
       GreatPanel.add(buyWebAddPanel.buyWebAddPanel, "Buy Web Panel");
        Window.add(GreatPanel);



        //  LISTENERS PARA MOVERSE ENTRE PANELES  //


        //LISTENER singIn

        loginPanel.singIn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (loginPanel.userLevel == 0) {

                    cardLayout.show(GreatPanel, "Admin User Panel");

                } else if (loginPanel.userLevel == 1){
                    cardLayout.show(GreatPanel, "Ceo User Panel");

                } else if (loginPanel.userLevel == 2) {
                    cardLayout.show(GreatPanel, "User Panel");
                }

            }

        });


        //LISTENER LIMITED USER PANEL adsButton
        limitedUserPanel.adsButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //call another method in the same class which will close this Jframe
                cardLayout.show(GreatPanel, "Ads Panel");

            }
        });

        //LISTENER LIMITED USER PANEL contactButton
        limitedUserPanel.contactButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //call another method in the same class which will close this Jframe
                cardLayout.show(GreatPanel, "Contact Panel");

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

        //LISTENER ADMIN USER PANEL adsButton
        ceoUserPanel.adsButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //call another method in the same class which will close this Jframe
                cardLayout.show(GreatPanel, "Ads Panel");

            }
        });

        //LISTENER ADMIN USER PANEL contactButton
        ceoUserPanel.contactButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //call another method in the same class which will close this Jframe
                cardLayout.show(GreatPanel, "Contact Panel");

            }
        });


        //LISTENER UNIVERSAL ADS PANEL userButton
        adsPanel.userButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //call another method in the same class which will close this Jframe

                if (loginPanel.userLevel == 0) {

                    cardLayout.show(GreatPanel, "Admin User Panel");

                } else if (loginPanel.userLevel == 1){
                    cardLayout.show(GreatPanel, "Ceo User Panel");

                } else if (loginPanel.userLevel == 2) {
                    cardLayout.show(GreatPanel, "User Panel");
                }

            }
        });

        //LISTENER UNIVERSAL ADS PANEL contactButton
        adsPanel.contactButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //call another method in the same class which will close this Jframe
                cardLayout.show(GreatPanel, "Contact Panel");

            }
        });

        //LISTENER UNIVERSAL CONTACT PANEL userButton
        contactPanel.userButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //call another method in the same class which will close this Jframe
                if (loginPanel.userLevel == 0) {

                    cardLayout.show(GreatPanel, "Admin User Panel");

                } else if (loginPanel.userLevel == 1){
                    cardLayout.show(GreatPanel, "Ceo User Panel");

                } else if (loginPanel.userLevel == 2) {
                    cardLayout.show(GreatPanel, "User Panel");
                }


            }
        });

        //LISTENER UNIVERSAL CONTACT PANEL adsButton
        contactPanel.adsButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //call another method in the same class which will close this Jframe
                cardLayout.show(GreatPanel, "Ads Panel");

            }
        });





        //LISTENER ADS PANEL add1
        adsPanel.add1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                //call another method in the same class which will close this Jframe
                cardLayout.show(GreatPanel, "Ads Info");

            }
        });

        //LISTENER ADS PANEL add2
        adsPanel.add2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                //call another method in the same class which will close this Jframe
                cardLayout.show(GreatPanel, "Ads Info");

            }
        });

        //LISTENER ADS PANEL add3
        adsPanel.add3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                //call another method in the same class which will close this Jframe
                cardLayout.show(GreatPanel, "Ads Info");

            }
        });

        //LISTENER ADS PANEL newAdd
        adsPanel.newAdd.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                //call another method in the same class which will close this Jframe
                cardLayout.show(GreatPanel, "Contract Add Panel");

            }
        });

        //LISTENER ADS INFORMATION PANEL userButton
        adsInfoPanel.pageBackButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //call another method in the same class which will close this Jframe
                cardLayout.show(GreatPanel, "Ads Panel");

            }
        });

        //LISTENER ADS INFORMATION PANEL userButton
        contractAddPanel.flyerAddButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //call another method in the same class which will close this Jframe
                cardLayout.show(GreatPanel, "Buy Flyer Panel");

            }
        });

        //LISTENER ADS INFORMATION PANEL userButton
        contractAddPanel.webAddButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //call another method in the same class which will close this Jframe
                cardLayout.show(GreatPanel, "Buy Web Panel");

            }
        });

        //LISTENER ADMIN USER PANEL listaEmpresas
        adminUserPanel.listaEmpresas.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                //call another method in the same class which will close this Jframe
                cardLayout.show(GreatPanel, "User List Panel");

            }
        });













    }

}
