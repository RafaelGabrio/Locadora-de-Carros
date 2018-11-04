/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apresentacao.view_telas;

import classes.PessoaFisica;
import javax.swing.JOptionPane;
import negocio.PessoaFisicaNE;

/**
 *
 * @author Meire
 */
public class cadastroPessoa extends javax.swing.JFrame {

    /**
     * Creates new form cadastroPessoa
     */
    public cadastroPessoa() {
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

        jLabel2 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        comboCNH = new javax.swing.JComboBox<>();
        comboSexo = new javax.swing.JComboBox<>();
        txtCPF = new javax.swing.JTextField();
        nIdade = new javax.swing.JSpinner();
        jLabel8 = new javax.swing.JLabel();
        txtNome1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 51));
        jLabel2.setText("Cadastro de pessoa física");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, 290, 40));

        btnCancelar.setBackground(new java.awt.Color(255, 0, 0));
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(null);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 490, 120, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/background-image-1273097_960_720.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 110));

        btnCadastrar.setBackground(new java.awt.Color(0, 255, 51));
        btnCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.setBorder(null);
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 490, 120, 30));

        jLabel3.setText("Nome:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 40, 10));

        jLabel4.setText("CPF:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, 60, 20));

        jLabel5.setText("Sexo:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 370, 30, -1));

        jLabel6.setText("CNH:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 410, 30, -1));

        comboCNH.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Escolha uma opção--", "A", "B", "D" }));
        getContentPane().add(comboCNH, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 410, 230, -1));

        comboSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Escolha uma opção--", "Feminino", "Masculino" }));
        comboSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboSexoActionPerformed(evt);
            }
        });
        getContentPane().add(comboSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 370, 230, -1));
        getContentPane().add(txtCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, 430, 30));
        getContentPane().add(nIdade, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 430, 30));

        jLabel8.setText("Idade:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 60, 20));
        getContentPane().add(txtNome1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 430, 30));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void comboSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboSexoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        home home1 = new home();
        home1.show();
        this.hide();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        CadastroPessoaJuridica pj = new CadastroPessoaJuridica();
        String nome = txtNome1.getText();
        int idade = (int) nIdade.getValue();
        String sexo = comboSexo.getSelectedItem().toString();
        String cnh = comboCNH.getSelectedItem().toString();
        String cpf = txtCPF.getText();
        
        PessoaFisica p = new PessoaFisica(nome);
        p.setCnh(cnh);
        p.setCpf(cpf);
        p.setIdade(idade);
        p.setSexo(sexo);
        try{
            new PessoaFisicaNE().cadastrar(p);
        } catch (Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        } finally {
            JOptionPane.showMessageDialog(null, "Nome: "+nome+"\n"+"CPF: "+cpf+"\n"+"Sexo: "+sexo);
   
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

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
            java.util.logging.Logger.getLogger(cadastroPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cadastroPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cadastroPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cadastroPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cadastroPessoa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JComboBox<String> comboCNH;
    private javax.swing.JComboBox<String> comboSexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSpinner nIdade;
    private javax.swing.JTextField txtCPF;
    private javax.swing.JTextField txtNome1;
    // End of variables declaration//GEN-END:variables
}
