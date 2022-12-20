import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.util.Objects;

public class BuyWebAddPanel {

    //CREAMOS JPANEL PARA COMPRAR ANUNCIOS WEB

    JPanel buyWebAddPanel = new JPanel();

    //CREAMOS 3 BOTONES PARA ESCOGER EL TAMAÑO

    JButton sizeLittle = new JButton();
    JButton sizeMedium = new JButton();
    JButton sizeBig = new JButton();

    public BuyWebAddPanel() {

        //JLABEL PARA ESTABLECER IMAGEN DE FONDO
        JLabel buyWebAddPanelBackground = new JLabel(
                new ImageIcon(Objects.requireNonNull(getClass().getResource("images/Fondo_ComprarAnuncioWeb.png"))));


        sizeLittle.setBounds(181, 355, 148, 198);
        sizeLittle.setText(null);
        sizeLittle.setContentAreaFilled(false);

        sizeLittle.addMouseListener(new MouseAdapter() { // Cambia el color de las letras en el
            // momento que el raton pasa encima
            public void mouseEntered(MouseEvent evt) {
                try {
                    sizeLittle.setFont(
                            Font.createFont(Font.TRUETYPE_FONT, Objects.requireNonNull(getClass().getClassLoader().getResourceAsStream("fonts/BebasNeue-Regular.ttf")))); // Añadimos
                } catch (FontFormatException e) {
                    throw new RuntimeException(e);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                // fuente
                // personalizada

                sizeLittle.setFont(sizeLittle.getFont().deriveFont(Font.PLAIN, 48)); // Añadimos el tamaño de la fuente
                sizeLittle.setText("256px");
                sizeLittle.setForeground((Color.decode("#E18700")));
                sizeLittle.setBorder(BorderFactory.createStrokeBorder(new BasicStroke(5.0f)));
                sizeLittle.setBorder(BorderFactory.createLineBorder((Color.decode("#E18700"))));;
            }

            public void mouseExited(MouseEvent evt) { // Vuelve al color original una vez el raton se
                // quita del texto
                sizeLittle.setText(null);
                sizeLittle.setBorder(null);
            }
        });

        sizeMedium.setBounds(471, 307, 184, 246);
        sizeMedium.setText(null);
        sizeMedium.setContentAreaFilled(false);

        sizeMedium.addMouseListener(new MouseAdapter() { // Cambia el color de las letras en el
            // momento que el raton pasa encima
            public void mouseEntered(MouseEvent evt) {
                try {
                    sizeMedium.setFont(
                            Font.createFont(Font.TRUETYPE_FONT, Objects.requireNonNull(getClass().getClassLoader().getResourceAsStream("fonts/BebasNeue-Regular.ttf")))); // Añadimos
                } catch (FontFormatException e) {
                    throw new RuntimeException(e);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                // fuente
                // personalizada

                sizeMedium.setFont(sizeMedium.getFont().deriveFont(Font.PLAIN, 48)); // Añadimos el tamaño de la fuente
                sizeMedium.setText("512px");
                sizeMedium.setForeground((Color.decode("#E18700")));
                sizeMedium.setBorder(BorderFactory.createStrokeBorder(new BasicStroke(5.0f)));
                sizeMedium.setBorder(BorderFactory.createLineBorder((Color.decode("#E18700"))));;
            }

            public void mouseExited(MouseEvent evt) { // Vuelve al color original una vez el raton se
                // quita del texto
                sizeMedium.setText(null);
                sizeMedium.setBorder(null);
            }
        });


        sizeBig.setBounds(797, 236, 237, 317);
        sizeBig.setText(null);
        sizeBig.setContentAreaFilled(false);

        sizeBig.addMouseListener(new MouseAdapter() { // Cambia el color de las letras en el
            // momento que el raton pasa encima
            public void mouseEntered(MouseEvent evt) {
                try {
                    sizeBig.setFont(
                            Font.createFont(Font.TRUETYPE_FONT, Objects.requireNonNull(getClass().getClassLoader().getResourceAsStream("fonts/BebasNeue-Regular.ttf")))); // Añadimos
                } catch (FontFormatException e) {
                    throw new RuntimeException(e);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                // fuente
                // personalizada

                sizeBig.setFont(sizeBig.getFont().deriveFont(Font.PLAIN, 48)); // Añadimos el tamaño de la fuente
                sizeBig.setText("1024px");
                sizeBig.setForeground((Color.decode("#E18700")));
                sizeBig.setBorder(BorderFactory.createStrokeBorder(new BasicStroke(5.0f)));
                sizeBig.setBorder(BorderFactory.createLineBorder((Color.decode("#E18700"))));;
            }

            public void mouseExited(MouseEvent evt) { // Vuelve al color original una vez el raton se
                // quita del texto
                sizeBig.setText(null);
                sizeBig.setBorder(null);
            }
        });


        buyWebAddPanelBackground.add(sizeLittle);
        buyWebAddPanelBackground.add(sizeMedium);
        buyWebAddPanelBackground.add(sizeBig);
        buyWebAddPanel.add(buyWebAddPanelBackground);


    }




}
