package alphalearn;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Image;
import java.util.Stack;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class GUI_RegistrarAlumno extends javax.swing.JFrame {
    private final Stack<Alumno> pilaAlumnos;
    
    public GUI_RegistrarAlumno(Stack<Alumno> pila) {
        initComponents();
        this.pilaAlumnos = pila;
        setFrameIcon();
        setCursors();
        this.setLocationRelativeTo(null);
    }
    
    private void setFrameIcon() {
        Image icon = UIUtils.getScaledIcon("img/icon.png", 32, 32).getImage();
        setIconImage(icon);
    }
    
    private void setCursors() {
        btnAgregar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnEliminar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnRegresar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        lblSubtitulo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtMatricula = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtCarrera = new javax.swing.JTextField();
        txtSemestre = new javax.swing.JTextField();
        lblMatricula = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblCarrera = new javax.swing.JLabel();
        lblSemestre = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro de Alumnos");
        setSize(new java.awt.Dimension(600, 500));
        getContentPane().setBackground(Colores.FONDO_CLARO);

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24));
        lblTitulo.setForeground(Colores.AZUL_INTENSO);
        lblTitulo.setText("Sistema Biblioteca");

        lblSubtitulo.setFont(new java.awt.Font("Segoe UI", 1, 18));
        lblSubtitulo.setForeground(Colores.AZUL_OSCURO);
        lblSubtitulo.setText("Registro de Alumnos");

        jPanel1.setBackground(new Color(220, 230, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder(
            javax.swing.BorderFactory.createLineBorder(Colores.AZUL_CIELO, 2),
            javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15)
        ));

        lblMatricula.setText("Matrícula:");

        lblNombre.setText("Nombre:");

        lblCarrera.setText("Carrera:");

        lblSemestre.setText("Semestre:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMatricula)
                    .addComponent(lblNombre)
                    .addComponent(lblCarrera)
                    .addComponent(lblSemestre))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMatricula)
                    .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCarrera)
                    .addComponent(txtCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSemestre)
                    .addComponent(txtSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        btnAgregar.setIcon(UIUtils.getScaledIcon("img/add_icon.png", 20, 20));
        btnAgregar.setText("Agregar");
        UIUtils.configurarBoton(btnAgregar, Colores.AZUL_INTENSO);
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnEliminar.setIcon(UIUtils.getScaledIcon("img/delete_icon.png", 20, 20));
        btnEliminar.setText("Eliminar");
        UIUtils.configurarBoton(btnEliminar, Colores.AZUL_VIOLETA);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSubtitulo)
                            .addComponent(lblTitulo))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblTitulo)
                .addGap(18, 18, 18)
                .addComponent(lblSubtitulo)
                .addGap(37, 37, 37)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {}

    private void txtCarreraActionPerformed(java.awt.event.ActionEvent evt) {}

    private void txtSemestreActionPerformed(java.awt.event.ActionEvent evt) {}

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            Alumno alumno = new Alumno(
                txtMatricula.getText(),
                txtNombre.getText(),
                txtCarrera.getText(),
                Integer.parseInt(txtSemestre.getText())
            );
            pilaAlumnos.push(alumno);
            limpiarCampos();
            JOptionPane.showMessageDialog(this, "Alumno registrado con éxito");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Error en formato de semestre");
        }
    }

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {
        new GUI_Menu().setVisible(true);
        dispose();
    }

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {
        if (!pilaAlumnos.isEmpty()) {
            pilaAlumnos.pop();
            JOptionPane.showMessageDialog(this, "Último alumno eliminado");
        } else {
            JOptionPane.showMessageDialog(this, "Pila vacía");
        }
    }

    private void limpiarCampos() {
        txtMatricula.setText("");
        txtNombre.setText("");
        txtCarrera.setText("");
        txtSemestre.setText("");
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new GUI_RegistrarAlumno(new Stack<>()).setVisible(true);
        });
    }

    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCarrera;
    private javax.swing.JLabel lblMatricula;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblSemestre;
    private javax.swing.JLabel lblSubtitulo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtCarrera;
    private javax.swing.JTextField txtMatricula;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtSemestre;
}