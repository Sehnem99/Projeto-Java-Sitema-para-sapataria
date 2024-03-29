/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Classes.Carteira;
import db.CarteiraDAO;
import static java.awt.Frame.MAXIMIZED_BOTH;
import javax.swing.JOptionPane;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;


public class frmCarteira extends javax.swing.JFrame {
    private CarteiraDAO vSerCarte = new CarteiraDAO();
    private Carteira vCarteira = new Carteira();
    
    public frmCarteira() {
        initComponents(); 
        atualizaValores();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnPrincipal = new javax.swing.JPanel();
        pnSuperior = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pnData = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        pnTabela = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        abaLucros = new javax.swing.JPanel();
        abaCustos = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        txtValorDespesa = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        btCanselarDespesa = new javax.swing.JButton();
        btAdicionarDespesa = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescDespesa = new javax.swing.JTextArea();
        pnSaldos = new javax.swing.JPanel();
        pnSaldoInicial = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        pnSaldoPrevisto = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        pnSaldoDespesas = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        pnSaldoInicialTexto = new javax.swing.JPanel();
        lbSaldoInicial = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        pnSaldoPrevistoTexto = new javax.swing.JPanel();
        lbSaldoPrevisto = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        pnSaldoDespesasTexto = new javax.swing.JPanel();
        lbSaldoDespesas = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        btnVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
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
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnSuperiorLayout.setVerticalGroup(
            pnSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnSuperiorLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnData.setBackground(new java.awt.Color(204, 204, 204));
        pnData.setPreferredSize(new java.awt.Dimension(288, 60));

        jPanel7.setBackground(new java.awt.Color(204, 204, 204));
        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel7.setPreferredSize(new java.awt.Dimension(1072, 35));

        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1068, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 31, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pnData.add(jPanel7);

        pnTabela.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout abaLucrosLayout = new javax.swing.GroupLayout(abaLucros);
        abaLucros.setLayout(abaLucrosLayout);
        abaLucrosLayout.setHorizontalGroup(
            abaLucrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1379, Short.MAX_VALUE)
        );
        abaLucrosLayout.setVerticalGroup(
            abaLucrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 541, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Lucros", abaLucros);

        jPanel8.setToolTipText("");

        jLabel3.setText("Valor Despesa");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel3)
                .addGap(44, 44, 44)
                .addComponent(txtValorDespesa, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtValorDespesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap())
        );

        btCanselarDespesa.setText("Canselar Despesa");

