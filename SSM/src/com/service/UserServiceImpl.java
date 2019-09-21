package com.service;
import java.util.List;
 
import javax.annotation.Resource;
 
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
 
import com.mapper.UserMapper;
import com.model.User;
import com.service.UserService;
 
@Service
@Transactional
public class UserServiceImpl implements UserService{
	@Resource
	public UserMapper userMapper;
	@Override
	public int findAgeById(int id) {
		// TODO Auto-generated method stub
		int age = userMapper.findAgeById(id);
        return age;
	}
	@Override
	public String findNameById(int id) {
		// TODO Auto-generated method stub
		String username = userMapper.findNameById(id);
		return username;
	}
	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		
		  userMapper.addUser(user);
	}
	@Override
	public List<User> findUser(){
		return userMapper.findUser();
	}
	@Override
	public void deleteUser(int id) {
		// TODO Auto-generated method stub
		userMapper.deleteUser(id);
	}
	
}