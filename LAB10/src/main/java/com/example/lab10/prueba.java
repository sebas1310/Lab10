package com.example.lab10;

import com.example.lab10.beans.Contratos;
import com.example.lab10.daos.DaoContratos;

import java.util.ArrayList;

public class prueba {
    public static void main (String [ ] args) {


        DaoContratos contratosD = new DaoContratos();
        ArrayList<Contratos> listaContratos = contratosD.listaContratos();
        System.out.println("Hola");
        for(Contratos contrato: listaContratos){

            System.out.println(contrato.getNroDeContrato());
        }

    }
}
