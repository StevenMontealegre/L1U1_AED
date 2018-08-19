package interfaz;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelEmergente  extends JDialog implements ActionListener{
	
	public static final String ACEPTAR ="guardar";
	private VentanaPrincipal principal;
	
	private JLabel lblNumeros;
	private JLabel lblRangoDesde;
	private JLabel lblRangoHasta;
	
	private JTextField txtNumeros;
	private JTextField txtRangoDesde;
	private JTextField txtRangoHasta;
	
	private JCheckBox cbRepetir;
	private JCheckBox cbDistinto;
	
	private JButton guardar;
	
	public PanelEmergente(VentanaPrincipal prin) {
	this.principal= prin;
	
	setLayout(new BorderLayout());
	
	JPanel center = new JPanel();
	center.setLayout(new GridLayout(4, 2,10,10));
	lblNumeros = new JLabel("Total numeros");
	lblRangoDesde = new JLabel("Rango Desde");
	lblRangoHasta = new JLabel("Rango Hasta");
	
	txtNumeros= new JTextField();
	txtRangoDesde=new JTextField();
	txtRangoHasta=new JTextField();
	
	cbRepetir = new JCheckBox("Repetir");
	cbDistinto = new JCheckBox("Distinto");
	
	center.add(lblNumeros);
	center.add(txtNumeros);
	center.add(lblRangoDesde);
	center.add(txtRangoDesde);
	center.add(lblRangoHasta);
	center.add(txtRangoHasta);
	center.add(cbRepetir);
	center.add(cbDistinto);
	
	JPanel south = new JPanel();
	south.setLayout(new FlowLayout());
	guardar = new JButton("ACEPTAR");
	guardar.addActionListener(this);
	guardar.setActionCommand(ACEPTAR);
	south.add(guardar);
	
	add(center, BorderLayout.CENTER);
	add(south, BorderLayout.SOUTH);
	pack();
	}
	
	public int validarCheckBox() {
		int selec = -1;
		
		if (cbRepetir.isSelected()) {
			selec = 1;
		}
		if (cbDistinto.isSelected()) {
			selec=2;
		}
		return selec;
	}
	/* Metodo el cual toma los valores de la venta emergente
	 *pos[0]--> cantidad de numeros
	 *pos[1]--> rango desde
	 *pos[2]--> rango hasta
	 *pos[3]--> CheckBox
	 *
	 */
	public int[] recogerInfo() {
		int check = validarCheckBox();
		int[] info = new int[4];
		info[0] = Integer.parseInt(txtNumeros.getText());
		info[1] = Integer.parseInt(txtRangoDesde.getText());
		info[2] = Integer.parseInt(txtRangoHasta.getText());
		info[3] = check;
		
//		for (int i = 0; i < info.length; i++) {
//			System.out.println("pos "+i+": "+info[i]+"");
//		}
//		
		return info;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		
		if (command.equals(ACEPTAR)) {
			//principal.getInformation(recogerInfo());
//			principal.pintarNumeros(recogerInfo());
			principal.generarNumeros(recogerInfo());
		}
		
	}

}
