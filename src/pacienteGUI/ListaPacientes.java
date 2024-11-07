package pacienteGUI;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class ListaPacientes extends JFrame {
    private JTable tablePacientes;
    private DefaultTableModel model;

    public ListaPacientes() {
        setTitle("Lista de Pacientes");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("Nombre");
        model.addColumn("Apellido");
        model.addColumn("DNI");

        tablePacientes = new JTable(model);

        // Agregar datos a la tabla (ejemplo, consulta a ControlPaciente para obtener pacientes)
        // ...

        add(new JScrollPane(tablePacientes));
        setVisible(true);
    }
}
