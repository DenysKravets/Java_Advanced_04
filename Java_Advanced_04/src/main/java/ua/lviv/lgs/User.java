package ua.lviv.lgs;

import java.util.ArrayList;

public class User {

	private String name;
	private String email;
	private String password;
	private double money;
	private boolean isAdmin;
	private ArrayList<Magazine> subscribed;
	
	

	public User(String name, String email, String password, boolean isAdmin) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.isAdmin = isAdmin;
		this.money = 0;
		this.subscribed = new ArrayList<>();
	}

	public void addMoney(double money) {
		this.money += money;
	}
	
	public boolean pay(double price) {
		
		if(price > money) {
			return false;
		}
		
		money = money - price;
		
		return true;
	}
	
	public ArrayList<Magazine> getSubscriptions() {
		return subscribed;
	}
	
	public boolean subscribed(Magazine magazine) {
		return subscribed.contains(magazine);
	}
	
	public void addSubscription(Magazine magazine) {
		if(!subscribed.contains(magazine)) 
			subscribed.add(magazine);
	}
	
	public void cancelSubscription(Magazine magazine) {
		if(subscribed.contains(magazine))
			subscribed.remove(magazine);
			
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isAdmin() {
		return isAdmin;
	}

	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", password=" + password + ", money=" + money + ", isAdmin="
				+ isAdmin + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + (isAdmin ? 1231 : 1237);
		long temp;
		temp = Double.doubleToLongBits(money);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (isAdmin != other.isAdmin)
			return false;
		if (Double.doubleToLongBits(money) != Double.doubleToLongBits(other.money))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		return true;
	}
	
	

	
}
