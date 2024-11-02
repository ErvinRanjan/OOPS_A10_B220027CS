package oldshelf;

public class OldSelection {

	 /*
	 * 
	 * @param o object
	 * returns if o is not a book, returns empty string, if Comic, returns title, of Fiction
	 * returns name, and if TextBook, returns subject.
	 */
//	public static String getAgeOrTitle(Object o) {
//		if (!(o instanceof Book)) {
//			 return "";
//		} else if(o instanceof Comic) {
//			return ((Comic)o).getTitle();
//		} else if(o instanceof Fiction) {
//			return ((Fiction)o).getName();
//		} 
//		return ((TextBook)o).subject();
//	}
	
	public static String getAgeOrTitle(Object o) {
		switch(o) {
			case Comic c:  return c.getTitle();
			case Fiction f: return f.getName();
			case TextBook t: return t.subject();
			default : return  "";
		}
	}

	public static void main(String[] args) {
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
