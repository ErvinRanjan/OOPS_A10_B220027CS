package newshelf;

public class NewSelection {

	// TODO: Complete this method 
	/**
	 * 
	 * @param o object
	 * returns if o is not a book, returns empty string, if Comic, returns title, of Fiction
	 * returns name, and if TextBook, returns subject.
	 */
	public static String getAgeOrTitle(Object o) {
		if(o instanceof Comic) {
			return ((Comic)o).Title();
		} else if(o instanceof Fiction) {
			return ((Fiction)o).name();
		} else if(o instanceof TextBook) {
			return ((TextBook)o).subject();
		}
		return "";
	}

	public static void main(String[] args) {
		
		// TODO: Write a test code here and execute and text.
		TextBook t = new TextBook("Math");
		Comic c = new Comic("SpiderMan",16);
		Fiction f = new Fiction("Harry Potter");
		
		System.out.println(c);
		System.out.println(t);
		
		System.out.println(getAgeOrTitle(t));
		System.out.println(getAgeOrTitle(c));
		System.out.println(getAgeOrTitle(f));
		
	}
}
