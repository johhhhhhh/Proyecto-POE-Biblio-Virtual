package alphalearn;

import java.awt.Cursor;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class GUI_Login extends javax.swing.JFrame {

    public GUI_Login() {
        initComponents();
        setFrameIcon();
        setCursors();
        setBackgroundImage();
    }

    private void setFrameIcon() {
        Image icon = UIUtils.getScaledIcon("img/icon.png", 32, 32).getImage();
        setIconImage(icon);
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
        btnLogin.setCursor(handCursor);
        btnRegistro.setCursor(handCursor);
    }
    
    private void setBackgroundImage() {
        ImageIcon background = UIUtils.getScaledIcon("img/background_login.jpg", 600, 400);
        lblBackground.setIcon(background);
        lblBackground.setBounds(0, 0, 600, 400);
        getContentPane().setLayout(null);
        getContentPane().add(lblBackground);
        lblBackground.setLayout(null);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        txtPassword = new javax.swing.JPasswordField();
        lblTitulo = new javax.swing.JLabel();
        lblLogin = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        btnRegistro = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();
        txtUsuario = new javax.swing.JTextField();
        lblLogo = new javax.swing.JLabel();  // Nuevo JLabel para el logo
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Biblioteca");
        setResizable(false);
        setSize(new java.awt.Dimension(600, 400));
        getContentPane().setBackground(Colores.FONDO_OSCURO);

        // Configuración del logo pequeño
        ImageIcon logoIcon = new ImageIcon("img/logoletras.png");
        // Escalar manteniendo relación de aspecto (ancho fijo, alto proporcional)
        int logoWidth = 150; // Ancho pequeño
        int logoHeight = (int) (logoIcon.getIconHeight() * ((double) logoWidth / logoIcon.getIconWidth()));
        Image logoImage = logoIcon.getImage().getScaledInstance(logoWidth, logoHeight, Image.SCALE_SMOOTH);
        lblLogo.setIcon(new ImageIcon(logoImage));
        lblLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24));
        lblTitulo.setForeground(Colores.AZUL_TURQUESA);
        lblTitulo.setText("Sistema Biblioteca");

        lblLogin.setFont(new java.awt.Font("Segoe UI", 1, 18));
        lblLogin.setForeground(Colores.TEXTO_CLARO);
        lblLogin.setText("Login");

        lblUsuario.setFont(new java.awt.Font("Calibri", 1, 14));
        lblUsuario.setForeground(Colores.TEXTO_CLARO);
        lblUsuario.setText("Usuario: ");

        lblPassword.setFont(new java.awt.Font("Calibri", 1, 14));
        lblPassword.setForeground(Colores.TEXTO_CLARO);
        lblPassword.setText("Contraseña: ");

        btnRegistro.setIcon(UIUtils.getScaledIcon("img/add_icon.png", 20, 20));
        btnRegistro.setText("Registro");
        UIUtils.configurarBoton(btnRegistro, Colores.AZUL_CIELO);
        btnRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroActionPerformed(evt);
            }
        });

        btnLogin.setIcon(UIUtils.getScaledIcon("img/login_icon.png", 20, 20));
        btnLogin.setText("Ingresar");
        UIUtils.configurarBoton(btnLogin, Colores.AZUL_INTENSO);
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(lblTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(btnRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPassword)
                            .addComponent(lblUsuario))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(txtUsuario)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addComponent(lblLogin)))
                .addContainerGap(180, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE) // Altura proporcional
                .addGap(18, 18, 18)
                .addComponent(lblTitulo)
                .addGap(18, 18, 18)
                .addComponent(lblLogin)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsuario)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPassword))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {
        Usuario[] usuarios = {
            new Usuario("johan", "johan"),
            new Usuario("ivan", "ivan"),
            new Usuario("gerardo", "gerardo"),
            new Usuario("carlos", "carlos"),
        };

        String user = txtUsuario.getText();
        String pass = new String(txtPassword.getPassword());

        for (Usuario u : usuarios) {
            if (u.getUsername().equals(user) && u.getPassword().equals(pass)) {
                new GUI_Menu().setVisible(true);
                dispose();
                return;
            }
        }
        JOptionPane.showMessageDialog(this, "Credenciales incorrectas");
    }
    
    private void btnRegistroActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(this, "Función de registro no implementada");
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
            java.util.logging.Logger.getLogger(GUI_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new GUI_Login().setVisible(true);
        });
    }

    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnRegistro;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblLogo; // Nuevo JLabel para el logo
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsuario;
}