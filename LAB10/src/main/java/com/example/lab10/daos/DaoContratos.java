package com.example.lab10.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.example.lab10.beans.*;
import com.example.lab10.Dtos.*;
import java.sql.*;
import java.util.ArrayList;

public class DaoContratos extends DaoBase{

    public ArrayList<Contratos> listaContratos(){
        ArrayList<Contratos> listaContratos = new ArrayList<>();

        //Conexion a base de datos
        String sql = "SELECT * FROM bi_corp_business.jm_cotr_bis";

        try (Connection conn = this.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            Contratos contrato = new Contratos();
            while (rs.next()) {

                contrato.setNroDeContrato(rs.getString(1));
                contrato.setIdCliente(rs.getInt(2));
                contrato.setDivisa(rs.getInt(3));
                contrato.setEstado(rs.getInt(4));
                contrato.setMesesEnEseEstado(rs.getInt(5));

                //
                //if (rs.getInt(4) == 0) {
                //  contrato.setEstado("Normal");
                //} else if (rs.getInt(4) == 1){
                //   contrato.setEstado("Cura");
                //}else{
                //    contrato.setEstado("Mora");
                }
                //
                listaContratos.add(contrato);

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return listaContratos;
    }
    public CantidadContratosDto mostrarCantidadContratos(int estado) {


        String sql = "SELECT G6789_status, COUNT(*) as CantidadContratos\n" +
                "FROM bi_corp_business.jm_cotr_bis\n" +
                "GROUP BY G6789_status";

        CantidadContratosDto cantidadcontrato = new CantidadContratosDto();

        try (Connection conn = this.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql);) {
            pstmt.setInt(1,estado);
            pstmt.setInt(2,estado);
            try (ResultSet rs = pstmt.executeQuery()){
                if(rs.next()){
                    cantidadcontrato.setEstados(rs.getInt(1));
                    cantidadcontrato.setContratoXestado(rs.getInt(2));
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return cantidadcontrato;
    }

    public MaxExpectedLossDto mostrarMaxExpectedLoss(int idCliente) {


        String sql = "SELECT MAX(pd_value*lgd_value*(1-recovery_rate)) as MaxExpectedLoss,cb.client_nro_id\n" +
                "FROM bi_corp_business.jm_values\n" +
                "inner join bi_corp_business.jm_cotr_bis cb on ( jm_cotr_bis_g6789_cod_nup  = cb.g6789_contract)\n" +
                "inner join jm_client_bii c on ( cb.client_nro_id  = c.g4093_nro_id)\n" +
                "WHERE c.g4093_nro_id = ?\n" +
                "GROUP BY cb.client_nro_id ";

        MaxExpectedLossDto maxexploss = new MaxExpectedLossDto();

        try (Connection conn = this.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql);) {
                pstmt.setInt(1,idCliente);
            try (ResultSet rs = pstmt.executeQuery()) {
                if(rs.next()){
                    maxexploss.setResultado(rs.getInt(1));
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return maxexploss;
    }
}
