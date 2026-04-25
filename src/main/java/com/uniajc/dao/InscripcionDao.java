package com.uniajc.dao;

import com.uniajc.config.ConexionPostgresDatabase;
import com.uniajc.modelo.Inscripcion;
import java.sql.*;

public class InscripcionDao {

    public void guardar(Inscripcion i) {
        String sql = "INSERT INTO inscripcion(id_estudiante, id_grupo) VALUES (?, ?)";

        try (Connection con = ConexionPostgresDatabase.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, i.getIdEstudiante());
            ps.setInt(2, i.getIdGrupo());

            ps.executeUpdate();
            System.out.println("Inscripción guardada");

        } catch (Exception ex) {
            System.out.println("Error Inscripcion DAO: " + ex.getMessage());
        }
    }
}
