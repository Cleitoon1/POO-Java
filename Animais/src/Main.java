
public class Main {

	public static void main(String[] args) {
	Gato gato = new Gato("Cat", 15, 25);
	Cachorro cachorro = new Cachorro("Dog", 10, 30);
		ManadaVirgula manadaVirgula = new ManadaVirgula();
		manadaVirgula.addAnimal(gato);
		manadaVirgula.addAnimal(cachorro);
		
		ManadaSustenido manadaSustenido = new ManadaSustenido();
		manadaSustenido.addAnimal(gato);
		manadaSustenido.addAnimal(cachorro);
		System.out.println(manadaVirgula.estourar());
		System.out.println(manadaSustenido.estourar());
	}

}
