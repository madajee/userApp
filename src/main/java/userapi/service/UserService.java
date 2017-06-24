package userapi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.sql.ResultSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
//import org.springframework.jdbc.support.GeneratedKeyHolder;
//import org.springframework.jdbc.support.KeyHolder;
//import org.springframework.jdbc.core.PreparedStatementCreator;

@Component
public class UserService {

	private static final Logger log = LoggerFactory.getLogger(UserService.class);

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public User createUser(final User user)
	{
		final String sql = "insert into users(userId,userName,userEmail,address) values(?,?,?,?)";
		//KeyHolder holder = new GeneratedKeyHolder();
		//int newUserId = holder.getKey().intValue();
		//System.out.println("UserID: " + newUserId );
		/*jdbcTemplate.update(new PreparedStatementCreator() {
            @Override
            public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
                PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
                System.out.println("******Connection Prepared Statement");
                ps.setInt(1, user.getUserId());
                ps.setString(2, user.getUserName());
                ps.setString(3, user.getUserEmail());
                ps.setString(4, user.getAddress());
                return ps;
            }
        }, holder);*/

		
        //user.setUserId(newUserId);
        jdbcTemplate.update(sql, "12345","Tom", "tomea@mail.com", "USA");

		return user;
	}

	public List<User> getUser ()
	{
		String sqlSelect = "SELECT * FROM users";
		List<User> listUser = jdbcTemplate.query(sqlSelect, new RowMapper<User>() {
 
            public User mapRow(ResultSet result, int rowNum) throws SQLException {
                User user = new User();
                user.setUserId(result.getString("userId"));
                user.setUserName(result.getString("userName"));
                user.setUserEmail(result.getString("userEmail"));
                user.setAddress(result.getString("address"));
                 
                return user;
            }      
        });
        for (User aUser : listUser) {
            System.out.println(aUser);
        }
        return listUser;
         
	}
}