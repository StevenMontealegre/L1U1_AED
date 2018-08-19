package interfaz;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelBotones extends JPanel implements ActionListener {
	
	private VentanaPrincipal principal;
	
	public final static String RAMDON = "random";
	public final static String INGRESAR = "ingresar";
	
	private JButton random;
	private JButton ingresar;
	
	public PanelBotones(VentanaPrincipal prin) {
		this.repaint();
		this.principal=prin;
	
//		setLayout(new FlowLayout());
		setLayout(new GridLayout(2,1,50,10));
		random= new JButton("RANDOM");
		random.setSize(new Dimension(700, 200));
		random.setActionCommand(RAMDON);
		random.addActionListener(this);
		
		ingresar = new JButton("INGRESAR");
//		ingresar.setSize(new Dimension(500, 200));
		ingresar.setActionCommand(INGRESAR);
		ingresar.addActionListener(this);
		ingresar.setBounds(500, 400, 100, 50);
		
		
		add(random);
		add(ingresar);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent c) {
		String comando = c.getActionCommand();
		
		if (comando.equals(RAMDON)) {
			principal.ventanaEmergente();
		}
		if (comando.equals(INGRESAR)) {
//			principal.ventanaEmergente();
			principal.ingresarNumeros();
		}
		
	}

}
