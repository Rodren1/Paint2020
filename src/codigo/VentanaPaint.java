/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import codigo.formas.Circulo;
import codigo.formas.Cuadrado;
import codigo.formas.Texto;
import codigo.formas.Estrella;
import codigo.formas.Forma;
import codigo.formas.Goma;
import codigo.formas.Lapiz;
import codigo.formas.Pentagono;
import codigo.formas.Recta;
import codigo.formas.Triangulo;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Javi, Alba, Edu
 */
public class VentanaPaint extends javax.swing.JFrame {

    BufferedImage buffer, buffer2, buffer3 = null;

    Graphics2D bufferGraphics, bufferGraphics2, bufferGraphics3, jpanelGraphics = null;

    Circulo miCirculo = null;

    Recta miRecta = null;

    Lapiz miLapiz = null;

    Goma miGoma = null;

    String grosorGoma = "5";

    Texto miTexto = null;

    Forma miForma = new Forma(-1, -1, 1, Color.white, false);

    int spray = 3;

    Random aleatorio = new Random();

    String grosor = "5";

    String texto = ""; //Aquí guardaremos el texto para poner en pantalla

    int indiceLista = 0; //Este indice nos indica que buffer se muestra en pantalla

    int tamanoFuente = 16; //Tamaño de la fuente de la herramienta escribir, será 16 por defecto

    String fuente = "Arial";

    ArrayList<BufferedImage> retroceso = new ArrayList<BufferedImage>();

    /**
     * Creates new form VentanaPaint
     */
    public VentanaPaint() {
        initComponents();
        inicializaBuffers();
        jDialog1.setSize(700, 450);
        jDialog2.setSize(700, 500);
        jDialog3.setSize(700, 500);

    }

