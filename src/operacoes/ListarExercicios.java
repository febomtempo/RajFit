/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operacoes;

import atividades.Exercicio;
import atividades.Musculacao;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Felipe
 */
public class ListarExercicios {

    public static void listar(List<Exercicio> exercicios, JTable tabela) {
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();

        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }

        for (Exercicio exercicio : exercicios) {
            if (exercicio instanceof Musculacao) {
                Object[] row = {exercicio.getNome(), ((Musculacao) exercicio).getAparelho()};
                modelo.addRow(row);
            } else {
                Object[] row = {exercicio.getNome(), "Nenhum"};
                modelo.addRow(row);
            }

        }
    }
}
