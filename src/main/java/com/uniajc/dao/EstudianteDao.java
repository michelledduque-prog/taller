package com.uniajc.dao;

import com.uniajc.config.ConexionPostgresDatabase;
import com.uniajc.modelo.Estudiante;
import java.sql.*;

public class EstudianteDao {

    public void guardar(Estudiante e) {
        String sql = "INSERT INTO estudiante(nombre, apellido, email) VALUES (?, ?, ?)";

        try (Connection con = ConexionPostgresDatabase.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, e.getNombre());
            ps.setString(2, e.getApellido());
            ps.setString(3, e.getEmail());

            ps.executeUpdate();
            System.out.println("Estudiante guardado");

        } catch (Exception ex) {
            System.out.println("Error Estudiante DAO: " + ex.getMessage());
        }
    }
}