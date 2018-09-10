package bean;

public class Book {

	String author;
	int id;
	String name;
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Book [author=" + author + ", id=" + id + ", name=" + name + "]";
	}
	public Book(String author, int id, String name) {
		super();
		this.author = author;
		this.id = id;
		this.name = name;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
