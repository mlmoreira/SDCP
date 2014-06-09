package gui;

import java.util.List;
import javax.swing.JOptionPane;
import jpa.BairroJpaController;
import jpa.CidadeJpaController;
import jpa.UfJpaController;
import jpa.UsuarioJpaController;
import jpa.exceptions.NonexistentEntityException;
import model.Bairro;
import model.Cidade;
import model.Uf;
import model.Usuario;

public class guiCadastroUsuario extends javax.swing.JInternalFrame {

    private Usuario u;

    public guiCadastroUsuario() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        btnLimpar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        txtId = new javax.swing.JTextField();
        txtCep = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnExcluir = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        btnGravar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        cboNivel = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        cboSexo = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtCpf = new javax.swing.JTextField();
        cboCidade = new javax.swing.JComboBox();
        cboBairro = new javax.swing.JComboBox();
        cboUf = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnBairro = new javax.swing.JButton();
        txtEndereco = new javax.swing.JTextField();

        setClosable(true);
        setTitle("Cadastro de Usuário");
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

        jLabel4.setText("Endereço:");

        btnLimpar.setText("Limpar campos");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnAlterar.setText("Alterar");
        btnAlterar.setEnabled(false);
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        txtId.setEditable(false);
        txtId.setBackground(new java.awt.Color(220, 220, 220));

        jLabel1.setText("Id:");

        btnExcluir.setText("Excluir");
        btnExcluir.setEnabled(false);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        jLabel8.setText("CEP:");

