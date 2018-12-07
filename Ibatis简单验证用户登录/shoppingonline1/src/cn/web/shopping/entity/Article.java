package cn.web.shopping.entity;

public class Article implements java.io.Serializable{

	private static final long serialVersionUID = 1L;
	
	
	private int id;
	private String title;
	private String supplier;
	private double price;
	private double discount;
	private String locality;
	private String putawayDate;
	private int storage;
	private String image;
	private String description;
	private String typeCode;
	private String createDate;
	private String disabled;
	
	/** setter and getter method */
	public void setId(int id){
		this.id = id;
	}
	public int getId(){
		return this.id;
	}
	public void setTitle(String title){
		this.title = title;
	}
	public String getTitle(){
		return this.title;
	}
	public void setSupplier(String supplier){
		this.supplier = supplier;
	}
	public String getSupplier(){
		return this.supplier;
	}
	public void setPrice(double price){
		this.price = price;
	}
	public double getPrice(){
		return this.price;
	}
	public void setDiscount(double discount){
		this.discount = discount;
	}
	public double getDiscount(){
		return this.discount;
	}
	public void setLocality(String locality){
		this.locality = locality;
	}
	public String getLocality(){
		return this.locality;
	}
	public void setPutawayDate(String putawayDate){
		this.putawayDate = putawayDate;
	}
	public String getPutawayDate(){
		return this.putawayDate;
	}
	public void setStorage(int storage){
		this.storage = storage;
	}
	public int getStorage(){
		return this.storage;
	}
	public void setImage(String image){
		this.image = image;
	}
	public String getImage(){
		return this.image;
	}
	public void setDescription(String description){
		this.description = description;
	}
	public String getDescription(){
		return this.description;
	}
	public void setTypeCode(String typeCode){
		this.typeCode = typeCode;
	}
	public String getTypeCode(){
		return this.typeCode;
	}
	public void setCreateDate(String createDate){
		this.createDate = createDate;
	}
	public String getCreateDate(){
		return this.createDate;
	}
	public void setDisabled(String disabled){
		this.disabled = disabled;
	}
	public String getDisabled(){
		return this.disabled;
	}
	@Override
	public String toString() {
		return "Article [id=" + id + ", title=" + title + ", supplier=" + supplier + ", price=" + price + ", discount="
				+ discount + ", locality=" + locality + ", putawayDate=" + putawayDate + ", storage=" + storage
				+ ", image=" + image + ", description=" + description + ", typeCode=" + typeCode + ", createDate="
				+ createDate + ", disabled=" + disabled + "]";
	}

}