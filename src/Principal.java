import javax.swing.table.DefaultTableModel;
/**
 *
 * @author geova
 */
public class Principal extends javax.swing.JFrame {
 
    CrudPacientes crudPaciente;
    boolean atualizando=false;
    
    public void LoadTablePac(){
        
        DefaultTableModel modelo = new DefaultTableModel(new Object[]{"Código" ,"Nome","Idade",
        "Altura","Pressão", "Peso"},0);
        
        for (int i=0; i< this.crudPaciente.listaPacientes.size(); i++){
            Object linha[] = new Object[]{this.crudPaciente.listaPacientes.get(i).getCodigo(),
                                          this.crudPaciente.listaPacientes.get(i).getNome(),
                                          this.crudPaciente.listaPacientes.get(i).getIdade(), 
                                          this.crudPaciente.listaPacientes.get(i).getAltura(), 
                                          this.crudPaciente.listaPacientes.get(i).getPressao(),
                                          this.crudPaciente.listaPacientes.get(i).getPeso()};
            
            modelo.addRow(linha);
           
        }
        
        tbl_pacientes.setModel(modelo);
        tbl_pacientes.getColumnModel().getColumn(0).setPreferredWidth(50);
        tbl_pacientes.getColumnModel().getColumn(1).setPreferredWidth(100);
      
    }
    
    public Principal() {
        initComponents();
        
        campo_paciente_codigo.setEnabled(false);
        this.crudPaciente = new CrudPacientes();
        this.crudPaciente.leObjetosArquivoDados();
         
        LoadTablePac();
        ManipulaInterface("Navegar");
       
    }
   
