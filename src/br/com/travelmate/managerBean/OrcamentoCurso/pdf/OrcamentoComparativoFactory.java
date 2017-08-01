/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.travelmate.managerBean.OrcamentoCurso.pdf;

import java.util.List;

/**
 *
 * @author Wolverine
 */
public class OrcamentoComparativoFactory {
    
    private static List<OrcamentoComparativoBean> lista;

    public static List<OrcamentoComparativoBean> getLista() {
        return lista;
    }

    public static void setLista(List<OrcamentoComparativoBean> lista) {
        OrcamentoComparativoFactory.lista = lista;
    }
    
     public static List<OrcamentoComparativoBean> gerarLista(){
        return lista;
    }
    
}
