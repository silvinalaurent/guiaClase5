package guiaClase5;

public class ItemCarrito {

	private int cantidad;
	private Producto producto;
	
	public ItemCarrito(int c, Producto p)
	{
		cantidad=c;
		producto=p;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	
	public float precio()
	{
		return cantidad * producto.getPrecio(); 
	}
	 
}