        btAdicionarDespesa.setText("Adicionar Despesa");
        btAdicionarDespesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdicionarDespesaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(btAdicionarDespesa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(btCanselarDespesa, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btCanselarDespesa, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(btAdicionarDespesa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel4.setText("Descrição");

        txtDescDespesa.setColumns(20);
        txtDescDespesa.setRows(5);
        jScrollPane1.setViewportView(txtDescDespesa);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout abaCustosLayout = new javax.swing.GroupLayout(abaCustos);
        abaCustos.setLayout(abaCustosLayout);
        abaCustosLayout.setHorizontalGroup(
            abaCustosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaCustosLayout.createSequentialGroup()
                .addGroup(abaCustosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(abaCustosLayout.createSequentialGroup()
                        .addGap(455, 455, 455)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(abaCustosLayout.createSequentialGroup()
                        .addGap(483, 483, 483)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(abaCustosLayout.createSequentialGroup()
                        .addGap(489, 489, 489)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(528, Short.MAX_VALUE))
        );
        abaCustosLayout.setVerticalGroup(
            abaCustosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaCustosLayout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(230, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Custos", abaCustos);

        pnTabela.add(jTabbedPane1);

        pnSaldos.setBackground(new java.awt.Color(204, 204, 204));

        pnSaldoInicial.setBackground(new java.awt.Color(204, 204, 204));
        pnSaldoInicial.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnSaldoInicial.setPreferredSize(new java.awt.Dimension(278, 41));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel7.setText("Saldo Inicial: ");
        pnSaldoInicial.add(jLabel7);

        pnSaldos.add(pnSaldoInicial);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(110, 41));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );

        pnSaldos.add(jPanel1);

        pnSaldoPrevisto.setBackground(new java.awt.Color(204, 204, 204));
        pnSaldoPrevisto.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnSaldoPrevisto.setPreferredSize(new java.awt.Dimension(278, 41));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel6.setText("Saldo Previsto Locro: ");
        pnSaldoPrevisto.add(jLabel6);

        pnSaldos.add(pnSaldoPrevisto);

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setPreferredSize(new java.awt.Dimension(110, 41));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );

        pnSaldos.add(jPanel3);

        pnSaldoDespesas.setBackground(new java.awt.Color(204, 204, 204));
        pnSaldoDespesas.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnSaldoDespesas.setPreferredSize(new java.awt.Dimension(278, 41));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel8.setText("Despesas: ");
        pnSaldoDespesas.add(jLabel8);

        pnSaldos.add(pnSaldoDespesas);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        pnSaldoInicialTexto.setBackground(new java.awt.Color(204, 204, 204));
        pnSaldoInicialTexto.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnSaldoInicialTexto.setPreferredSize(new java.awt.Dimension(278, 60));

        lbSaldoInicial.setFont(new java.awt.Font("Tahoma", 0, 38)); // NOI18N
        lbSaldoInicial.setForeground(new java.awt.Color(51, 153, 0));
        lbSaldoInicial.setText("R$365,45");
        pnSaldoInicialTexto.add(lbSaldoInicial);

        jPanel2.add(pnSaldoInicialTexto);

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setPreferredSize(new java.awt.Dimension(110, 41));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel4);

        pnSaldoPrevistoTexto.setBackground(new java.awt.Color(204, 204, 204));
        pnSaldoPrevistoTexto.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnSaldoPrevistoTexto.setPreferredSize(new java.awt.Dimension(278, 60));

        lbSaldoPrevisto.setFont(new java.awt.Font("Tahoma", 0, 38)); // NOI18N
        lbSaldoPrevisto.setForeground(new java.awt.Color(255, 102, 0));
        lbSaldoPrevisto.setText("R$185,60");
        pnSaldoPrevistoTexto.add(lbSaldoPrevisto);

        jPanel2.add(pnSaldoPrevistoTexto);

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));
        jPanel5.setPreferredSize(new java.awt.Dimension(110, 41));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel5);

        pnSaldoDespesasTexto.setBackground(new java.awt.Color(204, 204, 204));
        pnSaldoDespesasTexto.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnSaldoDespesasTexto.setPreferredSize(new java.awt.Dimension(278, 60));

        lbSaldoDespesas.setFont(new java.awt.Font("Tahoma", 0, 38)); // NOI18N
        lbSaldoDespesas.setForeground(new java.awt.Color(255, 51, 51));
        lbSaldoDespesas.setText("R$185,60");
        pnSaldoDespesasTexto.add(lbSaldoDespesas);

        jPanel2.add(pnSaldoDespesasTexto);

        jPanel6.setBackground(new java.awt.Color(153, 153, 153));
        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnVoltar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnVoltar.setText("VOLTAR PARA TELA INICIAL");
        btnVoltar.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnVoltar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVoltarMouseClicked(evt);
            }
        });
        jPanel6.add(btnVoltar);

        javax.swing.GroupLayout pnPrincipalLayout = new javax.swing.GroupLayout(pnPrincipal);
        pnPrincipal.setLayout(pnPrincipalLayout);
        pnPrincipalLayout.setHorizontalGroup(
            pnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnSuperior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnTabela, javax.swing.GroupLayout.DEFAULT_SIZE, 1336, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnSaldos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnPrincipalLayout.setVerticalGroup(
            pnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnPrincipalLayout.createSequentialGroup()
                .addComponent(pnSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(pnData, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnSaldos, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnTabela, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(386, 386, 386))
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
            .addComponent(pnPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 717, Short.MAX_VALUE)
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
                this.dispose();
            } else if (opcao == JOptionPane.NO_OPTION) {
                this.setExtendedState(MAXIMIZED_BOTH);
            }
    }//GEN-LAST:event_btnVoltarMouseClicked

    private void btAdicionarDespesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdicionarDespesaActionPerformed
        vCarteira.setDescDespesa(txtDescDespesa.getText());
        vCarteira.setValorDespesa(Float.valueOf(txtValorDespesa.getText()));
        vCarteira.setDataAtual(getDateTime());
        if(vSerCarte.insertDespesa(vCarteira)){
          JOptionPane.showMessageDialog(null, "Despesa Inserida com Sucessso!");
          atualizaValores();
          limpaTela();
        }else{
          JOptionPane.showMessageDialog(null, "Erro ao Inserir Despesa!");  
        }
        
        
    }//GEN-LAST:event_btAdicionarDespesaActionPerformed
 
    private void limpaTela(){
        txtDescDespesa.setText(null);
        txtValorDespesa.setText(null);
    }
    private void atualizaValores(){
        vSerCarte.buscaValorInicial(vCarteira);
        vSerCarte.buscaValorDespesa(vCarteira);
        vSerCarte.buscaSaldoPrevisto(vCarteira);
        
        lbSaldoInicial.setText(vCarteira.getValorInicial());
        lbSaldoDespesas.setText(vCarteira.getValorTotalDespesa());
        lbSaldoPrevisto.setText(vCarteira.getValorSaldo());
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
    private javax.swing.JButton btAdicionarDespesa;
    private javax.swing.JButton btCanselarDespesa;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lbSaldoDespesas;
    private javax.swing.JLabel lbSaldoInicial;
    private javax.swing.JLabel lbSaldoPrevisto;
    private javax.swing.JPanel pnData;
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
    private javax.swing.JTextArea txtDescDespesa;
    private javax.swing.JTextField txtValorDespesa;
    // End of variables declaration//GEN-END:variables
}
