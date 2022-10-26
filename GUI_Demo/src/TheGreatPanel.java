import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;


public class TheGreatPanel {

    //CREAR INSTANCIA DEL JFRAME

    AppFrame Window = new AppFrame();

    //CREAR INSTANCIA DEL PANEL DE PANELES

    JPanel GreatPanel = new JPanel();

    //SE CREAN LAS INSTANCIAS DE LOS PANELES
    LoginPanel loginPanel = new LoginPanel();
    LimitedUserPanel limitedUserPanel = new LimitedUserPanel();
    AdvertsPanel adsPanel = new AdvertsPanel();
    ContactPanel contactPanel = new ContactPanel();

    //CREAR EL MANAGER DE PANELES/LAYOUT
    CardLayout cardLayout = new CardLayout();


    public TheGreatPanel() throws IOException, FontFormatException {

        // SE ESTABLECE EL TIPO DE LAYOUT EN EL PANEL DE CONTENIDO

       GreatPanel.setLayout(cardLayout);


       // EL GREATPANEL AÑADE LOS OTROS PANELES
       GreatPanel.add(loginPanel.loginPanel, "Login Panel");
       GreatPanel.add(limitedUserPanel.userPanel,"User Panel");
       GreatPanel.add(adsPanel.adsPanel, "Ads Panel");
       GreatPanel.add(contactPanel.contactPanel, "Contact Panel");
        Window.add(GreatPanel);


        //  LISTENERS PARA MOVERSE ENTRE PANELES  //

        //LISTENER singIn

        loginPanel.singIn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                loginPanel.bevLoader.setVisible(true);
                loginPanel.fondoPanelLogin.setVisible(false);

                try {

                    // delay 5 seconds
                    Thread.sleep(500);
                    //call another method in the same class which will close this Jframe
                    cardLayout.show(GreatPanel, "User Panel");

                } catch (InterruptedException s) {
                    System.err.format("IOException: %s%n", e);
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
                cardLayout.show(GreatPanel, "User Panel");

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
                cardLayout.show(GreatPanel, "User Panel");

            }
        });

        //LISTENER ADS PANEL userButton
        contactPanel.adsButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //call another method in the same class which will close this Jframe
                cardLayout.show(GreatPanel, "Ads Panel");

            }
        });










    }

}
