import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.util.Objects;

public class Utilities {

    public JButton crearBotonesNavBarActive (int x, int y, int width, int height, String text)
            throws IOException, FontFormatException {

        JButton button = new JButton(text); // Texto
        button.setFont(
                Font.createFont(Font.TRUETYPE_FONT, Objects.requireNonNull(getClass().getClassLoader().getResourceAsStream("fonts/BebasNeue-Regular.ttf")))); // Añadimos
        // fuente
        // personalizada

        button.setFont(button.getFont().deriveFont(Font.PLAIN, 50)); // Añadimos el tamaño de la fuente
        button.setBounds(x, y, width, height);// Se establece su posición y tamaño
        button.setForeground(Color.decode("#A7B5FD")); // Color del texto
        button.setBorder(null); // Seteamos el borde a null
        button.setOpaque(true); // No lo ponemos opaco
        button.setContentAreaFilled(false); // No ponemos el contenido del area
        button.setBorderPainted(false); // Seteamos el borde en false
        button.setFocusable(false);



        return button;

    }

    public JButton crearBotonesNavBar (int x, int y, int width, int height, String text)
            throws IOException, FontFormatException {

        JButton button = new JButton(text); // Texto
        button.setFont(
                Font.createFont(Font.TRUETYPE_FONT, Objects.requireNonNull(getClass().getClassLoader().getResourceAsStream("fonts/BebasNeue-Regular.ttf")))); // Añadimos
        // fuente
        // personalizada

        button.setFont(button.getFont().deriveFont(Font.PLAIN, 50)); // Añadimos el tamaño de la fuente
        button.setBounds(x, y, width, height);// Se establece su posición y tamaño
        button.setForeground(Color.WHITE); // Color del texto
        button.setBorder(null); // Seteamos el borde a null
        button.setOpaque(true); // No lo ponemos opaco
        button.setContentAreaFilled(false); // No ponemos el contenido del area
        button.setBorderPainted(false); // Seteamos el borde en false
        button.setFocusable(false);

        button.addMouseListener(new MouseAdapter() { // Cambia el color de las letras en el
            // momento que el raton pasa encima
            public void mouseEntered(MouseEvent evt) {
                button.setForeground(Color.decode("#E18700"));
            }

            public void mouseExited(MouseEvent evt) { // Vuelve al color original una vez el raton se
                // quita del texto
                button.setForeground(Color.WHITE);
            }
        });


        return button;

    }

    public JLabel crearLabelParaPaneles (int x, int y, int width, int height, String text)
            throws IOException, FontFormatException {

        JLabel label = new JLabel(text); // Texto
        label.setFont(
                Font.createFont(Font.TRUETYPE_FONT, Objects.requireNonNull(getClass().getClassLoader().getResourceAsStream("fonts/BebasNeue-Regular.ttf")))); // Añadimos
        // fuente
        // personalizada

        label.setFont(label.getFont().deriveFont(Font.PLAIN, 48)); // Añadimos el tamaño de la fuente
        label.setBounds(x, y, width, height);// Se establece su posición y tamaño
        label.setBackground(null);
        label.setForeground(Color.BLACK); // Color del texto
        label.setBorder(null); // Seteamos el borde a null
        label.setOpaque(true); // No lo ponemos opaco
        label.setFocusable(false);




        return label;

    }

    public JLabel crearLabelParaPanelesDeInfoDeUsuario (int x, int y, int width, int height, String text)
            throws IOException, FontFormatException {

        JLabel label = new JLabel(text); // Texto
        label.setFont(
                Font.createFont(Font.TRUETYPE_FONT, Objects.requireNonNull(getClass().getClassLoader().getResourceAsStream("fonts/BebasNeue-Regular.ttf")))); // Añadimos
        // fuente
        // personalizada

        label.setFont(label.getFont().deriveFont(Font.PLAIN, 48)); // Añadimos el tamaño de la fuente
        label.setBounds(x, y, width, height);// Se establece su posición y tamaño
        label.setBackground(null);
        label.setForeground(Color.BLACK); // Color del texto
        label.setBorder(null); // Seteamos el bworde a null
        label.setOpaque(true); // No lo ponemos opaco
        label.setFocusable(false);




        return label;

    }




}
