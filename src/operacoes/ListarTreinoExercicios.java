/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operacoes;

import atividades.Treino;
import atividades.TreinoExercicio;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import pessoas.Pessoa;

/**
 *
 * @author Felipe
 */
public class ListarTreinoExercicios {

    public static void listar(List<TreinoExercicio> treinoExercicios, JTable tabela, Treino treino) {
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();

        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }

        for (TreinoExercicio te : treinoExercicios) {
            if (te.getTreino().equals(treino)) {
                Object[] row = {te.getExercicio().getNome(), te.getRepeticoes(), te.getSeries()};
                modelo.addRow(row);
            }

        }
    }
}
