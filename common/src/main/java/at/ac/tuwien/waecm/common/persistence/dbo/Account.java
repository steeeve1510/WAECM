package at.ac.tuwien.waecm.common.persistence.dbo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


/**
 * Created by Stefan on 15.03.2017.
 */
@Entity
public class Account {

    @Id
    @GeneratedValue
    private Long id;
    private String username;
    private String password;

    private Double balance = new Double(0);

    protected Account() {}

    public Account(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Account(String username, String password, Double balance) {
        this.username = username;
        this.password = password;
        this.balance = balance;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

	@Override
	public String toString() {
		return "Account [id=" + id + ", username=" + username + ", password=" + password + ", balance=" + balance + "]";
	}

}
