package oldshelf;

public class Fiction extends Book {

	private String name;
	private static FictionType type;
	public Fiction(String title) {
		super(title);
		this.name = title;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public FictionType getType() {
		return type;
	}
	
	public static void setType(FictionType ftype) {
		type = ftype;
	}
}
