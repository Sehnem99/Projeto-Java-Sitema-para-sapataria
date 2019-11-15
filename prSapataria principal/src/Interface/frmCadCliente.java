/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;


import Classes.Cliente;
import Utilitarios.Utilitarios;
import db.ServicoCadCliente;
import db.ServicoConexao;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.TextField;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author fz474
 */
public class frmCadCliente extends javax.swing.JFrame {
    private ServicoCadCliente vServCadCliente = new ServicoCadCliente();
    private Cliente cliente = new Cliente();
    private Utilitarios utilitario = new Utilitarios();
    private ServicoConexao conexao = new ServicoConexao();

    /**
     * Creates new form frmCadastro
     */
    public frmCadCliente() {
        initComponents();
    }
    

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbCodCliente = new javax.swing.JLabel();
        txtCodCliente = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        lbCpf = new javax.swing.JLabel();
        txtCpf = new javax.swing.JTextField();
        try{
            javax.swing.text.MaskFormatter cpf= new javax.swing.text.MaskFormatter("###.###.###-##");
            txtCpf = new javax.swing.JFormattedTextField(cpf);
        }
        catch (Exception e){
        }
        lbValidaCPF = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lbNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        lbDataNasc = new javax.swing.JLabel();
        txtDataNasc = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        lbContato = new javax.swing.JLabel();
        txtContato = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        lbCep = new javax.swing.JLabel();
        txtCep = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        lbEndereco = new javax.swing.JLabel();
        txtLogradouro = new javax.swing.JTextField();
        lbNumero = new javax.swing.JLabel();
        txtNum = new javax.swing.JTextField();
        jPanel12 = new javax.swing.JPanel();
        lbBairro = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        lbCidade = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        lbEstado = new javax.swing.JLabel();
        txtEstado = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        btIncluir = new javax.swing.JButton();
        btAlterar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        btnVoltar = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        lbAtivo = new javax.swing.JLabel();
        cbAtivo = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lbCodCliente.setText("Código: ");
        jPanel1.add(lbCodCliente);

        txtCodCliente.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txtCodCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCodCliente.setEnabled(false);
        txtCodCliente.setMaximumSize(new java.awt.Dimension(5000, 30));
        txtCodCliente.setMinimumSize(new java.awt.Dimension(100, 30));
        txtCodCliente.setName(""); // NOI18N
        txtCodCliente.setPreferredSize(new java.awt.Dimension(100, 30));
        txtCodCliente.setRequestFocusEnabled(false);
        jPanel1.add(txtCodCliente);

        lbCpf.setText("CPF: ");
        jPanel2.add(lbCpf);

