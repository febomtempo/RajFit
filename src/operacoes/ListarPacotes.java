/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operacoes;

import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import vendas.Pacote;

/**
 *
 * @author Felipe
 */
public class ListarPacotes {
     public static void listar(List<Pacote> pacotes, JTable tabela) {
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();

        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }

        for (Pacote pacote : pacotes) {

            Object[] row = {pacote.getNome(), pacote.getDescricao(), pacote.getValor()};
            modelo.addRow(row);

        }
    }
}
