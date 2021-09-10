package com.readlearncode.dukesbookshop.restserver.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Author implements Serializable{
	
	private String id;
	private String firstName;
	private String lastName;
	private String blogURL;
	
	// NOTE: serialization will fail w/o no argument constructor
	public Author() { }

	public Author(String id, String firstName, String lastName, String blogURL) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.blogURL = blogURL;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getBlogURL() {
		return blogURL;
	}

	public void setBlogURL(String blogURL) {
		this.blogURL = blogURL;
	}

	@Override
	public int hashCode() {
		return Objects.hash(blogURL, firstName, id, lastName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Author other = (Author) obj;
		return Objects.equals(blogURL, other.blogURL) && Objects.equals(firstName, other.firstName)
				&& Objects.equals(id, other.id) && Objects.equals(lastName, other.lastName);
	}

	@Override
	public String toString() {
		return "Author [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", blogURL=" + blogURL
				+ "]";
	}
	
}
