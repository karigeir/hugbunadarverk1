package is.hi.booksmart.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


/**
 * 
 * @author Sævar Ingi Sigurðsson <sis108@hi.is>
 * @date 19.september 2017
 * HVB501G Software Development 1
 * 
 * Stores name and abbreviation of schools.
 *
 */
@Entity
@Table (name="school")
public class School {
	
	@Id
	@Column (name = "schoolId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	private String abbrev;
	@OneToMany(mappedBy="school", fetch=FetchType.LAZY, cascade=CascadeType.ALL, orphanRemoval=true)
	private Set<Department> department = new HashSet<Department>();	
	
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
