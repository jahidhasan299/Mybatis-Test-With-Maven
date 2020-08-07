package com.sys.dao;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.sys.pojo.User;
public interface UserDao {
	//add new user
	public int addUser(User user) throws Exception;
	public void delUser(String username) throws Exception;
	public void updateUser(@Param("newname") String username, @Param("newnick")String nickname ) throws Exception;
	public List<User> getAll() throws Exception;
	public List<User> getAllWithCardid() throws Exception;
	public List<User> getAllWithPhone() throws Exception;

}
