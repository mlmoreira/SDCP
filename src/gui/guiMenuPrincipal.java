package gui;

import javax.swing.JDesktopPane;

public class guiMenuPrincipal extends javax.swing.JFrame {

    private static guiMenuPrincipal p;

    public static guiMenuPrincipal getInstancia() {
        if (p == null) {
            p = new guiMenuPrincipal();
        }
        return p;
    }

    public static JDesktopPane getPainel() {
        return getInstancia().desktopPane;
    }

    public guiMenuPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        menuCadastros = new javax.swing.JMenu();
        miPecas = new javax.swing.JMenuItem();
        menuLojas = new javax.swing.JMenu();
        miLojaPecas = new javax.swing.JMenuItem();
        miLojaReparo = new javax.swing.JMenuItem();
        menuEnderecos = new javax.swing.JMenu();
        miBairro = new javax.swing.JMenuItem();
        miCidade = new javax.swing.JMenuItem();
        miUf = new javax.swing.JMenuItem();
        miUsuarios = new javax.swing.JMenuItem();
        miSintomas = new javax.swing.JMenuItem();
        miDiagnosticos = new javax.swing.JMenuItem();
        menuRelatorios = new javax.swing.JMenu();
        miLojasPecasRegiao = new javax.swing.JMenuItem();
        miLojasReparoRegiao = new javax.swing.JMenuItem();
        miUsuarioPerfil = new javax.swing.JMenuItem();
        miDiagnosticosComuns = new javax.swing.JMenuItem();
        miTaxaSucessoDiagnosticos = new javax.swing.JMenuItem();
        menuSuporte = new javax.swing.JMenu();
        miDiagnosticar = new javax.swing.JMenuItem();
        miBuscarLojaPecas = new javax.swing.JMenuItem();
        miBuscarLojaReparos = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 621));

        menuCadastros.setMnemonic('c');
        menuCadastros.setText("Cadastros");

        miPecas.setMnemonic('o');
        miPecas.setText("Peças");
        miPecas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miPecasActionPerformed(evt);
            }
        });
        menuCadastros.add(miPecas);

        menuLojas.setText("Lojas");

        miLojaPecas.setText("Lojas de Peças");
        miLojaPecas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miLojaPecasActionPerformed(evt);
            }
        });
        menuLojas.add(miLojaPecas);

        miLojaReparo.setText("Lojas de Reparo");
        miLojaReparo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miLojaReparoActionPerformed(evt);
            }
        });
        menuLojas.add(miLojaReparo);

        menuCadastros.add(menuLojas);

        menuEnderecos.setText("Endereços");

        miBairro.setText("Bairro");
        miBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miBairroActionPerformed(evt);
            }
        });
        menuEnderecos.add(miBairro);

        miCidade.setText("Cidade");
        miCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCidadeActionPerformed(evt);
            }
        });
        menuEnderecos.add(miCidade);

        miUf.setText("UF");
        miUf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miUfActionPerformed(evt);
            }
        });
        menuEnderecos.add(miUf);

        menuCadastros.add(menuEnderecos);

        miUsuarios.setMnemonic('a');
        miUsuarios.setText("Usuários");
        miUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miUsuariosActionPerformed(evt);
            }
        });
        menuCadastros.add(miUsuarios);

        miSintomas.setMnemonic('x');
        miSintomas.setText("Sintomas");
        miSintomas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSintomasActionPerformed(evt);
            }
        });
        menuCadastros.add(miSintomas);

        miDiagnosticos.setText("Diagnósticos");
        miDiagnosticos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miDiagnosticosActionPerformed(evt);
            }
        });
        menuCadastros.add(miDiagnosticos);

        menuBar.add(menuCadastros);

        menuRelatorios.setMnemonic('e');
        menuRelatorios.setText("Relatórios");

        miLojasPecasRegiao.setMnemonic('y');
        miLojasPecasRegiao.setText("Lojas de Peças por Região");
        miLojasPecasRegiao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miLojasPecasRegiaoActionPerformed(evt);
            }
        });
        menuRelatorios.add(miLojasPecasRegiao);

        miLojasReparoRegiao.setMnemonic('t');
        miLojasReparoRegiao.setText("Lojas de Reparo por Região");
        menuRelatorios.add(miLojasReparoRegiao);

        miUsuarioPerfil.setMnemonic('p');
        miUsuarioPerfil.setText("Usuários por Perfil");
        menuRelatorios.add(miUsuarioPerfil);

        miDiagnosticosComuns.setText("Diagnósticos mais Comuns");
        menuRelatorios.add(miDiagnosticosComuns);

        miTaxaSucessoDiagnosticos.setMnemonic('d');
        miTaxaSucessoDiagnosticos.setText("Taxa de Sucesso de Diagnósticos");
        menuRelatorios.add(miTaxaSucessoDiagnosticos);

        menuBar.add(menuRelatorios);

        menuSuporte.setMnemonic('h');
        menuSuporte.setText("Suporte ao Usuário");

        miDiagnosticar.setMnemonic('c');
        miDiagnosticar.setText("Diagnosticar Problema");
        menuSuporte.add(miDiagnosticar);

        miBuscarLojaPecas.setMnemonic('a');
        miBuscarLojaPecas.setText("Buscar Lojas de Peças");
        miBuscarLojaPecas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miBuscarLojaPecasActionPerformed(evt);
            }
        });
        menuSuporte.add(miBuscarLojaPecas);

        miBuscarLojaReparos.setText("Buscar Lojas de Reparo");
        miBuscarLojaReparos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miBuscarLojaReparosActionPerformed(evt);
            }
        });
        menuSuporte.add(miBuscarLojaReparos);

        menuBar.add(menuSuporte);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miSintomasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSintomasActionPerformed
        guiCadastroSintoma tela = new guiCadastroSintoma();
        desktopPane.add(tela);
        tela.setVisible(true);
    }//GEN-LAST:event_miSintomasActionPerformed

    private void miPecasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miPecasActionPerformed
        guiCadastroPecas tela = new guiCadastroPecas();
        desktopPane.add(tela);
        tela.setVisible(true);
    }//GEN-LAST:event_miPecasActionPerformed

    private void miLojasPecasRegiaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miLojasPecasRegiaoActionPerformed
        guiPesquisaLojaPecasRegiao tela = new guiPesquisaLojaPecasRegiao();
        desktopPane.add(tela);
        tela.setVisible(true);
    }//GEN-LAST:event_miLojasPecasRegiaoActionPerformed

    private void miLojaPecasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miLojaPecasActionPerformed
        guiCadastroLojaPecas tela = new guiCadastroLojaPecas();
        desktopPane.add(tela);
        tela.setVisible(true);

    }//GEN-LAST:event_miLojaPecasActionPerformed

    private void miLojaReparoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miLojaReparoActionPerformed
        guiCadastroLojaReparo tela = new guiCadastroLojaReparo();
        desktopPane.add(tela);
        tela.setVisible(true);
    }//GEN-LAST:event_miLojaReparoActionPerformed

    private void miDiagnosticosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miDiagnosticosActionPerformed
        guiCadastroDiagnostico tela = new guiCadastroDiagnostico();
        desktopPane.add(tela);
        tela.setVisible(true);
    }//GEN-LAST:event_miDiagnosticosActionPerformed

    private void miUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miUsuariosActionPerformed
        guiCadastroUsuario tela = new guiCadastroUsuario();
        desktopPane.add(tela);
        tela.setVisible(true);
    }//GEN-LAST:event_miUsuariosActionPerformed

    private void miBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miBairroActionPerformed
        guiCadastroBairro tela = new guiCadastroBairro();
        desktopPane.add(tela);
        tela.setVisible(true);
    }//GEN-LAST:event_miBairroActionPerformed

    private void miCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCidadeActionPerformed
        guiCadastroCidade tela = new guiCadastroCidade();
        desktopPane.add(tela);
        tela.setVisible(true);
    }//GEN-LAST:event_miCidadeActionPerformed

    private void miUfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miUfActionPerformed
        guiCadastroUf tela = new guiCadastroUf();
        desktopPane.add(tela);
        tela.setVisible(true);
    }//GEN-LAST:event_miUfActionPerformed

    private void miBuscarLojaPecasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miBuscarLojaPecasActionPerformed
        guiPesquisaLojaPecasRegiao tela = new guiPesquisaLojaPecasRegiao();
        desktopPane.add(tela);
        tela.setVisible(true);
    }//GEN-LAST:event_miBuscarLojaPecasActionPerformed

    private void miBuscarLojaReparosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miBuscarLojaReparosActionPerformed
        guiPesquisaLojaReparoRegiao tela = new guiPesquisaLojaReparoRegiao();
        desktopPane.add(tela);
        tela.setVisible(true);
    }//GEN-LAST:event_miBuscarLojaReparosActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(guiMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(guiMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(guiMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(guiMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                getInstancia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuCadastros;
    private javax.swing.JMenu menuEnderecos;
    private javax.swing.JMenu menuLojas;
    private javax.swing.JMenu menuRelatorios;
    private javax.swing.JMenu menuSuporte;
    private javax.swing.JMenuItem miBairro;
    private javax.swing.JMenuItem miBuscarLojaPecas;
    private javax.swing.JMenuItem miBuscarLojaReparos;
    private javax.swing.JMenuItem miCidade;
    private javax.swing.JMenuItem miDiagnosticar;
    private javax.swing.JMenuItem miDiagnosticos;
    private javax.swing.JMenuItem miDiagnosticosComuns;
    private javax.swing.JMenuItem miLojaPecas;
    private javax.swing.JMenuItem miLojaReparo;
    private javax.swing.JMenuItem miLojasPecasRegiao;
    private javax.swing.JMenuItem miLojasReparoRegiao;
    private javax.swing.JMenuItem miPecas;
    private javax.swing.JMenuItem miSintomas;
    private javax.swing.JMenuItem miTaxaSucessoDiagnosticos;
    private javax.swing.JMenuItem miUf;
    private javax.swing.JMenuItem miUsuarioPerfil;
    private javax.swing.JMenuItem miUsuarios;
    // End of variables declaration//GEN-END:variables

}
