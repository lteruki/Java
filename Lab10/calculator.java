package Lab10;

import javax.swing.JButton;

@SuppressWarnings("serial")
public class calculator extends javax.swing.JFrame {

private Double v;

private Double v1;

private Double v2;

private Operator op;

private Double calc() {

switch (op) {

case ADD:

return v1 + v2;

case SUB:

return v1 - v2;

case MUL:

return v1 * v2;

case DIV:

return v1 / v2;

default:

return Double.NaN;

}

}

private enum Operator{

ADD,

SUB,

MUL,

DIV

}
public calculator() {

initComponents();
}
private void initComponents() {

jTextField1 = new javax.swing.JTextField();

jPanel1 = new javax.swing.JPanel();

jButton2 = new javax.swing.JButton();

jButton3 = new javax.swing.JButton();

jButton4 = new javax.swing.JButton();

jButton5 = new javax.swing.JButton();

jButton6 = new javax.swing.JButton();

jButton7 = new javax.swing.JButton();

jButton8 = new javax.swing.JButton();

jButton9 = new javax.swing.JButton();

jButton10 = new javax.swing.JButton();

jButton11 = new javax.swing.JButton();

jButton12 = new javax.swing.JButton();

jButton13 = new javax.swing.JButton();

jButton15 = new javax.swing.JButton();

jButton16 = new javax.swing.JButton();

jButton14 = new javax.swing.JButton();

jButton1 = new javax.swing.JButton();

jPanel3 = new javax.swing.JPanel();

jButton18 = new javax.swing.JButton();

jButton17 = new javax.swing.JButton();

jButton19 = new javax.swing.JButton();

setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

jTextField1.addActionListener(new java.awt.event.ActionListener() {

public void actionPerformed(java.awt.event.ActionEvent evt) {

jTextField1ActionPerformed(evt);

}

});

jPanel1.setLayout(new java.awt.GridLayout(4, 4));

jButton2.setText("1");

jButton2.addActionListener(new java.awt.event.ActionListener() {

public void actionPerformed(java.awt.event.ActionEvent evt) {

jButton2ActionPerformed(evt);

}

});

jPanel1.add(jButton2);

jButton3.setText("2");

jButton3.addActionListener(new java.awt.event.ActionListener() {

public void actionPerformed(java.awt.event.ActionEvent evt) {

jButton3ActionPerformed(evt);

}

});

jPanel1.add(jButton3);

jButton4.setText("3");

jButton4.addActionListener(new java.awt.event.ActionListener() {

public void actionPerformed(java.awt.event.ActionEvent evt) {

jButton4ActionPerformed(evt);

}

});

jPanel1.add(jButton4);

jButton5.setText("4");

jButton5.addActionListener(new java.awt.event.ActionListener() {

public void actionPerformed(java.awt.event.ActionEvent evt) {

jButton5ActionPerformed(evt);

}

});

jPanel1.add(jButton5);

jButton6.setText("5");

jButton6.addActionListener(new java.awt.event.ActionListener() {

public void actionPerformed(java.awt.event.ActionEvent evt) {

jButton6ActionPerformed(evt);

}

});

jPanel1.add(jButton6);

jButton7.setText("6");

jButton7.addActionListener(new java.awt.event.ActionListener() {

public void actionPerformed(java.awt.event.ActionEvent evt) {

jButton7ActionPerformed(evt);

}

});

jPanel1.add(jButton7);

jButton8.setText("7");

jButton8.addActionListener(new java.awt.event.ActionListener() {

public void actionPerformed(java.awt.event.ActionEvent evt) {

jButton8ActionPerformed(evt);

}

});

jPanel1.add(jButton8);

jButton9.setText("8");

jButton9.addActionListener(new java.awt.event.ActionListener() {

public void actionPerformed(java.awt.event.ActionEvent evt) {

jButton9ActionPerformed(evt);

}

});

jPanel1.add(jButton9);

jButton10.setText("9");

jButton10.addActionListener(new java.awt.event.ActionListener() {

public void actionPerformed(java.awt.event.ActionEvent evt) {

jButton10ActionPerformed(evt);

}

});

jPanel1.add(jButton10);

jButton11.setText("0");

jButton11.addActionListener(new java.awt.event.ActionListener() {

public void actionPerformed(java.awt.event.ActionEvent evt) {

jButton11ActionPerformed(evt);

}

});

jPanel1.add(jButton11);

jButton12.setText("+");

jButton12.addActionListener(new java.awt.event.ActionListener() {

public void actionPerformed(java.awt.event.ActionEvent evt) {

jButton12ActionPerformed(evt);

}

});

jPanel1.add(jButton12);

jButton13.setText("-");

jButton13.addActionListener(new java.awt.event.ActionListener() {

public void actionPerformed(java.awt.event.ActionEvent evt) {

jButton13ActionPerformed(evt);

}

});

jPanel1.add(jButton13);

jButton15.setText("*");

jButton15.addActionListener(new java.awt.event.ActionListener() {

public void actionPerformed(java.awt.event.ActionEvent evt) {

jButton15ActionPerformed(evt);

}

});

jPanel1.add(jButton15);

jButton16.setText("/");

jButton16.addActionListener(new java.awt.event.ActionListener() {

public void actionPerformed(java.awt.event.ActionEvent evt) {

jButton16ActionPerformed(evt);

}

});

jPanel1.add(jButton16);

jButton14.setText("=");

jButton14.addActionListener(new java.awt.event.ActionListener() {

public void actionPerformed(java.awt.event.ActionEvent evt) {

jButton14ActionPerformed(evt);

}

});

jPanel1.add(jButton14);

jButton1.setText(".");

jButton1.addActionListener(new java.awt.event.ActionListener() {

public void actionPerformed(java.awt.event.ActionEvent evt) {

jButton1ActionPerformed(evt);

}

});

jPanel1.add(jButton1);

jButton18.setText("C");

jButton18.addActionListener(new java.awt.event.ActionListener() {

public void actionPerformed(java.awt.event.ActionEvent evt) {

jButton18ActionPerformed(evt);

}

});

jButton17.setText("MR");

jButton17.addActionListener(new java.awt.event.ActionListener() {

public void actionPerformed(java.awt.event.ActionEvent evt) {

jButton17ActionPerformed(evt);

}

});

jButton19.setText("MC");

jButton19.addActionListener(new java.awt.event.ActionListener() {

public void actionPerformed(java.awt.event.ActionEvent evt) {

jButton19ActionPerformed(evt);

}

});

javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);

jPanel3.setLayout(jPanel3Layout);

jPanel3Layout.setHorizontalGroup(

jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

.addGroup(jPanel3Layout.createSequentialGroup()

.addContainerGap()

.addComponent(jButton18)

.addGap(18, 18, 18)

.addComponent(jButton17)

.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)

.addComponent(jButton19)

.addContainerGap(248, Short.MAX_VALUE))

);

