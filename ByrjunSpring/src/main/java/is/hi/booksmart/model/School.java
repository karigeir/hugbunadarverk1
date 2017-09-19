package is.hi.booksmart.model;

/**
 * 
 * @author Sævar Ingi Sigurðsson <sis108@hi.is>
 * @date 19.september 2017
 * HVB501G Software Development 1
 * 
 * Stores name and abbreviation of schools.
 *
 */

public class School {
	
	private String name;
	private String abbrev;
	
	
	public School(String name, String abbrev) {
		super();
		this.name = name;
		this.abbrev = abbrev;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAbbrev() {
		return abbrev;
	}

	public void setAbbrev(String abbrev) {
		this.abbrev = abbrev;
	}
	
	@Override
	public String toString() {
		return name + ", " + abbrev;
	}
}
