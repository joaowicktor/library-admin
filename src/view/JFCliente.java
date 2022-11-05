/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;
import model.Cliente;
import utils.BdCliente;


/**
 *
 * @author paulojp
 */
public class JFCliente extends javax.swing.JFrame {  
   
    // Variável que recebe a instância da tela principal
    private JFPrincipal telaPrincipal;
    
    /**
     * Creates new form Cliente
     */
    public JFCliente() {
        initComponents();
        
        // Desabilita os campos ao iniciar a janela
        desabilitaCampos();
    }
    
    // Construtor reabilita tela principal - recebe a instância
    JFCliente(JFPrincipal telaPrincipal) {
        
        // this(esta janela 'jFCliente') - abre a própria janela ao execultar o contrutor
        this();
        
        this.telaPrincipal = telaPrincipal;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jT1Nome = new javax.swing.JTextField();
        jT3Sexo = new javax.swing.JTextField();
        jT5Endereco = new javax.swing.JTextField();
        jT0Id = new javax.swing.JTextField();
        jT4Cpf = new javax.swing.JFormattedTextField(Mascara("###.###.###-##"));
        jT6Fone = new javax.swing.JFormattedTextField(Mascara("#####-####"));
        jT2Data = new com.toedter.calendar.JDateChooser();
        jPanel2 = new javax.swing.JPanel();
        jTPesquisar = new javax.swing.JTextField();
        jBPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePesquisa = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jBExcluir = new javax.swing.JButton();
        jBAlterar = new javax.swing.JButton();
        jBNovo = new javax.swing.JButton();
        jBCadastrar = new javax.swing.JButton();
        jBSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Dados dos Clientes");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });


        jLabel1.setText("Nome:");

        jLabel2.setText("Data de Nascimento: ");

        jLabel3.setText("Sexo: ");

        jLabel4.setText("Cpf: ");

        jLabel5.setText("Endereço: ");

        jLabel6.setText("Fone: ");

        jLabel7.setText("ID: ");

        jT4Cpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT4CpfActionPerformed(evt);
            }
        });
        jT4Cpf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jT4CpfKeyTyped(evt);
            }
        });

        jT6Fone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jT6FoneKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jT5Endereco)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jT3Sexo, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jT1Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jT0Id, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jT4Cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jT6Fone, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jT2Data, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 37, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jT0Id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jT1Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jT2Data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jT3Sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jT4Cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jT5Endereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jT6Fone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );


        jBPesquisar.setText("Pesquisar");
        jBPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPesquisarActionPerformed(evt);
            }
        });

        jTablePesquisa.setModel(tmCliente);
        jTablePesquisa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablePesquisaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTablePesquisa);

        jLabel8.setText("Nome:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(jBPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(8, 8, 8)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );


        jBExcluir.setText("Excluir");
        jBExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBExcluirActionPerformed(evt);
            }
        });

        jBAlterar.setText("Alterar");
        jBAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAlterarActionPerformed(evt);
            }
        });

        jBNovo.setText("Novo");
        jBNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNovoActionPerformed(evt);
            }
        });

        jBCadastrar.setText("Cadastrar");
        jBCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadastrarActionPerformed(evt);
            }
        });

        jBSair.setText("Sair");
        jBSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBNovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                    .addComponent(jBSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBAlterar)
                .addGap(18, 18, 18)
                .addComponent(jBNovo)
                .addGap(18, 18, 18)
                .addComponent(jBCadastrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(jBSair)
                .addContainerGap())
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jBAlterar, jBCadastrar, jBExcluir, jBNovo, jBSair});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.getAccessibleContext().setAccessibleName("Cadastro de Clientes");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    // BOTÃO NOVO - Precionando
    private void jBNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNovoActionPerformed
        habilitaCampos();
        // Limpa os dados dos campos
        limpaCampos();        
    }//GEN-LAST:event_jBNovoActionPerformed
      
    // BOTÃO CADASTRAR - Precionando
    private void jBCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadastrarActionPerformed
        cadastraRegistro();  
    }//GEN-LAST:event_jBCadastrarActionPerformed
     
    // BOTÃO PESQUISAR - Precionando
    private void jBPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPesquisarActionPerformed
        // Ao clicar em pesquisar, é executado o método que efetua a pesquisa, e outro método que exibe a lista da pesquisa
        try {            
            listaContatos(); 
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Problemas ao listar contatos.");            
        }
    }//GEN-LAST:event_jBPesquisarActionPerformed
    
    // TABELA PESQUISA - Selecionando registro com o clique do mouse
    private void jTablePesquisaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePesquisaMouseClicked
        // Salva a posição da linha selecionada na tabela de pesquisa
        try {
        int linhaSelecionada = jTablePesquisa.getSelectedRow();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date date = formatter.parse((String) jTablePesquisa.getValueAt(linhaSelecionada, 2));
        jT0Id.setText(jTablePesquisa.getValueAt(linhaSelecionada, 0).toString());
        jT1Nome.setText((String) jTablePesquisa.getValueAt(linhaSelecionada, 1));
        jT2Data.setDate(date);
        jT3Sexo.setText((String) jTablePesquisa.getValueAt(linhaSelecionada, 3));
        jT4Cpf.setText((String) jTablePesquisa.getValueAt(linhaSelecionada, 4));
        jT5Endereco.setText((String) jTablePesquisa.getValueAt(linhaSelecionada, 5));
        jT6Fone.setText((String) jTablePesquisa.getValueAt(linhaSelecionada, 6));
        } catch(Exception e) {
            System.out.println(e);
        }
        
        // Ao selecionar um registro, os campos são ativados possibilitando fazer alterações
        habilitaCampos();
    }//GEN-LAST:event_jTablePesquisaMouseClicked
    
    // BOTÃO EXCLUIR - Precionando
    private void jBExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExcluirActionPerformed
        try {
            excluirRegistro();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao excluir registro.");
        }
    }//GEN-LAST:event_jBExcluirActionPerformed

    private void jBAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAlterarActionPerformed
        try {
            alteraRegistro();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao alterar registro.");
        }
    }//GEN-LAST:event_jBAlterarActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        
        // habilita a janela principal
        telaPrincipal.setEnabled(true);
        
    }//GEN-LAST:event_formWindowClosed

    private void jBSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBSairActionPerformed

    private void jT4CpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT4CpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jT4CpfActionPerformed

    private void jT4CpfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jT4CpfKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_jT4CpfKeyTyped

    private void jT6FoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jT6FoneKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_jT6FoneKeyTyped
    
    
    
    public MaskFormatter Mascara(String Mascara){
        
        MaskFormatter F_Mascara = new MaskFormatter();
        try{
            F_Mascara.setMask(Mascara); //Atribui a mascara
            F_Mascara.setPlaceholderCharacter('X'); //Caracter para preencimento 
        }
        catch (Exception excecao) {
            excecao.printStackTrace();
        } 
        return F_Mascara;
 }
    
    
    /* ----CADASTRO-> */
    // MÉTODOS:
    
    // Método p/ cadastrar um registro no banco de dados.
    private void cadastraRegistro() {
        // Antes de cadastrar, verifica se ousuário está com algum registro selecionado
        if (jT1Nome.isEditable() && jT0Id.getText().equals("")) {
            // Antes de cadastrar, verifica se os campos foram preenchidos
            if (verificaDados()) {
                try {
                    Cliente c = new Cliente();
                    String tempcpf = jT4Cpf.getText();
                    tempcpf = tempcpf.replaceAll("\\.", "");
                    tempcpf = tempcpf.replaceAll("\\-", "");
                    String tempfone = jT6Fone.getText();
                    tempfone = tempfone.replaceAll("\\-", "");
                    System.out.println(tempcpf);
                    c.setNome(jT1Nome.getText());
                    c.setDataNasc(data());
                    c.setSexo(jT3Sexo.getText());
                    c.setCpf(tempcpf);
                    c.setEndereco(jT5Endereco.getText());
                    c.setFone(tempfone);

                    BdCliente d = new BdCliente();

                    d.adicionaCliente(c);

                    JOptionPane.showMessageDialog(rootPane, "Dados cadastrados com sucesso.");
                    limpaCampos();
                    desabilitaCampos();

                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(rootPane, "Erro ao cadastrar cliente.");
                }
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Para cadastrar um novo registro.\nClique em 'Novo'.");
        }
    }
    
    // Método p/ validação do formulário
    private boolean verificaDados() {

        if(jT1Nome.getText() == null || jT1Nome.getText().isEmpty() || jT1Nome.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "O Nome não pode estar vazio.");
            return false;
        }
        if(jT3Sexo.getText() == null || jT3Sexo.getText().isEmpty() || jT3Sexo.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "O Sexo não pode estar vazio.");
            return false;
        }
        if(jT5Endereco.getText() == null || jT5Endereco.getText().isEmpty() || jT5Endereco.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "O Endereço não pode estar vazio.");
            return false;
        }
        if(jT6Fone.getText() == null || jT6Fone.getText().isEmpty() || jT6Fone.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "O Telefone não pode estar vazio.");
            return false;
        }
        if(jT4Cpf.getText() == null || jT4Cpf.getText().isEmpty() || jT4Cpf.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "O CPF não pode estar vazio.");
            return false;
        }    
        
        return true;
    }
    
    // Método p/ concatenar a data
    private String data() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(jT2Data.getDate());
        String d = calendar.get(Calendar.YEAR) + "-" + calendar.get(Calendar.MONTH) + "-" + calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(d);
        return d;
    }
    /* <-CADASTRO---- */ 
    
    
    
    
    /* ----PESQUISA-> */
    // MÉTODOS:
    
    // Edita os campos e colunas da tabela de resultados
    DefaultTableModel tmCliente = new DefaultTableModel(null, new String[]{"Id", "Nome", "Data Nasc.", "Sexo", "CPF", "Endereço", "Fone"});
    List<Cliente> clientes;
        
    
    // Lista a quantidade de resultado, de acordo com o nome passado no campo pesquisa
    private void listaContatos() throws SQLException {
        limpaCampos();
        BdCliente d = new BdCliente();
        clientes = d.getLista("%" + jTPesquisar.getText() + "%"); 
        
        // Após pesquisar os contatos, executa o método p/ exibir o resultado na tabela pesquisa
        mostraPesquisa(clientes);
        clientes.clear();
    }
    
    // Mostra a lista de resultado de acordo com o nome passado no campo pesquisa
    private void mostraPesquisa(List<Cliente> clientes) {
        // Limpa a tabela sempre que for solicitado uma nova pesquisa
        limparTabela();
        
        if (clientes.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Nenhum registro não encontrado.");
        } else {            
            // Linha em branco usada no for, para cada registro é criada uma nova linha 
            String[] linha = new String[] {null, null, null, null, null, null, null};
            // P/ cada registro é criada uma nova linha, cada recebe linha os campos do registro
            for (int i = 0; i < clientes.size(); i++) {
                tmCliente.addRow(linha);
                tmCliente.setValueAt(clientes.get(i).getId(), i, 0);
                tmCliente.setValueAt(clientes.get(i).getNome(), i, 1);
                tmCliente.setValueAt(clientes.get(i).getDataNasc(), i, 2);
                tmCliente.setValueAt(clientes.get(i).getSexo(), i, 3);
                tmCliente.setValueAt(clientes.get(i).getCpf(), i, 4);
                tmCliente.setValueAt(clientes.get(i).getEndereco(), i, 5);
                tmCliente.setValueAt(clientes.get(i).getFone(), i, 6);                
            }            
        }
    }
    
    // Limpa a tabela de resultados
    private void limparTabela() {       
        while (tmCliente.getRowCount() > 0) {            
            tmCliente.removeRow(0);
        }
    } 
    /* <-PESQUISA---- */      
    
    
    
    /* ----EXCLUIR-> */
    // MÉTODOS:
    
    // Exclui resgistro
    private void excluirRegistro() throws SQLException {
        // Se algum registro estiver selecionado
        if (jTablePesquisa.getSelectedRow() != -1) {
            // Exibe uma janela de confirmação antes de exluir o registro
            int resp = JOptionPane.showConfirmDialog(rootPane, "Deseja realmente excluir este registro?",
                    "Confirmação!", JOptionPane.YES_NO_OPTION);

            // Se a confirmação for SIM
            if (resp == JOptionPane.YES_NO_OPTION) {
                // Recebe a linha selecionada
                int linhaSelecionada = jTablePesquisa.getSelectedRow();
                // Recebe o ID da linha selecionada
                int id = (int) jTablePesquisa.getValueAt(linhaSelecionada, 0);
                // Remove o registro, usando como parâmetro, o id da linha selecionada                
                BdCliente d = new BdCliente();
                d.remove(id);

                JOptionPane.showMessageDialog(rootPane, "Registro excluido com sucesso.");
                limpaCampos();
                desabilitaCampos();
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Registro não selecionado.");
        }
    }
    /* <-EXCLUIR---- */
    
    
    
    
    /* ----ALTERAR-> */
    // MÉTODOS:
    
    // Altera registro
    private void alteraRegistro() throws SQLException {
        if (jTablePesquisa.getSelectedRow() != -1) {
            int resp = JOptionPane.showConfirmDialog(rootPane, "Deseja realmente alterar este registro?",
                    "Confirmação!", JOptionPane.YES_NO_OPTION);

            // Se a confirmação for SIM
            if (resp == JOptionPane.YES_NO_OPTION) {     
                if(verificaDados()) {           
                    Cliente c = new Cliente();
                    BdCliente d = new BdCliente();
                    try {           
                        //c.setId(Integer.valueOf(jT0Id.getText()));
                        c.setNome(jT1Nome.getText());
                        //c.setDataNasc(jT2DataAno.getText());
                        c.setSexo(jT3Sexo.getText());
                        c.setCpf(jT4Cpf.getText());                
                        c.setEndereco(jT5Endereco.getText());
                        c.setFone(jT6Fone.getText());       
                        d.altera(c);
                        JOptionPane.showMessageDialog(rootPane, "Registro alterado com sucesso.");
                        limpaCampos();
                        desabilitaCampos();
                        listaContatos();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(rootPane, "Erro ao alterar o registro.");
                        System.out.println("Erro ao alterar o registro: " + e);
                    }
                }
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Registro não selecionado.");
        }
    }
    /* <-ALTERAR---- */
    
    
    
    
    /* ----OUTROS-> */
    // MÉTODOS:
    
    // Limpa os campos do formulário
    private void limpaCampos() {
        jT0Id.setText("");
        jT1Nome.setText("");
        jT2Data.setDate(new Date());
        jT3Sexo.setText("");
        jT4Cpf.setText("");
        jT5Endereco.setText("");
        jT6Fone.setText(""); 
    }
    
    // Desabilita os campos do formulário
    private void desabilitaCampos() {
        jT0Id.setEditable(false);
        jT1Nome.setEditable(false);
        jT2Data.setEnabled(false);
        jT3Sexo.setEditable(false);
        jT4Cpf.setEditable(false);
        jT5Endereco.setEditable(false);
        jT6Fone.setEditable(false);
    }
    
    // Habilita os campos do formulário
    private void habilitaCampos() {
        
        jT1Nome.setEditable(true);
        jT2Data.setEnabled(true);
        jT3Sexo.setEditable(true);
        jT4Cpf.setEditable(true);
        jT5Endereco.setEditable(true);
        jT6Fone.setEditable(true);
    }
    
    /* <-OUTROS---- */
    
    
    
    
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
            java.util.logging.Logger.getLogger(JFCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new JFCliente().setVisible(true);
            }
        });
    }    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAlterar;
    private javax.swing.JButton jBCadastrar;
    private javax.swing.JButton jBExcluir;
    private javax.swing.JButton jBNovo;
    private javax.swing.JButton jBPesquisar;
    private javax.swing.JButton jBSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jT0Id;
    private javax.swing.JTextField jT1Nome;
    private com.toedter.calendar.JDateChooser jT2Data;
    private javax.swing.JTextField jT3Sexo;
    private javax.swing.JFormattedTextField jT4Cpf;
    private javax.swing.JTextField jT5Endereco;
    private javax.swing.JFormattedTextField jT6Fone;
    private javax.swing.JTextField jTPesquisar;
    private javax.swing.JTable jTablePesquisa;
    // End of variables declaration//GEN-END:variables

}
