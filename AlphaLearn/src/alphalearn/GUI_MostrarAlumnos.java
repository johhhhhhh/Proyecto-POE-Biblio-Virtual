package alphalearn;

import java.awt.Cursor;
import java.awt.Font;
import java.util.Stack;
import javax.swing.table.DefaultTableModel;

public class GUI_MostrarAlumnos extends javax.swing.JFrame {
    private final Stack<Alumno> pilaAlumnos;
    
    public GUI_MostrarAlumnos(Stack<Alumno> pila) {
        initComponents();
        this.pilaAlumnos = pila;
        mostrarDatos();
        setCursors();
        this.setLocationRelativeTo(null);
    }
    
    private void setCursors() {
        btnLimpiar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnRegresar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }
    
    private void mostrarDatos() {
        DefaultTableModel model = (DefaultTableModel) tblAlumnos.getModel();
        model.setRowCount(0);
        
        for (Alumno a : pilaAlumnos) {
            Object[] row = {
                a.getMatricula(),
                a.getNombre(),
                a.getCarrera(),
                a.getSemestre()
            };
            model.addRow(row);
        }
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblAlumnos = new javax.swing.JTable();
        btnLimpiar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lista de Alumnos");
        setSize(new java.awt.Dimension(700, 500));
        getContentPane().setBackground(Colores.FONDO_CLARO);

        tblAlumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] {
                "Matrícula", "Nombre", "Carrera", "Semestre"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblAlumnos.setGridColor(Colores.AZUL_CIELO);
        tblAlumnos.setSelectionBackground(Colores.AZUL_CIELO);
        tblAlumnos.setSelectionForeground(Colores.TEXTO_OSCURO);
        tblAlumnos.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 12));
        tblAlumnos.getTableHeader().setFont(new java.awt.Font("Segoe UI", Font.BOLD, 14));
        tblAlumnos.getTableHeader().setBackground(Colores.AZUL_INTENSO);
        tblAlumnos.getTableHeader().setForeground(Colores.TEXTO_CLARO);
        jScrollPane1.setViewportView(tblAlumnos);

        btnLimpiar.setIcon(UIUtils.getScaledIcon("img/clear_icon.png", 20, 20));
        btnLimpiar.setText("Limpiar");
        UIUtils.configurarBoton(btnLimpiar, Colores.AZUL_VIOLETA);
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnRegresar.setIcon(UIUtils.getScaledIcon("img/back_icon.png", 20, 20));
        btnRegresar.setText("Regresar");
        UIUtils.configurarBoton(btnRegresar, Colores.AZUL_CIELO);
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24));
        lblTitulo.setForeground(Colores.AZUL_INTENSO);
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Listado de Alumnos Registrados");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {
        new GUI_Menu().setVisible(true);
        dispose();
    }

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {
        DefaultTableModel model = (DefaultTableModel) tblAlumnos.getModel();
        model.setRowCount(0);
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new GUI_MostrarAlumnos(new Stack<>()).setVisible(true);
        });
    }

    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tblAlumnos;
}
