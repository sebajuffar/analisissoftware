/*
	Programa: Editor Compilador en java
	Autor: Borja
	Web: http://todojava.awardspace.com/
	Version: 1.0
	
	Descripcin: Editor de texto que compila y ejecuta programas en java
	
	Dificultad: Media
*/

//	Clase Principal

import java.awt.*;
import java.lang.*;

import javax.swing.*;

import java.awt.event.*;
import java.io.*;

@SuppressWarnings("serial")
class Editor extends JFrame implements ActionListener
{
	//Menu
	JMenuBar MBarra=new JMenuBar();
	JMenu MArchivo=new JMenu("Archivo");
	JMenuItem MNuevo=new JMenuItem("Nuevo");
	JMenuItem MAbrir=new JMenuItem("Abrir");
	JMenuItem MSalir=new JMenuItem("Salir");	
	JMenuItem MGuardar=new JMenuItem("Guardar");
	JMenuItem MImprimir=new JMenuItem("Imprimir");;
	JMenu MEdicion=new JMenu("Edicion");
	JMenuItem MCortar=new JMenuItem("Cortar");
	JMenuItem MCopiar=new JMenuItem("Copiar");
	JMenuItem MPegar=new JMenuItem("Pegar");
	JMenuItem MBuscar=new JMenuItem("Buscar");
	JMenuItem MRemplazar=new JMenuItem("Reemplazar");
	JMenuItem MSelec=new JMenuItem("Seleccionar todo");
	//Toolbar
	JToolBar TBarra=new JToolBar(); 
		JButton BNuevo=new JButton();
		JButton BAbrir=new JButton();
		JButton BCopiar=new JButton();
		JButton BCortar=new JButton();
		JButton BPegar=new JButton();	
		JButton BGuardar=new JButton();
		
	//PopUpMenu Boton derecho	
	JPopupMenu PopMenu=new JPopupMenu (); 
  	JMenuItem PopCortar=new JMenuItem ("Cortar");
  	JMenuItem PopCopiar=new JMenuItem ("Copiar");
  	JMenuItem PopPegar=new JMenuItem ("Pegar");
  	JMenuItem PopSelTodo=new JMenuItem ("Seleccionar Todo");
	
				
	//Imagenes 
	ImageIcon INuevo=new ImageIcon("nuevo.gif");
	ImageIcon IAbrir=new ImageIcon("abrir.gif");
	ImageIcon ICopiar=new ImageIcon("copiar.gif");
	ImageIcon ICortar=new ImageIcon("cortar.gif");
	ImageIcon IPegar=new ImageIcon("pegar.gif");
	ImageIcon IGuardar=new ImageIcon("guardar.gif");
	ImageIcon IImprimir=new ImageIcon("impresora.gif");
	ImageIcon IBuscar=new ImageIcon("buscar.gif");
	ImageIcon ISalir=new ImageIcon("salir.gif");
	
		String nombre=" "; //nobre del programa
	
	//Paleta de colores
	JButton colorTexto=new JButton("    ");
		JLabel lcolorTexto=new JLabel("Texto: ");
	JButton colorFondo=new JButton("    ");
		JLabel lcolorFondo=new JLabel("Fondo: ");
	JColorChooser colores=new JColorChooser(); 

	//cajas de texto
	JTextArea Texto = new JTextArea();
	
	JTextArea Errores=new JTextArea(6,1);
	
	String Copiar="";
	
