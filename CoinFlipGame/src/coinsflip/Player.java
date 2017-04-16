package coinsflip;

public class Player {

	private String name;
	private String options;
	private String optionsvalue[] = {"Head", "Tail"};
	Player(String name) {
		this.name = name;

	}

	public void didPlayerWin(String winningSide) {
		if (options.equals(winningSide)) {
			System.out.println(name + " won with " + winningSide);
		} else {
			System.out.println(name + " lost with " + winningSide);
		}
	}

	public String getName() {
		return name;
	}

	public String getOptions() {
		return options;
	}

	public void setOptions(String options) {
		this.options = optionsvalue[Integer.valueOf(options)];
	}

}
