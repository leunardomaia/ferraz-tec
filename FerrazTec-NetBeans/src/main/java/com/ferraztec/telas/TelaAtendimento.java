package com.ferraztec.telas;

import com.ferraztec.dto.Cliente;
import com.ferraztec.dto.Produto;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class TelaAtendimento extends javax.swing.JFrame {

    private double totalSelecionados = 0; 
    private TelaSelecionarProduto telaSelecionarProduto;
    
    public TelaAtendimento(List<Produto> listaSelecionados, TelaSelecionarProduto telaSelecionarProduto) {
        initComponents();
        
        txtDescricaoServico.setEnabled(false);
        txtValorServico.setEnabled(false);
        
        this.telaSelecionarProduto = telaSelecionarProduto;
        
        this.setTotalSelecionados(listaSelecionados);
        
        preencherTabela(listaSelecionados);
        
        lblTotal.setText("R$ "+Double.toString(totalSelecionados));
    }
    
      private TelaAtendimento() {
    }
    
    private void preencherTabela(List<Produto> listaSelecionados){
        DefaultTableModel modeloTabela = (DefaultTableModel) tabelaProdutos.getModel();
  
        for (Produto selecionado : listaSelecionados){
            modeloTabela.addRow(new Object[]{
                selecionado.getId(),
                selecionado.getNome(),
                selecionado.getQuantidade(),
                selecionado.getPreco(),
                selecionado.getDescricao(),
            });
        }
    }

    private void setTotalSelecionados(List<Produto> listaSelecionados) {
        for(Produto selecionado : listaSelecionados){
            this.totalSelecionados += (selecionado.getPreco()*selecionado.getQuantidade());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        txtNomeCliente = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaProdutos = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        btnConfirmar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtDescricaoServico = new javax.swing.JTextField();
        lblTotal = new javax.swing.JTextField();
        txtValorServico = new javax.swing.JTextField();
        btnBuscarCliente = new javax.swing.JButton();
        checkBoxServico = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ATENDIMENTO");
        setResizable(false);

        jLabel4.setText("Cliente");

        txtNomeCliente.setEditable(false);

        jLabel5.setText("Produtos");

        tabelaProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Quantidade", "Preço", "Descrição"
            }
        ));
        jScrollPane2.setViewportView(tabelaProdutos);

        jLabel6.setText("Valor do Serviço");

        btnConfirmar.setText("Confirmar");
        btnConfirmar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        jLabel1.setText("VALOR TOTAL");

        btnVoltar.setText("Voltar");
        btnVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        jLabel2.setText("Descrição do Serviço");

        lblTotal.setEditable(false);
        lblTotal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        lblTotal.setText("R$ 55.00");

        txtValorServico.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtValorServico.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtValorServicoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtValorServicoKeyTyped(evt);
            }
        });

        btnBuscarCliente.setText("Buscar");
        btnBuscarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarClienteActionPerformed(evt);
            }
        });

        checkBoxServico.setText("Serviço");
        checkBoxServico.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        checkBoxServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxServicoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnVoltar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnConfirmar)
                .addGap(20, 20, 20))
            .addGroup(layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6)
                    .addComponent(txtDescricaoServico)
                    .addComponent(jLabel2)
                    .addComponent(checkBoxServico)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(lblTotal))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscarCliente))
                    .addComponent(jLabel4)
                    .addComponent(txtValorServico))
                .addContainerGap(98, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarCliente))
                .addGap(50, 50, 50)
                .addComponent(checkBoxServico)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtValorServico, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDescricaoServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVoltar)
                    .addComponent(btnConfirmar))
                .addGap(30, 30, 30))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        dispose();
        telaSelecionarProduto.dispose();
        
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void txtValorServicoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValorServicoKeyTyped
        String caracteres = "0123456789.";
        if (!caracteres.contains(evt.getKeyChar()+"")){
            evt.consume();
        }
    }//GEN-LAST:event_txtValorServicoKeyTyped

    private void txtValorServicoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValorServicoKeyReleased
        if (!txtValorServico.getText().isEmpty()){
            double total = (Double.valueOf(txtValorServico.getText()))+totalSelecionados;
            lblTotal.setText("R$ "+Double.toString(total));
        }else{
            lblTotal.setText("R$ "+Double.toString(totalSelecionados));
        }
    }//GEN-LAST:event_txtValorServicoKeyReleased

    private void btnBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClienteActionPerformed
        TelaSelecionarCliente cliente = new TelaSelecionarCliente(this);
        cliente.setVisible(true);
    }//GEN-LAST:event_btnBuscarClienteActionPerformed

    private void checkBoxServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxServicoActionPerformed
        if (checkBoxServico.isSelected()) {
            txtDescricaoServico.setEnabled(true);
            txtValorServico.setEnabled(true);
        } else {
            txtDescricaoServico.setEnabled(false);
            txtValorServico.setEnabled(false);
        }
    }//GEN-LAST:event_checkBoxServicoActionPerformed

    void selecionarCliente(Cliente cliente) {
        txtNomeCliente.setText(cliente.getNome());
    }
    
    public static void main(String args[]) {
      
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAtendimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
     

        java.awt.EventQueue.invokeLater(() -> {
            new TelaAtendimento().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarCliente;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JCheckBox checkBoxServico;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField lblTotal;
    private javax.swing.JTable tabelaProdutos;
    private javax.swing.JTextField txtDescricaoServico;
    private javax.swing.JTextField txtNomeCliente;
    private javax.swing.JTextField txtValorServico;
    // End of variables declaration//GEN-END:variables

    
}
