import javax.swing.*;
import java.util.Objects;

public class BuyWebAddPanel {

    //CREAMOS JPANEL PARA COMPRAR ANUNCIOS WEB

    JPanel buyWebAddPanel = new JPanel();

    public BuyWebAddPanel() {

        //JLABEL PARA ESTABLECER IMAGEN DE FONDO
        JLabel buyWebAddPanelBackground = new JLabel(
                new ImageIcon(Objects.requireNonNull(getClass().getResource("images/Fondo_ComprarAnuncioWeb.png"))));


        buyWebAddPanel.add(buyWebAddPanelBackground);


    }




}
