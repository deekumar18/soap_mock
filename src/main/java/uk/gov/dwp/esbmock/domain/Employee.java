package uk.gov.dwp.esbmock.domain;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

// Mongo database annotation.
/**
 * @author deepak.bh.kumar
 *
 */
@Document(collection = "employee")
public class Employee {

	@Id
	private ObjectId _id;
	private String designation;
	private String name;

	public Employee() {
	}

	public ObjectId get_id() {
		return _id;
	}

	public String getDesignation() {
		return designation;
	}

	public String getName() {
		return name;
	}

	public void set_id(ObjectId _id) {
		this._id = _id;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public void setName(String name) {
		this.name = name;
	}

}