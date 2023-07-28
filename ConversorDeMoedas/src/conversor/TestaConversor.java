package conversor;

public class TestaConversor {

	public static void main(String[] args) {
		
		MenuConversor mc = new MenuConversor();
		mc.CriaMenu();
		mc.PegaOpcaoDeMoeda();
		mc.PegaValor();
		System.out.println(mc.getTipoDaMoeda());
		System.out.println(mc.getTipoDaConversao());
		System.out.println(mc.getValorParaConversao());
		

	}
}
