package com.example.lab10.daos;

import com.example.lab10.beans.Clientes;
import com.example.lab10.beans.Credentials;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class DaoCliente extends DaoBase{
    public Credentials buscarUsuario(String numeroDocumento, String password){
        Credentials credentials = null;

        String sql = "select * from credentials WHERE nro_documento= ? and password=sha2(?,256)";
        try (Connection conn = this.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql);) {
            pstmt.setString(1, numeroDocumento);
            pstmt.setString(2, password);

            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    credentials = new Credentials();


                    user.setIdUsuario(rs.getInt(1));
                    user.setNombre(rs.getString(2));
                    user.setApellido(rs.getString(3));
                    user.setCorreo(rs.getString(4));
                    user.setCodigo(rs.getString(6));
                    user.setDni(rs.getString(7));
                    user.setCelular(rs.getString(8));
                    user.setCategoria(rs.getString(9));
                    user.setRolId(rs.getInt(11));
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return credentials;
    }

}
