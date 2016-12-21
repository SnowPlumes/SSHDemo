package me.lv.market.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer {
	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "nickname")
	private String nickname;
	private String username;
	private String sex;
	private String email;
	private String phone;
	private String isdelete;

	public Customer() {
		super();
	}

	public Customer(int id, String nickname, String username, String sex, String email, String phone, String isdelete) {
		super();
		this.id = id;
		this.nickname = nickname;
		this.username = username;
		this.sex = sex;
		this.email = email;
		this.phone = phone;
		this.isdelete = isdelete;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getIsdelete() {
		return isdelete;
	}

	public void setIsdelete(String isdelete) {
		this.isdelete = isdelete;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", nickname=" + nickname + ", username=" + username + ", sex=" + sex + ", email="
				+ email + ", phone=" + phone + ", isdelete=" + isdelete + "]";
	}

}
