/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.view;

import fatec.poo.model.Projeto;
import java.util.ArrayList;

/**
 *
 * @author Dimas
 */
public class GuiProjeto extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public GuiProjeto(ArrayList<Projeto> cadProj) {
        initComponents();
        cadastro = cadProj;
    }   
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtDescricao = new javax.swing.JTextField();
        btnConsultar = new javax.swing.JButton();
        btnInserir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtDtInicio = new javax.swing.JTextField();
        txtDtTermino = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Projeto");

        jLabel1.setText("Código");

        jLabel2.setText("Descrição");

        txtDescricao.setEnabled(false);

        btnConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/Consultar.png"))); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btnInserir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/Inserir.png"))); // NOI18N
        btnInserir.setText("Inserir");
        btnInserir.setEnabled(false);
        btnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirActionPerformed(evt);
            }
        });

        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/Alterar.png"))); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.setEnabled(false);
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/Remover.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.setEnabled(false);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/Sair.png"))); // NOI18N
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        jLabel3.setText("Data Início");

        jLabel4.setText("Data Término");

        txtDtInicio.setEnabled(false);

        txtDtTermino.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(btnConsultar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnInserir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAlterar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSair)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDtTermino, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDtInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAlterar, btnConsultar, btnExcluir, btnInserir, btnSair});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtCodigo, txtDtInicio, txtDtTermino});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtDtInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtDtTermino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConsultar)
                    .addComponent(btnInserir)
                    .addComponent(btnAlterar)
                    .addComponent(btnExcluir)
                    .addComponent(btnSair))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAlterar, btnConsultar, btnExcluir, btnInserir, btnSair});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtCodigo, txtDtInicio, txtDtTermino});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        int x;
        for (x = 0; x < cadastro.size(); x++){             
               if (cadastro.get(x).getCodigo() == Integer.parseInt(txtCodigo.getText())){
                   break;
               }
        } 
        
        if (x < cadastro.size()){
           posProj = x; //localizou o objeto Projeto no ArrayList
        }else{
           posProj = -1;//não localizou o objeto Projeto no ArrayList
        }            
        
        if (posProj >= 0){
            txtDescricao.setText(cadastro.get(posProj).getDescricao());
            txtDtInicio.setText(cadastro.get(posProj).getDtInicio());
            txtDtTermino.setText(cadastro.get(posProj).getDtTermino());
            btnConsultar.setEnabled(false);
            btnInserir.setEnabled(false);
            btnAlterar.setEnabled(true);
            btnExcluir.setEnabled(true);
        }else{
            btnConsultar.setEnabled(false);
            btnInserir.setEnabled(true);
            btnAlterar.setEnabled(false);
            btnExcluir.setEnabled(false);
            txtDescricao.requestFocus();
        }
        txtCodigo.setEnabled(false);
        txtDescricao.setEnabled(true);   
        txtDtInicio.setEnabled(true); 
        txtDtTermino.setEnabled(true); 
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
        //instanciação do objeto da classe Projeto
        Projeto proj=new Projeto(Integer.parseInt(txtCodigo.getText()),
                                  txtDescricao.getText());    
        proj.setDtInicio(txtDtInicio.getText());
        proj.setDtTermino(txtDtTermino.getText());
        cadastro.add(proj); //insere o objeto no ArrayList        
        
        txtCodigo.setText(null);
        txtDescricao.setText(null);
        txtDtInicio.setText(null);
        txtDtTermino.setText(null);
        btnConsultar.setEnabled(true);
        btnInserir.setEnabled(false);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
        txtCodigo.setEnabled(true);
        txtDescricao.setEnabled(false); 
        txtDtInicio.setEnabled(false);
        txtDtTermino.setEnabled(false);
        txtCodigo.requestFocus();
    }//GEN-LAST:event_btnInserirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        txtCodigo.setEnabled(false);
        cadastro.get(posProj).setDescricao(txtDescricao.getText());
        cadastro.get(posProj).setDtInicio(txtDtInicio.getText());
        cadastro.get(posProj).setDtTermino(txtDtTermino.getText());
                
        txtCodigo.setText(null);
        txtDescricao.setText(null); 
        txtDtInicio.setText(null);
        txtDtTermino.setText(null);
        btnConsultar.setEnabled(true);
        btnInserir.setEnabled(false);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
        txtCodigo.setEnabled(true);
        txtDescricao.setEnabled(false);  
        txtDtInicio.setEnabled(false);
        txtDtTermino.setEnabled(false);
        txtCodigo.requestFocus();        
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (posProj >= 0){
            cadastro.remove(posProj);
            posProj = -1;
        }
        txtCodigo.setText(null);
        txtDescricao.setText(null); 
        txtDtInicio.setText(null);
        txtDtTermino.setText(null);
        btnConsultar.setEnabled(true);
        btnInserir.setEnabled(false);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
        txtCodigo.setEnabled(true);
        txtDescricao.setEnabled(false);  
        txtDtInicio.setEnabled(false);
        txtDtTermino.setEnabled(false);
        txtCodigo.requestFocus();
    }//GEN-LAST:event_btnExcluirActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnInserir;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtDtInicio;
    private javax.swing.JTextField txtDtTermino;
    // End of variables declaration//GEN-END:variables
    private ArrayList<Projeto> cadastro;
    private int posProj;
}
