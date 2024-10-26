package oldshelf;

public final class TextBook extends Book {

	private final String subject;
	
	public TextBook(String subject) {
		super(subject);
		this.subject = subject;
	}

	public String subject() {
		return subject;
	}
	
	@Override
	public final String toString() {
		return "TextBook: Subject: " + subject;
	}
	
	@Override
	public final int hashCode() {
		return subject.hashCode();
	}
	
	@Override 
	public final boolean equals(Object o) {
		return this == o;
	}
}
