package alphalearn;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;
import javax.swing.border.*;

public class UIUtils {
    public static void configurarBoton(JButton boton, Color bgColor) {
        boton.setBackground(bgColor);
        boton.setForeground(Colores.TEXTO_CLARO);
        boton.setFont(new Font("Segoe UI", Font.BOLD, 14));
        boton.setFocusPainted(false);
        boton.setBorder(new CompoundBorder(
            new LineBorder(Colores.AZUL_OSCURO, 1),
            new EmptyBorder(8, 20, 8, 20)
        ));
        boton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        boton.setPreferredSize(new Dimension(140, 40));
        
        boton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent evt) {
                boton.setBackground(bgColor.darker());
            }
            @Override
            public void mouseExited(MouseEvent evt) {
                boton.setBackground(bgColor);
            }
        });
    }
    
    public static ImageIcon getScaledIcon(String path, int width, int height) {
        ImageIcon icon = new ImageIcon(path);
        if (icon.getImageLoadStatus() == MediaTracker.COMPLETE) {
            Image img = icon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
            return new ImageIcon(img);
        }
        return icon;
    }
}