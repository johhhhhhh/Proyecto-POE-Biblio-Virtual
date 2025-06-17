import javax.swing.*;
import java.awt.event.*;

public class MenuGUI extends JFrame {
    private final Pila pila = new Pila();
    private final Cola cola = new Cola();

    public MenuGUI() {
        setTitle("Pila y Cola - GUI");
        setSize(400, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JMenuBar menuBar = new JMenuBar();
        JMenu pilaMenu = new JMenu("Pila");
        JMenu colaMenu = new JMenu("Cola");

        JMenuItem pushItem = new JMenuItem("Agregar");
        JMenuItem popItem = new JMenuItem("Eliminar");
        JMenuItem recorrerPilaItem = new JMenuItem("Recorrer");

        JMenuItem encolarItem = new JMenuItem("Agregar");
        JMenuItem desencolarItem = new JMenuItem("Eliminar");
        JMenuItem recorrerColaItem = new JMenuItem("Recorrer");

        // Pila
        pushItem.addActionListener(e -> {
            String input = JOptionPane.showInputDialog("Ingrese un número para la pila:");
            try {
                int num = Integer.parseInt(input);
                pila.push(num);
                JOptionPane.showMessageDialog(this, "Elemento agregado a la pila.");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Entrada inválida.");
            }
        });

        popItem.addActionListener(e -> {
            if (pila.estaVacia()) {
                JOptionPane.showMessageDialog(this, "La pila está vacía.");
            } else {
                int valor = pila.pop();
                JOptionPane.showMessageDialog(this, "Elemento eliminado de la pila: " + valor);
            }
        });

        recorrerPilaItem.addActionListener(e -> {
            if (pila.estaVacia()) {
                JOptionPane.showMessageDialog(this, "La pila está vacía.");
            } else {
                JOptionPane.showMessageDialog(this, pila.recorrer(), "Contenido de la pila", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        // Cola
        encolarItem.addActionListener(e -> {
            String input = JOptionPane.showInputDialog("Ingrese un número para la cola:");
            try {
                int num = Integer.parseInt(input);
                cola.encolar(num);
                JOptionPane.showMessageDialog(this, "Elemento agregado a la cola.");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Entrada inválida.");
            }
        });

        desencolarItem.addActionListener(e -> {
            if (cola.estaVacia()) {
                JOptionPane.showMessageDialog(this, "La cola está vacía.");
            } else {
                int valor = cola.desencolar();
                JOptionPane.showMessageDialog(this, "Elemento eliminado de la cola: " + valor);
            }
        });

        recorrerColaItem.addActionListener(e -> {
            if (cola.estaVacia()) {
                JOptionPane.showMessageDialog(this, "La cola está vacía.");
            } else {
                JOptionPane.showMessageDialog(this, cola.recorrer(), "Contenido de la cola", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        // Menús
        pilaMenu.add(pushItem);
        pilaMenu.add(popItem);
        pilaMenu.add(recorrerPilaItem);

        colaMenu.add(encolarItem);
        colaMenu.add(desencolarItem);
        colaMenu.add(recorrerColaItem);

        menuBar.add(pilaMenu);
        menuBar.add(colaMenu);

        setJMenuBar(menuBar);
    
}

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jInternalFrame2 = new javax.swing.JInternalFrame();
        jInternalFrame3 = new javax.swing.JInternalFrame();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jButton1 = new javax.swing.JButton();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 275, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jInternalFrame2.setVisible(true);

        javax.swing.GroupLayout jInternalFrame2Layout = new javax.swing.GroupLayout(jInternalFrame2.getContentPane());
        jInternalFrame2.getContentPane().setLayout(jInternalFrame2Layout);
        jInternalFrame2Layout.setHorizontalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame2Layout.setVerticalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jInternalFrame3.setVisible(true);

        javax.swing.GroupLayout jInternalFrame3Layout = new javax.swing.GroupLayout(jInternalFrame3.getContentPane());
        jInternalFrame3.getContentPane().setLayout(jInternalFrame3Layout);
        jInternalFrame3Layout.setHorizontalGroup(
            jInternalFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 151, Short.MAX_VALUE)
        );
        jInternalFrame3Layout.setVerticalGroup(
            jInternalFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 339, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jDesktopPane2Layout = new javax.swing.GroupLayout(jDesktopPane2);
        jDesktopPane2.setLayout(jDesktopPane2Layout);
        jDesktopPane2Layout.setHorizontalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 363, Short.MAX_VALUE)
        );
        jDesktopPane2Layout.setVerticalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        jMenu1.setText("Pila");

        jMenuItem4.setText("Agregar");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem5.setText("Eliminar");
        jMenu1.add(jMenuItem5);

        jMenuItem6.setText("Recorrer");
        jMenu1.add(jMenuItem6);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Cola");

        jMenuItem1.setText("Agregar");
        jMenu2.add(jMenuItem1);

        jMenuItem2.setText("Eliminar");
        jMenu2.add(jMenuItem2);

        jMenuItem3.setText("Recorrer");
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane2)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
  // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
      String input = JOptionPane.showInputDialog(this, "Ingrese un número:");
try {
    int numero = Integer.parseInt(input);
    // Aquí llamas a tu pila o cola para agregar el número
    pila.push(numero); // ejemplo si tienes una pila
    JOptionPane.showMessageDialog(this, "Número agregado correctamente.");
} catch (NumberFormatException e) {
    JOptionPane.showMessageDialog(this, "Entrada inválida. Debe ser un número.");
}
  // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JInternalFrame jInternalFrame2;
    private javax.swing.JInternalFrame jInternalFrame3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

   
}