        txtCpf.setMaximumSize(new java.awt.Dimension(10000, 30));
        txtCpf.setMinimumSize(new java.awt.Dimension(300, 30));
        txtCpf.setPreferredSize(new java.awt.Dimension(370, 30));
        txtCpf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCpfKeyReleased(evt);
            }
        });
        jPanel2.add(txtCpf);
        jPanel2.add(lbValidaCPF);

        lbNome.setText("Nome Completo: ");
        jPanel3.add(lbNome);

        txtNome.setMaximumSize(new java.awt.Dimension(10000, 30));
        txtNome.setMinimumSize(new java.awt.Dimension(300, 30));
        txtNome.setPreferredSize(new java.awt.Dimension(300, 30));
        jPanel3.add(txtNome);

        lbDataNasc.setText("Data Nascimento");
        jPanel4.add(lbDataNasc);

        txtDataNasc.setPreferredSize(new java.awt.Dimension(150, 30));
        txtDataNasc.setRequestFocusEnabled(false);
        jPanel4.add(txtDataNasc);

        lbContato.setText("Contato");
        jPanel5.add(lbContato);

        txtContato.setPreferredSize(new java.awt.Dimension(265, 30));
        jPanel5.add(txtContato);

        lbCep.setText("CEP: ");
        jPanel6.add(lbCep);

        txtCep.setMaximumSize(new java.awt.Dimension(5000, 30));
        txtCep.setMinimumSize(new java.awt.Dimension(180, 30));
        txtCep.setPreferredSize(new java.awt.Dimension(200, 30));
        txtCep.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCepKeyReleased(evt);
            }
        });
        jPanel6.add(txtCep);

        lbEndereco.setText("Endereço: ");
        jPanel7.add(lbEndereco);

        txtLogradouro.setMaximumSize(new java.awt.Dimension(10000, 30));
        txtLogradouro.setMinimumSize(new java.awt.Dimension(300, 30));
        txtLogradouro.setName(""); // NOI18N
        txtLogradouro.setPreferredSize(new java.awt.Dimension(250, 30));
        jPanel7.add(txtLogradouro);

        lbNumero.setText("Nº: ");
        jPanel7.add(lbNumero);

        txtNum.setMaximumSize(new java.awt.Dimension(5000, 30));
        txtNum.setMinimumSize(new java.awt.Dimension(52, 30));
        txtNum.setPreferredSize(new java.awt.Dimension(52, 30));
        jPanel7.add(txtNum);

        lbBairro.setText("Bairro: ");
        jPanel12.add(lbBairro);

        txtBairro.setMaximumSize(new java.awt.Dimension(10000, 30));
        txtBairro.setMinimumSize(new java.awt.Dimension(300, 30));
        txtBairro.setPreferredSize(new java.awt.Dimension(180, 30));
        jPanel12.add(txtBairro);

        lbCidade.setText("Cidade: ");
        jPanel9.add(lbCidade);

        txtCidade.setMaximumSize(new java.awt.Dimension(10000, 30));
        txtCidade.setMinimumSize(new java.awt.Dimension(300, 30));
        txtCidade.setPreferredSize(new java.awt.Dimension(265, 30));
        jPanel9.add(txtCidade);

        lbEstado.setText("UF: ");
        jPanel9.add(lbEstado);

        txtEstado.setMaximumSize(new java.awt.Dimension(5000, 30));
        txtEstado.setMinimumSize(new java.awt.Dimension(58, 30));
        txtEstado.setPreferredSize(new java.awt.Dimension(50, 30));
        jPanel9.add(txtEstado);

        jPanel10.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        btIncluir.setText("Incluir");
        btIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btIncluirActionPerformed(evt);
            }
        });
        jPanel10.add(btIncluir);

        btAlterar.setText("Alterar");
        jPanel10.add(btAlterar);

        btExcluir.setText("Excluir");
        jPanel10.add(btExcluir);

        btnVoltar.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnVoltar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnVoltar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnVoltar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVoltarMouseClicked(evt);
            }
        });
        jPanel11.add(btnVoltar);

        lbAtivo.setText("Ativo");
        jPanel8.add(lbAtivo);

        cbAtivo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0 - Inativo", "1 - Ativo" }));
        cbAtivo.setSelectedIndex(-1);
        jPanel8.add(cbAtivo);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(86, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setExtendedState(MAXIMIZED_BOTH);
        
        jPanel11.setLayout(new GridBagLayout());
        jPanel10.setLayout(new GridBagLayout());
    }//GEN-LAST:event_formWindowOpened

    private void btnVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVoltarMouseClicked
        
        int opcao = JOptionPane.showConfirmDialog(null, "Deseja Realmente Fechar Esta Tela?", "Atenção", JOptionPane.YES_NO_OPTION);

            if (opcao == JOptionPane.YES_OPTION) {
               fecharTelaInicial();
               this.dispose();
            } else if (opcao == JOptionPane.NO_OPTION) {
               this.setExtendedState(MAXIMIZED_BOTH);
            }
    }//GEN-LAST:event_btnVoltarMouseClicked

    private void btIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btIncluirActionPerformed
       /*
        if (txtNome.getText().equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(null, "Entre com o nome do cliente!");
            txtNome.requestFocus();
            return;
        }
        if (txtCpf.getText().equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(null, "Entre com o CPF do cliente!");
            txtCpf.requestFocus();
            return;
        }
        if (isCPF(txtCpf.getText()) != true ) {
            JOptionPane.showMessageDialog(null, "Entre com o CPF valido!");
            txtCpf.requestFocus();
            return; 
        }
        if(txtDataNasc.getText().equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(null, "Entre com a data de nascimento do cliente!");
            txtDataNasc.requestFocus();
            return;
        }
         if(txtContato.getText().equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(null, "Entre com o contato cliente!");
            txtContato.requestFocus();
            return;
        }      
        if(txtCep.getText().equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(null, "Entre com algum CEP!");
            txtCep.requestFocus();
            return;
        }
        if(txtLogradouro.getText().equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(null, "Entre com a rua !");
            txtLogradouro.requestFocus();
            return;
        }
        if(txtNum.getText().equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(null, "Entre com o numero do endereço!");
            txtNum.requestFocus();
            return;
        }
        if(txtBairro.getText().equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(null, "Entre com o bairro!");
            txtBairro.requestFocus();
            return;
        }
        if(txtCidade.getText().equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(null, "Entre com a cidade!");
            txtCidade.requestFocus();
            return;
        }
        
        if(cbAtivo.getSelectedIndex() == -1){
            JOptionPane.showMessageDialog(null, "Selecione o codigo Ativo ou Inativo do Cliente");
            cbAtivo.requestFocus();
            return;  
        } else*/

            cliente.setNome(txtNome.getText());
            cliente.setCpf((txtCpf.getText()));
            cliente.setData_nasc(txtDataNasc.getText());
            cliente.setContato(txtContato.getText());
            cliente.setCep(utilitario.strToInt(txtCep.getText(),1));
            cliente.setLogradouro(txtLogradouro.getText());
            cliente.setNum(txtNum.getText());
            cliente.setBairro(txtBairro.getText());
            cliente.setCidade(txtCidade.getText());
            cliente.setUf(txtEstado.getText());
            cliente.setAtivo(cbAtivo.getSelectedIndex());
            
            try {
            if (vServCadCliente.insert(cliente)) {
                JOptionPane.showMessageDialog(null, "Cliente inserido com sucessso!");
                limpaTela();
            }else
                JOptionPane.showMessageDialog(null, "Houve um erro inesperado no cadastro!");

        } catch (SQLException ex) {
            Logger.getLogger(frmCadCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btIncluirActionPerformed

    private void txtCepKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCepKeyReleased
        txtLogradouro.setText("Aguarde...");
        if (txtCep.getText().length() == 8){
            buscarCep(txtCep.getText());
        }
    }//GEN-LAST:event_txtCepKeyReleased

    private void txtCpfKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCpfKeyReleased
        
        String cpfSemFormat="";
        
        if (txtCpf.getText().length() == 14){
            cpfSemFormat = utilitario.formatCPF(txtCpf.getText());
        }
        
        if (isCPF(cpfSemFormat) == true){
           lbValidaCPF.setText("CPF Valido");
           lbValidaCPF.setForeground(Color.GREEN);
        }
        else {
           lbValidaCPF.setText("Erro, CPF invalido !!!");
           lbValidaCPF.setForeground(Color.RED);
        }
    }//GEN-LAST:event_txtCpfKeyReleased
    
    public void abrirTelaInicial() {
        frmPrincipal principal = new frmPrincipal();
        
        principal.setVisible(true);
    }
    
    public void fecharTelaInicial() {
        frmPrincipal principal = new frmPrincipal();
        
        principal.dispose();
    }
    
    public void buscarCep(String cep) 
    {
        String json;        

        try {
            String logradouro;
            String bairro;
            String cidade;
            String uf;       
            URL url = new URL("http://viacep.com.br/ws/"+ cep +"/json");
            URLConnection urlConnection = url.openConnection();
            InputStream is = urlConnection.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));

            StringBuilder jsonSb = new StringBuilder();

            br.lines().forEach(l -> jsonSb.append(l.trim()));
            json = jsonSb.toString();
            
            // JOptionPane.showMessageDialog(null, json);
            
            json = json.replaceAll("[{},:]", "");
            json = json.replaceAll("\"", "\n");                       
            String array[] = new String[30];
            array = json.split("\n");
            
            // JOptionPane.showMessageDialog(null, array);
            
            
                             
            logradouro = array[7];            
            bairro = array[15];
            cidade = array[19]; 
            uf = array[23];
            
            txtLogradouro.setText(logradouro);
            txtBairro.setText(bairro);
            txtCidade.setText(cidade);
            txtEstado.setText(uf);
            //JOptionPane.showMessageDialog(null, logradouro + " " + bairro + " " + cidade + " " + uf);
            
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    public static boolean isCPF(String CPF) {
        // considera-se erro CPF's formados por uma sequencia de numeros iguais
        if (CPF.equals("00000000000") ||
            CPF.equals("11111111111") ||
            CPF.equals("22222222222") || CPF.equals("33333333333") ||
            CPF.equals("44444444444") || CPF.equals("55555555555") ||
            CPF.equals("66666666666") || CPF.equals("77777777777") ||
            CPF.equals("88888888888") || CPF.equals("99999999999") ||
            (CPF.length() != 11))
            return(false);
          
        char dig10, dig11;
        int sm, i, r, num, peso;
          
        // "try" - protege o codigo para eventuais erros de conversao de tipo (int)
        try {
        // Calculo do 1o. Digito Verificador
            sm = 0;
            peso = 10;
            for (i=0; i<9; i++) {              
        // converte o i-esimo caractere do CPF em um numero:
        // por exemplo, transforma o caractere '0' no inteiro 0         
        // (48 eh a posicao de '0' na tabela ASCII)         
            num = (int)(CPF.charAt(i) - 48); 
            sm = sm + (num * peso);
            peso = peso - 1;
            }
          
            r = 11 - (sm % 11);
            if ((r == 10) || (r == 11))
                dig10 = '0';
            else dig10 = (char)(r + 48); // converte no respectivo caractere numerico
          
        // Calculo do 2o. Digito Verificador
            sm = 0;
            peso = 11;
            for(i=0; i<10; i++) {
            num = (int)(CPF.charAt(i) - 48);
            sm = sm + (num * peso);
            peso = peso - 1;
            }
          
            r = 11 - (sm % 11);
            if ((r == 10) || (r == 11))
                 dig11 = '0';
            else dig11 = (char)(r + 48);
          
        // Verifica se os digitos calculados conferem com os digitos informados.
            if ((dig10 == CPF.charAt(9)) && (dig11 == CPF.charAt(10)))
                 return(true);
            else return(false);
                } catch (InputMismatchException erro) {
                return(false);
            }
        }

    private void limpaTela(){
        txtCpf.setText(null);
        txtNome.setText(null);
        txtContato.setText(null);
        txtDataNasc.setText(null);
        txtCep.setText(null);
        txtLogradouro.setText(null);
        txtNum.setText(null);
        txtBairro.setText(null);
        txtCidade.setText(null);
        txtEstado.setText(null);
        lbValidaCPF.setText(null);
        cbAtivo.setSelectedIndex(-1);
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
            java.util.logging.Logger.getLogger(frmCadCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCadCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCadCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCadCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new frmCadCliente().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btIncluir;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox<String> cbAtivo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel lbAtivo;
    private javax.swing.JLabel lbBairro;
    private javax.swing.JLabel lbCep;
    private javax.swing.JLabel lbCidade;
    private javax.swing.JLabel lbCodCliente;
    private javax.swing.JLabel lbContato;
    private javax.swing.JLabel lbCpf;
    private javax.swing.JLabel lbDataNasc;
    private javax.swing.JLabel lbEndereco;
    private javax.swing.JLabel lbEstado;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbNumero;
    private javax.swing.JLabel lbValidaCPF;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCep;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtCodCliente;
    private javax.swing.JTextField txtContato;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtDataNasc;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtLogradouro;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNum;
    // End of variables declaration//GEN-END:variables
}
