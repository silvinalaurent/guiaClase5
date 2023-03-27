package guiaClase5;

public class usoCarrito {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Producto p1=new Producto("Lavandina", 160);
		Producto p2=new Producto("Yerba", 378);
		Producto p3=new Producto("Azucar", 230);
		
		
		ItemCarrito[] items=new ItemCarrito[3];
		items[0]=new ItemCarrito(2,p3);
		items[1]=new ItemCarrito(1,p2);
		items[2]=new ItemCarrito(3,p1);
		Carrito c1=new Carrito(items,2022,3,14);
		
		Descuento desc=new DescuentoPorcentaje();
		desc.setValor((float)20);
		
		System.out.println("El total del carrito es "+c1.precio(desc));
		
			
			
				
		
		}

}
