import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Objects;

public class ContractAddPanel {

    //SE CREA JPANEL

    JPanel contractAddPanel = new JPanel();


    //SE CREA BOTÓN DE USUARIO

    JButton billboardAddButton = new JButton();
    JButton flyerAddButton = new JButton();
    JButton webAddButton = new JButton();




    public ContractAddPanel() {


        //JLABEL PARA ESTABLECER IMAGEN DE FONDO
        JLabel fondoPanelAds = new JLabel(
                new ImageIcon(Objects.requireNonNull(getClass().getResource("images/Fondo_SeleccionTipoDeAnuncio.png"))));

        fondoPanelAds.setLayout(null);// Ningun Layout en Especial


        //SETTEAMOS CORRECTAMENTE LOS BOTONES

        billboardAddButton.setBounds(105, 266,200, 187);
        billboardAddButton.setContentAreaFilled(false);
        billboardAddButton.setVisible(true);
        billboardAddButton.setBorder(null);

        billboardAddButton.addMouseListener(new MouseAdapter() { // Cambia el color de las letras en el
            // momento que el raton pasa encima
            public void mouseEntered(MouseEvent evt) {
                billboardAddButton.setBorder(BorderFactory.createStrokeBorder(new BasicStroke(5.0f)));
                billboardAddButton.setBorder(BorderFactory.createLineBorder((Color.decode("#E18700"))));;
            }

            public void mouseExited(MouseEvent evt) { // Vuelve al color original una vez el raton se
                // quita del texto
                billboardAddButton.setBorder(null);;
            }
        });

        fondoPanelAds.add(billboardAddButton);
        contractAddPanel.add(fondoPanelAds);

    }
}
