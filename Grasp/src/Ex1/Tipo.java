package Ex1;

public class Tipo {

	public enum Categoria{
		normal, lanšamento, infantil;
	}
	
	//Categoria cat;
	double valor = 0.00;
	
	/*public double preco(Categoria cat){
		if(cat == normal){
			this.valor = 10.00;
		} elseif (cat == lanšamento){
			this.valor = 20.00;
		} elseif (cat == infantil){
			this.valor = 15.00;
		} else {
			this.valor = 0.00;
		}
		return valor;
	}*/
	
	private double normal = 10.00;
	private double lanšamento = 25.00;
	private double infantil = 15.00;
	
}
