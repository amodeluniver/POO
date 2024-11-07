package controlPaciente;

import conexionDB.ConexionDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ControlPaciente {

    public void crearPaciente(String nombre, String apellido, String dni) {
        String sql = "INSERT INTO pacientes (nombre, apellido, dni) VALUES (?, ?, ?)";
        try (Connection conn = ConexionDB.conectar();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, nombre);
            pstmt.setString(2, apellido);
            pstmt.setString(3, dni);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ResultSet obtenerPacientes() {
        String sql = "SELECT * FROM pacientes";
        try {
            Connection conn = ConexionDB.conectar();
            return conn.createStatement().executeQuery(sql);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    // Métodos actualizarPaciente y eliminarPaciente...
}
