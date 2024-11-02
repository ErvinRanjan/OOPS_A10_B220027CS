package bonus;

public record Fiction(String name) implements IBook<String>{
	public String printName() {
		return name;
	}
}