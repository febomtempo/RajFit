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

/**
 *
 * @author Felipe
 */
public class ListarAlunos {
    public static void listar(List<Pessoa> pessoas, JTable tabela) {
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();

        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }

        for (Pessoa pessoa : pessoas) {
            if (pessoa instanceof Aluno) {
                Object[] row = {pessoa.getNomeCompleto(), pessoa.getTelefone(), ((Aluno) pessoa).getPacote().getNome() };
                modelo.addRow(row);
            }

        }
    }
}