    private void inicializaBuffers() {
        //creo una imagen del mismo ancho y alto que el jPanel1
        buffer = (BufferedImage) jPanel1.createImage(jPanel1.getWidth(), jPanel1.getHeight());
        buffer2 = (BufferedImage) jPanel1.createImage(jPanel1.getWidth(), jPanel1.getHeight());
        buffer3 = (BufferedImage) jPanel1.createImage(jPanel1.getWidth(), jPanel1.getHeight());
        //creo una imagen modificable
        bufferGraphics = buffer.createGraphics();
        bufferGraphics2 = buffer2.createGraphics();
        bufferGraphics3 = buffer3.createGraphics();
        //inicializo el buffer para que se pinte de blanco entero
        bufferGraphics.setColor(Color.WHITE);
        bufferGraphics.fillRect(0, 0, jPanel1.getWidth(), jPanel1.getHeight());

        bufferGraphics2.setColor(Color.WHITE);
        bufferGraphics2.fillRect(0, 0, jPanel1.getWidth(), jPanel1.getHeight());

        bufferGraphics3.drawImage(buffer2, null, this);
        retroceso.add(buffer3);

        //enlazamos el jPanel1 con el jPanelGraphics
        jpanelGraphics = (Graphics2D) jPanel1.getGraphics();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        //pinto el buffer sobre el jPanel
        jpanelGraphics.drawImage(buffer, 0, 0, null);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jColorChooser1 = new javax.swing.JColorChooser();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jDialog2 = new javax.swing.JDialog();
        jFileChooser1 = new javax.swing.JFileChooser();
        jDialog3 = new javax.swing.JDialog();
        jTextFieldTamanoFuente = new javax.swing.JTextField();
        botonescribir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldtext = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxFuente = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        botonescribir1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jSlider1 = new javax.swing.JSlider();
        jButton11 = new javax.swing.JButton();
        panelColores1 = new codigo.PanelColores();
        herramientas1 = new codigo.Herramientas();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();

        jButton2.setText("Aceptar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Cancelar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDialog1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jColorChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDialog1Layout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jColorChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jFileChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, 764, Short.MAX_VALUE)
                .addContainerGap())
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jFileChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(148, Short.MAX_VALUE))
        );

        jTextFieldTamanoFuente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTamanoFuenteActionPerformed(evt);
            }
        });

        botonescribir.setText("Aceptar");
        botonescribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonescribirActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Texto:");

        jTextFieldtext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldtextActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Fuente:");

        jComboBoxFuente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Arial", "Batang", "Comic Sans MS", "Helvetica", "Times New Roman" }));
        jComboBoxFuente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxFuenteActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Tamaño:");

        botonescribir1.setText("Cancelar");
        botonescribir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonescribir1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDialog3Layout = new javax.swing.GroupLayout(jDialog3.getContentPane());
        jDialog3.getContentPane().setLayout(jDialog3Layout);
        jDialog3Layout.setHorizontalGroup(
            jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog3Layout.createSequentialGroup()
                .addGroup(jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDialog3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDialog3Layout.createSequentialGroup()
                                .addGroup(jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBoxFuente, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldtext, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jDialog3Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldTamanoFuente, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jDialog3Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(botonescribir1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonescribir, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(622, Short.MAX_VALUE))
        );
        jDialog3Layout.setVerticalGroup(
            jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(jComboBoxFuente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldtext, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldTamanoFuente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonescribir, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonescribir1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(118, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel1MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 612, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 334, Short.MAX_VALUE)
        );

        jSlider1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider1StateChanged(evt);
            }
        });

        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Deshacer.png"))); // NOI18N
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jMenu1.setText("Archivos\n");

        jMenuItem1.setText("Guardar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Abrir");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Colores");

        jMenuItem3.setText("Colores");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuBar1.add(jMenu3);

        jMenu2.setText("Opciones");

        jMenuItem4.setText("Escribir texto");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(herramientas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton11))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(panelColores1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(herramientas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton11)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelColores1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSlider1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        bufferGraphics.drawImage(buffer2, 0, 0, null);
        switch (herramientas1.formaElegida) {
            case -1://Goma
                miGoma.dibujate(bufferGraphics2, evt.getX(), evt.getY(), grosorGoma);
                break;
            case 0://Lapiz
                miLapiz.dibujate(bufferGraphics2, evt.getX(), evt.getY(), grosor);
                break;
            case 1://Circulo
                miCirculo.dibujate(bufferGraphics, evt.getX(), grosor);
                break;
            case 2://Recta
                miRecta.Trazate(bufferGraphics, evt.getX(), evt.getY(), grosor);
                break;
            case 3://Triangulo
                miForma.dibujate(bufferGraphics, evt.getX(), evt.getY(), grosor);
                break;
            case 4://Cuadrado
                miForma.dibujate(bufferGraphics, evt.getX(), evt.getY(), grosor);
                break;
            case 5://Pentagono
                miForma.dibujate(bufferGraphics, evt.getX(), evt.getY(), grosor);
                break;
            case 9://Spray
                //Usamos la formula de la circunferencia y con el random se llena con puntos de forma aleatoria
                bufferGraphics2.setColor(panelColores1.colorSeleccionado);
                bufferGraphics2.fillOval(evt.getX() - aleatorio.nextInt((int) Math.PI * (spray * spray)) / 2,
                        evt.getY() - aleatorio.nextInt((int) Math.PI * (spray * spray)) / 2, spray, spray);
                break;
            case 256://Estrella
                miForma.dibujate(bufferGraphics, evt.getX(), evt.getY(), grosor);
                break;

        }
        repaint(0, 0, 1, 1);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        switch (herramientas1.formaElegida) {
            case -1: //Goma
                miGoma = new Goma(evt.getX(), evt.getY(), Color.white);
                miGoma.dibujate(bufferGraphics, evt.getX(), evt.getY(), grosorGoma);
                break;
            case 0: //Lapiz
                miLapiz = new Lapiz(evt.getX(), evt.getY(), panelColores1.colorSeleccionado);
                miLapiz.dibujate(bufferGraphics, evt.getX(), evt.getY(), grosor);
                break;
            case 1://Circulo
                miCirculo = new Circulo(evt.getX(), evt.getY(), 1, panelColores1.colorSeleccionado, herramientas1.relleno);
                miCirculo.dibujate(bufferGraphics, evt.getX(), grosor);
                break;
            case 2://Recta
                miRecta = new Recta(evt.getX(), evt.getY(), evt.getX(), evt.getY(), panelColores1.colorSeleccionado);
                miRecta.Trazate(bufferGraphics, evt.getX(), evt.getY(), grosor);
                break;
            case 3://Triangulo
                miForma = new Triangulo(evt.getX(), evt.getY(), 3, panelColores1.colorSeleccionado, herramientas1.relleno);
                miForma.dibujate(bufferGraphics, evt.getX(), evt.getY(), grosor);
                break;
            case 4://Cuadrado
                miForma = new Cuadrado(evt.getX(), evt.getY(), 4,panelColores1.colorSeleccionado, herramientas1.relleno);
                miForma.dibujate(bufferGraphics, evt.getX(), evt.getY(), grosor);
                break;
            case 5://Pentagono
                miForma = new Pentagono(evt.getX(), evt.getY(), 5, panelColores1.colorSeleccionado, herramientas1.relleno);
                miForma.dibujate(bufferGraphics, evt.getX(), evt.getY(), grosor);
                break;
            case 10://Pipeta
                Color c = new Color(buffer2.getRGB(evt.getX(), evt.getY()));
                panelColores1.colorSeleccionado = c;
                break;
            case 200://Texto
                miTexto = new Texto(evt.getX(), evt.getY(), panelColores1.colorSeleccionado);
                miTexto.escribete(bufferGraphics2, texto, tamanoFuente, fuente);
                bufferGraphics.drawImage(buffer2, 0, 0, null);
                repaint(0, 0, 1, 1);
                texto = "";//Dejamos el texto en blanco
                break;
            case 256://Estrella
                miForma = new Estrella(evt.getX(), evt.getY(), 3, panelColores1.colorSeleccionado, herramientas1.relleno);
                miForma.dibujate(bufferGraphics, evt.getX(), evt.getY(), grosor);
                break;

        }
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseReleased
        switch (herramientas1.formaElegida) {
            case -1:
                miGoma.dibujate(bufferGraphics2, evt.getX(), evt.getY(), grosorGoma);
                break;
            case 0:
                miLapiz.dibujate(bufferGraphics2, evt.getX(), evt.getY(), grosor);
                break;
            case 1:
                miCirculo.dibujate(bufferGraphics2, evt.getX(), grosor);
                break;
            case 2:
                miRecta.Trazate(bufferGraphics2, evt.getX(), evt.getY(), grosor);
                break;
            case 3:
                miForma.dibujate(bufferGraphics2, evt.getX(), evt.getY(), grosor);
                break;
            case 4:
                miForma.dibujate(bufferGraphics2, evt.getX(), evt.getY(), grosor);
                break;
            case 5:
                miForma.dibujate(bufferGraphics2, evt.getX(), evt.getY(), grosor);
                break;
            case 256:
                miForma.dibujate(bufferGraphics2, evt.getX(), evt.getY(), grosor);
                break;
        }
        //Este buffer copia lo dibujado en el buffer2 y se guarda en el arraylist para que funcione el deshacer
        buffer3 = (BufferedImage) jPanel1.createImage(jPanel1.getWidth(), jPanel1.getHeight());
        bufferGraphics3 = buffer3.createGraphics();
        bufferGraphics3.drawImage(buffer2, null, this);
        retroceso.add(buffer3);


    }//GEN-LAST:event_jPanel1MouseReleased

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jDialog1.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jDialog1.setVisible(false);
        panelColores1.colorSeleccionado = jColorChooser1.getColor();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        int seleccion = jFileChooser1.showSaveDialog(this);
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            //si entra aqui es pq el usuario ha pulsado en "guardar"
            File fichero = jFileChooser1.getSelectedFile();
            String nombre = fichero.getName();
            String extension = nombre.substring(nombre.lastIndexOf('.') + 1, nombre.length());
            if (extension.equalsIgnoreCase("jpg") || extension.equalsIgnoreCase("png")) {
                try {
                    ImageIO.write(buffer, "png", fichero);
                } catch (IOException e) {
                }
            } else {
                //mensaje de extension no válida
            }
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        jFileChooser1.setFileFilter(new FileNameExtensionFilter("arhivos de imagen jpg", "jpg"));
        jFileChooser1.setFileFilter(new FileNameExtensionFilter("arhivos de imagen png", "png"));
        int seleccion = jFileChooser1.showOpenDialog(this);

        if (seleccion == JFileChooser.APPROVE_OPTION) {
            File fichero = jFileChooser1.getSelectedFile();
            String nombre = fichero.getName();
            String extension = nombre.substring(nombre.lastIndexOf('.') + 1, nombre.length());

            if (extension.equalsIgnoreCase("jpg") || extension.equalsIgnoreCase("png")) {
                try {
                    bufferGraphics.drawImage(ImageIO.read(fichero), 0, 0, null);
                    bufferGraphics2.drawImage(ImageIO.read(fichero), 0, 0, null);
                    repaint(0, 0, 1, 1);
                } catch (IOException ex) {
                }
            }
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        jDialog1.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    //Con este slider cambia el grosor de las herramientas
    private void jSlider1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider1StateChanged
        grosor = Integer.toString(jSlider1.getValue() / 10) + "f";
        grosorGoma = Integer.toString(jSlider1.getValue() / 5) + "f";
        spray = (jSlider1.getValue() / 15);
        if (spray < 3) {
            spray = 3;
        }
    }//GEN-LAST:event_jSlider1StateChanged

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        if (retroceso.size() > 1) {
            bufferGraphics2.drawImage(retroceso.get(retroceso.size() - 2), 0, 0, null);
            retroceso.remove(retroceso.size() - 1);
            jpanelGraphics.drawImage(buffer2, 0, 0, null);
        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void botonescribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonescribirActionPerformed
        if (!jTextFieldTamanoFuente.getText().isEmpty()) {//Evitamos error si no hay ningún texto en el jtextfield
            tamanoFuente = Integer.parseInt(jTextFieldTamanoFuente.getText());
            //Para que el tamaño de la fuente esté entre 3 y 120
            if (tamanoFuente < 3) {
                tamanoFuente = 3;
            }
            if (tamanoFuente > 120) {
                tamanoFuente = 120;
            }
        }
        texto = jTextFieldtext.getText();
        herramientas1.formaElegida = 200;
        jDialog3.setVisible(false);
    }//GEN-LAST:event_botonescribirActionPerformed

    private void jComboBoxFuenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxFuenteActionPerformed
        fuente = (String) jComboBoxFuente.getSelectedItem();
    }//GEN-LAST:event_jComboBoxFuenteActionPerformed

    private void jTextFieldTamanoFuenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTamanoFuenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTamanoFuenteActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        herramientas1.formaElegida = 200;
        jDialog3.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void botonescribir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonescribir1ActionPerformed
        jDialog3.setVisible(false);
    }//GEN-LAST:event_botonescribir1ActionPerformed

    private void jTextFieldtextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldtextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldtextActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPaint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPaint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPaint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPaint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPaint().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonescribir;
    private javax.swing.JButton botonescribir1;
    private codigo.Herramientas herramientas1;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JComboBox<String> jComboBoxFuente;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JDialog jDialog3;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JTextField jTextFieldTamanoFuente;
    private javax.swing.JTextField jTextFieldtext;
    private codigo.PanelColores panelColores1;
    // End of variables declaration//GEN-END:variables
}
