package bonus;

public record TextBook(String subject,Integer id) implements IBook<Integer>{
	public Integer printName() {
		return id;
	}
}