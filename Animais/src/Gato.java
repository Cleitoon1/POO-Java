
public class Gato extends Animal {
	
	public Gato(String raca, double peso, double idade) {
		super(raca, peso, idade);
	}
	

	@Override
	public String fazerBarulho() {
		return "Miau";
	}
}
