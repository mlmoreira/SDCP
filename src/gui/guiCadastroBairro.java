package gui;

import java.util.List;
import javax.swing.JOptionPane;
import jpa.BairroJpaController;
import jpa.CidadeJpaController;
import jpa.UfJpaController;
import model.Bairro;
import model.Cidade;
import model.Uf;

public class guiCadastroBairro extends javax.swing.JInternalFrame {

    public guiCadastroBairro() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnGravar = new javax.swing.JButton();
        txtBairro = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnCidade = new javax.swing.JButton();
        btnUf = new javax.swing.JButton();
        cboCidade = new javax.swing.JComboBox();
        cboUf = new javax.swing.JComboBox();

        setClosable(true);
        setTitle("Cadastro de Bairro");
        setToolTipText("");
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

        jLabel1.setText("Nome");

        btnGravar.setText("Gravar");
        btnGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGravarActionPerformed(evt);
            }
        });

        jLabel2.setText("Uf");

        jLabel3.setText("Cidade");

        btnCidade.setText("...");
        btnCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCidadeActionPerformed(evt);
            }
        });

        btnUf.setText("...");
        btnUf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUfActionPerformed(evt);
            }
        });

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(24, 24, 24)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cboUf, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 202, Short.MAX_VALUE)
                                .addComponent(btnUf))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtBairro, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cboCidade, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(btnCidade))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGravar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(cboUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnUf))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCidade)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(cboCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnGravar)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGravarActionPerformed
        try {
            Bairro b = new Bairro();
            b.setCidade((Cidade) cboCidade.getSelectedItem());
            b.setNome(txtBairro.getText());
            new BairroJpaController().create(b);
            JOptionPane.showMessageDialog(null, "Gravado com sucesso");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro na gravação");
        }
    }//GEN-LAST:event_btnGravarActionPerformed

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        try {
            List l = new UfJpaController().findUfEntities();

            cboUf.removeAllItems();
            for (int i = 0; i < l.size(); i++) {
                Uf uf = (Uf) l.get(i);
                cboUf.addItem(uf);
            }
        } catch (Exception ex) {
            //JOptionPane.showMessageDialog(null, "cboCidadeItemStateChanged!!");
        }
    }//GEN-LAST:event_formInternalFrameActivated

    private void btnCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCidadeActionPerformed
        guiCadastroCidade tela = new guiCadastroCidade();
        guiMenuPrincipal.getPainel().add(tela);
        tela.setVisible(true);
    }//GEN-LAST:event_btnCidadeActionPerformed

    private void btnUfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUfActionPerformed
        guiCadastroUf tela = new guiCadastroUf();
        guiMenuPrincipal.getPainel().add(tela);
        tela.setVisible(true);
    }//GEN-LAST:event_btnUfActionPerformed

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
            //JOptionPane.showMessageDialog(null, "cboCidadeItemStateChanged!!");
        }
    }//GEN-LAST:event_cboUfItemStateChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCidade;
    private javax.swing.JButton btnGravar;
    private javax.swing.JButton btnUf;
    private javax.swing.JComboBox cboCidade;
    private javax.swing.JComboBox cboUf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtBairro;
    // End of variables declaration//GEN-END:variables
}