	Editor()
	{
		
		//Menu
		MArchivo.add(MNuevo);
		MNuevo.setIcon(INuevo);
		MNuevo.addActionListener(this);
		MArchivo.add(MAbrir);
		MAbrir.setIcon(IAbrir);
		MAbrir.addActionListener(this);
		MArchivo.add(MSalir);
		MSalir.addActionListener(this);
		MArchivo.add(MGuardar);
		MGuardar.setIcon(IGuardar);
		MGuardar.addActionListener(this);
		MArchivo.add(MImprimir);
		MImprimir.setIcon(IImprimir);
		MImprimir.addActionListener(this);
		MArchivo.addSeparator();
		MArchivo.add(MSalir);
		MSalir.setIcon(ISalir);
		MSalir.addActionListener(this);
		MEdicion.add(MCortar);
		MCortar.setIcon(ICortar);
		MCortar.addActionListener(this);
		MEdicion.add(MCopiar);
		MCopiar.setIcon(ICopiar);
		MCopiar.addActionListener(this);
		MEdicion.add(MPegar);
		MPegar.setIcon(IPegar);
		
		MEdicion.addSeparator();
		MEdicion.add(MBuscar);
		MBuscar.setIcon(IBuscar);
		MBuscar.addActionListener(this);
		MPegar.addActionListener(this);
		MEdicion.add(MRemplazar);
		MRemplazar.addActionListener(this);
		MEdicion.addSeparator();
		MEdicion.add(MSelec);
		MSelec.addActionListener(this);
		MBarra.add(MArchivo);
		MBarra.add(MEdicion);
		setJMenuBar(MBarra);
		
		//ToolBar
		TBarra.add(BNuevo);
		BNuevo.addActionListener(this);
		BNuevo.setIcon(INuevo);
		TBarra.add(BAbrir);
		BAbrir.addActionListener(this);
		BAbrir.setIcon(IAbrir);
		TBarra.add(BGuardar);
		BGuardar.setIcon(IGuardar);
		BGuardar.addActionListener(this);
		TBarra.addSeparator();
		TBarra.add(BCopiar);
		BCopiar.setIcon(ICopiar);
		BCopiar.addActionListener(this);
		TBarra.add(BCortar);
		BCortar.setIcon(ICortar);
		BCortar.addActionListener(this);
		TBarra.add(BPegar);
		BPegar.setIcon(IPegar);		
		BPegar.addActionListener(this);
			BGuardar.setToolTipText ("Guardar");
		BNuevo.setToolTipText ("Nuevo");
		BAbrir.setToolTipText ("Abrir");
		BCopiar.setToolTipText ("Copiar");
		BCortar.setToolTipText ("BCortar");
		BPegar.setToolTipText ("Pegar");
		
		//Colores de fondo y texto
			TBarra.addSeparator();
		TBarra.add(lcolorTexto);
		TBarra.add(colorTexto);
		colorTexto.addActionListener(this);
		colorTexto.setBackground(Color.WHITE);
		
			TBarra.addSeparator();
		TBarra.add(lcolorFondo);
		TBarra.add(colorFondo);
		colorFondo.addActionListener(this);
		colorFondo.setBackground(Color.WHITE);
		
		add(TBarra,"North");
		Texto.requestFocus();
		TBarra.setFloatable(false);
		
		//PopUpMenu
		PopCortar.addActionListener (this);
        PopMenu.add (PopCortar); 
        PopCopiar.addActionListener(this);
        PopMenu.add(PopCopiar);
        PopPegar.addActionListener(this);
        PopMenu.add(PopPegar);
               
        PopCortar.setIcon (ICortar);
        PopCopiar.setIcon(ICopiar);
        PopPegar.setIcon(IPegar);
        Texto.setComponentPopupMenu (PopMenu);
		
		//Aadir barras de scroll a la caja de texto principal
		JScrollPane barrillas=new JScrollPane(Texto,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		add(barrillas);
		
		//Aadir barras de scroll a la caja de texto de los errores
		JScrollPane barrasError=new JScrollPane(Errores,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		add(barrasError,"South");
		
		
		//Cerrar Ventana
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			 {//Sale del programa
			 	System.exit(0);
			 }
		});
		
		setTitle("Editor de Texto http://todojava.awardspace.com");	
	    setSize(800,600);
		setVisible(true);
			
	}
	
	  private void checkNuevo(ActionEvent ae){
		  //Checkeo Boton nuevo
		  if(ae.getSource()==MNuevo || ae.getSource()==BNuevo) Texto.setText("");
	  }
	  
	  private void checkCopiar(ActionEvent ae){
		//Checkeo Boton copiar
		  if(ae.getSource()==MCopiar || ae.getSource()==PopCopiar || ae.getSource()==BCopiar)	Texto.copy();
	  }
	  
	  private void checkPegar(ActionEvent ae){
		//Checkeo Boton Pegar
		  if(ae.getSource()==MPegar || ae.getSource()==PopPegar || ae.getSource()==BPegar)	Texto.paste();
	  }
	  
	  private void checkCortar(ActionEvent ae){
		//Checkeo Boton Cortar
		  if(ae.getSource()==MCortar || ae.getSource()==PopCortar || ae.getSource()==BCortar) Texto.cut();
	  }
	  
	  private void checkAbrir(ActionEvent ae){
	  //Checkeo Boton Abrir
		  if(ae.getSource()==BAbrir || ae.getSource()==MAbrir) Abrir();
	  }
	  
