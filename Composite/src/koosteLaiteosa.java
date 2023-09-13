import java.util.ArrayList;
import java.util.List;
//Composite-luokka
public class koosteLaiteosa implements Laiteosa {

	private String nimi;
    private List<Laiteosa> komponentit = new ArrayList<>();
	public koosteLaiteosa(String nimi){
		this.nimi = nimi;
	}
	public void lisaaLaiteosa(Laiteosa osa) {
		komponentit.add(osa);
	}

	
	@Override
	public double getHinta() {
		double kokoHinta = 0.0;
		for(Laiteosa osa : komponentit) {
			kokoHinta += osa.getHinta();
		}
		return kokoHinta;
	}

}
