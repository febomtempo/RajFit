/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operacoes;

import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import vendas.Categoria;

/**
 *
 * @author Felipe
 */
public class ListarCategorias {

    public static void listar(List<Categoria> categorias, JTable tabela) {
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();

        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }

        for (Categoria categoria : categorias) {

            Object[] row = {categoria.getNome(), "Teste"};
            modelo.addRow(row);

        }
    }
}
