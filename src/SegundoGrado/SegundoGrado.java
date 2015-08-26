package SegundoGrado;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class SegundoGrado {

	public static void main(String[] args) {
		String primero, segundo, tercero;
		double a, b, c;
		double x1, x2;
		
		primero = JOptionPane.showInputDialog("Ingrese el coeficiente a");
		segundo = JOptionPane.showInputDialog("Ingrese el coeficiente b");
		tercero = JOptionPane.showInputDialog("Ingrese el coeficiente c");
		a = Double.parseDouble(primero);
		b = Double.parseDouble(segundo);
		c = Double.parseDouble(tercero);
		
		if(a == 0 && b == 0 && c== 0){
			JOptionPane.showMessageDialog(null, "Los coeficientes no pueden ser 0");
		}else if(a == 0 && b!= 0 &&  c!=0){
			JOptionPane.showMessageDialog(null, "El coeficiente a no puede ser 0");
		}else if(a != 0 && b != 0 && c != 0){
			
			x1 = ((-b)+Math.sqrt((b*b)-(4*a*c)))/(2*a);
			x2 = ((-b)-Math.sqrt((b*b)-(4*a*c)))/(2*a);
			
			JOptionPane.showMessageDialog(null, "X1= " + x1);
			JOptionPane.showMessageDialog(null, "X2= "+ x2);
			
		}
		
		
		
		

	}

}
