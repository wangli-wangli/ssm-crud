package com.service;
import java.util.List;
import com.model.*;
 
public interface UserService {
	public int findAgeById(int i);
	public String findNameById(int id);
	public void addUser(User user);
	public List<User> findUser();
	public void deleteUser(int id);
}