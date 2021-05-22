package ammmm.springboot.http;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import ammmm.springboot.mapper.UserMapper;
import ammmm.springboot.model.UserEntity;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/api")
public class HttpController {

    @Autowired
	private UserMapper userMapper;

    @RequestMapping("")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping("/getUsers")
	public List<UserEntity> getUsers() {
		List<UserEntity> users=userMapper.getAll();
		return users;
	}

    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    @RequestMapping("/getUser")
    public Object getUser(){

        HashMap<String, Object> map = new HashMap<>();
        map.put("id", 1);
        map.put("name", "Ammmm");
        map.put("age", 21);

       return map;
    }

}