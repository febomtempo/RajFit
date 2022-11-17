/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operacoes;

import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import pessoas.Aluno;
import pessoas.Pessoa;
import vendas.AlunoProdutos;
import vendas.Fatura;

/**
 *
 * @author Felipe
 */
public class ListarFaturas {

    public static void listar(List<Fatura> faturas, JTable tabela, Pessoa pessoa) {
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();

        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }

        for (Fatura fatura : faturas) {
            if (fatura.getPessoa() instanceof Aluno) {
                if (fatura.getPessoa().equals(pessoa)) {
                    Object[] row = {fatura.getPessoa().getNomeCompleto(), fatura.totalFatura(pessoa),
                        fatura.getData()};
                    modelo.addRow(row);
                }

            }

        }

    }
}
