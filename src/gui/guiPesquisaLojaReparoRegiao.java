package gui;

import java.util.List;
import jpa.BairroJpaController;
import jpa.CidadeJpaController;
import jpa.LojaReparoJpaController;
import jpa.UfJpaController;
import model.Bairro;
import model.Cidade;
import model.Uf;

public class guiPesquisaLojaReparoRegiao extends javax.swing.JInternalFrame {

    public guiPesquisaLojaReparoRegiao() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstLojaPecasRegiao = new javax.swing.JList();
        cboUf = new javax.swing.JComboBox();
        cboCidade = new javax.swing.JComboBox();
        cboBairro = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        btnGerar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setClosable(true);
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

        jLabel5.setText("Bairro:");

        jScrollPane1.setViewportView(lstLojaPecasRegiao);

        cboUf.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboUfItemStateChanged(evt);
            }
        });

        cboCidade.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboCidadeItemStateChanged(evt);
            }
        });

        jLabel6.setText("Cidade:");

        btnGerar.setText("Gerar");
        btnGerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerarActionPerformed(evt);
            }
        });

        jLabel7.setText("UF:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cboUf, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cboCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cboBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGerar)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cboUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(cboBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(cboCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGerar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void cboCidadeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboCidadeItemStateChanged
        try {
            cboBairro.removeAllItems();
            //cboBairro.addItem("Todos");
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

    private void btnGerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerarActionPerformed
        lstLojaPecasRegiao.removeAll();

        //Estes podem ser usados para as pesquisas com "Todos"
        //Uf u = (Uf) cboUf.getSelectedItem();
        //Cidade c = (Cidade) cboCidade.getSelectedItem();
        Bairro b = (Bairro) cboBairro.getSelectedItem();

        List l = new LojaReparoJpaController().getLojaReparoRegiao(b);
        lstLojaPecasRegiao.setListData(l.toArray());
    }//GEN-LAST:event_btnGerarActionPerformed

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGerar;
    private javax.swing.JComboBox cboBairro;
    private javax.swing.JComboBox cboCidade;
    private javax.swing.JComboBox cboUf;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList lstLojaPecasRegiao;
    // End of variables declaration//GEN-END:variables
}
