package userapi;


import lombok.Getter;
import lombok.Setter;

public class User {

	@Getter @Setter private Integer userId;
	@Getter @Setter private String userName;
	@Getter @Setter private String userEmail;
	@Getter @Setter private String address;

	public User() {}

	public User(Integer userId, String userName, String userEmail, String address) 
	{
		this.userId = userId;
		this.userName = userName;
		this.userEmail = userEmail;
		this.address = address;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName
				+ ", userEmail=" + userEmail + ", address=" + address + "]";
	}
}