package Clases2;
public class Producto implements Comparable<Producto>{
	private int precio;
	private String nombre;
	private String categoria;
	private String opinion;
	private String marca;

	public Producto(int precio, String nombre, String categoria, String opinion, String marca) {
		this.precio = precio;
		this.nombre = nombre;
		this.categoria = categoria;
		this.opinion = opinion;
		this.marca = marca;
	}

	public Producto(){

	}

    

	@Override
	public String toString() {
		return "Nombre: " + getNombre() + "\n" + "Precio: " + getPrecio() + "\n" + "Categoria: " + getCategoria() + "\n"
				+ "Marca: " + getMarca() + "\n" + "Opinion: " + getOpinion() +"\n"+ "-----------";
	}
	@Override
	public int compareTo(Producto prod){
		return this.precio - prod.precio;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getOpinion() {
		return opinion;
	}

	public void setOpinion(String opinion) {
		this.opinion = opinion;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

}
