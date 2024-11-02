package bonus;

public record Fiction(String name) implements IBook<String,Fiction>{
	public String printName() {
		return name;
	}
	
	public int compareTo(Fiction f) {
		return this.name.compareTo(f.name);
	}
}