package TesteJSE;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		Professor professor1 = new Professor("Jo�o da Silva", 10);
		JOptionPane.showMessageDialog(null, professor1.getSalario());
		
		Professor professor2 = new ProfessorAssistente("Jo�ozinho Silveira", 10);
		JOptionPane.showMessageDialog(null, professor2.getSalario());
		
		Professor professor3 = new ProfessorAssociado("Jo�oz�o Silvino", 10);
		JOptionPane.showMessageDialog(null, professor3.getSalario());

	}

}
