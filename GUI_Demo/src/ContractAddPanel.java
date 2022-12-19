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
    JButton contrarAddPanelMarchaAtras = new JButton();




    public ContractAddPanel() {


        //JLABEL PARA ESTABLECER IMAGEN DE FONDO
        JLabel fondoPanelAds = new JLabel(
                new ImageIcon(Objects.requireNonNull(getClass().getResource("images/Fondo_SeleccionTipoDeAnuncio.png"))));

        fondoPanelAds.setLayout(null);// Ningun Layout en Especial


        //SETTEAMOS CORRECTAMENTE LOS BOTONES

        billboardAddButton.setBounds(821, 226,220, 237);
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



        flyerAddButton.setBounds(478, 226,200, 237);
        flyerAddButton.setContentAreaFilled(false);
        flyerAddButton.setVisible(true);
        flyerAddButton.setBorder(null);

        flyerAddButton.addMouseListener(new MouseAdapter() { // Cambia el color de las letras en el
            // momento que el raton pasa encima
            public void mouseEntered(MouseEvent evt) {
                flyerAddButton.setBorder(BorderFactory.createStrokeBorder(new BasicStroke(5.0f)));
                flyerAddButton.setBorder(BorderFactory.createLineBorder((Color.decode("#E18700"))));;
            }

            public void mouseExited(MouseEvent evt) { // Vuelve al color original una vez el raton se
                // quita del texto
                flyerAddButton.setBorder(null);;
            }
        });

        webAddButton.setBounds(95, 255,220, 197);
        webAddButton.setContentAreaFilled(false);
        webAddButton.setVisible(true);
        webAddButton.setBorder(null);

        webAddButton.addMouseListener(new MouseAdapter() { // Cambia el color de las letras en el
            // momento que el raton pasa encima
            public void mouseEntered(MouseEvent evt) {
                webAddButton.setBorder(BorderFactory.createStrokeBorder(new BasicStroke(5.0f)));
                webAddButton.setBorder(BorderFactory.createLineBorder((Color.decode("#E18700"))));;
            }

            public void mouseExited(MouseEvent evt) { // Vuelve al color original una vez el raton se
                // quita del texto
                webAddButton.setBorder(null);;
            }
        });

        contrarAddPanelMarchaAtras.setBounds(17, 24,86,65);
        contrarAddPanelMarchaAtras.setContentAreaFilled(false);
        contrarAddPanelMarchaAtras.setVisible(true);
        contrarAddPanelMarchaAtras.setBorder(null);

        contrarAddPanelMarchaAtras.addMouseListener(new MouseAdapter() { // Cambia el color de las letras en el
            // momento que el raton pasa encima
            public void mouseEntered(MouseEvent evt) {
                contrarAddPanelMarchaAtras.setBorder(BorderFactory.createStrokeBorder(new BasicStroke(5.0f)));
                contrarAddPanelMarchaAtras.setBorder(BorderFactory.createLineBorder((Color.decode("#E18700"))));;
            }

            public void mouseExited(MouseEvent evt) { // Vuelve al color original una vez el raton se
                // quita del texto
                contrarAddPanelMarchaAtras.setBorder(null);;
            }
        });

        fondoPanelAds.add(contrarAddPanelMarchaAtras);
        fondoPanelAds.add(flyerAddButton);
        fondoPanelAds.add(billboardAddButton);
        fondoPanelAds.add(webAddButton);
        contractAddPanel.add(fondoPanelAds);

    }
}
