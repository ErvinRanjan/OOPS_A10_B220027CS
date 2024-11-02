package bonus;

public record TextBook(String subject,Integer id) implements IBook<Integer,TextBook>{
	public Integer printName() {
		return id;
	}
	
	public int compareTo(TextBook t) {
		return this.id - t.id;
	}
}