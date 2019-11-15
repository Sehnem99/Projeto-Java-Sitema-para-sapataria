/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JButton;

/**
 *
 * @author suporte
 */
public class frmPrincipal extends javax.swing.JFrame {
    
    /**
     * Creates new form frmPrincipal
     */
    public frmPrincipal() {
        initComponents();
        
        ArrayList<JButton> listaBotao = new ArrayList<>();

        listaBotao.add(btn1);
        listaBotao.add(btn2);
        listaBotao.add(btn3);
        listaBotao.add(btn4);
        listaBotao.add(btn5);
        listaBotao.add(btn6);
        listaBotao.add(btn7);
        listaBotao.add(btn8);
        listaBotao.add(btn9);
        listaBotao.add(btn10);
        listaBotao.add(btn11);
        listaBotao.add(btn12);
        listaBotao.add(btn13);
        listaBotao.add(btn14);
        listaBotao.add(btn15);

        listaBotao.add(btn16);
        listaBotao.add(btn17);
        listaBotao.add(btn18);
        listaBotao.add(btn19);
        listaBotao.add(btn20);
        listaBotao.add(btn21);
        listaBotao.add(btn22);
        listaBotao.add(btn23);
        listaBotao.add(btn24);
        listaBotao.add(btn25);
        listaBotao.add(btn26);
        listaBotao.add(btn27);
        listaBotao.add(btn28);
        listaBotao.add(btn29);
        listaBotao.add(btn30);

        listaBotao.add(btn31);
        listaBotao.add(btn32);
        listaBotao.add(btn33);
        listaBotao.add(btn34);
        listaBotao.add(btn35);
        listaBotao.add(btn36);
        listaBotao.add(btn37);
        listaBotao.add(btn38);
        listaBotao.add(btn39);
        listaBotao.add(btn40);
        listaBotao.add(btn41);
        listaBotao.add(btn42);
        listaBotao.add(btn43);
        listaBotao.add(btn44);
        listaBotao.add(btn45);

        listaBotao.add(btn46);
        listaBotao.add(btn47);
        listaBotao.add(btn48);
        listaBotao.add(btn49);
        listaBotao.add(btn50);
        listaBotao.add(btn51);
        listaBotao.add(btn52);
        listaBotao.add(btn53);
        listaBotao.add(btn54);
        listaBotao.add(btn55);
        listaBotao.add(btn56);
        listaBotao.add(btn57);
        listaBotao.add(btn58);
        listaBotao.add(btn59);
        listaBotao.add(btn60);

        listaBotao.add(btn61);
        listaBotao.add(btn62);
        listaBotao.add(btn63);
        listaBotao.add(btn64);
        listaBotao.add(btn65);
        listaBotao.add(btn66);
        listaBotao.add(btn67);
        listaBotao.add(btn68);
        listaBotao.add(btn69);
        listaBotao.add(btn70);
        listaBotao.add(btn71);
        listaBotao.add(btn72);
        listaBotao.add(btn73);
        listaBotao.add(btn74);
        listaBotao.add(btn75);

        listaBotao.add(btn76);
        listaBotao.add(btn77);
        listaBotao.add(btn78);
        listaBotao.add(btn79);
        listaBotao.add(btn80);
        listaBotao.add(btn81);
        listaBotao.add(btn82);
        listaBotao.add(btn83);
        listaBotao.add(btn84);
        listaBotao.add(btn85);
        listaBotao.add(btn86);
        listaBotao.add(btn87);
        listaBotao.add(btn88);
        listaBotao.add(btn89);
        listaBotao.add(btn90);

        listaBotao.add(btn91);
        listaBotao.add(btn92);
        listaBotao.add(btn93);
        listaBotao.add(btn94);
        listaBotao.add(btn95);
        listaBotao.add(btn96);
        listaBotao.add(btn97);
        listaBotao.add(btn98);
        listaBotao.add(btn99);
        listaBotao.add(btn100);
        listaBotao.add(btn101);
        listaBotao.add(btn102);
        listaBotao.add(btn103);
        listaBotao.add(btn104);
        listaBotao.add(btn105);

        listaBotao.add(btn106);
        listaBotao.add(btn107);
        listaBotao.add(btn108);
        listaBotao.add(btn109);
        listaBotao.add(btn110);
        listaBotao.add(btn111);
        listaBotao.add(btn112);
        listaBotao.add(btn113);
        listaBotao.add(btn114);
        listaBotao.add(btn115);
        listaBotao.add(btn116);
        listaBotao.add(btn117);
        listaBotao.add(btn118);
        listaBotao.add(btn119);
        listaBotao.add(btn120);

        listaBotao.add(btn121);
        listaBotao.add(btn122);
        listaBotao.add(btn123);
        listaBotao.add(btn124);
        listaBotao.add(btn125);
        listaBotao.add(btn126);
        listaBotao.add(btn127);
        listaBotao.add(btn128);
        listaBotao.add(btn129);
        listaBotao.add(btn130);
        listaBotao.add(btn131);
        listaBotao.add(btn132);
        listaBotao.add(btn133);
        listaBotao.add(btn134);
        listaBotao.add(btn135);

        listaBotao.add(btn136);
        listaBotao.add(btn137);
        listaBotao.add(btn138);
        listaBotao.add(btn139);
        listaBotao.add(btn140);
        listaBotao.add(btn141);
        listaBotao.add(btn142);
        listaBotao.add(btn143);
        listaBotao.add(btn144);
        listaBotao.add(btn145);
        listaBotao.add(btn146);
        listaBotao.add(btn147);
        listaBotao.add(btn148);
        listaBotao.add(btn149);
        listaBotao.add(btn150);

        for (int i = 0; i < listaBotao.size(); i++) {
            listaBotao.get(i).setName("btn" + Integer.toString(i + 1));
            listaBotao.get(i).setText(Integer.toString(i + 1));
            listaBotao.get(i).setFont(new java.awt.Font("Tahoma", 1, 35));
            listaBotao.get(i).setBackground(Color.green);
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

        jPanel1 = new javax.swing.JPanel();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn10 = new javax.swing.JButton();
        btn15 = new javax.swing.JButton();
        btn14 = new javax.swing.JButton();
        btn13 = new javax.swing.JButton();
        btn12 = new javax.swing.JButton();
        btn11 = new javax.swing.JButton();
        btn23 = new javax.swing.JButton();
        btn24 = new javax.swing.JButton();
        btn25 = new javax.swing.JButton();
        btn29 = new javax.swing.JButton();
        btn28 = new javax.swing.JButton();
        btn27 = new javax.swing.JButton();
        btn26 = new javax.swing.JButton();
        btn16 = new javax.swing.JButton();
        btn17 = new javax.swing.JButton();
        btn18 = new javax.swing.JButton();
        btn19 = new javax.swing.JButton();
        btn20 = new javax.swing.JButton();
        btn21 = new javax.swing.JButton();
        btn22 = new javax.swing.JButton();
        btn30 = new javax.swing.JButton();
        btn34 = new javax.swing.JButton();
        btn42 = new javax.swing.JButton();
        btn41 = new javax.swing.JButton();
        btn31 = new javax.swing.JButton();
        btn38 = new javax.swing.JButton();
        btn36 = new javax.swing.JButton();
        btn43 = new javax.swing.JButton();
        btn44 = new javax.swing.JButton();
        btn45 = new javax.swing.JButton();
        btn37 = new javax.swing.JButton();
        btn39 = new javax.swing.JButton();
        btn40 = new javax.swing.JButton();
        btn33 = new javax.swing.JButton();
        btn35 = new javax.swing.JButton();
        btn32 = new javax.swing.JButton();
        btn52 = new javax.swing.JButton();
        btn46 = new javax.swing.JButton();
        btn53 = new javax.swing.JButton();
        btn60 = new javax.swing.JButton();
        btn51 = new javax.swing.JButton();
        btn47 = new javax.swing.JButton();
        btn57 = new javax.swing.JButton();
        btn50 = new javax.swing.JButton();
        btn58 = new javax.swing.JButton();
        btn54 = new javax.swing.JButton();
        btn55 = new javax.swing.JButton();
        btn48 = new javax.swing.JButton();
        btn49 = new javax.swing.JButton();
        btn56 = new javax.swing.JButton();
        btn59 = new javax.swing.JButton();
        btn64 = new javax.swing.JButton();
        btn72 = new javax.swing.JButton();
        btn71 = new javax.swing.JButton();
        btn61 = new javax.swing.JButton();
        btn68 = new javax.swing.JButton();
        btn66 = new javax.swing.JButton();
        btn73 = new javax.swing.JButton();
        btn67 = new javax.swing.JButton();
        btn69 = new javax.swing.JButton();
        btn70 = new javax.swing.JButton();
        btn63 = new javax.swing.JButton();
        btn65 = new javax.swing.JButton();
        btn62 = new javax.swing.JButton();
        btn82 = new javax.swing.JButton();
        btn76 = new javax.swing.JButton();
        btn83 = new javax.swing.JButton();
        btn81 = new javax.swing.JButton();
        btn77 = new javax.swing.JButton();
        btn87 = new javax.swing.JButton();
        btn80 = new javax.swing.JButton();
        btn88 = new javax.swing.JButton();
        btn84 = new javax.swing.JButton();
        btn85 = new javax.swing.JButton();
        btn78 = new javax.swing.JButton();
        btn79 = new javax.swing.JButton();
        btn86 = new javax.swing.JButton();
        btn106 = new javax.swing.JButton();
        btn97 = new javax.swing.JButton();
        btn111 = new javax.swing.JButton();
        btn116 = new javax.swing.JButton();
        btn101 = new javax.swing.JButton();
        btn109 = new javax.swing.JButton();
        btn100 = new javax.swing.JButton();
        btn107 = new javax.swing.JButton();
        btn94 = new javax.swing.JButton();
        btn115 = new javax.swing.JButton();
        btn99 = new javax.swing.JButton();
        btn91 = new javax.swing.JButton();
        btn93 = new javax.swing.JButton();
        btn102 = new javax.swing.JButton();
        btn112 = new javax.swing.JButton();
        btn110 = new javax.swing.JButton();
        btn92 = new javax.swing.JButton();
        btn108 = new javax.swing.JButton();
        btn95 = new javax.swing.JButton();
        btn96 = new javax.swing.JButton();
        btn118 = new javax.swing.JButton();
        btn117 = new javax.swing.JButton();
        btn98 = new javax.swing.JButton();
        btn114 = new javax.swing.JButton();
        btn113 = new javax.swing.JButton();
        btn103 = new javax.swing.JButton();
        btn148 = new javax.swing.JButton();
        btn131 = new javax.swing.JButton();
        btn130 = new javax.swing.JButton();
        btn127 = new javax.swing.JButton();
        btn141 = new javax.swing.JButton();
        btn132 = new javax.swing.JButton();
        btn144 = new javax.swing.JButton();
        btn129 = new javax.swing.JButton();
        btn126 = new javax.swing.JButton();
        btn122 = new javax.swing.JButton();
        btn138 = new javax.swing.JButton();
        btn128 = new javax.swing.JButton();
        btn136 = new javax.swing.JButton();
        btn124 = new javax.swing.JButton();
        btn133 = new javax.swing.JButton();
        btn145 = new javax.swing.JButton();
        btn143 = new javax.swing.JButton();
        btn137 = new javax.swing.JButton();
        btn140 = new javax.swing.JButton();
        btn125 = new javax.swing.JButton();
        btn139 = new javax.swing.JButton();
        btn123 = new javax.swing.JButton();
        btn147 = new javax.swing.JButton();
        btn121 = new javax.swing.JButton();
        btn146 = new javax.swing.JButton();
        btn142 = new javax.swing.JButton();
        btn74 = new javax.swing.JButton();
        btn75 = new javax.swing.JButton();
        btn89 = new javax.swing.JButton();
        btn90 = new javax.swing.JButton();
        btn104 = new javax.swing.JButton();
        btn105 = new javax.swing.JButton();
        btn119 = new javax.swing.JButton();
        btn120 = new javax.swing.JButton();
        btn134 = new javax.swing.JButton();
        btn135 = new javax.swing.JButton();
        btn149 = new javax.swing.JButton();
        btn150 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(0));

        btn1.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn1.setText("1");
        btn1.setName("btn1"); // NOI18N

        btn2.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn2.setText("1");
        btn2.setName("btn2"); // NOI18N

        btn3.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn3.setText("1");
        btn3.setName("btn3"); // NOI18N

        btn4.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn4.setText("1");
        btn4.setName("btn4"); // NOI18N

        btn5.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn5.setText("1");
        btn5.setName("btn5"); // NOI18N

        btn6.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn6.setText("1");
        btn6.setName("btn6"); // NOI18N

        btn7.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn7.setText("1");
        btn7.setName("btn7"); // NOI18N

        btn8.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn8.setText("1");
        btn8.setName("btn8"); // NOI18N

        btn9.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn9.setText("1");
        btn9.setName("btn9"); // NOI18N

        btn10.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn10.setText("1");
        btn10.setName("btn10"); // NOI18N

        btn15.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn15.setText("1");
        btn15.setName("btn15"); // NOI18N

        btn14.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn14.setText("1");
        btn14.setName("btn14"); // NOI18N

        btn13.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn13.setText("1");
        btn13.setName("btn13"); // NOI18N

        btn12.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn12.setText("1");
        btn12.setName("btn12"); // NOI18N

        btn11.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn11.setText("1");
        btn11.setName("btn11"); // NOI18N

        btn23.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn23.setText("1");
        btn23.setName("btn23"); // NOI18N

        btn24.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn24.setText("1");
        btn24.setName("btn24"); // NOI18N

        btn25.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn25.setText("1");
        btn25.setName("btn25"); // NOI18N

        btn29.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn29.setText("1");
        btn29.setName("btn29"); // NOI18N

        btn28.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn28.setText("1");
        btn28.setName("btn28"); // NOI18N

        btn27.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn27.setText("1");
        btn27.setName("btn27"); // NOI18N

        btn26.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn26.setText("1");
        btn26.setName("btn26"); // NOI18N

        btn16.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn16.setText("1");
        btn16.setName("btn16"); // NOI18N

        btn17.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn17.setText("1");
        btn17.setName("btn17"); // NOI18N

        btn18.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn18.setText("1");
        btn18.setName("btn18"); // NOI18N

        btn19.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn19.setText("1");
        btn19.setName("btn19"); // NOI18N

        btn20.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn20.setText("1");
        btn20.setName("btn20"); // NOI18N

        btn21.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn21.setText("1");
        btn21.setName("btn21"); // NOI18N

        btn22.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn22.setText("1");
        btn22.setName("btn22"); // NOI18N

        btn30.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn30.setText("1");
        btn30.setName("btn30"); // NOI18N

        btn34.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn34.setText("1");
        btn34.setName("btn34"); // NOI18N

        btn42.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn42.setText("1");
        btn42.setName("btn42"); // NOI18N

        btn41.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn41.setText("1");
        btn41.setName("btn41"); // NOI18N

        btn31.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn31.setText("1");
        btn31.setName("btn31"); // NOI18N

        btn38.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn38.setText("1");
        btn38.setName("btn38"); // NOI18N

        btn36.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn36.setText("1");
        btn36.setName("btn36"); // NOI18N

        btn43.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn43.setText("1");
        btn43.setName("btn43"); // NOI18N

        btn44.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn44.setText("1");
        btn44.setName("btn44"); // NOI18N

        btn45.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn45.setText("1");
        btn45.setName("btn45"); // NOI18N

        btn37.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn37.setText("1");
        btn37.setName("btn37"); // NOI18N

        btn39.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn39.setText("1");
        btn39.setName("btn39"); // NOI18N

        btn40.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn40.setText("1");
        btn40.setName("btn40"); // NOI18N

        btn33.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn33.setText("1");
        btn33.setName("btn33"); // NOI18N

        btn35.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn35.setText("1");
        btn35.setName("btn35"); // NOI18N

        btn32.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn32.setText("1");
        btn32.setName("btn32"); // NOI18N

        btn52.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn52.setText("1");
        btn52.setName("btn52"); // NOI18N

        btn46.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn46.setText("1");
        btn46.setName("btn46"); // NOI18N

        btn53.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn53.setText("1");
        btn53.setName("btn53"); // NOI18N

        btn60.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn60.setText("1");
        btn60.setName("btn60"); // NOI18N

        btn51.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn51.setText("1");
        btn51.setName("btn51"); // NOI18N

        btn47.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn47.setText("1");
        btn47.setName("btn47"); // NOI18N

        btn57.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn57.setText("1");
        btn57.setName("btn57"); // NOI18N

        btn50.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn50.setText("1");
        btn50.setName("btn50"); // NOI18N

        btn58.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn58.setText("1");
        btn58.setName("btn58"); // NOI18N

        btn54.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn54.setText("1");
        btn54.setName("btn54"); // NOI18N

        btn55.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn55.setText("1");
        btn55.setName("btn55"); // NOI18N

        btn48.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn48.setText("1");
        btn48.setName("btn48"); // NOI18N

        btn49.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn49.setText("1");
        btn49.setName("btn49"); // NOI18N

        btn56.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn56.setText("1");
        btn56.setName("btn56"); // NOI18N

        btn59.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn59.setText("1");
        btn59.setName("btn59"); // NOI18N

        btn64.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn64.setText("1");
        btn64.setName("btn64"); // NOI18N

        btn72.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn72.setText("1");
        btn72.setName("btn72"); // NOI18N

        btn71.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn71.setText("1");
        btn71.setName("btn71"); // NOI18N

        btn61.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn61.setText("1");
        btn61.setName("btn61"); // NOI18N

        btn68.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn68.setText("1");
        btn68.setName("btn68"); // NOI18N

        btn66.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn66.setText("1");
        btn66.setName("btn66"); // NOI18N

        btn73.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn73.setText("1");
        btn73.setName("btn73"); // NOI18N

        btn67.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn67.setText("1");
        btn67.setName("btn67"); // NOI18N

        btn69.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn69.setText("1");
        btn69.setName("btn69"); // NOI18N

        btn70.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn70.setText("1");
        btn70.setName("btn70"); // NOI18N

        btn63.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn63.setText("1");
        btn63.setName("btn63"); // NOI18N

        btn65.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn65.setText("1");
        btn65.setName("btn65"); // NOI18N

        btn62.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn62.setText("1");
        btn62.setName("btn62"); // NOI18N

        btn82.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn82.setText("1");
        btn82.setName("btn82"); // NOI18N

        btn76.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn76.setText("1");
        btn76.setName("btn76"); // NOI18N

        btn83.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn83.setText("1");
        btn83.setName("btn83"); // NOI18N

        btn81.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn81.setText("1");
        btn81.setName("btn81"); // NOI18N

        btn77.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn77.setText("1");
        btn77.setName("btn77"); // NOI18N

        btn87.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn87.setText("1");
        btn87.setName("btn87"); // NOI18N

        btn80.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn80.setText("1");
        btn80.setName("btn80"); // NOI18N

        btn88.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn88.setText("1");
        btn88.setName("btn88"); // NOI18N

        btn84.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn84.setText("1");
        btn84.setName("btn84"); // NOI18N

        btn85.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn85.setText("1");
        btn85.setName("btn85"); // NOI18N

        btn78.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn78.setText("1");
        btn78.setName("btn78"); // NOI18N

        btn79.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn79.setText("1");
        btn79.setName("btn79"); // NOI18N

        btn86.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn86.setText("1");
        btn86.setName("btn86"); // NOI18N

        btn106.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn106.setText("1");
        btn106.setName("btn106"); // NOI18N

        btn97.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn97.setText("1");
        btn97.setName("btn97"); // NOI18N

        btn111.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn111.setText("1");
        btn111.setName("btn111"); // NOI18N

        btn116.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn116.setText("1");
        btn116.setName("btn116"); // NOI18N

        btn101.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn101.setText("1");
        btn101.setName("btn101"); // NOI18N

        btn109.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn109.setText("1");
        btn109.setName("btn109"); // NOI18N

        btn100.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn100.setText("1");
        btn100.setName("btn100"); // NOI18N

        btn107.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn107.setText("1");
        btn107.setName("btn107"); // NOI18N

        btn94.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn94.setText("1");
        btn94.setName("btn94"); // NOI18N

        btn115.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn115.setText("1");
        btn115.setName("btn115"); // NOI18N

        btn99.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn99.setText("1");
        btn99.setName("btn99"); // NOI18N

        btn91.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn91.setText("1");
        btn91.setName("btn91"); // NOI18N

        btn93.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn93.setText("1");
        btn93.setName("btn93"); // NOI18N

        btn102.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn102.setText("1");
        btn102.setName("btn102"); // NOI18N

        btn112.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn112.setText("1");
        btn112.setName("btn112"); // NOI18N

        btn110.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn110.setText("1");
        btn110.setName("btn110"); // NOI18N

        btn92.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn92.setText("1");
        btn92.setName("btn92"); // NOI18N

        btn108.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn108.setText("1");
        btn108.setName("btn108"); // NOI18N

        btn95.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn95.setText("1");
        btn95.setName("btn95"); // NOI18N

        btn96.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn96.setText("1");
        btn96.setName("btn96"); // NOI18N

        btn118.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn118.setText("1");
        btn118.setName("btn118"); // NOI18N

        btn117.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn117.setText("1");
        btn117.setName("btn117"); // NOI18N

        btn98.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn98.setText("1");
        btn98.setName("btn98"); // NOI18N

        btn114.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn114.setText("1");
        btn114.setName("btn114"); // NOI18N

        btn113.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn113.setText("1");
        btn113.setName("btn113"); // NOI18N

        btn103.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn103.setText("1");
        btn103.setName("btn103"); // NOI18N

        btn148.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn148.setText("1");
        btn148.setName("btn148"); // NOI18N

        btn131.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn131.setText("1");
        btn131.setName("btn131"); // NOI18N

        btn130.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn130.setText("1");
        btn130.setName("btn130"); // NOI18N

        btn127.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn127.setText("1");
        btn127.setName("btn127"); // NOI18N

        btn141.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn141.setText("1");
        btn141.setName("btn141"); // NOI18N

        btn132.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn132.setText("1");
        btn132.setName("btn132"); // NOI18N

        btn144.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn144.setText("1");
        btn144.setName("btn144"); // NOI18N

        btn129.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn129.setText("1");
        btn129.setName("btn129"); // NOI18N

        btn126.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn126.setText("1");
        btn126.setName("btn126"); // NOI18N

        btn122.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn122.setText("1");
        btn122.setName("btn122"); // NOI18N

        btn138.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn138.setText("1");
        btn138.setName("btn138"); // NOI18N

        btn128.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn128.setText("1");
        btn128.setName("btn128"); // NOI18N

        btn136.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn136.setText("1");
        btn136.setName("btn136"); // NOI18N

        btn124.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn124.setText("1");
        btn124.setName("btn124"); // NOI18N

        btn133.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn133.setText("1");
        btn133.setName("btn133"); // NOI18N

        btn145.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn145.setText("1");
        btn145.setName("btn145"); // NOI18N

        btn143.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn143.setText("1");
        btn143.setName("btn143"); // NOI18N

        btn137.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn137.setText("1");
        btn137.setName("btn137"); // NOI18N

        btn140.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn140.setText("1");
        btn140.setName("btn140"); // NOI18N

        btn125.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn125.setText("1");
        btn125.setName("btn125"); // NOI18N

        btn139.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn139.setText("1");
        btn139.setName("btn139"); // NOI18N

        btn123.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn123.setText("1");
        btn123.setName("btn123"); // NOI18N

        btn147.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn147.setText("1");
        btn147.setName("btn147"); // NOI18N

        btn121.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn121.setText("1");
        btn121.setName("btn121"); // NOI18N

        btn146.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn146.setText("1");
        btn146.setName("btn146"); // NOI18N

        btn142.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn142.setText("1");
        btn142.setName("btn142"); // NOI18N

        btn74.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn74.setText("1");
        btn74.setName("btn72"); // NOI18N

        btn75.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn75.setText("1");
        btn75.setName("btn73"); // NOI18N

        btn89.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn89.setText("1");
        btn89.setName("btn87"); // NOI18N

        btn90.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn90.setText("1");
        btn90.setName("btn88"); // NOI18N

        btn104.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn104.setText("1");
        btn104.setName("btn102"); // NOI18N

        btn105.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn105.setText("1");
        btn105.setName("btn103"); // NOI18N

        btn119.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn119.setText("1");
        btn119.setName("btn117"); // NOI18N

        btn120.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn120.setText("1");
        btn120.setName("btn118"); // NOI18N

        btn134.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn134.setText("1");
        btn134.setName("btn132"); // NOI18N

        btn135.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn135.setText("1");
        btn135.setName("btn133"); // NOI18N

        btn149.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn149.setText("1");
        btn149.setName("btn147"); // NOI18N

        btn150.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        btn150.setText("1");
        btn150.setName("btn148"); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn10, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn11, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn12, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn13, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn14, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn15, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn16, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn31, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn46, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn17, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn32, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn47, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn18, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn33, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn48, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn19, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn34, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn49, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn20, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn35, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn50, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn21, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn36, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn51, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn22, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn37, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn52, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn23, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn38, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn53, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn24, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn39, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn54, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn25, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn40, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn55, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn26, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn41, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn56, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn27, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn42, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn57, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn28, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn43, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn58, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn29, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn44, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn59, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn30, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn45, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn60, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn121, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn136, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn122, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn137, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn123, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn138, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn124, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn139, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn125, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn140, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn126, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn141, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn127, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn142, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn128, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn143, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn129, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn144, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn130, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn145, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn131, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn146, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn132, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn147, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn133, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn148, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn61, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn76, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn62, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn77, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn63, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn78, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn64, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn79, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn65, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn80, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn66, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn81, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn67, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn82, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn68, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn83, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn69, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn84, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn70, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn85, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn71, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn86, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn72, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn87, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn73, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn74, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn75, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn88, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btn134, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btn149, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btn135, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btn150, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btn89, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btn90, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btn104, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btn119, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btn105, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btn120, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn91, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn106, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn92, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn107, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn93, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn108, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn94, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn109, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn95, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn110, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn96, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn111, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn97, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn112, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn98, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn113, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn99, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn114, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn100, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn115, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn101, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn116, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn102, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn117, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn103, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn118, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn10, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn11, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn12, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn13, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn14, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn15, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn16, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn17, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn18, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn19, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn20, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn21, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn22, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn23, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn24, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn25, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn26, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn27, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn28, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn29, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn30, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn31, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn32, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn33, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn34, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn35, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn36, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn37, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn38, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn39, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn40, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn41, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn42, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn43, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn44, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn45, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn46, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn47, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn48, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn49, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn50, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn51, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn52, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn53, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn54, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn55, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn56, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn57, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn58, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn59, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn60, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn61, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn62, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn63, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn64, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn65, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn66, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn67, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn68, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn69, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn70, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn71, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn72, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn73, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn74, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn75, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn76, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn77, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn78, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn79, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn80, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn81, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn82, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn83, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn84, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn85, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn86, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn87, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn88, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn91, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn92, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn93, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn94, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn95, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn96, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn97, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn98, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn99, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn100, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn101, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn102, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn103, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn106, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn107, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn108, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn109, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn110, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn111, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn112, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn113, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn114, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn115, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn116, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn117, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn118, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn121, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn122, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn123, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn124, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn125, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn126, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn127, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn128, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn129, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn130, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn131, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn132, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn133, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn136, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn137, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn138, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn139, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn140, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn141, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn142, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn143, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn144, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn145, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn146, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn147, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn148, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn89, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn90, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn104, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn105, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn119, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn120, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn134, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn135, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn149, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn150, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/1369923900266202317edit_business_user.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/1672233.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/214362.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/oie_transparent.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jLabel5.setText("Cadastrar Cliente");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jLabel8.setText("Novo Serviço");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jLabel6.setText("Carteira");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jLabel7.setText("Relatórios");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jLabel8))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(jLabel6))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(jLabel7)))
                .addContainerGap(233, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(81, 81, 81)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addGap(57, 57, 57)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(86, 86, 86)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(75, 75, 75)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setExtendedState(MAXIMIZED_BOTH);
    }//GEN-LAST:event_formWindowOpened

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        frmCadCliente TelaCadastro = new frmCadCliente();
        
        TelaCadastro.setVisible(true);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        //frmServico servico = new frmServico();

        //servico.setVisible(true);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        //frmCarteira carteira = new frmCarteira();

        //carteira.setVisible(true);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        //frmRelatorio relatorio = new frmRelatorio();

        //relatorio.setVisible(true);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        frmCadCliente TelaCadastro = new frmCadCliente();
        
        TelaCadastro.setVisible(true);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        frmLogin login = new frmLogin();
        
        login.setVisible(true);
    }//GEN-LAST:event_jLabel4MouseClicked

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
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn10;
    private javax.swing.JButton btn100;
    private javax.swing.JButton btn101;
    private javax.swing.JButton btn102;
    private javax.swing.JButton btn103;
    private javax.swing.JButton btn104;
    private javax.swing.JButton btn105;
    private javax.swing.JButton btn106;
    private javax.swing.JButton btn107;
    private javax.swing.JButton btn108;
    private javax.swing.JButton btn109;
    private javax.swing.JButton btn11;
    private javax.swing.JButton btn110;
    private javax.swing.JButton btn111;
    private javax.swing.JButton btn112;
    private javax.swing.JButton btn113;
    private javax.swing.JButton btn114;
    private javax.swing.JButton btn115;
    private javax.swing.JButton btn116;
    private javax.swing.JButton btn117;
    private javax.swing.JButton btn118;
    private javax.swing.JButton btn119;
    private javax.swing.JButton btn12;
    private javax.swing.JButton btn120;
    private javax.swing.JButton btn121;
    private javax.swing.JButton btn122;
    private javax.swing.JButton btn123;
    private javax.swing.JButton btn124;
    private javax.swing.JButton btn125;
    private javax.swing.JButton btn126;
    private javax.swing.JButton btn127;
    private javax.swing.JButton btn128;
    private javax.swing.JButton btn129;
    private javax.swing.JButton btn13;
    private javax.swing.JButton btn130;
    private javax.swing.JButton btn131;
    private javax.swing.JButton btn132;
    private javax.swing.JButton btn133;
    private javax.swing.JButton btn134;
    private javax.swing.JButton btn135;
    private javax.swing.JButton btn136;
    private javax.swing.JButton btn137;
    private javax.swing.JButton btn138;
    private javax.swing.JButton btn139;
    private javax.swing.JButton btn14;
    private javax.swing.JButton btn140;
    private javax.swing.JButton btn141;
    private javax.swing.JButton btn142;
    private javax.swing.JButton btn143;
    private javax.swing.JButton btn144;
    private javax.swing.JButton btn145;
    private javax.swing.JButton btn146;
    private javax.swing.JButton btn147;
    private javax.swing.JButton btn148;
    private javax.swing.JButton btn149;
    private javax.swing.JButton btn15;
    private javax.swing.JButton btn150;
    private javax.swing.JButton btn16;
    private javax.swing.JButton btn17;
    private javax.swing.JButton btn18;
    private javax.swing.JButton btn19;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn20;
    private javax.swing.JButton btn21;
    private javax.swing.JButton btn22;
    private javax.swing.JButton btn23;
    private javax.swing.JButton btn24;
    private javax.swing.JButton btn25;
    private javax.swing.JButton btn26;
    private javax.swing.JButton btn27;
    private javax.swing.JButton btn28;
    private javax.swing.JButton btn29;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn30;
    private javax.swing.JButton btn31;
    private javax.swing.JButton btn32;
    private javax.swing.JButton btn33;
    private javax.swing.JButton btn34;
    private javax.swing.JButton btn35;
    private javax.swing.JButton btn36;
    private javax.swing.JButton btn37;
    private javax.swing.JButton btn38;
    private javax.swing.JButton btn39;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn40;
    private javax.swing.JButton btn41;
    private javax.swing.JButton btn42;
    private javax.swing.JButton btn43;
    private javax.swing.JButton btn44;
    private javax.swing.JButton btn45;
    private javax.swing.JButton btn46;
    private javax.swing.JButton btn47;
    private javax.swing.JButton btn48;
    private javax.swing.JButton btn49;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn50;
    private javax.swing.JButton btn51;
    private javax.swing.JButton btn52;
    private javax.swing.JButton btn53;
    private javax.swing.JButton btn54;
    private javax.swing.JButton btn55;
    private javax.swing.JButton btn56;
    private javax.swing.JButton btn57;
    private javax.swing.JButton btn58;
    private javax.swing.JButton btn59;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn60;
    private javax.swing.JButton btn61;
    private javax.swing.JButton btn62;
    private javax.swing.JButton btn63;
    private javax.swing.JButton btn64;
    private javax.swing.JButton btn65;
    private javax.swing.JButton btn66;
    private javax.swing.JButton btn67;
    private javax.swing.JButton btn68;
    private javax.swing.JButton btn69;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn70;
    private javax.swing.JButton btn71;
    private javax.swing.JButton btn72;
    private javax.swing.JButton btn73;
    private javax.swing.JButton btn74;
    private javax.swing.JButton btn75;
    private javax.swing.JButton btn76;
    private javax.swing.JButton btn77;
    private javax.swing.JButton btn78;
    private javax.swing.JButton btn79;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn80;
    private javax.swing.JButton btn81;
    private javax.swing.JButton btn82;
    private javax.swing.JButton btn83;
    private javax.swing.JButton btn84;
    private javax.swing.JButton btn85;
    private javax.swing.JButton btn86;
    private javax.swing.JButton btn87;
    private javax.swing.JButton btn88;
    private javax.swing.JButton btn89;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btn90;
    private javax.swing.JButton btn91;
    private javax.swing.JButton btn92;
    private javax.swing.JButton btn93;
    private javax.swing.JButton btn94;
    private javax.swing.JButton btn95;
    private javax.swing.JButton btn96;
    private javax.swing.JButton btn97;
    private javax.swing.JButton btn98;
    private javax.swing.JButton btn99;
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
    // End of variables declaration//GEN-END:variables
}
