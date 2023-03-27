package guiaClase5;

public class Producto {
	private String nombre;
	private float precio;
	
	public Producto(String n, float p)
	{
		nombre=n;
		precio=p;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	public float costoFinal(int cantCuotas)
	{
		return precio*cantCuotas;
	}
	
	
}
