package coinsflip;

public class Coin {

	private String options;
	private String optionsvalue[] = {"Head", "Tail"};
	Coin() {

	}

	private String getOptions() {
		return options;
	}

	public String flipped() {
		int randomIndex = Math.random() < 0.5 ? 0 : 1;
		this.options = optionsvalue[randomIndex];
		return options;
	}

}
