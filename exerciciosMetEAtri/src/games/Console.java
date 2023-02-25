package games;

public class Console extends Produtos {

	private int console;

	public Console(int tipoP, int forma, String cliente, int tipoM, float preco, int console) {
		super(tipoP, forma, cliente, tipoM, preco);
		this.console = console;
	}

	public int getConsole() {
		return console;
	}

	public void setConsole(int console) {
		this.console = console;
	}

	public void visualizar() {
		super.visualizar();

		String console = "";

		switch (this.console) {
		case 1 -> console = "PS4";
		case 2 -> console = "Nintendo Switch";
		case 3 -> console = "Xbox";
		case 4 -> console = "PS5";
		default -> System.out.println("\nConsole indisponível!");
		}

		System.out.println("                   6-Código do Console: " + console);
	}

}
