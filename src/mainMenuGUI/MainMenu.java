package mainMenuGUI;

import javax.swing.*;
import java.awt.*;

public class MainMenu extends JFrame {
    private JButton btnPacientes;
    private JButton btnCitas;
    private JButton btnPersonal;
    private JButton btnInventario;

    public MainMenu() {
        setTitle("Menú Principal");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        btnPacientes = new JButton("Pacientes");
        btnCitas = new JButton("Citas");
        btnPersonal = new JButton("Personal");
        btnInventario = new JButton("Inventario");

        setLayout(new GridLayout(2, 2));
        add(btnPacientes);
        add(btnCitas);
        add(btnPersonal);
        add(btnInventario);

        // Agregar eventos para cada botón (abrir ventanas correspondientes)
        // ...

        setVisible(true);
    }

    public static void main(String[] args) {
        new MainMenu();
    }
}
