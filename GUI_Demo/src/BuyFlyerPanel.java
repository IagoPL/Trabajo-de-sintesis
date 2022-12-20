import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.util.Objects;

public class BuyFlyerPanel {

    //SE CREA JPANEL

    JPanel buyFlyerPanel = new JPanel();

    // SE CREAN BOTONES

    JButton flyerWithColor = new JButton();
    JButton flyerGreyAndWhite = new JButton();
    JButton comprarFlyer = new JButton();

    JButton flyerAtras = new JButton();

    //SE CREAN JTEXTFIELDS
    JTextField flyerQuantity = new JTextField();
    JTextField flyerCP = new JTextField();
    JTextField flyerTitle = new JTextField();


    public BuyFlyerPanel() throws IOException, FontFormatException {

        //JLABEL PARA ESTABLECER IMAGEN DE FONDO
        JLabel buyFlyerPanelBackground = new JLabel(
                new ImageIcon(Objects.requireNonNull(getClass().getResource("images/Fondo_ComprarFlyer.png"))));

        flyerTitle.setBounds(97, 270,290, 56);
        flyerTitle.setFont(Font.createFont(Font.TRUETYPE_FONT, Objects.requireNonNull(getClass().getClassLoader().getResourceAsStream("fonts/Quicksand-Regular.ttf"))));
        flyerTitle.setFont(flyerTitle.getFont().deriveFont(Font.PLAIN, 25));

        flyerQuantity.setBounds(97, 480,290, 56);
        flyerQuantity.setFont(Font.createFont(Font.TRUETYPE_FONT, Objects.requireNonNull(getClass().getClassLoader().getResourceAsStream("fonts/Quicksand-Regular.ttf"))));
        flyerQuantity.setFont(flyerQuantity.getFont().deriveFont(Font.PLAIN, 25));

        flyerCP.setBounds(97, 372,290, 56);
        flyerCP.setFont(Font.createFont(Font.TRUETYPE_FONT, Objects.requireNonNull(getClass().getClassLoader().getResourceAsStream("fonts/Quicksand-Regular.ttf"))));
        flyerCP.setFont(flyerCP.getFont().deriveFont(Font.PLAIN, 25));

        //BOTONES PARA COLOR FLYER

        flyerWithColor.setBounds(861,293, 142,203);
        flyerWithColor.setContentAreaFilled(false);

        flyerWithColor.addMouseListener(new MouseAdapter() { // Cambia el color de las letras en el
            // momento que el raton pasa encima
            public void mouseEntered(MouseEvent evt) {
                flyerWithColor.setBorder(BorderFactory.createStrokeBorder(new BasicStroke(5.0f)));
                flyerWithColor.setBorder(BorderFactory.createLineBorder((Color.decode("#E18700"))));;
            }

            public void mouseExited(MouseEvent evt) { // Vuelve al color original una vez el raton se
                // quita del texto
                flyerWithColor.setBorder(null);;
            }
        });


        flyerGreyAndWhite.setBounds(572, 293, 148,203);
        flyerGreyAndWhite.setContentAreaFilled(false);

        flyerGreyAndWhite.addMouseListener(new MouseAdapter() { // Cambia el color de las letras en el
            // momento que el raton pasa encima
            public void mouseEntered(MouseEvent evt) {
                flyerGreyAndWhite.setBorder(BorderFactory.createStrokeBorder(new BasicStroke(5.0f)));
                flyerGreyAndWhite.setBorder(BorderFactory.createLineBorder((Color.decode("#E18700"))));;
            }

            public void mouseExited(MouseEvent evt) { // Vuelve al color original una vez el raton se
                // quita del texto
                flyerGreyAndWhite.setBorder(null);;
            }
        });

        comprarFlyer.setBounds(97, 614,200,56);
        comprarFlyer.setContentAreaFilled(false);
        comprarFlyer.setVisible(true);



        flyerAtras.setBounds(17, 24,86,65);
        flyerAtras.setContentAreaFilled(false);
        flyerAtras.setVisible(true);



        buyFlyerPanelBackground.add(flyerWithColor);
        buyFlyerPanelBackground.add(flyerGreyAndWhite);
        buyFlyerPanelBackground.add(flyerAtras);
        buyFlyerPanelBackground.add(comprarFlyer);
        buyFlyerPanelBackground.add(flyerCP);
        buyFlyerPanelBackground.add(flyerTitle);
        buyFlyerPanelBackground.add(flyerQuantity);
        buyFlyerPanel.add(buyFlyerPanelBackground);


    }




}


