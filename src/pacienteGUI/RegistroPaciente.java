package pacienteGUI;

import javax.swing.*;

public class RegistroPaciente extends JFrame {
    private JTextField txtNombre;
    private JTextField txtApellido;
    private JTextField txtDNI;
    private JButton btnRegistrar;

    public RegistroPaciente() {
        setTitle("Registro de Paciente");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Inicializar componentes
        txtNombre = new JTextField(20);
        txtApellido = new JTextField(20);
        txtDNI = new JTextField(10);
        btnRegistrar = new JButton("Registrar");

        // Agregar componentes al JFrame (puedes usar un layout)
        // ...

        btnRegistrar.addActionListener(e -> registrarPaciente());

        setVisible(true);
    }

    private void registrarPaciente() {
        // Aquí se realiza la lógica de registro
        // (Llamar al método de ControlPaciente para registrar en la base de datos)
    }

    public static void main(String[] args) {
        new RegistroPaciente();
    }
}
