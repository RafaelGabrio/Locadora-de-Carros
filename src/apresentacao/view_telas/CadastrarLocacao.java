/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apresentacao.view_telas;

import classes.Locacao;
import classes.Moto;
import classes.Pessoa;
import classes.PessoaFisica;
import classes.Veiculo;
import java.io.File;
import javax.swing.JOptionPane;
import negocio.LocacaoNE;

/**
 *
 * @author Meire
 */
public class CadastrarLocacao extends javax.swing.JFrame {

    /**
     * Creates new form CadastrarLocacao
     */
    public CadastrarLocacao() {
        initComponents();
        /*PessoaFisica pf1 = new PessoaFisica("Gabi");
        pf1.setCnh("A");
        pf1.setIdade(19);
        pf1.setSexo("Feminino");
        pf1.setCpf("111.111.111-90");
        
        PessoaFisica pf2 = new PessoaFisica("Gabi2");
        pf2.setCnh("A");
        pf2.setIdade(19);
        pf2.setSexo("Feminino");
        pf2.setCpf("111.111.111-90");
        
        Moto m1 = new Moto();
        m1.setAno(200);
        m1.setKm(386483);
        m1.setMarca("honda");
        m1.setModelo("hod");
        m1.setTipoCompustivel("gasolina");*/
        
        
        
        //JOptionPane.showMessageDialog(null,pf1.getNome());
      
        File arquivos[];
        File diretorio = new File("C:\\Users\\rafae\\Documents\\NetBeansProjects\\trabalholocadora\\trabalholocadora\\trabalholocadora\\BD\\Pessoas");
        arquivos = diretorio.listFiles();
        for(int i = 0; i < arquivos.length; i++){
            comboPessoas.addItem(arquivos[i].toString());
        }
        
        File diretorioB = new File("C:\\Users\\rafae\\Documents\\NetBeansProjects\\trabalholocadora\\trabalholocadora\\trabalholocadora\\BD\\Veiculos");
        File arquivosB[] = diretorioB.listFiles();
        for (int i = 0; i < arquivosB.length; i++){
            comboVeiculos.addItem(arquivosB[i].toString());
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

        jLabel2 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        comboVeiculos = new javax.swing.JComboBox<>();
        comboPessoas = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txtDtSaida = new javax.swing.JTextField();
        txtDtRetorno = new javax.swing.JTextField();
        comboFinalizado = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 51));
        jLabel2.setText("Cadastro de locação");

        btnCancelar.setBackground(new java.awt.Color(255, 0, 0));
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(null);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/background-image-1273097_960_720.jpg"))); // NOI18N

        btnCadastrar.setBackground(new java.awt.Color(0, 255, 51));
        btnCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.setBorder(null);
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        jLabel3.setText("Pessoa:");

        jLabel4.setText("Veículo:");

        jLabel5.setText("Data de retorno:");

        jLabel6.setText("Status de finalização:");

        jLabel7.setText("Data de saída:");

        txtDtSaida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDtSaidaActionPerformed(evt);
            }
        });

        comboFinalizado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Escolha uma opção--", "True", "False" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtDtRetorno, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(txtDtSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(comboFinalizado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(530, 530, 530)
                        .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel4))
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(comboPessoas, 0, 774, Short.MAX_VALUE)
                    .addComponent(comboVeiculos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(265, 265, 265))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(comboPessoas, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboVeiculos, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtDtRetorno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtDtSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(comboFinalizado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(115, 115, 115)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 5, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        home home1 = new home();
        home1.show();
        this.hide();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtDtSaidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDtSaidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDtSaidaActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        Pessoa p1 = (Pessoa) comboPessoas.getSelectedItem();
        Veiculo v1 = (Veiculo) comboVeiculos.getSelectedItem();
        String dtRetorno = txtDtRetorno.getText();
        String dtSaida = txtDtSaida.getText();
        boolean status = (boolean) comboFinalizado.getSelectedItem();
        
        
        
        Locacao l1 = null;
        l1.setPessoa(p1);
        l1.setVeiculo(v1);
        l1.setDtRetorno(dtRetorno);
        l1.setDtSaida(dtSaida);
        l1.setFinalizado(status);
        
        try{
            new LocacaoNE().cadastrar(l1, p1, v1);
            /*JOptionPane.showMessageDialog(null, "Nome Pessoa: "+p1.getNome()+"\nVeículo: "+v1.getMarca()
                    +"\nData Retorno: "+dtRetorno+"\nData Saída: "+dtSaida,"Resumo",JOptionPane.INFORMATION_MESSAGE);

            JOptionPane.showMessageDialog(null, "Locação cadastrado com sucesso");*/

        } catch(Exception ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
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
            java.util.logging.Logger.getLogger(CadastrarLocacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarLocacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarLocacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarLocacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarLocacao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JComboBox<String> comboFinalizado;
    private javax.swing.JComboBox<Object> comboPessoas;
    private javax.swing.JComboBox<Object> comboVeiculos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtDtRetorno;
    private javax.swing.JTextField txtDtSaida;
    // End of variables declaration//GEN-END:variables
}
