/**
 * 
 */

/**
 * @author henryasmal
 *
 */
public class Product {

	/**
	 * 
	 */
	
	 int id;
	 String name;
	 String description;
	 Double price;
	 String brand;
	 String category;
	 String img;
	 
	 Product(){}
	
	public Product( int id, String name, String description, Double price,String brand, String category, String img) {
		// TODO Auto-generated constructor stub
		
		this.id=id;
		 this.name=name;
		 this.description=description;
		 this.price=price;
		 this.brand=brand;
		 this.category=category;
		 this.img=img;
	}
	
	
	public int getID() {
		
		return id;
	}
	
	public void setID(int ID) {
		this.id=ID;
	}
	
	
public String getName() {
		
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
public String getDescription() {
		
		return name;
	}
	
	public void setDescription(String description) {
		this.description=description;
	}
	
	
public double getPrice() {
		
		return price;
	}
	
	public void setPrice(Double price) {
		this.price=price;
	}
	
	public String getbrand() {
		
		return brand;
	}
	
	public void setbrand(String brand) {
		this.brand=brand;
	}
	
	
	public String getcategory() {
		
		return category;
	}
	
	public void setcategory(String category) {
		this.category=category;
	}
	
public String getImage() {
		
		return img;
	}
	
	public void setImage(String image) {
		this.img=image;
	}
	
	
}
