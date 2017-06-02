package Matriz;


import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Matriz1 {
	static int ff=5;
	static int cc=9;
	public static void main(String[] args) {
		
		String [] pp = {"A","B","C","D","E"};
		String [] dd = {"1","2","3","4","5","6","7","8","9"};
		int [][] votos = new int [ff][cc];
		llenar(votos);
		imprimir(votos);
		for(;;){
			int op=JOptionPane.showOptionDialog(null,"Seleccione opcion","PROGRA1",
												JOptionPane.YES_NO_OPTION,
												JOptionPane.QUESTION_MESSAGE,null,
												new Object[]{"1","2","3","4","5","6","salir"},null);
			switch (op){
				//case 0: f1();
				//case 1: f2();
				//case 2: f3();
				//case 3: f4();
				//case 4: f5();
				//case 5: f6();
				case 6: System.exit(0);
			
			}
			
		}
	}
	public static void llenar(int votos[][]){
		for(int i=0;i<ff;i++){
			for(int j=0;j<cc;j++){
				votos [i][j]=(int)Math.random()%9;
			}
		}
	}
	public static void imprimir (int votos[][]){
		String c = "";
		for(int i=0;i<ff;i++){
			for(int j=0;j<cc;j++){
				c+=votos [i][j]+"";
			}
			c+="\n";
		}
		JTextArea area = new JTextArea(c);
		JOptionPane.showMessageDialog(null, area);
	}
}
