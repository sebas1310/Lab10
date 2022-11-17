package com.example.lab10.daos;

import com.example.lab10.beans.Credentials;

import java.sql.*;
import java.util.ArrayList;


public class DaoCliente extends DaoBase{

    public Credentials buscarUsuario(String numeroDocumento, String password){
        Credentials credentials = null;

        String sql = "select * from credentials WHERE nro_documento= ? and hashedPassword=sha2(?,256)";
        try (Connection conn = this.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql);) {
            pstmt.setString(1, numeroDocumento);
            pstmt.setString(2, password);

            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    credentials = new Credentials();
                    credentials.setNumeroDocumento(rs.getString(1));
                    credentials.setTipoUsuario(rs.getInt(4));
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return credentials;
    }

    public void createCredentials(String numeroDocumento, String password){

        String sql = "INSERT INTO credentials (nro_documento,password,hashedPassword,tipoUsuario) VALUES (?,?,sha2(?,256),?)";

        try (Connection connection = this.getConnection();
             PreparedStatement pstmt = connection.prepareStatement(sql)) {
                pstmt.setString(1,numeroDocumento);
                pstmt.setString(2,password);
                pstmt.setString(3,password);
                pstmt.setInt(4,2);
                pstmt.executeUpdate();
            }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
