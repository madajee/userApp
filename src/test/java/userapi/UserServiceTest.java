package userapi;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.beans.factory.annotation.Autowired;

import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {

	@Autowired
    UserService userService;

    @Test
    public void testCreateUser() throws Exception {
    	System.out.println("test create user");
    	User user1 = new User(15, "test","test","test");
    	System.out.println(user1);
    	User user2 = new User();
    	user2 = userService.createUser(user1);
    	System.out.println(user2);
    }
}
