package com.ferraztec.telas;

import javax.swing.JFrame;

public class TelaMenu extends javax.swing.JFrame {

    public TelaMenu() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuBar1 = new java.awt.MenuBar();
        menu1 = new java.awt.Menu();
        menu2 = new java.awt.Menu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        lblImagem = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        btnCadastrarProduto = new javax.swing.JMenuItem();
        btnBuscarProduto = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        btnCadastrarCliente = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jMenu3 = new javax.swing.JMenu();
        btnCadastrarUsuario = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenu6 = new javax.swing.JMenu();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        btnNovoAtendimento = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        btnSobre = new javax.swing.JMenuItem();
        btnDeslogar = new javax.swing.JMenuItem();
        btnEncerrar = new javax.swing.JMenuItem();

        menu1.setLabel("File");
        menuBar1.add(menu1);

        menu2.setLabel("Edit");
        menuBar1.add(menu2);

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FERRAZTEC");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblImagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblImagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 0, 1790, 1440));

        jMenu1.setText("Produto");
        jMenu1.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N

        btnCadastrarProduto.setText("Cadastrar");
        btnCadastrarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarProdutoActionPerformed(evt);
            }
        });
        jMenu1.add(btnCadastrarProduto);

        btnBuscarProduto.setText("Buscar");
        btnBuscarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProdutoActionPerformed(evt);
            }
        });
        jMenu1.add(btnBuscarProduto);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Cliente");
        jMenu2.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N

        btnCadastrarCliente.setText("Cadastrar");
        btnCadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarClienteActionPerformed(evt);
            }
        });
        jMenu2.add(btnCadastrarCliente);
        jMenu2.add(jSeparator4);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Usuário");
        jMenu3.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N

        btnCadastrarUsuario.setText("Cadastrar");
        btnCadastrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarUsuarioActionPerformed(evt);
            }
        });
        jMenu3.add(btnCadastrarUsuario);
        jMenu3.add(jSeparator3);

        jMenuBar1.add(jMenu3);

        jMenu6.setText(" Atendimento");
        jMenu6.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jMenu6.add(jSeparator2);

        btnNovoAtendimento.setText("Novo Atendimento");
        btnNovoAtendimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoAtendimentoActionPerformed(evt);
            }
        });
        jMenu6.add(btnNovoAtendimento);

        jMenuBar1.add(jMenu6);

        jMenu4.setText("Mais");
        jMenu4.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jMenu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu4ActionPerformed(evt);
            }
        });
        jMenu4.add(jSeparator1);

        btnSobre.setText("Sobre");
        btnSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSobreActionPerformed(evt);
            }
        });
        jMenu4.add(btnSobre);

        btnDeslogar.setText("Deslogar");
        btnDeslogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeslogarActionPerformed(evt);
            }
        });
        jMenu4.add(btnDeslogar);

        btnEncerrar.setText("Encerrar");
        btnEncerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncerrarActionPerformed(evt);
            }
        });
        jMenu4.add(btnEncerrar);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        getAccessibleContext().setAccessibleDescription("SISTEMA DE CONTROLE DE ESTOQUE");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarProdutoActionPerformed
        new TelaCadastroProdutos().setVisible(true);
    }//GEN-LAST:event_btnCadastrarProdutoActionPerformed

    private void btnCadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarClienteActionPerformed
        new TelaCadastroCliente().setVisible(true);
    }//GEN-LAST:event_btnCadastrarClienteActionPerformed

    private void btnBuscarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProdutoActionPerformed
        new TelaBuscarProdutos().setVisible(true);
    }//GEN-LAST:event_btnBuscarProdutoActionPerformed

    private void btnCadastrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarUsuarioActionPerformed
        new TelaCadastroUsuario().setVisible(true);
    }//GEN-LAST:event_btnCadastrarUsuarioActionPerformed

    private void btnNovoAtendimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoAtendimentoActionPerformed
        new TelaSelecionarProduto().setVisible(true);
    }//GEN-LAST:event_btnNovoAtendimentoActionPerformed

    private void btnDeslogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeslogarActionPerformed
        new TelaLogin().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnDeslogarActionPerformed

    private void btnEncerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncerrarActionPerformed
        dispose();
    }//GEN-LAST:event_btnEncerrarActionPerformed

    private void jMenu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu4ActionPerformed

    private void btnSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSobreActionPerformed
        new TelaSobreCriadores().setVisible(true);
    }//GEN-LAST:event_btnSobreActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(() -> {
            new TelaMenu().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btnBuscarProduto;
    private javax.swing.JMenuItem btnCadastrarCliente;
    private javax.swing.JMenuItem btnCadastrarProduto;
    private javax.swing.JMenuItem btnCadastrarUsuario;
    private javax.swing.JMenuItem btnDeslogar;
    private javax.swing.JMenuItem btnEncerrar;
    private javax.swing.JMenuItem btnNovoAtendimento;
    private javax.swing.JMenuItem btnSobre;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JLabel lblImagem;
    private java.awt.Menu menu1;
    private java.awt.Menu menu2;
    private java.awt.MenuBar menuBar1;
    // End of variables declaration//GEN-END:variables
}
