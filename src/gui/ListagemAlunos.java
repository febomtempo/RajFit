/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import java.util.List;
import operacoes.ListarAlunoProdutos;
import operacoes.ListarAlunos;
import pessoas.Endereco;
import pessoas.Medida;
import pessoas.Pessoa;
import vendas.AlunoProdutos;
import vendas.Pacote;
import vendas.Produto;

/**
 *
 * @author fabri
 */
public class ListagemAlunos extends javax.swing.JFrame implements IAtualizarFrame {

    private List<Pessoa> pessoas;
    private List<Pacote> pacotes;
    private List<Medida> medidas;
    private List<Endereco> enderecos;
    private List<Produto> produtos;
    private List<AlunoProdutos> alunoProdutos;

    /**
     * Creates new form ListagemAlunos
     */
    public ListagemAlunos(List<Pessoa> pessoas, List<Pacote> pacotes, List<Medida> medidas, List<Endereco> enderecos,
            List<Produto> produtos, List<AlunoProdutos> alunoProdutos) {
        this.pacotes = pacotes;
        this.pessoas = pessoas;
        this.medidas = medidas;
        this.enderecos = enderecos;
        this.produtos = produtos;
        this.alunoProdutos = alunoProdutos;
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        ListarAlunos.listar(pessoas, jTable1);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jButtonRetornaAluno = new javax.swing.JButton();
        jButtonRemoveAluno = new javax.swing.JButton();
        jButtonEditAluno = new javax.swing.JButton();
        jButtonNovoAluno = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("RAJFIT - Alunos");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Telefone", "Pacote"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButtonRetornaAluno.setText("Retornar");
        jButtonRetornaAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRetornaAlunoActionPerformed(evt);
            }
        });

        jButtonRemoveAluno.setText("Remover");
        jButtonRemoveAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoveAlunoActionPerformed(evt);
            }
        });

        jButtonEditAluno.setText("Outras Informações");
        jButtonEditAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditAlunoActionPerformed(evt);
            }
        });

        jButtonNovoAluno.setText("Novo");
        jButtonNovoAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoAlunoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonNovoAluno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonEditAluno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonRemoveAluno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonRetornaAluno)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonRetornaAluno)
                    .addComponent(jButtonRemoveAluno)
                    .addComponent(jButtonEditAluno)
                    .addComponent(jButtonNovoAluno)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRetornaAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRetornaAlunoActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonRetornaAlunoActionPerformed

    private void jButtonNovoAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoAlunoActionPerformed
        new FichaAluno(this, this.pessoas, this.pacotes, "Novo", null, this.medidas,
                this.enderecos, this.produtos, this.alunoProdutos).setVisible(true);
    }//GEN-LAST:event_jButtonNovoAlunoActionPerformed

    private void jButtonEditAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditAlunoActionPerformed
        Pessoa pessoa = this.pessoas.get(jTable1.getSelectedRow());
        new FichaAluno(this, this.pessoas, this.pacotes, "Outras Informações", pessoa, this.medidas,
                this.enderecos, this.produtos, this.alunoProdutos).setVisible(true);
    }//GEN-LAST:event_jButtonEditAlunoActionPerformed

    private void jButtonRemoveAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoveAlunoActionPerformed
        this.pessoas.remove(jTable1.getSelectedRow());
        this.atualizarFrame();
    }//GEN-LAST:event_jButtonRemoveAlunoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEditAluno;
    private javax.swing.JButton jButtonNovoAluno;
    private javax.swing.JButton jButtonRemoveAluno;
    private javax.swing.JButton jButtonRetornaAluno;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void atualizarFrame() {
        ListarAlunos.listar(pessoas, jTable1);

    }

}
