/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import static java.awt.Frame.MAXIMIZED_BOTH;
import javax.swing.JOptionPane;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 *
 * @author fz474
 */
public class frmCarteira extends javax.swing.JFrame {

    /**
     * Creates new form frmCarteira
     */
    public frmCarteira() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnPrincipal = new javax.swing.JPanel();
        pnSuperior = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pnData = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        pnTabela = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        abaLucros = new javax.swing.JPanel();
        abaCustos = new javax.swing.JPanel();
        pnInferior = new javax.swing.JPanel();
        btnVoltar = new javax.swing.JButton();
        pnSaldos = new javax.swing.JPanel();
        pnSaldoInicial = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        pnSaldoInicialTexto = new javax.swing.JPanel();
        lbSaldoInicial = new javax.swing.JLabel();
        pnSaldoDespesas = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        pnSaldoDespesasTexto = new javax.swing.JPanel();
        lbSaldoDespesas = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        pnSaldoPrevisto = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        pnSaldoPrevistoTexto = new javax.swing.JPanel();
        lbSaldoPrevisto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        setFocusableWindowState(false);
        setType(java.awt.Window.Type.UTILITY);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        pnPrincipal.setBackground(new java.awt.Color(204, 204, 204));

        pnSuperior.setBackground(new java.awt.Color(153, 153, 153));
        pnSuperior.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnSuperior.setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("FLUXO DE CAIXA");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnSuperiorLayout = new javax.swing.GroupLayout(pnSuperior);
        pnSuperior.setLayout(pnSuperiorLayout);
        pnSuperiorLayout.setHorizontalGroup(
            pnSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1332, Short.MAX_VALUE)
        );
        pnSuperiorLayout.setVerticalGroup(
            pnSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnSuperiorLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnData.setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("jLabel2");
        pnData.add(jLabel2);

        pnTabela.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout abaLucrosLayout = new javax.swing.GroupLayout(abaLucros);
        abaLucros.setLayout(abaLucrosLayout);
        abaLucrosLayout.setHorizontalGroup(
            abaLucrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1331, Short.MAX_VALUE)
        );
        abaLucrosLayout.setVerticalGroup(
            abaLucrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 461, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Lucros", abaLucros);

        javax.swing.GroupLayout abaCustosLayout = new javax.swing.GroupLayout(abaCustos);
        abaCustos.setLayout(abaCustosLayout);
        abaCustosLayout.setHorizontalGroup(
            abaCustosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1331, Short.MAX_VALUE)
        );
        abaCustosLayout.setVerticalGroup(
            abaCustosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 461, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Custos", abaCustos);

        pnTabela.add(jTabbedPane1);

        pnInferior.setBackground(new java.awt.Color(153, 153, 153));
        pnInferior.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnVoltar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnVoltar.setText("VOLTAR PARA TELA INICIAL");
        btnVoltar.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnVoltar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVoltarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnInferiorLayout = new javax.swing.GroupLayout(pnInferior);
        pnInferior.setLayout(pnInferiorLayout);
        pnInferiorLayout.setHorizontalGroup(
            pnInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnInferiorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVoltar)
                .addContainerGap())
        );
        pnInferiorLayout.setVerticalGroup(
            pnInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnInferiorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnSaldos.setBackground(new java.awt.Color(204, 204, 204));

        pnSaldoInicial.setBackground(new java.awt.Color(204, 204, 204));
        pnSaldoInicial.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel7.setText("Saldo Inicial: ");
        pnSaldoInicial.add(jLabel7);

        pnSaldoInicialTexto.setBackground(new java.awt.Color(204, 204, 204));
        pnSaldoInicialTexto.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lbSaldoInicial.setFont(new java.awt.Font("Tahoma", 0, 38)); // NOI18N
        lbSaldoInicial.setForeground(new java.awt.Color(51, 153, 0));
        lbSaldoInicial.setText("R$365,45");
        pnSaldoInicialTexto.add(lbSaldoInicial);

        pnSaldoDespesas.setBackground(new java.awt.Color(204, 204, 204));
        pnSaldoDespesas.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel8.setText("Despesas: ");
        pnSaldoDespesas.add(jLabel8);

        pnSaldoDespesasTexto.setBackground(new java.awt.Color(204, 204, 204));
        pnSaldoDespesasTexto.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lbSaldoDespesas.setFont(new java.awt.Font("Tahoma", 0, 38)); // NOI18N
        lbSaldoDespesas.setForeground(new java.awt.Color(255, 51, 51));
        lbSaldoDespesas.setText("R$185,60");
        pnSaldoDespesasTexto.add(lbSaldoDespesas);

        javax.swing.GroupLayout pnSaldosLayout = new javax.swing.GroupLayout(pnSaldos);
        pnSaldos.setLayout(pnSaldosLayout);
        pnSaldosLayout.setHorizontalGroup(
            pnSaldosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnSaldosLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(pnSaldosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnSaldoInicialTexto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnSaldoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnSaldosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnSaldoDespesasTexto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnSaldoDespesas, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );
        pnSaldosLayout.setVerticalGroup(
            pnSaldosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnSaldosLayout.createSequentialGroup()
                .addComponent(pnSaldoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnSaldoInicialTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnSaldosLayout.createSequentialGroup()
                .addComponent(pnSaldoDespesas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnSaldoDespesasTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        pnSaldoPrevisto.setBackground(new java.awt.Color(204, 204, 204));
        pnSaldoPrevisto.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnSaldoPrevisto.setPreferredSize(new java.awt.Dimension(278, 41));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel6.setText("Saldo Previsto: ");
        pnSaldoPrevisto.add(jLabel6);

        jPanel1.add(pnSaldoPrevisto);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        pnSaldoPrevistoTexto.setBackground(new java.awt.Color(204, 204, 204));
        pnSaldoPrevistoTexto.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnSaldoPrevistoTexto.setPreferredSize(new java.awt.Dimension(278, 60));

        lbSaldoPrevisto.setFont(new java.awt.Font("Tahoma", 0, 38)); // NOI18N
        lbSaldoPrevisto.setForeground(new java.awt.Color(255, 102, 0));
        lbSaldoPrevisto.setText("R$185,60");
        pnSaldoPrevistoTexto.add(lbSaldoPrevisto);

        jPanel2.add(pnSaldoPrevistoTexto);

        javax.swing.GroupLayout pnPrincipalLayout = new javax.swing.GroupLayout(pnPrincipal);
        pnPrincipal.setLayout(pnPrincipalLayout);
        pnPrincipalLayout.setHorizontalGroup(
            pnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnInferior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnSuperior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnTabela, javax.swing.GroupLayout.DEFAULT_SIZE, 1336, Short.MAX_VALUE)
            .addComponent(pnSaldos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnPrincipalLayout.setVerticalGroup(
            pnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnPrincipalLayout.createSequentialGroup()
                .addComponent(pnSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(pnData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnSaldos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addComponent(pnTabela, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnInferior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnSuperior.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setExtendedState(MAXIMIZED_BOTH);
        jLabel2.setText(getDateTime());
    }//GEN-LAST:event_formWindowOpened

    private void btnVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVoltarMouseClicked
        int opcao = JOptionPane.showConfirmDialog(null, "Deseja Voltar Para a Tela Inicial?", "Atenção", JOptionPane.YES_NO_OPTION);

            if (opcao == JOptionPane.YES_OPTION) {
                fecharTelaCarteira();
                this.dispose();
            } else if (opcao == JOptionPane.NO_OPTION) {
                this.setExtendedState(MAXIMIZED_BOTH);
            }
    }//GEN-LAST:event_btnVoltarMouseClicked
    
    public void fecharTelaCarteira() {
        frmCarteira carteira = new frmCarteira();
        
        carteira.dispose();
    }
 
    private String getDateTime() {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        return dateFormat.format(date);
}
    
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(frmCarteira.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCarteira.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCarteira.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCarteira.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCarteira().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel abaCustos;
    private javax.swing.JPanel abaLucros;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lbSaldoDespesas;
    private javax.swing.JLabel lbSaldoInicial;
    private javax.swing.JLabel lbSaldoPrevisto;
    private javax.swing.JPanel pnData;
    private javax.swing.JPanel pnInferior;
    private javax.swing.JPanel pnPrincipal;
    private javax.swing.JPanel pnSaldoDespesas;
    private javax.swing.JPanel pnSaldoDespesasTexto;
    private javax.swing.JPanel pnSaldoInicial;
    private javax.swing.JPanel pnSaldoInicialTexto;
    private javax.swing.JPanel pnSaldoPrevisto;
    private javax.swing.JPanel pnSaldoPrevistoTexto;
    private javax.swing.JPanel pnSaldos;
    private javax.swing.JPanel pnSuperior;
    private javax.swing.JPanel pnTabela;
    // End of variables declaration//GEN-END:variables
}
