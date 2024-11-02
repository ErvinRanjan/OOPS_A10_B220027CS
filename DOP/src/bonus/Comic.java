package bonus;

public record Comic(String title,int ageOfMainCharacter,String additionalAttributes) implements IBook<String>{
	public String printName() {
		return title;
	}
}