    public void ManipulaInterface(String modo){
       switch (modo){
           case "Navegar":
                btn_paciente_salvar.setEnabled(false);
                btn_paciente_cancelar.setEnabled(false);
                campo_paciente_nome.setEnabled(false);
                campo_paciente_idade.setEnabled(false);
                campo_paciente_altura.setEnabled(false);
                campo_paciente_pressao.setEnabled(false);
                campo_paciente_peso.setEnabled(false);
                btn_paciente_novo.setEnabled(true);
                btn_paciente_atualizar.setEnabled(false);
                btn_paciente_excluir.setEnabled(false);
                break;
               
           case "Novo":
                btn_paciente_salvar.setEnabled(true);
                btn_paciente_cancelar.setEnabled(true);
                campo_paciente_nome.setEnabled(true);
                campo_paciente_idade.setEnabled(true);
                campo_paciente_altura.setEnabled(true);
                campo_paciente_pressao.setEnabled(true);
                campo_paciente_peso.setEnabled(true);
                btn_paciente_novo.setEnabled(false);
                btn_paciente_atualizar.setEnabled(false);
                btn_paciente_excluir.setEnabled(false);
                break;
               
           case "Atualizar":
                btn_paciente_salvar.setEnabled(true);
                btn_paciente_cancelar.setEnabled(true);
                campo_paciente_nome.setEnabled(true);
                campo_paciente_idade.setEnabled(true);
                campo_paciente_altura.setEnabled(true);
                campo_paciente_pressao.setEnabled(true);
                campo_paciente_peso.setEnabled(true);
                btn_paciente_novo.setEnabled(true);
                btn_paciente_atualizar.setEnabled(false);
                btn_paciente_excluir.setEnabled(false);
                break;
              
           case "Excluir":
                btn_paciente_salvar.setEnabled(false);
                btn_paciente_cancelar.setEnabled(false);
                campo_paciente_nome.setEnabled(false);
                campo_paciente_idade.setEnabled(false);
                campo_paciente_altura.setEnabled(false);
                campo_paciente_pressao.setEnabled(false);
                campo_paciente_peso.setEnabled(false);
                btn_paciente_novo.setEnabled(true);
                btn_paciente_atualizar.setEnabled(false);
                btn_paciente_excluir.setEnabled(false);
                break;
               
           case "Selecao":
                btn_paciente_salvar.setEnabled(false);
                btn_paciente_cancelar.setEnabled(false);
                campo_paciente_nome.setEnabled(false);
                campo_paciente_idade.setEnabled(false);
                campo_paciente_altura.setEnabled(false);
                campo_paciente_pressao.setEnabled(false);
                campo_paciente_peso.setEnabled(false);
                btn_paciente_novo.setEnabled(true);
                btn_paciente_atualizar.setEnabled(true);
                btn_paciente_excluir.setEnabled(true);
                break;
               
           default: System.out.println("Inválido");       
                   
       }
       
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_pacientes = new javax.swing.JTable();
        tbl_pacientes_dois = new javax.swing.JPanel();
        label = new javax.swing.JLabel();
        campo_paciente_codigo = new javax.swing.JTextField();
        btn_paciente_salvar = new javax.swing.JButton();
        btn_paciente_cancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        campo_paciente_nome = new javax.swing.JTextField();
        campo_paciente_idade = new javax.swing.JTextField();
        campo_paciente_altura = new javax.swing.JTextField();
        campo_paciente_pressao = new javax.swing.JTextField();
        campo_paciente_peso = new javax.swing.JTextField();
        btn_paciente_novo = new javax.swing.JButton();
        btn_paciente_atualizar = new javax.swing.JButton();
        btn_paciente_excluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbl_pacientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Idade", "Altura", "Pressão", "Peso"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Float.class, java.lang.Float.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                true, true, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_pacientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_pacientesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_pacientes);
        if (tbl_pacientes.getColumnModel().getColumnCount() > 0) {
            tbl_pacientes.getColumnModel().getColumn(0).setHeaderValue("Código");
            tbl_pacientes.getColumnModel().getColumn(1).setPreferredWidth(150);
            tbl_pacientes.getColumnModel().getColumn(1).setHeaderValue("Nome");
            tbl_pacientes.getColumnModel().getColumn(2).setResizable(false);
            tbl_pacientes.getColumnModel().getColumn(2).setHeaderValue("Idade");
            tbl_pacientes.getColumnModel().getColumn(3).setHeaderValue("Altura");
            tbl_pacientes.getColumnModel().getColumn(4).setHeaderValue("Pressão");
            tbl_pacientes.getColumnModel().getColumn(5).setHeaderValue("Peso");
        }

        tbl_pacientes_dois.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Dados"));

        label.setText("Código:");

        campo_paciente_codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_paciente_codigoActionPerformed(evt);
            }
        });

        btn_paciente_salvar.setText("Salvar");
        btn_paciente_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_paciente_salvarActionPerformed(evt);
            }
        });

        btn_paciente_cancelar.setText("Cancelar");
        btn_paciente_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_paciente_cancelarActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome:");

        jLabel2.setText("Idade:");

        jLabel3.setText("Altura:");

        jLabel4.setText("Pressão:");

        jLabel5.setText("Peso:");

        campo_paciente_pressao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_paciente_pressaoActionPerformed(evt);
            }
        });

        campo_paciente_peso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_paciente_pesoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tbl_pacientes_doisLayout = new javax.swing.GroupLayout(tbl_pacientes_dois);
        tbl_pacientes_dois.setLayout(tbl_pacientes_doisLayout);
        tbl_pacientes_doisLayout.setHorizontalGroup(
            tbl_pacientes_doisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tbl_pacientes_doisLayout.createSequentialGroup()
                .addGroup(tbl_pacientes_doisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tbl_pacientes_doisLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(tbl_pacientes_doisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(tbl_pacientes_doisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(tbl_pacientes_doisLayout.createSequentialGroup()
                                .addComponent(campo_paciente_idade, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(tbl_pacientes_doisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(tbl_pacientes_doisLayout.createSequentialGroup()
                                        .addGap(25, 25, 25)
                                        .addComponent(btn_paciente_salvar)
                                        .addGap(46, 46, 46)
                                        .addComponent(btn_paciente_cancelar))
                                    .addGroup(tbl_pacientes_doisLayout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(campo_paciente_altura, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(campo_paciente_pressao, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(campo_paciente_peso, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(campo_paciente_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(tbl_pacientes_doisLayout.createSequentialGroup()
                        .addComponent(label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campo_paciente_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        tbl_pacientes_doisLayout.setVerticalGroup(
            tbl_pacientes_doisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tbl_pacientes_doisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tbl_pacientes_doisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label)
                    .addComponent(campo_paciente_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tbl_pacientes_doisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(campo_paciente_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tbl_pacientes_doisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(campo_paciente_idade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campo_paciente_altura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campo_paciente_pressao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campo_paciente_peso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(tbl_pacientes_doisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_paciente_salvar)
                    .addComponent(btn_paciente_cancelar))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        btn_paciente_novo.setText("Novo");
        btn_paciente_novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_paciente_novoActionPerformed(evt);
            }
        });

        btn_paciente_atualizar.setText("Atualizar");
        btn_paciente_atualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_paciente_atualizarActionPerformed(evt);
            }
        });

        btn_paciente_excluir.setText("Excluir");
        btn_paciente_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_paciente_excluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tbl_pacientes_dois, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_paciente_novo, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_paciente_atualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(btn_paciente_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_paciente_novo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_paciente_atualizar)
                    .addComponent(btn_paciente_excluir))
                .addGap(18, 18, 18)
                .addComponent(tbl_pacientes_dois, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );

        jTabbedPane2.addTab("Pacientes", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2)
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_paciente_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_paciente_novoActionPerformed
       
        atualizando = false;
        this.crudPaciente.leObjetosArquivoCodigos();
        
        String cod = Integer.toString(this.crudPaciente.codigoPaciente);
        
        campo_paciente_codigo.setText(cod);
        campo_paciente_nome.setText("");
        campo_paciente_idade.setText("");
        campo_paciente_altura.setText("");
        campo_paciente_pressao.setText("");
        campo_paciente_peso.setText("");
        
        ManipulaInterface("Novo");
    }//GEN-LAST:event_btn_paciente_novoActionPerformed

    private void btn_paciente_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_paciente_salvarActionPerformed
        
        String codigo = campo_paciente_codigo.getText();
        String nome = campo_paciente_nome.getText();
        int idade = Integer.parseInt(campo_paciente_idade.getText());
        float altura = Float.parseFloat(campo_paciente_altura.getText());
        float pressao = Float.parseFloat(campo_paciente_pressao.getText());
        float peso = Float.parseFloat(campo_paciente_peso.getText());
        
        Paciente paciente = new Paciente(codigo,nome, idade, altura, pressao, peso);
        
        if (atualizando){
            this.crudPaciente.atualizar(codigo, paciente);
        } else { 
            this.crudPaciente.cria(paciente);
        }
        
        ManipulaInterface("Navegar");
        LoadTablePac();
        
        campo_paciente_codigo.setText("");
        campo_paciente_nome.setText("");
        campo_paciente_idade.setText("");
        campo_paciente_altura.setText("");
        campo_paciente_pressao.setText("");
        campo_paciente_peso.setText("");
        
    }//GEN-LAST:event_btn_paciente_salvarActionPerformed
     
    
    private void btn_paciente_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_paciente_excluirActionPerformed
       btn_paciente_salvar.setEnabled(false);
       btn_paciente_cancelar.setEnabled(false);
        ManipulaInterface("Navegar");
    }//GEN-LAST:event_btn_paciente_excluirActionPerformed

    private void btn_paciente_atualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_paciente_atualizarActionPerformed
        
        ManipulaInterface("Atualizar");
        atualizando = true;
        
    }//GEN-LAST:event_btn_paciente_atualizarActionPerformed

    private void campo_paciente_codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_paciente_codigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_paciente_codigoActionPerformed

    private void campo_paciente_pressaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_paciente_pressaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_paciente_pressaoActionPerformed

    private void campo_paciente_pesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_paciente_pesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_paciente_pesoActionPerformed

    private void btn_paciente_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_paciente_cancelarActionPerformed
        campo_paciente_codigo.setText("");
        campo_paciente_codigo.setText("");
        campo_paciente_nome.setText("");
        campo_paciente_idade.setText("");
        campo_paciente_altura.setText("");
        campo_paciente_pressao.setText("");
        campo_paciente_peso.setText("");
        
        ManipulaInterface("Navegar");
    }//GEN-LAST:event_btn_paciente_cancelarActionPerformed

    private void tbl_pacientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_pacientesMouseClicked
       int click = tbl_pacientes.getSelectedRow();
        if(click>=0 && click < this.crudPaciente.listaPacientes.size()){
            Paciente paciente = this.crudPaciente.listaPacientes.get(click);
            campo_paciente_codigo.setText(String.valueOf(paciente.getCodigo()));
            campo_paciente_nome.setText(paciente.getNome());
            campo_paciente_idade.setText(Integer.toString(paciente.getIdade()));
            campo_paciente_altura.setText(Float.toString(paciente.getAltura()));
            campo_paciente_pressao.setText(Float.toString(paciente.getPressao()));
            campo_paciente_peso.setText(Float.toString(paciente.getPeso()));
            
            ManipulaInterface("Selecao");
        }
    }//GEN-LAST:event_tbl_pacientesMouseClicked
   
    
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_paciente_atualizar;
    private javax.swing.JButton btn_paciente_cancelar;
    private javax.swing.JButton btn_paciente_excluir;
    private javax.swing.JButton btn_paciente_novo;
    private javax.swing.JButton btn_paciente_salvar;
    private javax.swing.JTextField campo_paciente_altura;
    private javax.swing.JTextField campo_paciente_codigo;
    private javax.swing.JTextField campo_paciente_idade;
    private javax.swing.JTextField campo_paciente_nome;
    private javax.swing.JTextField campo_paciente_peso;
    private javax.swing.JTextField campo_paciente_pressao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JLabel label;
    private javax.swing.JTable tbl_pacientes;
    private javax.swing.JPanel tbl_pacientes_dois;
    // End of variables declaration//GEN-END:variables
}
