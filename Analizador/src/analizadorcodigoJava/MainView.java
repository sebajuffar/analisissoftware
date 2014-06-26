package analizadorcodigoJava;

import java.io.File;
import java.util.LinkedList;

import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;


public class MainView extends javax.swing.JFrame implements Runnable {

    /**
     * Creates new form MainView
     */
    public MainView() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    private void initComponents() {

        fileChooser = new javax.swing.JFileChooser();
        jButton1 = new javax.swing.JButton();
        txtArchivo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        lblLineasTotales = new javax.swing.JLabel();
        lblLineasComentario = new javax.swing.JLabel();
        lblLineasPorcentaje = new javax.swing.JLabel();
        lblComplejidad = new javax.swing.JLabel();
        lblFanOut = new javax.swing.JLabel();
        lblFanIn = new javax.swing.JLabel();
        lblHLongitud = new javax.swing.JLabel();
        lblHVolumen = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaMetodos = new javax.swing.JList();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        labelCodigo = new javax.swing.JTextPane();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Analizador de Codigo Java");
        setResizable(false);

        jButton1.setText("Abrir archivo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirFileChooser(evt);
            }
        });

        txtArchivo.setToolTipText("El archivo a analizar");

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel1.setText("Análisis del método");

        lblLineasTotales.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblLineasTotales.setText("---");
        lblLineasTotales.setFocusTraversalPolicyProvider(true);

        lblLineasComentario.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblLineasComentario.setText("---");
        lblLineasComentario.setFocusTraversalPolicyProvider(true);
        lblLineasComentario.setPreferredSize(new java.awt.Dimension(40, 14));

        lblLineasPorcentaje.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblLineasPorcentaje.setText("---");
        lblLineasPorcentaje.setFocusTraversalPolicyProvider(true);
        lblLineasPorcentaje.setPreferredSize(new java.awt.Dimension(40, 14));

        lblComplejidad.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblComplejidad.setText("---");
        lblComplejidad.setFocusTraversalPolicyProvider(true);
        lblComplejidad.setPreferredSize(null);

        lblFanOut.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblFanOut.setText("---");
        lblFanOut.setFocusTraversalPolicyProvider(true);
        lblFanOut.setPreferredSize(new java.awt.Dimension(40, 14));

        lblFanIn.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblFanIn.setText("---");
        lblFanIn.setFocusTraversalPolicyProvider(true);
        lblFanIn.setPreferredSize(new java.awt.Dimension(40, 14));

        lblHLongitud.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblHLongitud.setText("---");
        lblHLongitud.setFocusTraversalPolicyProvider(true);
        lblHLongitud.setPreferredSize(new java.awt.Dimension(40, 14));

        lblHVolumen.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblHVolumen.setText("---");
        lblHVolumen.setFocusTraversalPolicyProvider(true);
        lblHVolumen.setPreferredSize(new java.awt.Dimension(40, 14));

        listaMetodos.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Seleccione un archivo Java" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        listaMetodos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                seleccionMetodo(evt);
            }
        });
        jScrollPane1.setViewportView(listaMetodos);

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel10.setText("Código del método");

        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel11.setText("Métodos del programa");

        labelCodigo.setEditable(false);
        labelCodigo.setContentType("text/html"); // NOI18N
        jScrollPane2.setViewportView(labelCodigo);

        jLabel2.setText("Lineas totales de código");

        jLabel3.setText("Lineas totales de comentarios");

        jLabel4.setText("Porcentaje de comentarios sobre código");

        jLabel5.setText("Complejidad Ciclomática");

        jLabel6.setText("FanIn");

        jLabel7.setText("FanOut");

        jLabel8.setText("Longitud de Halstead");

        jLabel9.setText("Volumen de Halstead");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(35, 35, 35)
                                .addComponent(txtArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10)
                            .addComponent(jScrollPane1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6)
                                .addComponent(jLabel7)
                                .addComponent(jLabel8)
                                .addComponent(jLabel9)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(50, 50, 50)))
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblLineasPorcentaje, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                            .addComponent(lblHLongitud, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblFanIn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblLineasTotales, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                            .addComponent(lblLineasComentario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblComplejidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblHVolumen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblFanOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(txtArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblLineasTotales)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblLineasComentario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(lblLineasPorcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblComplejidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFanIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFanOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHLongitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHVolumen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void abrirFileChooser(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirFileChooser

        int returnVal = fileChooser.showOpenDialog(MainView.this);

        if (returnVal == JFileChooser.APPROVE_OPTION) {
            // Tomo el archivo seleccionado.
            this.file = fileChooser.getSelectedFile();
            DefaultListModel datosLista = new DefaultListModel();

            this.txtArchivo.setText(this.file.getName());
            
            if (!this.file.getName().toUpperCase().endsWith(".JAVA")) {
                datosLista.add(0, "El archivo no pudo ser procesado.");
            } else {
                int i = 0;
                //Obtengo los métodos del programa.
                this.metodos = Analizador.analizarMetodos(this.file);

                // Recorro la lista de metodos para agregarlos al modelo.                
                for (Metodo metodo : metodos) {
                    datosLista.add(i++, metodo);
                }
            }

            // Seteo el modelo a la lista.
            this.listaMetodos.setModel(datosLista);

        }

    }//GEN-LAST:event_abrirFileChooser

    private void seleccionMetodo(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seleccionMetodo

        if("Seleccione un archivo Java".equals(this.listaMetodos.getSelectedValue()))
            return;
        
        Metodo metodo = Analizador.analizarMetodo(this.file, this.listaMetodos.getSelectedValue());

        /* Muestro la cantidad de lineas de codigo */
        this.lblLineasTotales.setText(String.valueOf(metodo.getLineasCodigo()));
        
        /* Muestro la cantidad de lineas de comentarios */
        this.lblLineasComentario.setText(String.valueOf(metodo.getLineasComentario()));

        /* Muestro la razon entre comentarios y codigo */
        this.lblLineasPorcentaje.setText(metodo.getPorcentaje());

        /* Muestro la complejiadd ciclomatica */
        this.lblComplejidad.setText(String.valueOf(metodo.getComplejidadCiclomatica()));

        /* Muestro el fanIn */
        this.lblFanIn.setText(String.valueOf(metodo.getFanIn()));

        /* Muestro el fanOut */
        this.lblFanOut.setText(String.valueOf(metodo.getFanOut()));
        
        /* Muestro la lognçitud segun halstead */
        this.lblHLongitud.setText(String.valueOf(metodo.gethLongitud()));
        
        /* Muestro el volumen segun halstead */
        this.lblHVolumen.setText(metodo.gethVolumen());

        // Preparo el codigo para mostrar.
        String codigoResaltado = metodo.getCodigo();

        // Resalto el nombre del metodo
        codigoResaltado = codigoResaltado.replaceFirst(metodo.getNombre(),
                "<B>" + metodo.getNombre() + "</B>");

        // Coloreo los nombres reservados del codigo
        codigoResaltado = codigoResaltado
                .replaceAll("int ", "<span class='rsr'>int</span>&nbsp;")
                .replaceAll("char ", "<span class='rsr'>char</span>&nbsp;")
                .replaceAll("void ", "<span class='rsr'>void</span>&nbsp;")
                .replaceAll("FILE ", "<span class='rsr'>FILE</span>&nbsp;")
                .replaceAll("&nbsp;for", "&nbsp;<span class='rsr'>for</span>")
                .replaceAll("&nbsp;while", "&nbsp;<span class='rsr'>while</span>")
                .replaceAll("&nbsp;do", "&nbsp;<span class='rsr'>do</span>")
                .replaceAll("&nbsp;if", "&nbsp;<span class='rsr'>if</span>")
                .replaceAll("&nbsp;else", "&nbsp;<span class='rsr'>else</span>")
                .replaceAll("&nbsp;switch", "&nbsp;<span class='rsr'>switch</span>")
                .replaceAll("&nbsp;case", "&nbsp;<span class='rsr'>case</span>")
                .replaceAll("&nbsp;return", "&nbsp;<span class='rsr'>return</span>");

        // Coloreo los strings harcodeados
        while (codigoResaltado.indexOf("\"") != -1) {
            codigoResaltado = codigoResaltado.replaceFirst("\"", "<span class='str'>##\\##");
            codigoResaltado = codigoResaltado.replaceFirst("\"", "##\\##</span>");
        }
        codigoResaltado = codigoResaltado.replaceAll("##\\##", "\"");

        // Coloreo los comentarios
        while (codigoResaltado.indexOf("//") != -1) {
            codigoResaltado =
                    codigoResaltado.substring(0, codigoResaltado.indexOf("//"))
                    + codigoResaltado.substring(codigoResaltado.indexOf("//"))
                    .replaceFirst("<BR>", "</span>##BB##");
            codigoResaltado = codigoResaltado.replaceFirst("//", "<span class='cmnt'>##/-/##");
        }
        codigoResaltado = codigoResaltado.replaceAll("##/-/##", "//");
        codigoResaltado = codigoResaltado.replaceAll("##BB##", "<BR>");

        // Coloreo los comentarios continuos
        while (codigoResaltado.indexOf("/*") != -1) {
            codigoResaltado = codigoResaltado.replaceFirst("/\\*", "<span class='cmnt'>##/---##");
            codigoResaltado = codigoResaltado.replaceFirst("\\*/", "##---/##</span>");
        }
        codigoResaltado = codigoResaltado.replaceAll("##/---##", "/*");
        codigoResaltado = codigoResaltado.replaceAll("##---/##", "*/");


        codigoResaltado =
                "<HTML>"
                + "<HEAD>"
                + "<style>"
                + "body{"
                + " font-family: verdana; "
                + "}"
                + ".cmnt > span{"
                + " color: #55AA55; "
                + "}"
                + ".cmnt{"
                + " color: #55AA55; "
                + "}"
                + ".rsr{"
                + " color: #000099;"
                + " font-weight: bold; "
                + "}"
                + ".str{"
                + " color: #FF009D; "
                + "}"
                + "</style>"
                + "</HEAD><BODY>" + codigoResaltado + "</BODY></HTML>";

        this.labelCodigo.setText(codigoResaltado);

    }//GEN-LAST:event_seleccionMetodo

     /* Create and display the form 
     }*/
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane labelCodigo;
    private javax.swing.JLabel lblComplejidad;
    private javax.swing.JLabel lblFanIn;
    private javax.swing.JLabel lblFanOut;
    private javax.swing.JLabel lblHLongitud;
    private javax.swing.JLabel lblHVolumen;
    private javax.swing.JLabel lblLineasComentario;
    private javax.swing.JLabel lblLineasPorcentaje;
    private javax.swing.JLabel lblLineasTotales;
    private javax.swing.JList listaMetodos;
    private javax.swing.JTextField txtArchivo;
    // End of variables declaration//GEN-END:variables
    private File file;
    private LinkedList<Metodo> metodos;

    @Override
    public void run() {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {

//                System.out.println(info.getName());

                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        // Mostrar.
        this.setVisible(true);
    }
}