	  private void checkColor(ActionEvent ae){
	  ///Cambia el color de Fondo
	 	if(ae.getSource()==colorFondo){
	 		ElegirColor myColor=new ElegirColor(this,"Elegir color...",true,"fondo");
	 	}
	 	//Cambia el color del texto
	 	if(ae.getSource()==colorTexto){
	 		ElegirColor myColor=new ElegirColor(this,"Elegir color...",true,"texto");
	 	}
	  }
		public void actionPerformed(ActionEvent ae)
		 {
			 //Método encargado de la escucha de la acción realizada sobre el botón Archivo
			 //Dentro del mismo, existen varias opciones. Se identifica la opción a realizar
			 // y Se procede a crear un objeto que es capaz de realizar las distintas acciones.
			 
		 	if(ae.getSource()==MImprimir) imprimir();
		 	//Sale
		 	if(ae.getSource()==MSalir) dispose();
		 	
		 	checkNuevo(ae);
		 	
		 	checkCopiar(ae);
		 	
		 	checkPegar(ae);
		 	
		 	checkCortar(ae);
		 	
		 	checkColor(ae);
		 	
		 	checkAbrir(ae);
		 	//Identifico seleccion de todo el texto o sólo una parte
		 	if(ae.getSource()==MSelec) 
		 	{
		 		Texto.requestFocus();
		 	    Texto.selectAll();
		 	}		
		 	
		 	if(ae.getSource()==BGuardar )
		 	{
		 		Guardar ();
		 	}
		 			 	
		 	if(ae.getSource()==MGuardar)
		 	{
			Guardar (); 	   
		 	}
		 	//Busca en el texto
		 	if(ae.getSource()==MBuscar)
		 	{
		 		Busca Bes=new Busca(this,"Buscar...",true);
		 	}
		 	//Reemplaza en el texto
		 	if(ae.getSource()==MRemplazar)
		 	{
		 		BuscaRemplaza ByR=new BuscaRemplaza(this,"Buscar y Reemplazar",true);
		 	}
		 }
		 void Abrir()
		 {
			  //Método encargado de la operación de apertura de un archivo.
			  //Una vez seleccionada la opción, el Editor se encarga de Instanciar este método
			  //que nos da la posibilidad de abrir un nuevo archivo en el editor
			
		 		String Text="";
	            try
				{
	           		JFileChooser fc=new JFileChooser(System.getProperty("user.dir"));
		 			fc.showOpenDialog(this);
		 			File Abrir=fc.getSelectedFile(); //Devuelve el File que vamos a leerName
		 			
		 			if(Abrir!=null)
		 			{
		 				nombre=fc.getSelectedFile().getName();
		 			}
		 	
		 			if(Abrir!=null)
		 			{	
		 				//Abro el archivo seleccionado
		 				Texto.setText("");	
		 				FileReader Fichero=new FileReader(Abrir);
		 				BufferedReader leer=new BufferedReader(Fichero);
		 				while((Text=leer.readLine())!=null)
		 					{
		 					 Texto.append(Text+ "\n"); //append Concatena la linea leida
		 					}
		 					
		 		  		leer.close();
		 			}
		 			
		 		}
		 		catch(IOException ioe)
					{
					  System.out.println(ioe);
					}
		 }
		 void Guardar()
		 {
		 		String Text="";
		 		try
		 		{//Se trata de abrir la ventana para elegir el archivo
		 			JFileChooser fc=new JFileChooser(System.getProperty("user.dir"));
		 			fc.showSaveDialog(this);
		 			File Guardar =fc.getSelectedFile();
		 			//Si pude abrir el archivo, entonces
		 			if(Guardar !=null)
		 			{
		 				//Escribo el archivo seleccionado
			 			nombre=fc.getSelectedFile().getName();
			 			FileWriter  Guardx=new FileWriter(Guardar);
			 			Guardx.write(Texto.getText()); //Escribo el texto
			 			Guardx.close();
		 		    }
		 				 			
		 		 }
		 	   catch(IOException ioe)
					{//En caso de error imprimo la pila de error
					  System.out.println(ioe);
					}	
		} 
	  void imprimir()
       {
       	   	String todo=Texto.getText(); //Contiene le texto editado
     	  	PrintJob pjob = getToolkit().getPrintJob(this,"Imprimir Hoja",null); //Obtiene un printJob necesario para imprimir
	     	  	Graphics pg=  pjob.getGraphics(); //Se obtiene obn
	     	  	pg.setFont(new Font("SansSerif",Font.PLAIN,10)); //Seteo la tipografía de la impresión
	     	  	pg.drawString("Imprimido:",100,100); 
	     	  	int inicio=0;
	     	  	int numlineas=1;
	     	  	//Recorro todo y voy asignado las palabras que van a ser impresas
	     	  	for(int i=0; i<todo.length();i++)
	     	  	 {
	     	  	    if((int) todo.charAt(i)==10)
	     	  	     {
	     	  	    	pg.drawString(todo.substring(inicio,i-1),100,100 + (15 * numlineas));
	     	  	    	inicio=i+1;
	     	  	    	numlineas ++;
	     	  	     }
	     	  	 }
	     	  	pg.drawString (todo.substring(inicio,todo.length()),100,100 + (15 * numlineas));
	     	  	pg.dispose (); //Finalizar pagina
	     	  	pjob.end(); //Termina trabajo y escupe pagina
       }
		 
		 public static void main (String []args)
		 {
		 	new Editor();
		 }
}