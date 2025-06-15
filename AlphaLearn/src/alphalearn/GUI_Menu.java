package alphalearn;

import java.awt.Cursor;
import java.awt.Font;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.util.Stack;
import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class GUI_Menu extends javax.swing.JFrame {
    public static Stack<Alumno> pilaAlumnos = new Stack<>();
    public static Stack<Libro> pilaLibros = new Stack<>();
    public static Stack<Prestamo> pilaPrestamos = new Stack<>();

    public GUI_Menu() {
        initComponents();
        setFrameIcon();
        setMenuIcons();
        setCursors();
        setBackgroundImage();
        this.setLocationRelativeTo(null);
    }
    
    private void setFrameIcon() {
        Image icon = UIUtils.getScaledIcon("img/icon.png", 32, 32).getImage();
        setIconImage(icon);
    }
    
    private void setMenuIcons() {
        Alumnos.setIcon(UIUtils.getScaledIcon("img/student_icon.png", 20, 20));
        Libros.setIcon(UIUtils.getScaledIcon("img/book_icon.png", 20, 20));
        Préstamos.setIcon(UIUtils.getScaledIcon("img/loan_icon.png", 20, 20));
        
        AlumnosRegistrar.setIcon(UIUtils.getScaledIcon("img/add_icon.png", 20, 20));
        AlumnosMostrar.setIcon(UIUtils.getScaledIcon("img/list_icon.png", 20, 20));
        LibrosRegistrar.setIcon(UIUtils.getScaledIcon("img/add_icon.png", 20, 20));
        LibrosMostrar.setIcon(UIUtils.getScaledIcon("img/list_icon.png", 20, 20));
        PrestamosRegistrar.setIcon(UIUtils.getScaledIcon("img/add_icon.png", 20, 20));
        PrestamosMostrar.setIcon(UIUtils.getScaledIcon("img/list_icon.png", 20, 20));
    }
    
    private Cursor createCustomCursor(String imagePath, Point hotspot) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Image cursorImage = UIUtils.getScaledIcon(imagePath, 32, 32).getImage();
        return toolkit.createCustomCursor(cursorImage, hotspot, "custom");
    }
    
    private void setCursors() {
        Point hotspot = new Point(0, 0);
        Cursor defaultCursor = createCustomCursor("img/raton.png", hotspot);
        Cursor handCursor = createCustomCursor("img/raton_seleccion.png", hotspot);
        
        setCursor(defaultCursor);
        btnVolver.setCursor(handCursor);
        Alumnos.setCursor(handCursor);
        Libros.setCursor(handCursor);
        Préstamos.setCursor(handCursor);
    }
    
    private void setBackgroundImage() {
        ImageIcon background = UIUtils.getScaledIcon("img/background_menu.jpg", 800, 600);
        lblBackground.setIcon(background);
        lblBackground.setBounds(0, 0, 800, 600);
        getContentPane().setLayout(null);
        getContentPane().add(lblBackground);
        lblBackground.setLayout(null);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        btnVolver = new javax.swing.JButton();
        lblMensaje = new javax.swing.JLabel();
        jMenuBar = new javax.swing.JMenuBar();
        Alumnos = new javax.swing.JMenu();
        AlumnosRegistrar = new javax.swing.JMenuItem();
        AlumnosMostrar = new javax.swing.JMenuItem();
        Libros = new javax.swing.JMenu();
        LibrosRegistrar = new javax.swing.JMenuItem();
        LibrosMostrar = new javax.swing.JMenuItem();
        Préstamos = new javax.swing.JMenu();
        PrestamosRegistrar = new javax.swing.JMenuItem();
        PrestamosMostrar = new javax.swing.JMenuItem();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menú Principal");
        setResizable(false);
        setSize(new java.awt.Dimension(800, 600));
        getContentPane().setBackground(Colores.FONDO_OSCURO);

        btnVolver.setIcon(UIUtils.getScaledIcon("img/back_icon.png", 20, 20));
        btnVolver.setText("Cerrar Sesión");
        UIUtils.configurarBoton(btnVolver, Colores.AZUL_VIOLETA);
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        lblMensaje.setFont(new java.awt.Font("Calibri", 1, 24));
        lblMensaje.setForeground(Colores.AZUL_TURQUESA);
        lblMensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMensaje.setText("Bienvenido al Sistema de Biblioteca");

        Alumnos.setText("Alumnos");
        Alumnos.setFont(new java.awt.Font("Segoe UI", Font.BOLD, 14));
        Alumnos.setForeground(Colores.TEXTO_OSCURO);

        AlumnosRegistrar.setText("Registrar Alumno");
        AlumnosRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlumnosRegistrarActionPerformed(evt);
            }
        });
        Alumnos.add(AlumnosRegistrar);

        AlumnosMostrar.setText("Mostrar Alumnos");
        AlumnosMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlumnosMostrarActionPerformed(evt);
            }
        });
        Alumnos.add(AlumnosMostrar);

        jMenuBar.add(Alumnos);

        Libros.setText("Libros");
        Libros.setFont(new java.awt.Font("Segoe UI", Font.BOLD, 14));
        Libros.setForeground(Colores.TEXTO_OSCURO);

        LibrosRegistrar.setText("Registrar Libro");
        LibrosRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LibrosRegistrarActionPerformed(evt);
            }
        });
        Libros.add(LibrosRegistrar);

        LibrosMostrar.setText("Mostrar Libros");
        LibrosMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LibrosMostrarActionPerformed(evt);
            }
        });
        Libros.add(LibrosMostrar);

        jMenuBar.add(Libros);

        Préstamos.setText("Préstamos");
        Préstamos.setFont(new java.awt.Font("Segoe UI", Font.BOLD, 14));
        Préstamos.setForeground(Colores.TEXTO_OSCURO);

        PrestamosRegistrar.setText("Registrar Préstamos");
        PrestamosRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrestamosRegistrarActionPerformed(evt);
            }
        });
        Préstamos.add(PrestamosRegistrar);

        PrestamosMostrar.setText("Mostrar Préstamos");
        PrestamosMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrestamosMostrarActionPerformed(evt);
            }
        });
        Préstamos.add(PrestamosMostrar);

        jMenuBar.add(Préstamos);
        jMenuBar.setBackground(Colores.AZUL_INTENSO);
        jMenuBar.setBorder(javax.swing.BorderFactory.createEmptyBorder());

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMensaje, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(250, Short.MAX_VALUE)
                .addComponent(lblMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        pack();
    }

    private void AlumnosRegistrarActionPerformed(java.awt.event.ActionEvent evt) {
        new GUI_RegistrarAlumno(pilaAlumnos).setVisible(true);
        dispose();
    }

    private void LibrosRegistrarActionPerformed(java.awt.event.ActionEvent evt) {
        new GUI_RegistrarLibro(pilaLibros).setVisible(true);
        dispose();
    }

    private void PrestamosRegistrarActionPerformed(java.awt.event.ActionEvent evt) {
        new GUI_RegistrarPrestamo(pilaPrestamos).setVisible(true);
        dispose();
    }

    private void AlumnosMostrarActionPerformed(java.awt.event.ActionEvent evt) {
        new GUI_MostrarAlumnos(pilaAlumnos).setVisible(true);
        dispose();
    }

    private void LibrosMostrarActionPerformed(java.awt.event.ActionEvent evt) {
        new GUI_MostrarLibros(pilaLibros).setVisible(true);
        dispose();
    }

    private void PrestamosMostrarActionPerformed(java.awt.event.ActionEvent evt) {
        new GUI_MostrarPrestamos(pilaPrestamos).setVisible(true);
        dispose();
    }
    
    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {
        pilaAlumnos.clear();
        pilaLibros.clear();
        pilaPrestamos.clear();
        new GUI_Login().setVisible(true);
        dispose();
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new GUI_Menu().setVisible(true);
        });
    }

    private javax.swing.JMenu Alumnos;
    private javax.swing.JMenuItem AlumnosMostrar;
    private javax.swing.JMenuItem AlumnosRegistrar;
    private javax.swing.JMenu Libros;
    private javax.swing.JMenuItem LibrosMostrar;
    private javax.swing.JMenuItem LibrosRegistrar;
    private javax.swing.JMenuItem PrestamosMostrar;
    private javax.swing.JMenuItem PrestamosRegistrar;
    private javax.swing.JMenu Préstamos;
    private javax.swing.JButton btnVolver;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblMensaje;
}