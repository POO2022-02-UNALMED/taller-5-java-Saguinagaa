package gestion;
import java.util.ArrayList;
import zooAnimales.*;

public class Zona {
	private String nombre;
	 private Zoologico zoo;
	private ArrayList<Animal> animales= new ArrayList<Animal>();
	
	
	public Zona() {
    	this(null, null);
    }
	public Zona(String nom, Zoologico zoo) {
		this.nombre= nom;
		this.zoo= zoo;
	}
	public void agregarAnimales(Animal animales1) {
        animales.add(animales1);
    }
    public int cantidadAnimales() {
		return animales.size();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Zoologico getZoo() {
		return zoo;
	}

	public void setZoo(Zoologico zoo) {
		this.zoo = zoo;
	}

	public ArrayList<Animal> getAnimales() {
		return animales;
	}

	public void setAnimales(ArrayList<Animal> animales) {
		this.animales = animales;
	}
	
	

}