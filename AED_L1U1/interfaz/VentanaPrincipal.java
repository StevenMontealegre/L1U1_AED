package interfaz;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import modelo.GenerarNumeros;

public class VentanaPrincipal extends JFrame {

	private GenerarNumeros modelo;

	private PanelBotones botones;
	private PanelEmergente emergente;
	private PanelOrdenar ordenar;

	public VentanaPrincipal() {
		this.modelo = new GenerarNumeros();

		setTitle("Numeros Aleatorios");
		setLayout(new GridLayout(1, 1));
		setResizable(false);
		setSize(500, 400);

		emergente = new PanelEmergente(this);

		JPanel aux = new JPanel() {
			@Override
			public void paintComponent(Graphics g) {
				Graphics2D g2 = (Graphics2D) g;
				ImageIcon fondo = new ImageIcon("./img/fondo.png");
				g2.drawImage(fondo.getImage(), 0, 0, null);

			}
		};

		aux.setLayout(new GridLayout(3, 3));
		botones = new PanelBotones(this);
		botones.setOpaque(false);
		aux.add(new JLabel(""));
		aux.add(new JLabel(""));
		aux.add(new JLabel(""));
		aux.add(new JLabel(""));
		aux.add(botones);
		aux.add(new JLabel(""));
		aux.add(new JLabel(""));
		aux.add(new JLabel(""));
		aux.add(new JLabel(""));
		add(aux);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public void ventanaEmergente() {
		emergente.setVisible(true);
	}

	public void pintarNumeros(int[] info) {
		ordenar.pintarLista(info);
	}

	public GenerarNumeros getModelo() {
		return modelo;
	}

	public void generarNumeros(int[] infor) {
		int[] info = infor;
		int tamanio = info[0];
		int desde = info[1];
		int hasta = info[2];

		modelo.generarNumerosAleatorios(tamanio, desde, hasta);

	}

	public double[] ingresarNumeros() {
		String str = JOptionPane.showInputDialog(null, "Ingresar el total de numeros deseados");
		int cantidad = Integer.parseInt(str);
		System.out.println("cantidad numeros: "+ cantidad);
		double[] arreglo = new double[cantidad];

		for (int i = 0; i < arreglo.length; i++) {
			String entrada = JOptionPane.showInputDialog(null, "por favor ingrese un numero");
			double numero = Double.parseDouble(entrada);
			arreglo[i] = numero;
			System.out.println("numero en la pos"+i+": "+ numero);
		}
		return arreglo;
	}

	public static void main(String[] args) {
		VentanaPrincipal ven = new VentanaPrincipal();
		ven.setVisible(true);


	}
}
