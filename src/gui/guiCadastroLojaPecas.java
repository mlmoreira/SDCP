package gui;

import java.util.List;
import javax.swing.JOptionPane;
import jpa.BairroJpaController;
import jpa.CidadeJpaController;
import jpa.LojaPecasJpaController;
import jpa.UfJpaController;
import jpa.exceptions.NonexistentEntityException;
import model.Bairro;
import model.Cidade;
import model.LojaPecas;
import model.Uf;

public class guiCadastroLojaPecas extends javax.swing.JInternalFrame {

    private LojaPecas lp;

    public guiCadastroLojaPecas() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnLimpar = new javax.swing.JButton();
        txtCnpj = new javax.swing.JTextField();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnGravar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        txtCep = new javax.swing.JTextField();
        cboCidade = new javax.swing.JComboBox();
        cboBairro = new javax.swing.JComboBox();
        btnBairro = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        cboUf = new javax.swing.JComboBox();

        setClosable(true);
        setTitle("Cadastro de Loja de Peças");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        btnLimpar.setText("Limpar campos");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnAlterar.setText("Alterar");
        btnAlterar.setEnabled(false);
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.setEnabled(false);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnGravar.setText("Gravar");
        btnGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGravarActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel3.setText("CNPJ:");

        txtId.setEditable(false);
        txtId.setBackground(new java.awt.Color(220, 220, 220));

        jLabel2.setText("Nome:");

        jLabel1.setText("Id:");

        jLabel4.setText("Endereço:");

        jLabel5.setText("Bairro:");

        jLabel6.setText("Cidade:");

        jLabel7.setText("UF:");

        jLabel8.setText("CEP:");

        cboCidade.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboCidadeItemStateChanged(evt);
            }
        });

        btnBairro.setText("...");
        btnBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBairroActionPerformed(evt);
            }
        });

        jLabel10.setText("Telefone:");

        cboUf.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboUfItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtCnpj, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtId, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel5))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cboBairro, 0, 204, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnBairro))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnLimpar)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnGravar)
                                        .addGap(20, 20, 20)
                                        .addComponent(btnBuscar)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnAlterar)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnExcluir))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)
                                        .addComponent(cboCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel7))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cboUf, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(19, 19, 19))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cboUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cboCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cboBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBairro))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGravar)
                    .addComponent(btnBuscar)
                    .addComponent(btnAlterar)
                    .addComponent(btnExcluir))
                .addGap(18, 18, 18)
                .addComponent(btnLimpar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        txtId.setText("");
        txtNome.setText("");
        txtCnpj.setText("");
        txtTelefone.setText("");
        txtEndereco.setText("");
        cboUf.setSelectedIndex(0);
        cboCidade.setSelectedIndex(0);
        cboBairro.setSelectedIndex(0);
        txtCep.setText("");

        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        lp.setNome(txtNome.getText());
        lp.setCnpj(txtCnpj.getText());
        lp.setTelefone(txtTelefone.getText());
        lp.setEndereco(txtEndereco.getText());
        lp.setBairro((Bairro) cboBairro.getSelectedItem());
        lp.setCep(txtCep.getText());

        try {
            new LojaPecasJpaController().edit(lp);
            JOptionPane.showMessageDialog(null, "Alterado com sucesso");
        } catch (NonexistentEntityException ex) {
            JOptionPane.showMessageDialog(null, "Registro não encontrado");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Procure o administrador do sistema");
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (lp == null) {
            return;
        }
        try {
            new LojaPecasJpaController().destroy(lp.getId());
            JOptionPane.showMessageDialog(null, "Excluído com sucesso");

            txtId.setText("");
            txtNome.setText("");
            txtCnpj.setText("");
            txtTelefone.setText("");
            txtEndereco.setText("");
            cboUf.setSelectedIndex(0);
            cboCidade.setSelectedIndex(0);
            cboBairro.setSelectedIndex(0);
            txtCep.setText("");

            btnAlterar.setEnabled(false);
            btnExcluir.setEnabled(false);

        } catch (NonexistentEntityException ex) {
            JOptionPane.showMessageDialog(null, "Registro não encontrado");
        }
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGravarActionPerformed
        lp = new LojaPecas();

        lp.setNome(txtNome.getText());
        lp.setCnpj(txtCnpj.getText());
        lp.setTelefone(txtTelefone.getText());
        lp.setEndereco(txtEndereco.getText());
        lp.setBairro((Bairro) cboBairro.getSelectedItem());
        lp.setCep(txtCep.getText());

        new LojaPecasJpaController().create(lp);

        txtId.setText(lp.getId().toString());
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
        JOptionPane.showMessageDialog(null, "Gravado com sucesso");
    }//GEN-LAST:event_btnGravarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        try {
            lp = new LojaPecasJpaController().getLojaPecas(txtNome.getText());
            btnAlterar.setEnabled(true);
            btnExcluir.setEnabled(true);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Registro não encontrado");
        }

        txtId.setText(String.valueOf(lp.getId()));
        txtNome.setText(lp.getNome());
        txtCnpj.setText(lp.getCnpj());
        txtTelefone.setText(lp.getTelefone());
        txtEndereco.setText(lp.getEndereco());
        cboUf.setSelectedItem(lp.getBairro().getCidade().getUf());
        cboCidade.setSelectedItem(lp.getBairro().getCidade());
        cboBairro.setSelectedItem(lp.getBairro());
        txtCep.setText(lp.getCep());
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        try {
            List l = new UfJpaController().findUfEntities();
            cboUf.removeAllItems();
            for (int i = 0; i < l.size(); i++) {
                Uf uf = (Uf) l.get(i);
                cboUf.addItem(uf);
            }
        } catch (Exception ex) {
            //JOptionPane.showMessageDialog(null, "FormInternalFrameActivated!!");
        }
    }//GEN-LAST:event_formInternalFrameActivated

    private void btnBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBairroActionPerformed
        guiCadastroBairro tela = new guiCadastroBairro();
        guiMenuPrincipal.getPainel().add(tela);
        tela.setVisible(true);
    }//GEN-LAST:event_btnBairroActionPerformed

    private void cboCidadeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboCidadeItemStateChanged
        try {
            cboBairro.removeAllItems();

            Cidade c = (Cidade) cboCidade.getSelectedItem();
            List j = new BairroJpaController().getListBairroCidade(c);

            for (int i = 0; i < j.size(); i++) {
                Bairro b = (Bairro) j.get(i);
                cboBairro.addItem(b);
            }
        } catch (Exception ex) {
            //JOptionPane.showMessageDialog(null, "cboCidadeItemStateChanged!!");
        }
    }//GEN-LAST:event_cboCidadeItemStateChanged

    private void cboUfItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboUfItemStateChanged
        try {
            cboCidade.removeAllItems();

            Uf uf = (Uf) cboUf.getSelectedItem();
            List j = new CidadeJpaController().getListCidadeEstado(uf);

            for (int i = 0; i < j.size(); i++) {
                Cidade c = (Cidade) j.get(i);
                cboCidade.addItem(c);
            }
        } catch (Exception ex) {
            //JOptionPane.showMessageDialog(null, "cboBairroItemStateChanged!!");
        }
    }//GEN-LAST:event_cboUfItemStateChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnBairro;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnGravar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JComboBox cboBairro;
    private javax.swing.JComboBox cboCidade;
    private javax.swing.JComboBox cboUf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtCep;
    private javax.swing.JTextField txtCnpj;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
