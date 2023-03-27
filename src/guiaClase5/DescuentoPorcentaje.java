package guiaClase5;

public class DescuentoPorcentaje extends Descuento {
	
	private float valor;
	
	public float descuento(float valorInicial) {
			return valorInicial - (valorInicial * 
			valor);

	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}
	
}