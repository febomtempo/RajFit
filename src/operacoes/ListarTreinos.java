/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operacoes;

import atividades.Treino;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import pessoas.Pessoa;


/**
 *
 * @author Felipe
 */
public class ListarTreinos {

    public static void listar(List<Treino> treinos, JTable tabela, Pessoa pessoa) {
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();

        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }

        for (Treino treino : treinos) {
            if (treino.getAluno().equals(pessoa)) {
                Object[] row = {treino.getNome(), treino.getDia()};
                modelo.addRow(row);
            }

        }
    }
}
