
package New;

public class mobi extends javax.swing.JFrame {

    public mobi() {
        initComponents();
        this.revalidate();
    }
    public void Main()
    {
        Min m=new Min();
        m.setVisible(true);
        this.setVisible(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        barText = new javax.swing.JProgressBar();
        numText = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        barText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        barText.setForeground(new java.awt.Color(204, 0, 0));

        numText.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        numText.setForeground(new java.awt.Color(255, 0, 0));
        numText.setText("99");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/New/3a968d23-9897-4a41-9f4d-43775b265669.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(numText))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(barText, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(120, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addComponent(numText)
                .addGap(18, 18, 18)
                .addComponent(barText, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        
                mobi m=  new mobi();
                m.setVisible(true);
                try{
                    for(int i=0;i<=100;i++)
                    {
                        Thread.sleep(50);
                        
                        m.numText.setText(Integer.toString(i)+"%");
                        m.barText.setValue(i);
                    }
                } catch (Exception ex) {
                    
                }
                finally{
                    m.Main();             
                }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar barText;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel numText;
    // End of variables declaration//GEN-END:variables
}
