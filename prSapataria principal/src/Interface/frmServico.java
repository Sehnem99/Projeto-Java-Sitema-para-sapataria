
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
    private float vValorToal = 0;
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
        carregaSevAFazer();
    }
    
    public void carregaSevAFazer(){
        DefaultTableModel modelo = (DefaultTableModel) tblSevFazer.getModel();
        modelo.setNumRows(0);        
        for(Sapato tp:servicoDAO.readSevPendentes()){
             modelo.addRow(new Object[]{
                tp.getCodCliente(),
                tp.getNomeCliente(),
                tp.getTipoSapato(),
                tp.getMarca(),
                tp.getCorSapato(),
                tp.getNumSapato(),
                tp.getConserto(),
                tp.getDataEntrada(),
                tp.getValorFormat()
            });
        }        
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
        jTabbedPane1 = new javax.swing.JTabbedPane();
        abaSevFazer = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblSevFazer = new javax.swing.JTable();
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
        jLabel13 = new javax.swing.JLabel();
        txtDataPag = new javax.swing.JFormattedTextField();
        jLabel12 = new javax.swing.JLabel();
        txtValorSapato = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        txtAltProduto = new javax.swing.JButton();
        txtAdcProduto = new javax.swing.JButton();
        txtExcluirProduto = new javax.swing.JButton();
        pnData = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtDataEntrada = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDataSaida = new javax.swing.JFormattedTextField();
        abaConsulta = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblSapatos = new javax.swing.JTable();
        pnInferior = new javax.swing.JPanel();
        btnVoltar = new javax.swing.JButton();
        pnCpf1 = new javax.swing.JPanel();
        lbCodCliente = new javax.swing.JLabel();
        txtCodCliente = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro / Consulta de Serviços");
        setPreferredSize(new java.awt.Dimension(1213, 711));
        setType(java.awt.Window.Type.UTILITY);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        pnPrincipal.setBackground(new java.awt.Color(204, 204, 204));
        pnPrincipal.setPreferredSize(new java.awt.Dimension(1213, 711));
        pnPrincipal.setRequestFocusEnabled(false);

        pnSuperior.setBackground(new java.awt.Color(153, 153, 153));
        pnSuperior.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnSuperior.setPreferredSize(new java.awt.Dimension(587, 54));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("CADASTRO DE SERVIÇOS");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnSuperiorLayout = new javax.swing.GroupLayout(pnSuperior);
        pnSuperior.setLayout(pnSuperiorLayout);
        pnSuperiorLayout.setHorizontalGroup(
            pnSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnSuperiorLayout.createSequentialGroup()
                .addGap(550, 550, 550)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnSuperiorLayout.setVerticalGroup(
            pnSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnSuperiorLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel2))
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

        jTabbedPane1.setBackground(new java.awt.Color(204, 204, 204));
        jTabbedPane1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTabbedPane1.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        jTabbedPane1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTabbedPane1AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        abaSevFazer.setBackground(new java.awt.Color(204, 204, 204));

        tblSevFazer.setAutoCreateRowSorter(true);
        tblSevFazer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Código Cliente", "Nome Cliente", "Tipo Calçado", "Marca", "Cor", "Tamanho", "Conserto(s)", "Data Entrada", "Valor do Conserto"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblSevFazer.setToolTipText("");
        tblSevFazer.setGridColor(new java.awt.Color(0, 0, 0));
        tblSevFazer.setSelectionForeground(new java.awt.Color(153, 153, 153));
        tblSevFazer.setUpdateSelectionOnSort(false);
        tblSevFazer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSevFazerMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tblSevFazer);

        javax.swing.GroupLayout abaSevFazerLayout = new javax.swing.GroupLayout(abaSevFazer);
        abaSevFazer.setLayout(abaSevFazerLayout);
        abaSevFazerLayout.setHorizontalGroup(
            abaSevFazerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 1484, Short.MAX_VALUE)
        );
        abaSevFazerLayout.setVerticalGroup(
            abaSevFazerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 485, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("A Fazer", abaSevFazer);

        abaCadastro.setBackground(new java.awt.Color(204, 204, 204));
        abaCadastro.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        abaCadastro.setMaximumSize(new java.awt.Dimension(31000, 3100));
        abaCadastro.setPreferredSize(new java.awt.Dimension(1100, 678));
        abaCadastro.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                abaCadastroComponentShown(evt);
            }
        });

        pnDadosProduto.setBackground(new java.awt.Color(204, 204, 204));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Dados do(s) Produto(s):");
        pnDadosProduto.add(jLabel5);

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

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel13.setText("Data do pagamento: ");
        jPanel2.add(jLabel13);

        try {
            txtDataPag.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDataPag.setPreferredSize(new java.awt.Dimension(107, 30));
        jPanel2.add(txtDataPag);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel12.setText("Valor do Conserto: ");
        jPanel2.add(jLabel12);

        txtValorSapato.setMinimumSize(new java.awt.Dimension(6, 10));
        txtValorSapato.setPreferredSize(new java.awt.Dimension(180, 30));
        jPanel2.add(txtValorSapato);

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        txtAltProduto.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtAltProduto.setText("Alterar Produto");
        txtAltProduto.setPreferredSize(new java.awt.Dimension(160, 30));
        txtAltProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAltProdutoActionPerformed(evt);
            }
        });
        jPanel3.add(txtAltProduto);

        txtAdcProduto.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtAdcProduto.setText("Adicionar Produto");
        txtAdcProduto.setPreferredSize(new java.awt.Dimension(160, 30));
        txtAdcProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAdcProdutoActionPerformed(evt);
            }
        });
        jPanel3.add(txtAdcProduto);

        txtExcluirProduto.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtExcluirProduto.setText("Excluir Produto");
        txtExcluirProduto.setPreferredSize(new java.awt.Dimension(160, 30));
        txtExcluirProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtExcluirProdutoActionPerformed(evt);
            }
        });
        jPanel3.add(txtExcluirProduto);

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

        javax.swing.GroupLayout abaCadastroLayout = new javax.swing.GroupLayout(abaCadastro);
        abaCadastro.setLayout(abaCadastroLayout);
        abaCadastroLayout.setHorizontalGroup(
            abaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaCadastroLayout.createSequentialGroup()
                .addGroup(abaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 1480, Short.MAX_VALUE)
                    .addComponent(pnMarca1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnMarca, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnNumeroCor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnTipoCalcado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnData, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnCodigo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnDadosProduto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        abaCadastroLayout.setVerticalGroup(
            abaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnDadosProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnData, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnTipoCalcado, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnNumeroCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnMarca1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Cadastro", null, abaCadastro, "");

        abaConsulta.setBackground(new java.awt.Color(204, 204, 204));

        tblSapatos.setAutoCreateRowSorter(true);
        tblSapatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Tipo Calçado", "Marca", "Cor", "Tamanho", "Conserto(s)", "Data Entrada", "Data Saida", "Valor do Conserto"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
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
        if (tblSapatos.getColumnModel().getColumnCount() > 0) {
            tblSapatos.getColumnModel().getColumn(7).setResizable(false);
            tblSapatos.getColumnModel().getColumn(7).setHeaderValue("Data Saida");
        }

        javax.swing.GroupLayout abaConsultaLayout = new javax.swing.GroupLayout(abaConsulta);
        abaConsulta.setLayout(abaConsultaLayout);
        abaConsultaLayout.setHorizontalGroup(
            abaConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1484, Short.MAX_VALUE)
        );
        abaConsultaLayout.setVerticalGroup(
            abaConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 485, Short.MAX_VALUE)
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
        pnInferior.add(btnVoltar);

        pnCpf1.setBackground(new java.awt.Color(204, 204, 204));

        lbCodCliente.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lbCodCliente.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbCodCliente.setText("Codigo: ");
        lbCodCliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnCpf1.add(lbCodCliente);

        txtCodCliente.setPreferredSize(new java.awt.Dimension(180, 30));
        pnCpf1.add(txtCodCliente);

        javax.swing.GroupLayout pnPrincipalLayout = new javax.swing.GroupLayout(pnPrincipal);
        pnPrincipal.setLayout(pnPrincipalLayout);
        pnPrincipalLayout.setHorizontalGroup(
            pnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPrincipalLayout.createSequentialGroup()
                .addGroup(pnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(pnNome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnCpf, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 1488, Short.MAX_VALUE)
                        .addComponent(pnCpf1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jTabbedPane1)
                    .addComponent(pnInferior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnSuperior, javax.swing.GroupLayout.DEFAULT_SIZE, 1493, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnPrincipalLayout.setVerticalGroup(
            pnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPrincipalLayout.createSequentialGroup()
                .addComponent(pnSuperior, 46, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnCpf1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnNome, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnInferior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnSuperior.getAccessibleContext().setAccessibleParent(pnSuperior);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 1493, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 751, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVoltarMouseClicked

        int opcao = JOptionPane.showConfirmDialog(null, "Deseja Realmente Fechar Esta Tela?", "Atenção", JOptionPane.YES_NO_OPTION);

        if (opcao == JOptionPane.YES_OPTION) {
            this.dispose();
        } else if (opcao == JOptionPane.NO_OPTION) {
            this.setExtendedState(MAXIMIZED_BOTH);
        }
    }//GEN-LAST:event_btnVoltarMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setExtendedState(MAXIMIZED_BOTH);        
    }//GEN-LAST:event_formWindowOpened

    private void limpaTelaCadSapato(){
        txtCodSapato.setText(null);
        txtConserto.setText(null);
        txtNumSapato.setText(null);
        txtMarca.setText(null);
        txtValorSapato.setText(null);
        cbCorSapato.setSelectedIndex(-1);
        cbTipoSapato.setSelectedIndex(-1);
        txtDataEntrada.setText(getDateTime()); 
        txtDataSaida.setText(null);
    }
    
    public void carregaSapatosCliente() {
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
                tp.getDataEntrada(),
                tp.getDataSaida(),
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
                txtCodCliente.setText(String.valueOf(cliente.getCodigo()));
                sapato.setCodCliente(cliente.getCodigo());
                carregaSapatosCliente();
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
        cbTipoSapatoselectedIndex(sapato.getCodTipoSapato());
        cbCorSapatoselectedIndex(sapato.getCodCorSapato());
        txtNumSapato.setText(String.valueOf(sapato.getNumSapato()));
        txtMarca.setText(sapato.getMarca());
        txtConserto.setText(sapato.getConserto());
        txtDataEntrada.setText(sapato.getDataEntrada());
        txtDataSaida.setText(sapato.getDataSaida());
        txtValorSapato.setText(String.valueOf(sapato.getValor()));     
    }//GEN-LAST:event_tblSapatosMouseClicked

    private void tblSevFazerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSevFazerMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblSevFazerMouseClicked

    private void jTabbedPane1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTabbedPane1AncestorAdded
        
    }//GEN-LAST:event_jTabbedPane1AncestorAdded

    private void abaCadastroComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_abaCadastroComponentShown
        txtDataEntrada.setText(getDateTime());
    }//GEN-LAST:event_abaCadastroComponentShown

    private void txtExcluirProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtExcluirProdutoActionPerformed
        if(servicoDAO.deleteSapato(sapato)){
            JOptionPane.showMessageDialog(null, "Sapato Excluido Com Sucesso!");

        }else{
            JOptionPane.showMessageDialog(null, "Erro ao Excluir Sapato");
        }
        limpaTelaCadSapato();
        carregaSapatosCliente();
        carregaSevAFazer();
    }//GEN-LAST:event_txtExcluirProdutoActionPerformed

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
        sapato.setDataEntrada(txtDataEntrada.getText());
        sapato.setDataSaida(txtDataSaida.getText());
        sapato.setConserto(txtConserto.getText());
        sapato.setMarca(txtMarca.getText());
        sapato.setNumSapato(Integer.parseInt(txtNumSapato.getText()));
        sapato.setValor(Float.parseFloat(txtValorSapato.getText()));

        venda.setData_pagamento(txtDataPag.getText());
        venda.setValorFinal(sapato.getValor());

        if(txtDataSaida.getText().equalsIgnoreCase("  /  /    ")){
            if(servicoDAO.insertSapatoSemDataFim(sapato)){
                servicoDAO.buscaUltimoCodSapato(venda);
                JOptionPane.showMessageDialog(null, "Sapato Inserido Com Sucessso!");
            }else{
                JOptionPane.showMessageDialog(null, "Houve um Erro Inesperado No Cadastro!");
            }
        }else{
            if(servicoDAO.insertSapato(sapato)){
                servicoDAO.buscaUltimoCodSapato(venda);
                JOptionPane.showMessageDialog(null, "Sapato Inserido Com Sucessso!");
            }else{
                JOptionPane.showMessageDialog(null, "Houve um Erro Inesperado No Cadastro!");
            }
        }
        if(txtDataPag.getText().equalsIgnoreCase("  /  /    ")){
            servicoDAO.insertVendaSemData(venda);
        }else{
            servicoDAO.insertVendaComData(venda);
        }

        limpaTelaCadSapato();
        carregaSapatosCliente();
        carregaSevAFazer();
    }//GEN-LAST:event_txtAdcProdutoActionPerformed

    private void txtAltProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAltProdutoActionPerformed
        TipoSapato tipoSapato = (TipoSapato) cbTipoSapato.getSelectedItem();

        CorSapato cor_Sapato = (CorSapato) cbCorSapato.getSelectedItem();

        sapato.setCodTipoSapato(tipoSapato.getCodTipoSapato());
        sapato.setCodCorSapato(cor_Sapato.getCodCorSapato());
        sapato.setDataEntrada(txtDataEntrada.getText());
        sapato.setDataSaida(txtDataSaida.getText());
        sapato.setConserto(txtConserto.getText());
        sapato.setMarca(txtMarca.getText());
        sapato.setNumSapato(Integer.parseInt(txtNumSapato.getText()));
        sapato.setValor(Float.parseFloat(txtValorSapato.getText()));

        if(txtDataSaida.getText().equalsIgnoreCase("  /  /    ")){
            if(servicoDAO.updateSapatoSemDataFim(sapato)){
                JOptionPane.showMessageDialog(null, "Sapato Atualizado Com Sucesso!");
            }else{
                JOptionPane.showMessageDialog(null, "Erro ao Atualizar");
            }
        }else{
            if(servicoDAO.updateSapato(sapato)){
                JOptionPane.showMessageDialog(null, "Sapato Atualizado Com Sucesso!");
            }else{
                JOptionPane.showMessageDialog(null, "Erro ao Atualizar");
            }
        }
        limpaTelaCadSapato();
        carregaSapatosCliente();
        carregaSevAFazer();
    }//GEN-LAST:event_txtAltProdutoActionPerformed
    
    public void cbTipoSapatoselectedIndex(Integer codTipoSapato){
        switch (codTipoSapato) {
             case 1:cbTipoSapato.setSelectedIndex(0);
                    break;
             case 2:cbTipoSapato.setSelectedIndex(1);
                    break;
             case 3:cbTipoSapato.setSelectedIndex(2);
                    break;
             case 4:cbTipoSapato.setSelectedIndex(3);
                    break;
             case 5:cbTipoSapato.setSelectedIndex(4);
                    break;
             case 6:cbTipoSapato.setSelectedIndex(5);
                    break;
             case 7:cbTipoSapato.setSelectedIndex(6);
                    break;
             case 8:cbTipoSapato.setSelectedIndex(7);
                    break;
             case 9:cbTipoSapato.setSelectedIndex(8);
                    break;
             case 10:cbTipoSapato.setSelectedIndex(9);
                    break;
             case 11:cbTipoSapato.setSelectedIndex(10);
                    break;
             case 12:cbTipoSapato.setSelectedIndex(11);
                    break;
             case 13:cbTipoSapato.setSelectedIndex(12);
                    break;
             case 14:cbTipoSapato.setSelectedIndex(13);
                    break;
             case 15:cbTipoSapato.setSelectedIndex(14);
                    break;
             case 16:cbTipoSapato.setSelectedIndex(15);
                    break;
             case 17:cbTipoSapato.setSelectedIndex(16);
        }
    }
    
    public void cbCorSapatoselectedIndex(Integer codCorSapato){
        switch (codCorSapato) {
             case 1:cbCorSapato.setSelectedIndex(0);
                    break;
             case 2:cbCorSapato.setSelectedIndex(1);
                    break;
             case 3:cbCorSapato.setSelectedIndex(2);
                    break;
             case 4:cbCorSapato.setSelectedIndex(3);
                    break;
             case 5:cbCorSapato.setSelectedIndex(4);
                    break;
             case 6:cbCorSapato.setSelectedIndex(5);
                    break;
             case 7:cbCorSapato.setSelectedIndex(6);
                    break;
             case 8:cbCorSapato.setSelectedIndex(7);
                    break;
             case 9:cbCorSapato.setSelectedIndex(8);
                    break;
             case 10:cbCorSapato.setSelectedIndex(9);
                    break;
             case 11:cbCorSapato.setSelectedIndex(10);
                    break;
        }      
        
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
    private javax.swing.JPanel abaSevFazer;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox<Object> cbCorSapato;
    private javax.swing.JComboBox<Object> cbTipoSapato;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lbCodCliente;
    private javax.swing.JLabel lbCpf;
    private javax.swing.JPanel pnCodigo;
    private javax.swing.JPanel pnCpf;
    private javax.swing.JPanel pnCpf1;
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
    private javax.swing.JTable tblSevFazer;
    private javax.swing.JButton txtAdcProduto;
    private javax.swing.JButton txtAltProduto;
    private javax.swing.JTextField txtCodCliente;
    private javax.swing.JTextField txtCodSapato;
    private javax.swing.JTextArea txtConserto;
    private javax.swing.JFormattedTextField txtCpf;
    private javax.swing.JFormattedTextField txtDataEntrada;
    private javax.swing.JFormattedTextField txtDataPag;
    private javax.swing.JFormattedTextField txtDataSaida;
    private javax.swing.JButton txtExcluirProduto;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtNomeCliente;
    private javax.swing.JTextField txtNumSapato;
    private javax.swing.JTextField txtValorSapato;
    // End of variables declaration//GEN-END:variables
}
