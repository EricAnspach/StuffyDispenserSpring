package stuffy.business;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Stuffy {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String type;
	private String size;
	private String color;

	public Stuffy(int id, String type, String color, String size) {
		this.id = id;
		this.type = type;
		this.size = size;
		this.color = color;
	}

	public int getId() {
		return id;
	}

	public String getType() {
		return type;
	}

	public String getSize() {
		return size;
	}

	public String getColor() {
		return color;
	}

	@Override
	public String toString() {
		return "Stuffy [id=" + id + ", type=" + type + ", color=" + color + ", size=" + size + "]";
	}
	
	
}
