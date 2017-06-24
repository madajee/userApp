package userapi;


import lombok.Getter;
import lombok.Setter;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class User {

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	@Getter @Setter private String userId;
	@Getter @Setter private String userName;
	@Getter @Setter private String userEmail;
	@Getter @Setter private String address;

	public User() {}

	public User(String userId, String userName, String userEmail, String address) 
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