jPanel3Layout.setVerticalGroup(

jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

.addGroup(jPanel3Layout.createSequentialGroup()

.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)

.addComponent(jButton18)

.addComponent(jButton17)

.addComponent(jButton19))

.addGap(0, 12, Short.MAX_VALUE))

);

javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());

getContentPane().setLayout(layout);

layout.setHorizontalGroup(

layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

.addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)

.addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING)

.addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)

);

layout.setVerticalGroup(

layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

.addGroup(layout.createSequentialGroup()

.addContainerGap()

.addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)

.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)

.addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)

.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)

.addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE))

);

pack();

}

private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {

}

private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {

addDigit(((JButton)evt.getSource()).getText());

}

private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {

addDigit(((JButton)evt.getSource()).getText());

}

private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {

addDigit(((JButton)evt.getSource()).getText());

}

private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {

addDigit(((JButton)evt.getSource()).getText());

}

private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {

addDigit(((JButton)evt.getSource()).getText());

}

private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {

addDigit(((JButton)evt.getSource()).getText());

}

private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {

addDigit(((JButton)evt.getSource()).getText());

}

private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {

addDigit(((JButton)evt.getSource()).getText());

}

private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {

addDigit(((JButton)evt.getSource()).getText());

}

private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {

addDigit(((JButton)evt.getSource()).getText());

}

private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {

clear();

}

private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {

v1= Double.parseDouble(jTextField1.getText());

clear();

op = Operator.ADD;

}

private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {

v2 = Double.parseDouble(jTextField1.getText());

jTextField1.setText(calc().toString());

}

private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {

v1= Double.parseDouble(jTextField1.getText());

clear();

op = Operator.SUB;

}

private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {

v1= Double.parseDouble(jTextField1.getText());

clear();

op = Operator.MUL;

}

private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {

v1= Double.parseDouble(jTextField1.getText());

clear();

op = Operator.DIV;

}

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {

addDigit(((JButton)evt.getSource()).getText());

}

private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {

jTextField1.setText(v.toString());

}

private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {

v= Double.parseDouble(jTextField1.getText());

clear();

}



public static void main(String args[]) {

try {

for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {

if ("Nimbus".equals(info.getName())) {

javax.swing.UIManager.setLookAndFeel(info.getClassName());

break;

}

}

} catch (ClassNotFoundException ex) {

java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);

} catch (InstantiationException ex) {

java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);

} catch (IllegalAccessException ex) {

java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);

} catch (javax.swing.UnsupportedLookAndFeelException ex) {

java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);

}

java.awt.EventQueue.invokeLater(new Runnable() {

public void run() {

new calculator().setVisible(true);

}

});

}

private javax.swing.JButton jButton1;

private javax.swing.JButton jButton10;

private javax.swing.JButton jButton11;

private javax.swing.JButton jButton12;

private javax.swing.JButton jButton13;

private javax.swing.JButton jButton14;

private javax.swing.JButton jButton15;

private javax.swing.JButton jButton16;

private javax.swing.JButton jButton17;

private javax.swing.JButton jButton18;

private javax.swing.JButton jButton19;

private javax.swing.JButton jButton2;

private javax.swing.JButton jButton3;

private javax.swing.JButton jButton4;

private javax.swing.JButton jButton5;

private javax.swing.JButton jButton6;

private javax.swing.JButton jButton7;

private javax.swing.JButton jButton8;

private javax.swing.JButton jButton9;

private javax.swing.JPanel jPanel1;

private javax.swing.JPanel jPanel3;

private javax.swing.JTextField jTextField1;

private void addDigit(String text) {

jTextField1.setText(jTextField1.getText()+text);

}


private void clear() {

jTextField1.setText("");

}

}