package interfaz;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.ScrollPane;

import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionListener;

public class PanelOrdenar extends JPanel {

	
	private JList listaOrdenada;
	private JList listaRandom;
	
	public PanelOrdenar() {
		setLayout(new FlowLayout());
		
		crearLista();
	
	}
	
	public void crearLista() {
		Font fuente = new Font("Lucida Calligraphy", 10, 20);
		
		listaRandom = new JList();
		listaRandom.setFont(fuente);
		listaRandom.setVisibleRowCount(5);
		
		JScrollPane scroll = new JScrollPane(listaRandom);
		scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
	}
//	public void crearListaOrdenada() {
//		Font fuente = new Font("Lucida Calligraphy", 10, 20);
//		
//		listaRandom = new JList();
//		listaRandom.setFont(fuente);
//		listaRandom.setVisibleRowCount(5);
//		
//		JScrollPane scroll = new JScrollPane(listaRandom);
//		scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
//	}
	public void pintarLista(int[] ordenada) {
		for (int i = 0; i < ordenada.length; i++) {
			listaOrdenada.setSelectedIndex(ordenada[i]);
		}
	}
//	public void pintarListaRandom(int[] ordenada) {
//		for (int i = 0; i < ordenada.length; i++) {
//			listaOrdenada.setSelectedIndex(ordenada[i]);
//		}
//	}
	
	
	
}
