package conversor;

import javax.swing.JOptionPane;

public class MenuConversor {

		private String[] tiposDeConversao = { "Conversor de Temperatura", "Conversor de Moeda", 
									  "Conversor de Comprimento", "Conversor de Peso", 
									  "Conversor de Volume", "Conversor de Tempo"};
		
		private double valorInputado;

		public Object CriaMenu() {
			return JOptionPane.showInputDialog(null, "Escolha uma opção:", "Menu", 
				JOptionPane.INFORMATION_MESSAGE, null, this.tiposDeConversao, 
				this.tiposDeConversao[0]);
		}
		
		
		public void PegaValor() {
			 String numeroParaConversao = JOptionPane.showInputDialog("Digite o numero para a conversão:");
			 
			 try {
		            valorInputado = Double.parseDouble(numeroParaConversao);
		        } catch (NumberFormatException e) {
		            JOptionPane.showMessageDialog(null, "Entrada inválida. Digite um valor numérico.", "Erro", JOptionPane.ERROR_MESSAGE);
		            PegaValor();
		        }
		}
		
		public double getValorInputado() {
			return valorInputado;
		}
		

		
		
}

