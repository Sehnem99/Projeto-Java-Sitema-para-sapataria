
package Interface;

import Classes.Cliente;
import Classes.CorSapato;
import Classes.Sapato;
import Classes.TipoSapato;
import Classes.Venda;
import Utilitarios.Utilitarios;
import db.ServicoCadCliente;
import db.ServicoDAO;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class frmServico extends javax.swing.JFrame {
    private ServicoCadCliente vServCadCliente = new ServicoCadCliente();
    private Cliente cliente = new Cliente();
    private Sapato sapato = new Sapato();
    private TipoSapato tpSapato = new TipoSapato();
    private CorSapato corSapato = new CorSapato();
    private Venda venda = new Venda();
    private float vValorToal =0;
    List<TipoSapato> tipoSapatos;
    ServicoDAO servicoDAO = new ServicoDAO();
    Utilitarios util = new Utilitarios();
    
    public frmServico() {
        initComponents();
   
        for(TipoSapato tp:servicoDAO.readTipoSapato()){
             cbTipoSapato.addItem(tp);
        }
        for(CorSapato cp:servicoDAO.readCorSapato()){
            cbCorSapato.addItem(cp);
        }
        cbTipoSapato.setSelectedIndex(-1);
        cbCorSapato.setSelectedIndex(-1);
        txtDataEntrada.setText(getDateTime());     
        
    }
    
    private String getDateTime() {
    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    Date date = new Date();
    return dateFormat.format(date);
}

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnPrincipal = new javax.swing.JPanel();
        pnSuperior = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        pnCpf = new javax.swing.JPanel();
        lbCpf = new javax.swing.JLabel();
        txtCpf = new javax.swing.JFormattedTextField();
        pnNome = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNomeCliente = new javax.swing.JTextField();
        pnData = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtDataEntrada = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDataSaida = new javax.swing.JFormattedTextField();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        abaCadastro = new javax.swing.JPanel();
        pnDadosProduto = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        pnCodigo = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        txtCodSapato = new javax.swing.JTextField();
        pnTipoCalcado = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        cbTipoSapato = new javax.swing.JComboBox<>();
        pnNumeroCor = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtNumSapato = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cbCorSapato = new javax.swing.JComboBox<>();
        pnMarca = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        pnMarca1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtConserto = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        txtValorSapato = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        txtAltProduto = new javax.swing.JButton();
        txtAdcProduto = new javax.swing.JButton();
        txtExcluirProduto = new javax.swing.JButton();
        abaConsulta = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblSapatos = new javax.swing.JTable();
        pnInferior = new javax.swing.JPanel();
        btnVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        pnPrincipal.setBackground(new java.awt.Color(204, 204, 204));

        pnSuperior.setBackground(new java.awt.Color(153, 153, 153));
        pnSuperior.setPreferredSize(new java.awt.Dimension(863, 54));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("CADASTRO DE SERVIÇOS");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnSuperiorLayout = new javax.swing.GroupLayout(pnSuperior);
        pnSuperior.setLayout(pnSuperiorLayout);
        pnSuperiorLayout.setHorizontalGroup(
            pnSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnSuperiorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1443, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(198, 198, 198))
        );
        pnSuperiorLayout.setVerticalGroup(
            pnSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnSuperiorLayout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
        );

        pnCpf.setBackground(new java.awt.Color(204, 204, 204));

        lbCpf.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lbCpf.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbCpf.setText("CPF: ");
        lbCpf.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnCpf.add(lbCpf);

        try {
            txtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCpf.setPreferredSize(new java.awt.Dimension(380, 30));
        txtCpf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCpfKeyPressed(evt);
            }
        });
        pnCpf.add(txtCpf);

        pnNome.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Nome: ");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnNome.add(jLabel1);

        txtNomeCliente.setName(""); // NOI18N
        txtNomeCliente.setPreferredSize(new java.awt.Dimension(350, 30));
        pnNome.add(txtNomeCliente);

        pnData.setBackground(new java.awt.Color(204, 204, 204));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setText("Data Entrada: ");
        pnData.add(jLabel3);

        try {
            txtDataEntrada.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDataEntrada.setPreferredSize(new java.awt.Dimension(107, 30));
        pnData.add(txtDataEntrada);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel4.setText("Data Saída: ");
        pnData.add(jLabel4);

        try {
            txtDataSaida.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDataSaida.setPreferredSize(new java.awt.Dimension(108, 30));
        pnData.add(txtDataSaida);

        jTabbedPane1.setBackground(new java.awt.Color(204, 204, 204));
        jTabbedPane1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTabbedPane1.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);

        abaCadastro.setBackground(new java.awt.Color(204, 204, 204));
        abaCadastro.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        abaCadastro.setMaximumSize(new java.awt.Dimension(31000, 3100));
        abaCadastro.setPreferredSize(new java.awt.Dimension(1100, 678));

        pnDadosProduto.setBackground(new java.awt.Color(204, 204, 204));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Dados do(s) Produto(s):");

        javax.swing.GroupLayout pnDadosProdutoLayout = new javax.swing.GroupLayout(pnDadosProduto);
        pnDadosProduto.setLayout(pnDadosProdutoLayout);
        pnDadosProdutoLayout.setHorizontalGroup(
            pnDadosProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnDadosProdutoLayout.setVerticalGroup(
            pnDadosProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDadosProdutoLayout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnCodigo.setBackground(new java.awt.Color(204, 204, 204));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel11.setText("Código: ");
        pnCodigo.add(jLabel11);

        txtCodSapato.setEnabled(false);
        txtCodSapato.setPreferredSize(new java.awt.Dimension(357, 30));
        pnCodigo.add(txtCodSapato);

        pnTipoCalcado.setBackground(new java.awt.Color(204, 204, 204));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel6.setText("Tipo do Calçado: ");
        pnTipoCalcado.add(jLabel6);

        cbTipoSapato.setToolTipText("");
        cbTipoSapato.setPreferredSize(new java.awt.Dimension(290, 30));
        pnTipoCalcado.add(cbTipoSapato);

        pnNumeroCor.setBackground(new java.awt.Color(204, 204, 204));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel7.setText("Número: ");
        pnNumeroCor.add(jLabel7);

        txtNumSapato.setPreferredSize(new java.awt.Dimension(142, 30));
        pnNumeroCor.add(txtNumSapato);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel8.setText("Cor: ");
        pnNumeroCor.add(jLabel8);

        cbCorSapato.setSelectedIndex(-1);
        cbCorSapato.setPreferredSize(new java.awt.Dimension(160, 30));
        pnNumeroCor.add(cbCorSapato);

        pnMarca.setBackground(new java.awt.Color(204, 204, 204));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel9.setText("Marca: ");
        pnMarca.add(jLabel9);

        txtMarca.setPreferredSize(new java.awt.Dimension(363, 30));
        pnMarca.add(txtMarca);

        pnMarca1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel10.setText("Conserto(s): ");
        jLabel10.setToolTipText("");
        jLabel10.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel10.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        pnMarca1.add(jLabel10);

        txtConserto.setColumns(28);
        txtConserto.setRows(5);
        jScrollPane1.setViewportView(txtConserto);

        pnMarca1.add(jScrollPane1);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel12.setText("Valor do Conserto: ");
        jPanel2.add(jLabel12);

        txtValorSapato.setPreferredSize(new java.awt.Dimension(280, 30));
        jPanel2.add(txtValorSapato);

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        txtAltProduto.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtAltProduto.setText("Alterar Produto");
        txtAltProduto.setPreferredSize(new java.awt.Dimension(230, 40));
        txtAltProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAltProdutoActionPerformed(evt);
            }
        });

        txtAdcProduto.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtAdcProduto.setText("Adicionar Produto");
        txtAdcProduto.setPreferredSize(new java.awt.Dimension(230, 40));
        txtAdcProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAdcProdutoActionPerformed(evt);
            }
        });

        txtExcluirProduto.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtExcluirProduto.setText("Excluir Produto");
        txtExcluirProduto.setPreferredSize(new java.awt.Dimension(230, 40));
        txtExcluirProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtExcluirProdutoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(txtAdcProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtAltProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtExcluirProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 16, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAdcProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAltProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtExcluirProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout abaCadastroLayout = new javax.swing.GroupLayout(abaCadastro);
        abaCadastro.setLayout(abaCadastroLayout);
        abaCadastroLayout.setHorizontalGroup(
            abaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaCadastroLayout.createSequentialGroup()
                .addGap(561, 561, 561)
                .addGroup(abaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(abaCadastroLayout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addGroup(abaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pnMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, abaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addComponent(pnNumeroCor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(abaCadastroLayout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addGroup(abaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(abaCadastroLayout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(pnDadosProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(pnCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(abaCadastroLayout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(pnTipoCalcado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(abaCadastroLayout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(pnMarca1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(563, Short.MAX_VALUE))
        );
        abaCadastroLayout.setVerticalGroup(
            abaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaCadastroLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(pnDadosProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnTipoCalcado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnNumeroCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnMarca1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Cadastro", null, abaCadastro, "");

        abaConsulta.setBackground(new java.awt.Color(204, 204, 204));

        tblSapatos.setAutoCreateRowSorter(true);
        tblSapatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Tipo Calçado", "Marca", "Cor", "Tamanho", "Conserto(s)", "Valor do Conserto"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblSapatos.setToolTipText("");
        tblSapatos.setGridColor(new java.awt.Color(0, 0, 0));
        tblSapatos.setSelectionForeground(new java.awt.Color(153, 153, 153));
        tblSapatos.setUpdateSelectionOnSort(false);
        tblSapatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSapatosMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblSapatos);

        javax.swing.GroupLayout abaConsultaLayout = new javax.swing.GroupLayout(abaConsulta);
        abaConsulta.setLayout(abaConsultaLayout);
        abaConsultaLayout.setHorizontalGroup(
            abaConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1886, Short.MAX_VALUE)
        );
        abaConsultaLayout.setVerticalGroup(
            abaConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 594, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Consulta", abaConsulta);

        pnInferior.setBackground(new java.awt.Color(153, 153, 153));
        pnInferior.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnInferior.setAlignmentX(0.0F);

        btnVoltar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnVoltar.setText("VOLTAR PARA TELA INICIAL");
        btnVoltar.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnVoltar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVoltarMouseClicked(evt);
            }
        });
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnInferiorLayout = new javax.swing.GroupLayout(pnInferior);
        pnInferior.setLayout(pnInferiorLayout);
        pnInferiorLayout.setHorizontalGroup(
            pnInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnInferiorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnInferiorLayout.setVerticalGroup(
            pnInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnInferiorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnPrincipalLayout = new javax.swing.GroupLayout(pnPrincipal);
        pnPrincipal.setLayout(pnPrincipalLayout);
        pnPrincipalLayout.setHorizontalGroup(
            pnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPrincipalLayout.createSequentialGroup()
                .addGroup(pnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnSuperior, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1895, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnPrincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnCpf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnNome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnInferior, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        pnPrincipalLayout.setVerticalGroup(
            pnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPrincipalLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(pnSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(pnNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 626, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnInferior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(768, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(pnPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVoltarMouseClicked

        int opcao = JOptionPane.showConfirmDialog(null, "Deseja Realmente Fechar Esta Tela?", "Atenção", JOptionPane.YES_NO_OPTION);

        if (opcao == JOptionPane.YES_OPTION) {
            fecharTelaServico();
            this.dispose();
        } else if (opcao == JOptionPane.NO_OPTION) {
            this.setExtendedState(MAXIMIZED_BOTH);
        }
    }//GEN-LAST:event_btnVoltarMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setExtendedState(MAXIMIZED_BOTH);
        
    }//GEN-LAST:event_formWindowOpened

    private void txtAdcProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAdcProdutoActionPerformed
        if(txtDataEntrada.getText().equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(null, "Entre com a data de entrada.");
            txtDataEntrada.requestFocus();  
        }
        
        if(cbTipoSapato.getSelectedIndex() == -1){
            JOptionPane.showMessageDialog(null, "Selecione o tipo do calçado");
            cbTipoSapato.requestFocus();
            return;
        }
        if(txtNumSapato.getText().equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(null, "Entre com algum numero para o calçado");
            txtNumSapato.requestFocus();
            return; 
        }
        if(cbCorSapato.getSelectedIndex() == -1){
            JOptionPane.showMessageDialog(null, "Selecione a cor do calçado");
            cbCorSapato.requestFocus();
            return;
        }
        if(txtConserto.getText().equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(null, "Entre com algum serviço");
            txtConserto.requestFocus();
            return;
        }
        if(txtValorSapato.getText().equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(null, "Entre com algum valor do serviço");
            txtValorSapato.requestFocus();
            return;
        }
        
        
        TipoSapato tipoSapato = (TipoSapato) cbTipoSapato.getSelectedItem();
        
        CorSapato cor_Sapato = (CorSapato) cbCorSapato.getSelectedItem();
        
        sapato.setCodTipoSapato(tipoSapato.getCodTipoSapato());
        sapato.setCodCorSapato(cor_Sapato.getCodCorSapato());
        sapato.setConserto(txtConserto.getText());
        sapato.setMarca(txtMarca.getText());
        sapato.setNumSapato(Integer.parseInt(txtNumSapato.getText()));
        sapato.setValor(Float.parseFloat(txtValorSapato.getText()));
        
        
        if(servicoDAO.insertSapato(sapato)){
            JOptionPane.showMessageDialog(null, "Sapato Inserido Com Sucessso!");
            limpaTela();
            readJTable();
            
        }else{
            JOptionPane.showMessageDialog(null, "Houve um Erro Inesperado No Cadastro!");
        }  
    }//GEN-LAST:event_txtAdcProdutoActionPerformed

    private void limpaTela(){
        txtCodSapato.setText(null);
        txtConserto.setText(null);
        txtNumSapato.setText(null);
        txtMarca.setText(null);
        txtValorSapato.setText(null);
        cbCorSapato.setSelectedIndex(-1);
        cbTipoSapato.setSelectedIndex(-1);
    }
    
    public void readJTable() {
        DefaultTableModel modelo = (DefaultTableModel) tblSapatos.getModel();
        modelo.setNumRows(0);
        
        for(Sapato tp:servicoDAO.readSapato(sapato.getCodCliente())){
             modelo.addRow(new Object[]{
                tp.getCodSapato(),
                tp.getTipoSapato(),
                tp.getMarca(),
                tp.getCorSapato(),
                tp.getNumSapato(),
                tp.getConserto(),
                tp.getValorFormat()
            });
        }
    }
        
    private void txtCpfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCpfKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
        cliente.setCpf(txtCpf.getText());
        try {
                if (vServCadCliente.consultaCliente(cliente)){
                txtNomeCliente.setText(cliente.getNome());
                sapato.setCodCliente(cliente.getCodigo());
                readJTable();
                }else {
                    JOptionPane.showMessageDialog(null, "Cliente não encontrado!");
                  
                }
            } catch (SQLException ex) {
                Logger.getLogger(frmCadCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 
    }//GEN-LAST:event_txtCpfKeyPressed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void tblSapatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSapatosMouseClicked
        sapato.setCodSapato(
               Integer.parseInt(String.valueOf(tblSapatos.getModel().getValueAt(tblSapatos.getSelectedRow(),0))));
        servicoDAO.buscaSapato(sapato);
        txtCodSapato.setText(String.valueOf(sapato.getCodSapato()));
   
        cbTipoSapato.setSelectedItem(sapato.getCodTipoSapato());
        cbCorSapato.setSelectedItem(sapato.getCodCorSapato());
        
        txtNumSapato.setText(String.valueOf(sapato.getNumSapato()));
        txtMarca.setText(sapato.getMarca());
        txtConserto.setText(sapato.getConserto());
        txtValorSapato.setText(String.valueOf(sapato.getValor()));     
    }//GEN-LAST:event_tblSapatosMouseClicked

    private void txtAltProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAltProdutoActionPerformed
        TipoSapato tipoSapato = (TipoSapato) cbTipoSapato.getSelectedItem();
        
        CorSapato cor_Sapato = (CorSapato) cbCorSapato.getSelectedItem();
        
        sapato.setCodTipoSapato(tipoSapato.getCodTipoSapato());
        sapato.setCodCorSapato(cor_Sapato.getCodCorSapato());
        sapato.setConserto(txtConserto.getText());
        sapato.setMarca(txtMarca.getText());
        sapato.setNumSapato(Integer.parseInt(txtNumSapato.getText()));
        sapato.setValor(Float.parseFloat(txtValorSapato.getText()));        
        
        servicoDAO.updateSapato(sapato);
        
        if(servicoDAO.updateSapato(sapato)){
            JOptionPane.showMessageDialog(null, "Sapato Atualizado Com Sucesso!");
            limpaTela();
            readJTable();
        }else{
            JOptionPane.showMessageDialog(null, "Erro ao Atualizar");
        }  
    }//GEN-LAST:event_txtAltProdutoActionPerformed

    private void txtExcluirProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtExcluirProdutoActionPerformed
        if(servicoDAO.deleteSapato(sapato)){
            JOptionPane.showMessageDialog(null, "Sapato Excluido Com Sucesso!");
            limpaTela();
            readJTable();
        }else{
            JOptionPane.showMessageDialog(null, "Erro ao Excluir Sapato");
        }  
    }//GEN-LAST:event_txtExcluirProdutoActionPerformed
    
    public void fecharTelaServico() {
        frmServico servico = new frmServico();
        
        servico.dispose();
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
            java.util.logging.Logger.getLogger(frmServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new frmServico().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel abaCadastro;
    private javax.swing.JPanel abaConsulta;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox<Object> cbCorSapato;
    private javax.swing.JComboBox<Object> cbTipoSapato;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lbCpf;
    private javax.swing.JPanel pnCodigo;
    private javax.swing.JPanel pnCpf;
    private javax.swing.JPanel pnDadosProduto;
    private javax.swing.JPanel pnData;
    private javax.swing.JPanel pnInferior;
    private javax.swing.JPanel pnMarca;
    private javax.swing.JPanel pnMarca1;
    private javax.swing.JPanel pnNome;
    private javax.swing.JPanel pnNumeroCor;
    private javax.swing.JPanel pnPrincipal;
    private javax.swing.JPanel pnSuperior;
    private javax.swing.JPanel pnTipoCalcado;
    private javax.swing.JTable tblSapatos;
    private javax.swing.JButton txtAdcProduto;
    private javax.swing.JButton txtAltProduto;
    private javax.swing.JTextField txtCodSapato;
    private javax.swing.JTextArea txtConserto;
    private javax.swing.JFormattedTextField txtCpf;
    private javax.swing.JFormattedTextField txtDataEntrada;
    private javax.swing.JFormattedTextField txtDataSaida;
    private javax.swing.JButton txtExcluirProduto;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtNomeCliente;
    private javax.swing.JTextField txtNumSapato;
    private javax.swing.JTextField txtValorSapato;
    // End of variables declaration//GEN-END:variables
}
