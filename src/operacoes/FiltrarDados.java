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
public class FiltrarDados {

    public static void filtrarDados(String mes, String ano, List<AlunoProdutos> alunoProdutos, JTable tabela) {
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        switch (mes) {
            case "Janeiro" ->
                mes = "01";
            case "Fevereiro" ->
                mes = "02";
            case "Março" ->
                mes = "03";
            case "Abril" ->
                mes = "04";
            case "Maio" ->
                mes = "05";
            case "Junho" ->
                mes = "06";
            case "Julho" ->
                mes = "07";
            case "Agosto" ->
                mes = "08";
            case "Setembro" ->
                mes = "09";
            case "Outubro" ->
                mes = "10";
            case "Novembro" ->
                mes = "11";
            case "Dezembro" ->
                mes = "12";
        }
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }

        for (AlunoProdutos fatura : alunoProdutos) {
            if (fatura.getData().getMonthValue() == Integer.parseInt(mes)
                    && fatura.getData().getYear() == Integer.parseInt(ano)) {
               
                Object[] row = {fatura.getPessoa().getNomeCompleto(), fatura.faturaTotal(alunoProdutos)};
                modelo.addRow(row);

            }

        }

    }
}
