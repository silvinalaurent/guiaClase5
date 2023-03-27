package guiaClase5;
import java.util.Date;
import java.util.GregorianCalendar;


public class Carrito {

	
	private ItemCarrito[] items;
	private Date fecha;
	
	public Carrito(ItemCarrito[] items, int a, int m, int d)
	{
		this.items=items;
		GregorianCalendar fecha=new GregorianCalendar(a,m-1,d);
		this.fecha=fecha.getTime();
	}

	public ItemCarrito[] getItems() {
		return items;
	}

	public void setItems(ItemCarrito[] items) {
		this.items = items;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public float precio(Descuento desc) {
		/*recorro items, tomo el de la linea, se suman y luego se resta el descuento*/
		float suma=0;
		for (int i=0; i<items.length; i++)
		{
			suma=suma+items[i].precio();
		}
	
		suma=suma-desc.getValor();
		return suma;
		
	}
	
}
