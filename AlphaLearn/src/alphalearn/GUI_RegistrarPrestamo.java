package alphalearn;

import java.awt.Cursor;
import java.util.Set;
import java.util.Stack;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class GUI_RegistrarPrestamo extends javax.swing.JFrame {
    private final Stack<Prestamo> pilaPrestamos;
    private final Stack<Alumno> pilaAlumnos;
    private final Stack<Libro> pilaLibros;
    
    
      public GUI_RegistrarPrestamo(Stack<Prestamo> pila, Stack<Alumno> alumnos, Stack<Libro> libros) {
        initComponents();
        this.pilaPrestamos = pila;
        this.pilaAlumnos = alumnos;
        this.pilaLibros = libros;
        setCursors();
        this.setLocationRelativeTo(null);
    }
    
    private void setCursors() {
        btnAgregar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnEliminar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnRegresar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }
private Alumno buscarAlumnoPorMatricula(String matricula) {
    for (Alumno a : pilaAlumnos) {
        if (a.getMatricula().equals(matricula)) {
            return a;
        }
    }
    return null;
}

private Libro buscarLibroPorISBN(String isbn) {
    for (Libro l : pilaLibros) {
        if (l.getIsbn().equals(isbn)) {
            return l;
        }
    }
    return null;
}

    @SuppressWarnings("unchecked")
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        lblSubtitulo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtID = new javax.swing.JTextField();
        txtMatricula = new javax.swing.JTextField();
        txtISBN = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        lblID = new javax.swing.JLabel();
        lblMatricula = new javax.swing.JLabel();
        lblISBN = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro de Préstamos");

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24));
        lblTitulo.setText("Sistema Biblioteca");

        lblSubtitulo.setFont(new java.awt.Font("Segoe UI", 1, 18));
        lblSubtitulo.setText("Registro de Préstamos");

        lblID.setText("ID Préstamo:");

        lblMatricula.setText("Matrícula Alumno:");

        lblISBN.setText("ISBN Libro:");

        lblFecha.setText("Fecha:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblID)
                    .addComponent(lblMatricula)
                    .addComponent(lblISBN)
                    .addComponent(lblFecha))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtISBN, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblID)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMatricula)
                    .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblISBN)
                    .addComponent(txtISBN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFecha)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        btnAgregar.setIcon(new javax.swing.ImageIcon("img/add_icon.png"));
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnEliminar.setIcon(new javax.swing.ImageIcon("img/delete_icon.png"));
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnRegresar.setIcon(new javax.swing.ImageIcon("img/back_icon.png"));
        btnRegresar.setText("Regresar");
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
                        .addComponent(btnAgregar)
                        .addGap(34, 34, 34)
                        .addComponent(btnEliminar)
                        .addGap(31, 31, 31)
                        .addComponent(btnRegresar))
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
                    .addComponent(btnAgregar)
                    .addComponent(btnEliminar)
                    .addComponent(btnRegresar))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {
     String matricula = txtMatricula.getText();
    String isbn = txtISBN.getText();
    
   Alumno alumno = buscarAlumnoPorMatricula(matricula);
if (alumno == null) {
    JOptionPane.showMessageDialog(this, "El alumno no está registrado");
    return;
}

Libro libro = buscarLibroPorISBN(isbn);
if (libro == null) {
    JOptionPane.showMessageDialog(this, "El libro no está registrado");
    return;
}
    
    try {
        Prestamo prestamo = new Prestamo(
            txtID.getText(),
            matricula,
            isbn,
            txtFecha.getText()
        );
        pilaPrestamos.push(prestamo);
        limpiarCampos();
        JOptionPane.showMessageDialog(this, "Préstamo registrado con éxito");
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error al registrar préstamo");
    }
    }

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {
        new GUI_Menu().setVisible(true);
        dispose();
    }

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {
        if (!pilaPrestamos.isEmpty()) {
            pilaPrestamos.pop();
            JOptionPane.showMessageDialog(this, "Último préstamo eliminado");
        } else {
            JOptionPane.showMessageDialog(this, "Pila vacía");
        }
    }

    private void limpiarCampos() {
        txtID.setText("");
        txtMatricula.setText("");
        txtISBN.setText("");
        txtFecha.setText("");
    }
    
  public static void main(String args[]) {
    java.awt.EventQueue.invokeLater(() -> {
        Stack<Alumno> alumnos = new Stack<>();
        Stack<Libro> libros = new Stack<>();

        new GUI_RegistrarPrestamo(new Stack<>(), alumnos, libros).setVisible(true);
    });
}

    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblISBN;
    private javax.swing.JLabel lblMatricula;
    private javax.swing.JLabel lblSubtitulo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtISBN;
    private javax.swing.JTextField txtMatricula;
}
