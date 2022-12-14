/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rajfit;

import atividades.Exercicio;
import atividades.Treino;
import atividades.TreinoExercicio;
import exception.ErroDeLeituraException;
import gui.Principal;
import io.Carregador;
import io.LeitorGravadorObjetos;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import pessoas.Endereco;
import pessoas.Medida;
import pessoas.Pessoa;
import vendas.AlunoProdutos;
import vendas.Categoria;
import vendas.Fatura;
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
            List<Exercicio> exercicios = (List<Exercicio>) Carregador.carregarDados(new LeitorGravadorObjetos<List<Exercicio>>(), "exercicios.txt");
            List<Pessoa> pessoas = (List<Pessoa>) Carregador.carregarDados(new LeitorGravadorObjetos<List<Pessoa>>(), "pessoas.txt");
            List<Medida> medidas = (List<Medida>) Carregador.carregarDados(new LeitorGravadorObjetos<List<Medida>>(), "medidas.txt");
            List<Endereco> enderecos = (List<Endereco>) Carregador.carregarDados(new LeitorGravadorObjetos<List<Endereco>>(), "enderecos.txt");
            List<AlunoProdutos> alunoProdutos = (List<AlunoProdutos>) Carregador.carregarDados(new LeitorGravadorObjetos<List<AlunoProdutos>>(), "alunoProdutos.txt");
            List<Fatura> faturas = (List<Fatura>) Carregador.carregarDados(new LeitorGravadorObjetos<List<Fatura>>(), "faturas.txt");
            List<Treino> treinos = (List<Treino>) Carregador.carregarDados(new LeitorGravadorObjetos<List<Treino>>(), "treinos.txt");
            List<TreinoExercicio> treinoExercicios = (List<TreinoExercicio>) Carregador.carregarDados(new LeitorGravadorObjetos<List<TreinoExercicio>>(), "treinoExercicios.txt");
            if (categorias == null) {
                categorias = new ArrayList<Categoria>();
                System.out.println("ARQUIVO categorias N??O EXISTE, NOVO OBJETO CRIADO!");
            }
            if (produtos == null) {
                produtos = new ArrayList<Produto>();
                System.out.println("ARQUIVO produtos N??O EXISTE, NOVO OBJETO CRIADO!");
            }

            if (pacotes == null) {
                pacotes = new ArrayList<Pacote>();
                System.out.println("ARQUIVO pacotes N??O EXISTE, NOVO OBJETO CRIADO!");
            }
            if (exercicios == null) {
                exercicios = new ArrayList<Exercicio>();
                System.out.println("ARQUIVO exercicios N??O EXISTE, NOVO OBJETO CRIADO!");
            }
            if (pessoas == null) {
                pessoas = new ArrayList<Pessoa>();
                System.out.println("ARQUIVO pessoas N??O EXISTE, NOVO OBJETO CRIADO!");
            }
            if (medidas == null) {
                medidas = new ArrayList<Medida>();
                System.out.println("ARQUIVO medidas N??O EXISTE, NOVO OBJETO CRIADO!");
            }
            if (enderecos == null) {
                enderecos = new ArrayList<Endereco>();
                System.out.println("ARQUIVO enderecos N??O EXISTE, NOVO OBJETO CRIADO!");
            }
            if (alunoProdutos == null) {
                alunoProdutos = new ArrayList<AlunoProdutos>();
                System.out.println("ARQUIVO alunoProdutos N??O EXISTE, NOVO OBJETO CRIADO!");
            }
            if (faturas == null) {
                faturas = new ArrayList<Fatura>();
                System.out.println("ARQUIVO faturas N??O EXISTE, NOVO OBJETO CRIADO!");
            }
            if (treinos == null) {
                treinos = new ArrayList<Treino>();
                System.out.println("ARQUIVO treinos N??O EXISTE, NOVO OBJETO CRIADO!");
            }
            if (treinoExercicios == null) {
                treinoExercicios = new ArrayList<TreinoExercicio>();
                System.out.println("ARQUIVO treinoExercicios N??O EXISTE, NOVO OBJETO CRIADO!");
            }
            new Principal(categorias, produtos, pacotes, exercicios, pessoas,
                    medidas, enderecos, alunoProdutos, faturas,
                    treinos, treinoExercicios).setVisible(true);
        } catch (ErroDeLeituraException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERRO AO CARREGAR ARQUIVOS!!!", JOptionPane.ERROR_MESSAGE);
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
