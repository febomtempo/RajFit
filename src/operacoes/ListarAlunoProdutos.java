/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operacoes;

import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import vendas.AlunoProdutos;

/**
 *
 * @author Felipe
 */
public class ListarAlunoProdutos {
    public static void listar(List<AlunoProdutos> alunoProdutos, JTable tabela) {
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();

        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }

        for (AlunoProdutos ap : alunoProdutos) {
            if (ap instanceof AlunoProdutos) {
                Object[] row = {ap.getProduto().getNome(), ap.getQuantidade(),
                    ap.getProduto().getValor(), ap.somarTotal() };
                modelo.addRow(row);
            }

        }
    }
}
