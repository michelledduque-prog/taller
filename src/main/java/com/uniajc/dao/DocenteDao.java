package com.uniajc.dao;

import com.uniajc.config.ConexionPostgresDatabase;
import com.uniajc.modelo.Docente;
import java.sql.*;

public class DocenteDao {

    public void guardar(Docente d) {
        String sql = "INSERT INTO docente(nombre, especialidad) VALUES (?, ?)";

        try (Connection con = ConexionPostgresDatabase.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, d.getNombre());
            ps.setString(2, d.getEspecialidad());

            ps.executeUpdate();
            System.out.println("Docente guardado");

        } catch (Exception e) {
            System.out.println("Error Docente DAO: " + e.getMessage());
        }
    }
}