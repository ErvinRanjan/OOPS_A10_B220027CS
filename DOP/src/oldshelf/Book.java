package oldshelf;

public abstract class Book {
	String title;
	public Book(String title) {
		this.title = title;
	}	
	
	@Override
	public String toString() {
		return "Title : " + title;
	}
}
