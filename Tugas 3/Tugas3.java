import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class Tugas3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Login & Registration");
        frame.setSize(500, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        JPanel panel = new JPanel();
        CardLayout cardLayout = new CardLayout();
        panel.setLayout(cardLayout);

        LoginPanel loginPanel = new LoginPanel(cardLayout, panel);
        RegistrationPanel registrationPanel = new RegistrationPanel(cardLayout, panel);

        panel.add(registrationPanel, "Registration");
        panel.add(loginPanel, "Login");

        frame.add(panel, BorderLayout.CENTER);
        frame.setVisible(true);
    }
}

class LoginPanel extends JPanel {
    public LoginPanel(CardLayout cardLayout, JPanel panel) {
        setLayout(new GridLayout(7, 1, 10, 10));
        setBorder(new EmptyBorder(40, 30, 30, 30));
        setBackground(new Color(230, 240, 255));

        JLabel loginLabel = new JLabel("LOGIN", SwingConstants.CENTER);
        loginLabel.setForeground(new Color(51, 102, 255));
        loginLabel.setFont(new Font("Arial", Font.BOLD, 28));
        add(loginLabel);

        JLabel fullNameLabel = new JLabel("Full Name:");
        fullNameLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        add(fullNameLabel);

        JTextField fullNameTextField = new JTextField(20);
        add(fullNameTextField);

        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        add(passwordLabel);

        JPasswordField passwordTextField = new JPasswordField(20);
        add(passwordTextField);

        JPanel loginPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        loginPanel.setBackground(new Color(230, 240, 255));

        JButton loginButton = new JButton("Login");
        loginButton.setFont(new Font("Arial", Font.BOLD, 14));
        loginButton.setPreferredSize(new Dimension(100, 40));
        loginPanel.add(loginButton);
        add(loginPanel);

        JPanel registerPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 0));
        registerPanel.setBackground(new Color(230, 240, 255));

        JLabel noAccountLabel = new JLabel("<HTML><U>I don't have an account</U></HTML>");
        noAccountLabel.setFont(new Font("Arial", Font.PLAIN, 12));
        noAccountLabel.setForeground(Color.BLUE);
        noAccountLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        registerPanel.add(noAccountLabel);

        JButton registerButton = new JButton("Register");
        registerButton.setFont(new Font("Arial", Font.PLAIN, 12));
        registerButton.setPreferredSize(new Dimension(80, 30));
        registerButton.setForeground(Color.BLUE);
        registerButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        registerButton.addActionListener(e -> cardLayout.show(panel, "Registration"));
        registerPanel.add(registerButton);

        add(registerPanel);
    }
}

class RegistrationPanel extends JPanel {
    public RegistrationPanel(CardLayout cardLayout, JPanel panel) {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBorder(new EmptyBorder(50, 50, 50, 50));
        setBackground(new Color(240, 230, 255));

        JLabel registrationLabel = new JLabel("REGISTRATION", SwingConstants.CENTER);
        registrationLabel.setForeground(new Color(102, 51, 255));
        registrationLabel.setFont(new Font("Arial", Font.BOLD, 30));
        registrationLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        add(registrationLabel);
        
        add(Box.createRigidArea(new Dimension(0, 30)));

        JLabel regFullNameLabel = new JLabel("Full Name:");
        regFullNameLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        regFullNameLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        add(regFullNameLabel);

        JTextField regFullNameTextField = new JTextField(20);
        regFullNameTextField.setPreferredSize(new Dimension(350, 35));
        regFullNameTextField.setMaximumSize(new Dimension(350, 35));
        add(regFullNameTextField);

        add(Box.createRigidArea(new Dimension(0, 15)));

        JLabel emailLabel = new JLabel("Email:");
        emailLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        emailLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        add(emailLabel);

        JTextField emailTextField = new JTextField(20);
        emailTextField.setPreferredSize(new Dimension(350, 35));
        emailTextField.setMaximumSize(new Dimension(350, 35));
        add(emailTextField);

        add(Box.createRigidArea(new Dimension(0, 15)));

        JLabel regPasswordLabel = new JLabel("Password:");
        regPasswordLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        regPasswordLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        add(regPasswordLabel);

        JPasswordField regPasswordTextField = new JPasswordField(20);
        regPasswordTextField.setPreferredSize(new Dimension(350, 35));
        regPasswordTextField.setMaximumSize(new Dimension(350, 35));
        add(regPasswordTextField);

        add(Box.createRigidArea(new Dimension(0, 30)));

        JPanel registrationPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        registrationPanel.setBackground(new Color(240, 230, 255));

        JButton registerButton = new JButton("Register");
        registerButton.setFont(new Font("Arial", Font.BOLD, 16));
        registerButton.setPreferredSize(new Dimension(140, 45));
        registrationPanel.add(registerButton);
        add(registrationPanel);

        JPanel loginPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 0));
        loginPanel.setBackground(new Color(240, 230, 255));

        JLabel haveAccountLabel = new JLabel("<HTML><U>Already have an account</U></HTML>");
        haveAccountLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        haveAccountLabel.setForeground(Color.BLUE);
        haveAccountLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        loginPanel.add(haveAccountLabel);

        JButton loginButton = new JButton("Login");
        loginButton.setFont(new Font("Arial", Font.PLAIN, 14));
        loginButton.setPreferredSize(new Dimension(80, 30));
        loginButton.setForeground(Color.BLUE);
        loginButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        loginButton.addActionListener(e -> cardLayout.show(panel, "Login"));
        loginPanel.add(loginButton);

        add(loginPanel);
    }
}
