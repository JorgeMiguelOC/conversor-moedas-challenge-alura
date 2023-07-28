package conversor;

import javax.swing.JOptionPane;

public class MenuConversor {
	
		//Adicionar futuramente Conversor de temperatura, Peso, Volume e Tempo
		private String[] tiposDeConversao = {"Conversor de Moeda"};
		private String[] tiposDeMoeda = {"Real para Dólar", "Real para Euro", "Real para Libras Esterlinas", 
										"Real para Yenes", "Real para Peso Argentino", "Real para Peso Chileno",
										"Dólar para Real", "Euro para Real","Libras Esterlinas para Real", 
										"Yenes para Real", "Peso Argentino para Real", "Peso Chileno para Real"};
		
		private String tipoDaConversao;
		private String tipoDaMoeda;
		private double valorParaConversao;
		

		//Cria menu de seleção para selecionar o tipo de conversão
		//os tipos de seleção estão armazenados na variavel tiposDeConversao
		public void CriaMenu() {
			tipoDaConversao = (String) JOptionPane.showInputDialog(null, "Escolha uma opção:", "Menu", 
				JOptionPane.INFORMATION_MESSAGE, null, this.tiposDeConversao, 
				this.tiposDeConversao[0]);
			
			if(tipoDaConversao == null) {
				JOptionPane.showMessageDialog(null, "Nenhuma opção de conversão selecionada.", "Aviso", JOptionPane.WARNING_MESSAGE);
				CriaMenu();
			}
		}
		
		//Cria menu de seleção para selecionar o tipo de conversão monetaria desejada
		//os tipos armazenados são da variavel tiposDeMoeda
		public void PegaOpcaoDeMoeda() {
			tipoDaMoeda =  (String) JOptionPane.showInputDialog(null, "Escolha uma opção:", "Opção de Moeda", 
				JOptionPane.INFORMATION_MESSAGE, null, this.tiposDeMoeda, 
				this.tiposDeMoeda[0]);
			
			if(tipoDaMoeda == null) {
				JOptionPane.showMessageDialog(null, "Nenhuma opção de moeda selecionada.", "Aviso", JOptionPane.WARNING_MESSAGE);
				PegaOpcaoDeMoeda();
			}
			
		}
		
		//Cria input requerindo um valor para conversão e trata o valor recebido para que seja numeros
		//lança um NumberFormatException caso enviem letras ou outros caracteres.
		public void PegaValor() {
			 String numeroParaConversao = JOptionPane.showInputDialog("Digite o numero para a conversão:");
			 
			 try {
				 valorParaConversao = Double.parseDouble(numeroParaConversao);
		        } catch (NumberFormatException e) {
		            JOptionPane.showMessageDialog(null, "Entrada inválida. Digite um valor numérico.", "Erro", JOptionPane.ERROR_MESSAGE);
		            PegaValor();
		        } catch (NullPointerException e) {
					JOptionPane.showMessageDialog(null, "Nenhuma valor foi passado.", "Aviso", JOptionPane.WARNING_MESSAGE);
					PegaValor();
					}
		        }
			 
			public String getTipoDaConversao() {
				return tipoDaConversao;
			}
			
			public double getValorParaConversao() {
				return valorParaConversao;
			}
			
			public String getTipoDaMoeda() {
				return tipoDaMoeda;
			}
		
		
		}
	

