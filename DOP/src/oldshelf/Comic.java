package oldshelf;

public class Comic extends Book {

	private String Title;

	private final int ageOfMainCharacter;

	public Comic(String Title, int ageOfMainCharacter) {
		super(Title);
		this.Title = Title;
		this.ageOfMainCharacter = ageOfMainCharacter;
	}
	
	public String getTitle() {
		return Title;
	}
	
	public void setTitle(String newTitle) {
		Title = newTitle;
	}
	
	public int getAgeOfMainCharacter() {
		return ageOfMainCharacter;
	}
		
	@Override
	public String toString() {
		return "Title : " + Title + "\nAge of main character: " + ageOfMainCharacter;
	}

	@Override
	public int hashCode() {
		int hash = 7;
		hash = 31*hash + (Title == null ? 0 : Title.hashCode());
		hash = 31*hash + ageOfMainCharacter;
		return hash;
	}
	
	 
	@Override
	public boolean equals(Object o) {
		if(!(o instanceof Comic)) {
			return false;
		}
		
		Comic c = (Comic)o;
		return Title.equals(c.Title) && ageOfMainCharacter == c.ageOfMainCharacter; 
	}
}
