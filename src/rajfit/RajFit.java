/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rajfit;

import exception.ErroDeLeituraException;
import gui.Principal;
import io.Carregador;
import io.LeitorGravadorObjetos;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import vendas.Categoria;
import vendas.Pacote;
import vendas.Produto;

/**
 *
 * @author fabri
 */
public class RajFit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            List<Categoria> categorias = (List<Categoria>) Carregador.carregarDados(new LeitorGravadorObjetos<List<Categoria>>(), "categorias.txt");
            List<Produto> produtos = (List<Produto>) Carregador.carregarDados(new LeitorGravadorObjetos<List<Produto>>(), "produtos.txt");
            List<Pacote> pacotes = (List<Pacote>) Carregador.carregarDados(new LeitorGravadorObjetos<List<Pacote>>(), "pacotes.txt");
            if (categorias == null) {
                categorias = new ArrayList<Categoria>();
                System.out.println("ARQUIVO NÃO EXISTE, NOVO OBJETO CRIADO!");
            }
            if (produtos == null) {
                produtos = new ArrayList<Produto>();
                System.out.println("ARQUIVO NÃO EXISTE, NOVO OBJETO CRIADO!");
            }
            
            if (pacotes == null) {
                pacotes = new ArrayList<Pacote>();
                System.out.println("ARQUIVO NÃO EXISTE, NOVO OBJETO CRIADO!");
            }
            new Principal(categorias, produtos, pacotes).setVisible(true);
        } catch (ErroDeLeituraException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Categorias", JOptionPane.ERROR_MESSAGE);
        }
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                } else {
                }
            }
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gui.Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(RajFit.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