        btnGravar.setText("Gravar");
        btnGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGravarActionPerformed(evt);
            }
        });

        jLabel2.setText("Nome:");

        jLabel9.setText("Nível de conhecimento:");

        cboNivel.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Baixo", "Médio", "Alto" }));

        jLabel3.setText("Sexo:");

        cboSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Masculino", "Feminino" }));

        jLabel10.setText("Telefone:");

        jLabel11.setText("CPF");

        cboCidade.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboCidadeItemStateChanged(evt);
            }
        });

        cboUf.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboUfItemStateChanged(evt);
            }
        });

        jLabel7.setText("UF:");

        jLabel6.setText("Cidade:");

        jLabel5.setText("Bairro:");

        btnBairro.setText("...");
        btnBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBairroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnLimpar)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnGravar)
                                .addGap(20, 20, 20)
                                .addComponent(btnBuscar)
                                .addGap(18, 18, 18)
                                .addComponent(btnAlterar)
                                .addGap(18, 18, 18)
                                .addComponent(btnExcluir))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(42, 42, 42)
                                        .addComponent(cboUf, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(18, 18, 18)
                                        .addComponent(cboNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel11))
                                        .addGap(29, 29, 29)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtNome, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                                            .addComponent(cboSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtCpf)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel8))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(15, 15, 15)
                                                .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(22, 22, 22)
                                        .addComponent(cboCidade, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(27, 27, 27)
                                        .addComponent(cboBairro, 0, 192, Short.MAX_VALUE)))
                                .addGap(18, 18, 18)
                                .addComponent(btnBairro)))))
                .addContainerGap())
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cboSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cboNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cboCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cboBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBairro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGravar)
                    .addComponent(btnBuscar)
                    .addComponent(btnAlterar)
                    .addComponent(btnExcluir))
                .addGap(18, 18, 18)
                .addComponent(btnLimpar)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        txtId.setText(null);
        txtNome.setText("");
        txtCpf.setText("");
        cboSexo.setSelectedIndex(0);
        cboNivel.setSelectedIndex(0);
        txtTelefone.setText("");
        txtEndereco.setText("");
        cboUf.setSelectedIndex(0);
        cboCidade.setSelectedIndex(0);
        cboBairro.setSelectedIndex(0);
        txtCep.setText("");
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        try {
            u = new UsuarioJpaController().getUsuario(txtNome.getText());
            btnAlterar.setEnabled(true);
            btnExcluir.setEnabled(true);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Registro não encontrado");
        }

        txtId.setText(String.valueOf(u.getId()));
        txtNome.setText(u.getNome());
        txtCpf.setText(u.getCpf());
        cboSexo.setSelectedItem(u.getSexo());
        cboNivel.setSelectedItem(u.getNivel());
        txtTelefone.setText(u.getTelefone());
        txtEndereco.setText(u.getEndereco());
        cboBairro.setSelectedItem(u.getBairro());
        txtCep.setText(u.getCep());
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        u.setNome(txtNome.getText());
        u.setCpf(txtCpf.getText());
        u.setSexo((String) cboSexo.getSelectedItem());
        u.setNivel((String) cboNivel.getSelectedItem());
        u.setTelefone(txtTelefone.getText());
        u.setEndereco(txtEndereco.getText());
        u.setBairro((Bairro) cboBairro.getSelectedItem());
        u.setCep(txtCep.getText());

        try {
            new UsuarioJpaController().edit(u);
            JOptionPane.showMessageDialog(null, "Alterado com sucesso");
        } catch (NonexistentEntityException ex) {
            JOptionPane.showMessageDialog(null, "Registro não encontrado");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Procure o administrador do sistema");
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (u == null) {
            return;
        }
        try {
            new UsuarioJpaController().destroy(u.getId());
            JOptionPane.showMessageDialog(null, "Excluído com sucesso");
            txtId.setText(null);
            txtNome.setText("");
            txtCpf.setText("");
            cboSexo.setSelectedIndex(0);
            cboNivel.setSelectedIndex(0);
            txtTelefone.setText("");
            txtEndereco.setText("");
            cboUf.setSelectedIndex(0);
            cboCidade.setSelectedIndex(0);
            cboBairro.setSelectedIndex(0);
            txtCep.setText("");
        } catch (NonexistentEntityException ex) {
            JOptionPane.showMessageDialog(null, "Registro não encontrado");
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGravarActionPerformed
        u = new Usuario();

        u.setNome(txtNome.getText());
        u.setCpf(txtCpf.getText());
        u.setSexo((String) cboSexo.getSelectedItem());
        u.setNivel((String) cboNivel.getSelectedItem());
        u.setTelefone(txtTelefone.getText());
        u.setEndereco(txtEndereco.getText());
        u.setBairro((Bairro) cboBairro.getSelectedItem());
        u.setCep(txtCep.getText());

        new UsuarioJpaController().create(u);

        txtId.setText(u.getId().toString());
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
        JOptionPane.showMessageDialog(null, "Gravado com sucesso");
    }//GEN-LAST:event_btnGravarActionPerformed

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        List l = new UfJpaController().findUfEntities();

        cboUf.removeAllItems();
        for (int i = 0; i < l.size(); i++) {
            Uf uf = (Uf) l.get(i);
            cboUf.addItem(uf);
        }
    }//GEN-LAST:event_formInternalFrameActivated

    private void cboCidadeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboCidadeItemStateChanged
        cboBairro.removeAllItems();
        Cidade c = (Cidade) cboCidade.getSelectedItem();
        List j = new BairroJpaController().getListBairroCidade(c);

        for (int i = 0; i < j.size(); i++) {
            Bairro b = (Bairro) j.get(i);
            cboBairro.addItem(b);
        }
    }//GEN-LAST:event_cboCidadeItemStateChanged

    private void cboUfItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboUfItemStateChanged
        cboCidade.removeAllItems();
        Uf uf = (Uf) cboUf.getSelectedItem();
        List j = new CidadeJpaController().getListCidadeEstado(uf);

        for (int i = 0; i < j.size(); i++) {
            Cidade c = (Cidade) j.get(i);
            cboCidade.addItem(c);
        }
    }//GEN-LAST:event_cboUfItemStateChanged

    private void btnBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBairroActionPerformed
        guiCadastroBairro tela = new guiCadastroBairro();
        guiMenuPrincipal.getPainel().add(tela);
        tela.setVisible(true);
    }//GEN-LAST:event_btnBairroActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnBairro;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnGravar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JComboBox cboBairro;
    private javax.swing.JComboBox cboCidade;
    private javax.swing.JComboBox cboNivel;
    private javax.swing.JComboBox cboSexo;
    private javax.swing.JComboBox cboUf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtCep;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
