import javax.swing.*;
import java.util.Objects;

public class BuyWebbAddPanel2 {

    JPanel buyWebAddPanel2 = new JPanel();

    JTextField webAddTitle = new JTextField();
    JTextField webAddBuissnes = new JTextField();
    JTextField webAddInitialDate = new JTextField();
    JTextField webAddEndingDate = new JTextField();
    JTextField webAddWeb = new JTextField();


    public BuyWebbAddPanel2 () {

        //JLABEL PARA ESTABLECER IMAGEN DE FONDO
        JLabel buyWebAddPanel2Background = new JLabel(
                new ImageIcon(Objects.requireNonNull(getClass().getResource("images/Fondo_ComprarAnuncioWeb2.png"))));



        buyWebAddPanel2Background.add(webAddTitle);
        buyWebAddPanel2Background.add(webAddBuissnes);
        buyWebAddPanel2Background.add(webAddInitialDate);
        buyWebAddPanel2Background.add(webAddEndingDate);
        buyWebAddPanel2Background.add(webAddWeb);
        buyWebAddPanel2.add(buyWebAddPanel2Background);
    }
}
