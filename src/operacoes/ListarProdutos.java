/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operacoes;

import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import vendas.Produto;

/**
 *
 * @author Felipe
 */
public class ListarProdutos {
    public static void listar(List<Produto> produtos, JTable tabela) {
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();

        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }

        for (Produto produto : produtos) {

            Object[] row = {produto.getCategoria().getNome(), produto.getNome(), produto.getValor()};
            modelo.addRow(row);

        }
    }
}
