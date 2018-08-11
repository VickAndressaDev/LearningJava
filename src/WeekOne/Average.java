package WeekOne;

import java.util.Scanner;

import javax.swing.JOptionPane;

import com.sun.xml.internal.stream.Entity.ScannedEntity;

import jdk.internal.cmm.SystemResourcePressureImpl;
import jdk.management.resource.internal.inst.SocketOutputStreamRMHooks;

public class Average {

	// Construtor

	public Average() {

	}

	public Average(float Nota2) {

	}

	// Atributos

	float nota1;
	float nota2;
	float nota3;
	float nota4;
	float media;
	float totalmedia;

	// Calculo
	public void Calcular() {
		
		Scanner ler = new Scanner(System.in);
		nota1 = ler.nextFloat();
		nota2 = ler.nextFloat();
		nota3 = ler.nextFloat();
		nota4 = ler.nextFloat();
		
		totalmedia = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.println("Sua média é:" + totalmedia);
	}

	
	
}
