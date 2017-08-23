/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.travelmate.managerBean.cursos;

import java.util.List;

/**
 *
 * @author wolverine
 */
public class EmbarqueCheckFactory {
    
    private static List<EmbarqueCheckBean> lista;

    public static List<EmbarqueCheckBean> getLista() {
        return lista;
    }

    public static void setLista(List<EmbarqueCheckBean> lista) {
        EmbarqueCheckFactory.lista = lista;
    }
    
    public static List<EmbarqueCheckBean> gerarLista(){
        return lista;
    }
    
}
