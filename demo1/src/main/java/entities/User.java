package entities;

import java.time.LocalDate;

import javax.persistence.*;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(unique = true, nullable = false)
	private String username;

	@Column(nullable = false)
	private String password;

	@Column
	private String firstName;

	@Column
	private String lastName;

	@Column
	private LocalDate dob;

	public User() {
		super();
	}

	public User(String username, String password, String firstname, String lastname, LocalDate dob) {
		this.username = username;
		this.password = password;
		this.firstName = firstname;
		this.lastName = lastname;
		this.dob = dob;
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDate getDOB() {
		return this.dob;
	}

	public void setDOB(LocalDate dob) {
		this.dob = dob;
	}
}
