import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Objects;

public class BuyWebbAddPanel2 {

    //OBJETOS BASE DE DATOS

    WebListBo webListBoo = new WebListBo();

    DDBBLista_Web anuncioListWeb = new DDBBLista_Web();

    JPanel buyWebAddPanel2 = new JPanel();
    String mensaje;

    //BOTON DE ENVIAR

    JButton webAddEnviar = new JButton();

    JTextField webAddTitle = new JTextField();
    JTextField webAddNumber = new JTextField();
    JTextField webAddEndingDate = new JTextField();
    JTextField webAddWeb = new JTextField();

    String webAddTitleString = webAddTitle.getText();
    String webAddNumberString = webAddNumber.getText();
    String webAddEndingDateString = webAddEndingDate.getText();
    String webAddWebString = webAddWeb.getText();


    public BuyWebbAddPanel2 () {

        //JLABEL PARA ESTABLECER IMAGEN DE FONDO
        JLabel buyWebAddPanel2Background = new JLabel(
                new ImageIcon(Objects.requireNonNull(getClass().getResource("images/Fondo_ComprarAnuncioWeb2.png"))));


        webAddTitle.setBounds(503, 238,200,56);
        webAddNumber.setBounds(503, 357,200,56);
        webAddEndingDate.setBounds(503, 468,200,56);
        webAddWeb.setBounds(503, 578,400,56);

        webAddEnviar.setBounds(871,662,236,48);
        webAddEnviar.setContentAreaFilled(false);
        webAddEnviar.addMouseListener(new MouseAdapter() { // Cambia el color de las letras en el
            // momento que el raton pasa encima
            public void mouseEntered(MouseEvent evt) {
                webAddEnviar.setBorder(BorderFactory.createStrokeBorder(new BasicStroke(5.0f)));
                webAddEnviar.setBorder(BorderFactory.createLineBorder((Color.decode("#E18700"))));;
            }

            public void mouseExited(MouseEvent evt) { // Vuelve al color original una vez el raton se
                // quita del texto
                webAddEnviar.setBorder(null);;
            }
        });

        webAddEnviar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                //call another method in the same class which will close this Jframe
                anuncioListWeb.setWebURL(webAddWebString);

                mensaje = webListBoo.add(anuncioListWeb);
                System.out.println(anuncioListWeb);
                System.out.println(webAddWebString);

            }
        });

        buyWebAddPanel2Background.add(webAddEnviar);
        buyWebAddPanel2Background.add(webAddTitle);
        buyWebAddPanel2Background.add(webAddNumber);
        buyWebAddPanel2Background.add(webAddEndingDate);
        buyWebAddPanel2Background.add(webAddWeb);
        buyWebAddPanel2.add(buyWebAddPanel2Background);
    }
}
