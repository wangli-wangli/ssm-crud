package com.mapper;
import java.util.List;
import com.model.*;
 
public interface UserMapper {
	public int findAgeById(int id);
	public String findNameById(int id);
	public void addUser(User user);
	public List<User> findUser();
	public void deleteUser(int id);
}