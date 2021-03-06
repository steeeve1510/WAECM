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
    private String accountNumber;
    private String username;
    private String password;
    private String firstname;
    private String lastname;
    private Double balance = new Double(0);

    protected Account() {}

    public Account(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Account(String username, String password, String accountNumber, String firstname, String lastname, Double balance) {
        this.username = username;
        this.password = password;
        this.accountNumber = accountNumber;
        this.balance = Math.round(balance*100)/100.0;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
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

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = Math.round(balance*100)/100.0;;
    }

	@Override
	public String toString() {
		return "Account [id=" + id + ", account number" + accountNumber + ", username=" + username + ", password=" + password + ", balance=" + balance + "]";
	}

}
