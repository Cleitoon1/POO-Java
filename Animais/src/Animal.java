
public abstract class Animal {
	public String raca;
	public double peso;
	public double idade;
	public Animal(String raca, double peso, double idade) {
		super();
		this.raca = raca;
		this.peso = peso;
		this.idade = idade;
	}
	public abstract String fazerBarulho();	
}
