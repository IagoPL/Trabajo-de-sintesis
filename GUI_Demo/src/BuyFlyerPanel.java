import javax.swing.*;
import java.awt.*;
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

    public BuyFlyerPanel() throws IOException, FontFormatException {

        //JLABEL PARA ESTABLECER IMAGEN DE FONDO
        JLabel buyFlyerPanelBackground = new JLabel(
                new ImageIcon(Objects.requireNonNull(getClass().getResource("images/Fondo_ComprarFlyer.png"))));

        flyerQuantity.setBounds(97, 270,290, 56);
        flyerQuantity.setFont(Font.createFont(Font.TRUETYPE_FONT, Objects.requireNonNull(getClass().getClassLoader().getResourceAsStream("fonts/Quicksand-Regular.ttf"))));
        flyerQuantity.setFont(flyerQuantity.getFont().deriveFont(Font.PLAIN, 25));

        flyerCP.setBounds(97, 520,290, 56);
        flyerCP.setFont(Font.createFont(Font.TRUETYPE_FONT, Objects.requireNonNull(getClass().getClassLoader().getResourceAsStream("fonts/Quicksand-Regular.ttf"))));
        flyerCP.setFont(flyerCP.getFont().deriveFont(Font.PLAIN, 25));

        comprarFlyer.setBounds(97, 614,200,56);
        comprarFlyer.setContentAreaFilled(false);
        comprarFlyer.setVisible(true);

        flyerAtras.setBounds(17, 24,86,65);
        flyerAtras.setContentAreaFilled(false);
        flyerAtras.setVisible(true);

        buyFlyerPanelBackground.add(flyerAtras);
        buyFlyerPanelBackground.add(comprarFlyer);
        buyFlyerPanelBackground.add(flyerCP);
        buyFlyerPanelBackground.add(flyerQuantity);
        buyFlyerPanel.add(buyFlyerPanelBackground);
    }


}
