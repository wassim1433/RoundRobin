
package View;

import Model.Resultado;
import java.util.ArrayList;
public class RoundRobinView extends javax.swing.JFrame {

    ArrayList<Integer> l_procesos = new ArrayList<>();
    ArrayList<Integer> l_ncpu = new ArrayList<>();
    
    int tam_procesos = 0, quantum = 0;

    public RoundRobinView() {
        initComponents();
       
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtQuantum = new javax.swing.JTextField();
        txtProceso = new javax.swing.JTextField();
        txtNCPU = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnIniciar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblResultados = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaProcesos = new javax.swing.JTextArea();
        progressBar = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Quantum:");

        jLabel2.setText("Proceso:");

        jLabel3.setText("NCPU:");

        txtQuantum.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtQuantumFocusLost(evt);
            }
        });

        btnAgregar.setText("Agregar proceso");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnIniciar.setText("Iniciar");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });

        tblResultados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Procesos", "NCPU", "T. Espera", "T. Vuelta"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblResultados);
        if (tblResultados.getColumnModel().getColumnCount() > 0) {
            tblResultados.getColumnModel().getColumn(0).setResizable(false);
            tblResultados.getColumnModel().getColumn(1).setResizable(false);
            tblResultados.getColumnModel().getColumn(2).setResizable(false);
            tblResultados.getColumnModel().getColumn(3).setResizable(false);
        }

        txtAreaProcesos.setColumns(20);
        txtAreaProcesos.setRows(5);
        jScrollPane2.setViewportView(txtAreaProcesos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnIniciar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jScrollPane2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtQuantum, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                            .addComponent(txtProceso))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNCPU, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAgregar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtQuantum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtProceso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregar)
                    .addComponent(txtNCPU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(progressBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnIniciar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        l_procesos.add(Integer.parseInt(this.txtProceso.getText()));
        tam_procesos = l_procesos.size();

        l_ncpu.add(Integer.parseInt(this.txtNCPU.getText()));

        quantum = Integer.parseInt(this.txtQuantum.getText());
        
        this.txtAreaProcesos.setText(" Procesos: " + l_procesos.toString() +
                "\n" + " NCPU: " + l_ncpu.toString());
        this.txtProceso.setText("");
        this.txtNCPU.setText("");
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        encontrarTiempoPromedio(l_procesos, tam_procesos, l_ncpu, quantum);
    }//GEN-LAST:event_btnIniciarActionPerformed

    private void txtQuantumFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtQuantumFocusLost
        this.txtQuantum.setEnabled(false);
    }//GEN-LAST:event_txtQuantumFocusLost
    static void encontrarTiempoEspera(ArrayList<Integer> procesos, int tam_p,
            ArrayList<Integer> ncpu, int wt[], int quantum) {
        // Make a copy of burst times bt[] to store remaining 
        // burst times. 
        ArrayList<Integer> rem_bt = new ArrayList<>();

        for (int i = 0; i < ncpu.size(); i++) {
            rem_bt.add(ncpu.get(i));
        }

        int t = 0; // Current time 

        // Keep traversing processes in round robin manner 
        // until all of them are not done. 
        while (true) {
            boolean done = true;

            // Traverse all processes one by one repeatedly 
            for (int i = 0; i < tam_p; i++) {
                // If burst time of a process is greater than 0 
                // then only need to process further
                if (rem_bt.get(i) > 0) {
                    done = false; // There is a pending process 

                    if (rem_bt.get(i) > quantum) {
                        // Increase the value of t i.e. shows 
                        // how much time a process has been processed 
                        t += quantum;

                        // Decrease the burst_time of current process 
                        // by quantum 
                        rem_bt.set(i, rem_bt.get(i) - quantum);

                    } // If burst time is smaller than or equal to 
                    // quantum. Last cycle for this process 
                    else {
                        // Increase the value of t i.e. shows 
                        // how much time a process has been processed 
                        t = t + rem_bt.get(i);

                        // Waiting time is current time minus time 
                        // used by this process 
                        wt[i] = t - procesos.get(i);

                        // As the process gets fully executed 
                        // make its remaining burst time = 0 
                        rem_bt.set(i, 0);
                    }
                }
            }

            // If all processes are done 
            if (done == true) {
                break;
            }
        }
    }

    // Method to calculate turn around time 
    static void encontrarTiempoVuelta(ArrayList<Integer> procesos, int tam_proc,
            ArrayList<Integer> ncpu, int wt[], int tat[]) {
        // calculating turnaround time by adding 
        // bt[i] + wt[i] 
        for (int i = 0; i < tam_proc; i++) {
            tat[i] = ncpu.get(i) + wt[i];
        }
    }

    public void encontrarTiempoPromedio(ArrayList<Integer> proc, int tam_proc, ArrayList<Integer> ncpu,
            int quantum) {

        int wt[] = new int[tam_proc], tat[] = new int[tam_proc];
        int total_wt = 0, total_tat = 0;

        encontrarTiempoEspera(proc, tam_proc, ncpu, wt, quantum);
        encontrarTiempoVuelta(proc, tam_proc, ncpu, wt, tat);

        // Calculate total waiting time and total turn 
        // around time 
                
        for (int i = 0; i < tam_proc; i++) {
            total_wt = total_wt + wt[i];
            total_tat = total_tat + tat[i];
            
            //Resultado r = new Resultado((i+1), ncpu.get(i), wt[i], tat[i]);
        }
        
        System.out.println("Average waiting time = "
                + (float) total_wt / (float) tam_proc);
        System.out.println("Average turn around time = "
                + (float) total_tat / (float) tam_proc);
    }

    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new RoundRobinView().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnIniciar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JProgressBar progressBar;
    private javax.swing.JTable tblResultados;
    private javax.swing.JTextArea txtAreaProcesos;
    private javax.swing.JTextField txtNCPU;
    private javax.swing.JTextField txtProceso;
    private javax.swing.JTextField txtQuantum;
    // End of variables declaration//GEN-END:variables
}
