/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
// Criador: Eduardo Henrique Cioli Machado
// Data da última atualização: 2024-06-26
package com;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author machado.4922
 */
public class ExemploTabela extends javax.swing.JFrame {
    private boolean isEditable = false;

    /**
     * Creates new form ExemploTabela
     */
    public ExemploTabela() {
        initComponents(); // Initialize the form components
        
        // Now you can safely set the table model
        DefaultTableModel model = new DefaultTableModel(new Object[][]{},
                new Object[]{"Nome", "Email", "Endereço", "Telefone", "Genêro", "ID"}) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return isEditable;
            }
        };
        jtableClientes.setModel(model);
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        Genero = new javax.swing.ButtonGroup();
        Genero1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPaneTotal = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtableClientes = new javax.swing.JTable();
        Carregar = new javax.swing.JButton();
        Detalhes = new javax.swing.JButton();
        Excluir = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        textFieldTelefone1 = new javax.swing.JTextField();
        Nome1 = new javax.swing.JLabel();
        textFieldNome1 = new javax.swing.JTextField();
        DataNascimento1 = new javax.swing.JLabel();
        textFieldEmail1 = new javax.swing.JTextField();
        Endereco1 = new javax.swing.JLabel();
        textFieldEndereco1 = new javax.swing.JTextField();
        Telefone1 = new javax.swing.JLabel();
        botaoEditar1 = new javax.swing.JButton();
        textFieldID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Masculino1 = new javax.swing.JRadioButton();
        Feminino1 = new javax.swing.JRadioButton();
        Outros1 = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        textFieldTelefone = new javax.swing.JTextField();
        botaoCadastrar = new javax.swing.JButton();
        Nome = new javax.swing.JLabel();
        textFieldNome = new javax.swing.JTextField();
        DataNascimento = new javax.swing.JLabel();
        textFieldEmail = new javax.swing.JTextField();
        Endereco = new javax.swing.JLabel();
        textFieldEndereco = new javax.swing.JTextField();
        Telefone = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Masculino = new javax.swing.JRadioButton();
        Feminino = new javax.swing.JRadioButton();
        Outros = new javax.swing.JRadioButton();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jtableClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Email", "Endereço", "Telefone", "ID"
            }
        ));
        jScrollPane1.setViewportView(jtableClientes);

        Carregar.setText("Carregar");
        Carregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CarregarActionPerformed(evt);
            }
        });

        Detalhes.setText("Detalhes");
        Detalhes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DetalhesActionPerformed(evt);
            }
        });

        Excluir.setText("Excluir");
        Excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 553, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(Carregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Detalhes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Excluir)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Carregar)
                    .addComponent(Detalhes)
                    .addComponent(Excluir))
                .addGap(0, 37, Short.MAX_VALUE))
        );

        jTabbedPaneTotal.addTab("Administrador", jPanel3);

        textFieldTelefone1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldTelefone1ActionPerformed(evt);
            }
        });

        Nome1.setText("Nome: *");

        textFieldNome1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldNome1ActionPerformed(evt);
            }
        });

        DataNascimento1.setText("Email: *");

        Endereco1.setText("Endereço: *");

        Telefone1.setText("Telefone: *");

        botaoEditar1.setText("Editar");
        botaoEditar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEditar1ActionPerformed(evt);
            }
        });

        textFieldID.setText("jTextField1");

        jLabel2.setText("Todos os campos sinalizados com '*' são obrigatórios.");

        Genero1.add(Masculino1);
        Masculino1.setText("Masculino");

        Genero1.add(Feminino1);
        Feminino1.setText("Feminino");

        Genero1.add(Outros1);
        Outros1.setText("Outros");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botaoEditar1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Nome1)
                                .addComponent(textFieldNome1)
                                .addComponent(DataNascimento1)
                                .addComponent(textFieldEmail1)
                                .addComponent(Endereco1)
                                .addComponent(textFieldEndereco1)
                                .addComponent(Telefone1)
                                .addComponent(textFieldTelefone1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(Masculino1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Feminino1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Outros1))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(textFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(147, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Nome1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldNome1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Masculino1)
                    .addComponent(Feminino1)
                    .addComponent(Outros1))
                .addGap(18, 18, 18)
                .addComponent(DataNascimento1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldEmail1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Endereco1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldEndereco1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Telefone1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldTelefone1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(botaoEditar1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(textFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPaneTotal.addTab("Detalhes", jPanel4);

        botaoCadastrar.setText("Cadastrar");
        botaoCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarActionPerformed(evt);
            }
        });

        Nome.setText("Nome *");

        textFieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldNomeActionPerformed(evt);
            }
        });

        DataNascimento.setText("Email *");

        Endereco.setText("Endereço *");

        Telefone.setText("Telefone *");

        jLabel1.setText("Campos obrigatórios são sinalizados com '*'.");

        Genero.add(Masculino);
        Masculino.setText("Masculino");

        Genero.add(Feminino);
        Feminino.setText("Feminino");
        Feminino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FemininoActionPerformed(evt);
            }
        });

        Genero.add(Outros);
        Outros.setText("Outros");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Masculino)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Feminino)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Outros))
                    .addComponent(jLabel1)
                    .addComponent(botaoCadastrar)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Nome)
                        .addComponent(textFieldNome)
                        .addComponent(DataNascimento)
                        .addComponent(textFieldEmail)
                        .addComponent(Endereco)
                        .addComponent(textFieldEndereco)
                        .addComponent(Telefone)
                        .addComponent(textFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(199, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Nome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Masculino)
                    .addComponent(Feminino)
                    .addComponent(Outros))
                .addGap(13, 13, 13)
                .addComponent(DataNascimento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Endereco)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Telefone)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(botaoCadastrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        jTabbedPaneTotal.addTab("Cadastrar", jPanel2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jTabbedPaneTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jTabbedPaneTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void textFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
    }                                             

    private void botaoCadastrarActionPerformed(java.awt.event.ActionEvent evt) {                                               
        String nome = textFieldNome.getText(); 
        String email  = textFieldEmail.getText();
        String endereco = textFieldEndereco.getText(); 
        String telefone = textFieldTelefone.getText();
        String genero = "";

        if (Masculino.isSelected()) {
            genero = Masculino.getText();
            Feminino.setSelected(false);
            Outros.setSelected(false);
        } else if (Feminino.isSelected()) {
            genero = Feminino.getText();
            Masculino.setSelected(false); 
            Outros.setSelected(false);
        } else if (Outros.isSelected()) {
            genero = Outros.getText();
            Masculino.setSelected(false); 
            Feminino.setSelected(false);
        }
        
        String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        
        DefaultTableModel model = (DefaultTableModel)jtableClientes.getModel();
        
        if (nome.isEmpty() || endereco.isEmpty() || email.isEmpty() || telefone.isEmpty() || genero.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Por favor, preencha todos os campos.");
        }
        else if(!textFieldNome.getText().matches("[\\p{L}]+")){
            JOptionPane.showMessageDialog(rootPane, "Por favor, insira um nome válido.");
        }
        else if(!textFieldTelefone.getText().matches("\\(\\d{2}\\) \\d{5}-\\d{4}")){
            JOptionPane.showMessageDialog(rootPane, "Por favor, insira um telefone válido. O formato esperado é (XX) XXXXX-XXXX");
        }
        else if (!matcher.matches()){
            JOptionPane.showMessageDialog(rootPane, "Por favor, insira um e-mail válido.");
        } 
        else {
            try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/agenda_contato", "root", null)) {
                PreparedStatement insert;

                insert = conn.prepareStatement("INSERT INTO contato (nome, email, endereco, telefone, genero) VALUES (?,?,?,?,?)");

                insert.setString(1, nome);
                insert.setString(2, email);
                insert.setString(3, endereco);
                insert.setString(4, telefone);
                insert.setString(5, genero);
                insert.executeUpdate();         
                JOptionPane.showMessageDialog(rootPane, "Sucesso ao se cadastrar!");
                textFieldNome.setText("");
                textFieldEmail.setText("");
                textFieldEndereco.setText("");
                textFieldTelefone.setText("");
                Masculino.setSelected(false);
                Outros.setSelected(false);
                Feminino.setSelected(false);
                jTabbedPaneTotal.setSelectedIndex(0);
                conn.close();

            } catch (SQLException ex) {
                System.out.println("Erro na SQL");
            }           
        }
    }                                              

    private void CarregarActionPerformed(java.awt.event.ActionEvent evt) {                                         
        DefaultTableModel model = (DefaultTableModel) jtableClientes.getModel();
        model.setRowCount(0); 

        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/agenda_contato", "root", null)) {
            ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM contato");

            boolean hasContacts = false;

            while (rs.next()) {
                model.addRow(new Object[]{rs.getString("nome"), rs.getString("email"), rs.getString("endereco"), rs.getString("telefone"), rs.getString("genero"), rs.getString("id_contato")} );
                hasContacts = true; 
            }

            if (!hasContacts) {
                JOptionPane.showMessageDialog(null, "Não há contatos cadastrados.");
            } else {
                JOptionPane.showMessageDialog(null, "Informações carregadas.");
            }

        } catch (SQLException ex) {
            System.out.println("Erro na SQL: " + ex.getMessage());
        }              
    }                                        

    private void textFieldNome1ActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
    }                                              

    private void botaoEditar1ActionPerformed(java.awt.event.ActionEvent evt) {                                             
        String nome = textFieldNome1.getText(); 
        String email = textFieldEmail1.getText();
        String endereco = textFieldEndereco1.getText(); 
        String telefone = textFieldTelefone1.getText();
        String genero = null;

        if (Masculino1.isSelected()) {
            genero = Masculino1.getText();
            Feminino1.setSelected(false);
            Outros1.setSelected(false);
        } else if (Feminino1.isSelected()) {
            genero = Feminino1.getText();
            Masculino1.setSelected(false); 
            Outros1.setSelected(false);
        } else if (Outros1.isSelected()) {
            genero = Outros1.getText();
            Masculino1.setSelected(false); 
            Feminino1.setSelected(false);
        }

        String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);

        DefaultTableModel model = (DefaultTableModel) jtableClientes.getModel();

        if (nome.isEmpty() || endereco.isEmpty() || email.isEmpty() || telefone.isEmpty() || genero.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Por favor, preencha todos os campos.");
        } else if (!matcher.matches()) {
            JOptionPane.showMessageDialog(rootPane, "Por favor, insira um e-mail válido.");
        } else if(!textFieldNome1.getText().matches("[\\p{L}]+")){
            JOptionPane.showMessageDialog(rootPane, "Por favor, insira um nome válido.");
        } else if(!textFieldTelefone1.getText().matches("\\(\\d{2}\\) \\d{5}-\\d{4}")){
            JOptionPane.showMessageDialog(rootPane, "Por favor, insira um telefone válido.");
        } else {
            int colum5 = 5;
            int row = jtableClientes.getSelectedRow();

            String value1 = jtableClientes.getModel().getValueAt(row, colum5).toString();
            textFieldID.setText(value1);
            String id = value1;

            try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/agenda_contato", "root", null)) {
                PreparedStatement updateStmt = conn.prepareStatement("UPDATE contato SET nome = ?, email = ?, endereco = ?, telefone = ?, genero = ? WHERE id_contato = ?");

                updateStmt.setString(1, nome);
                updateStmt.setString(2, email);
                updateStmt.setString(3, endereco);
                updateStmt.setString(4, telefone);
                updateStmt.setString(5, genero);
                updateStmt.setString(6, id);

                int affectedRows = updateStmt.executeUpdate();
                if (affectedRows > 0) {
                    JOptionPane.showMessageDialog(rootPane, "Registro atualizado com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Falha ao atualizar registro.");
                }
                } catch (SQLException ex) {
                    System.out.println("Erro na SQL: " + ex.getMessage());
                }

                textFieldNome1.setText("");
                textFieldEmail1.setText("");
                textFieldEndereco1.setText("");
                textFieldTelefone1.setText("");
                model = (DefaultTableModel) jtableClientes.getModel();
                model.setRowCount(0); 
                jTabbedPaneTotal.setSelectedIndex(0);
        }
    }                                            

    private void DetalhesActionPerformed(java.awt.event.ActionEvent evt) {                                         
       int colum0 = 0;
       int colum1 = 1;
       int colum2 = 2;
       int colum3 = 3;
       int colum4 = 4;
       int colum5 = 5;
       
       int row = jtableClientes.getSelectedRow();
       if (row == -1) {
            JOptionPane.showMessageDialog(null, "Selecione um contato para ver os detalhes.");
        }
       String value0 = jtableClientes.getModel().getValueAt(row, colum0).toString();
       String value1 = jtableClientes.getModel().getValueAt(row, colum1).toString();
       String value2 = jtableClientes.getModel().getValueAt(row, colum2).toString();
       String value3 = jtableClientes.getModel().getValueAt(row, colum3).toString();
       String value4 = jtableClientes.getModel().getValueAt(row, colum4).toString();
       if(value4.equals("Masculino")){
           Masculino1.setSelected(true);
       }
       else if(value4.equals("Feminino")){
           Feminino1.setSelected(true);
       }
       else{
           Outros1.setSelected(true);
       }  
       String value5 = jtableClientes.getModel().getValueAt(row, colum5).toString();
       
       textFieldNome1.setText(value0); 
       textFieldEmail1.setText(value1);
       textFieldEndereco1.setText(value2); 
       textFieldTelefone1.setText(value3);
       textFieldID.setText(value5);
       
       
       jTabbedPaneTotal.setSelectedIndex(1);
    }                                        

    private void ExcluirActionPerformed(java.awt.event.ActionEvent evt) {                                        
        int colum5 = 5;
        int row = jtableClientes.getSelectedRow();

        if (row == -1) {
            JOptionPane.showMessageDialog(null, "Selecione um contato para excluir.");
        } else {
            String value1 = jtableClientes.getModel().getValueAt(row, colum5).toString();
            String id = value1;
            
            int resposta = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir o contato?", "Confirmação de exclusão", JOptionPane.YES_NO_OPTION);

            if (resposta == JOptionPane.YES_OPTION) {
                try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/agenda_contato", "root", null)) {
                    PreparedStatement delete;

                    delete = conn.prepareStatement("DELETE FROM contato WHERE id_contato = ?");
                    delete.setString(1, id);
                    int rowsAffected = delete.executeUpdate();

                    if (rowsAffected > 0) {
                        JOptionPane.showMessageDialog(null, "Contato excluído com sucesso!");
                        ((DefaultTableModel) jtableClientes.getModel()).removeRow(row);
                    } else {
                        JOptionPane.showMessageDialog(null, "Erro ao excluir contato. Contato não encontrado.");
                    }
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println("Erro na SQL");
                }
            } else {
     
            }
        }
    }                                       

    private void textFieldTelefone1ActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        // TODO add your handling code here:
    }                                                  

    private void FemininoActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(ExemploTabela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExemploTabela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExemploTabela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExemploTabela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        SwingUtilities.invokeLater(() -> {
            new ExemploTabela().setVisible(true);
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton Carregar;
    private javax.swing.JLabel DataNascimento;
    private javax.swing.JLabel DataNascimento1;
    private javax.swing.JButton Detalhes;
    private javax.swing.JLabel Endereco;
    private javax.swing.JLabel Endereco1;
    private javax.swing.JButton Excluir;
    private javax.swing.JRadioButton Feminino;
    private javax.swing.JRadioButton Feminino1;
    private javax.swing.ButtonGroup Genero;
    private javax.swing.ButtonGroup Genero1;
    private javax.swing.JRadioButton Masculino;
    private javax.swing.JRadioButton Masculino1;
    private javax.swing.JLabel Nome;
    private javax.swing.JLabel Nome1;
    private javax.swing.JRadioButton Outros;
    private javax.swing.JRadioButton Outros1;
    private javax.swing.JLabel Telefone;
    private javax.swing.JLabel Telefone1;
    private javax.swing.JButton botaoCadastrar;
    private javax.swing.JButton botaoEditar1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPaneTotal;
    private javax.swing.JTable jtableClientes;
    private javax.swing.JTextField textFieldEmail;
    private javax.swing.JTextField textFieldEmail1;
    private javax.swing.JTextField textFieldEndereco;
    private javax.swing.JTextField textFieldEndereco1;
    private javax.swing.JTextField textFieldID;
    private javax.swing.JTextField textFieldNome;
    private javax.swing.JTextField textFieldNome1;
    private javax.swing.JTextField textFieldTelefone;
    private javax.swing.JTextField textFieldTelefone1;
    // End of variables declaration                   
}