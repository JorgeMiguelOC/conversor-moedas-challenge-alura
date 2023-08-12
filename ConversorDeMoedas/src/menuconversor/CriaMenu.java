package menuconversor;

import javax.swing.JOptionPane;

public class CriaMenu {

	private String[] tiposDeConversao = { "Conversor de Moeda" };
	private String[] tiposDeMoeda = { "Real para Dólar", "Real para Euro", "Real para Libras Esterlinas",
			"Real para Peso Argentino", "Real para Peso Chileno", "Dólar para Real","Euro para Real", 
			"Libras Esterlinas para Real", "Peso Argentino para Real", "Peso Chileno para Real" };

	private String tipoDaConversao;
	private String tipoDaMoeda;
	private double valorParaConversao;

	private ConverteMoedas converte;

	public CriaMenu() {
		converte = new ConverteMoedas();
	}

	// Cria menu de seleção para selecionar o tipo de conversão
	// os tipos de seleção estão armazenados na variavel tiposDeConversao
	public void CriaMenuConsersor() {
		tipoDaConversao = (String) JOptionPane.showInputDialog(null, "Escolha uma opção:", "Menu",
				JOptionPane.INFORMATION_MESSAGE, null, this.tiposDeConversao, this.tiposDeConversao[0]);

		if (tipoDaConversao == null) {
			JOptionPane.showMessageDialog(null, "Nenhuma opção de conversão selecionada.", "Aviso",
					JOptionPane.WARNING_MESSAGE);
			CriaMenuConsersor();
		}
	}

	// Cria menu de seleção para selecionar o tipo de conversão monetaria desejada
	// os tipos armazenados são da variavel tiposDeMoeda
	public void PegaOpcaoDeMoeda() {
		tipoDaMoeda = (String) JOptionPane.showInputDialog(null, "Escolha uma opção:", "Opção de Moeda",
				JOptionPane.INFORMATION_MESSAGE, null, this.tiposDeMoeda, this.tiposDeMoeda[0]);

		if (tipoDaMoeda == null) {
			JOptionPane.showMessageDialog(null, "Nenhuma opção de moeda selecionada.", "Aviso",
					JOptionPane.WARNING_MESSAGE);
			PegaOpcaoDeMoeda();
		}

	}

	// Cria input requerindo um valor para conversão e trata o valor recebido para
	// que seja numeros
	// lança um NumberFormatException caso enviem letras ou outros caracteres.
	public void PegaValor() {
		String numeroParaConversao = JOptionPane.showInputDialog("Digite o numero para a conversão:");

		try {
			valorParaConversao = Double.parseDouble(numeroParaConversao);
			Converte();
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Entrada inválida. Digite um valor numérico.", "Erro",
					JOptionPane.ERROR_MESSAGE);
			PegaValor();
		} catch (NullPointerException e) {
			JOptionPane.showMessageDialog(null, "Nenhuma valor foi passado.", "Aviso", JOptionPane.WARNING_MESSAGE);
			PegaValor();
		}
	}

	public void Converte() {
		switch (tipoDaMoeda) {
		case "Real para Dólar":
			converte.converterReaisParaDolares(valorParaConversao);
			break;
		case "Real para Euro":
			converte.converterReaisParaEuros(valorParaConversao);
			break;
		case "Real para Libras Esterlinas":
			converte.converterReaisParaLibras(valorParaConversao);
			break;
		case "Real para Peso Argentino":
			converte.converterReaisParaPesosArgentinos(valorParaConversao);
			break;
		case "Real para Peso Chileno":
			converte.converterReaisParaPesosChilenos(valorParaConversao);
			break;
		case "Dólar para Real":
			converte.converterDolaresParaReais(valorParaConversao);
			break;
		case "Euro para Real":
			converte.converterEurosParaReais(valorParaConversao);
			break;
		case "Libras Esterlinas para Real":
			converte.converterLibrasParaReais(valorParaConversao);
			break;
		case "Peso Argentino para Real":
			converte.converterPesosArgentinosParaReais(valorParaConversao);
			break;
		case "Peso Chileno para Real":
			converte.converterPesosChilenosParaReais(valorParaConversao);
			break;
		}
	}
}
