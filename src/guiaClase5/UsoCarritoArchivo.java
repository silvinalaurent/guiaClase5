package guiaClase5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class UsoCarritoArchivo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try
		{
			Path arch = Paths.get("C:\\Users\\Silvina Laurent\\eclipse-workspace\\guiaClase5\\src\\carrito.csv");
			
			
			int c=0;
			for (String linea : Files.readAllLines(arch))
			{	
				//obtenemos el nro de lineas del archivo
				c++;
			}
			
			int i=0;
			Producto[] p=new Producto[c];
			ItemCarrito[] items=new ItemCarrito[c];
			
			for (String linea : Files.readAllLines(arch))
			{
				
				System.out.println(linea.split(",")[0]);//cantidad
				System.out.println(linea.split(",")[1]);//precioUnitario
				System.out.println(linea.split(",")[2]);//producto
				
				int cantidad=Integer.parseInt(linea.split(",")[0]);
				float precio=Float.parseFloat(linea.split(",")[1]);
				String producto=linea.split(",")[2];
				p[i]=new Producto(producto,precio);
				items[i]=new ItemCarrito(cantidad,p[i]);
				i++;
			}
			Carrito c1=new Carrito(items,2022,3,14);
			
			Descuento desc=new DescuentoPorcentaje();
			desc.setValor((float)10);
			
			System.out.println("El total del carrito es "+c1.precio(desc));
			
		}
		catch (IOException e) {
            System.err.println(e);
        }
		
}
}
