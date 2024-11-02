package bonus;

public record Comic(String title,int ageOfMainCharacter,String additionalAttributes) implements IBook<String,Comic>{
	public String printName() {
		return title;
	}
	
	public int compareTo(Comic c) {
		return this.ageOfMainCharacter - c.ageOfMainCharacter;
	}
}
