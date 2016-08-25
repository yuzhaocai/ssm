package cn.itcast.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/user")
public class UserController {
	private static final String LIST = "";
	private static final String CREATE = "";
	private static final String UPDATE = "";
	
	@RequestMapping(value="/index",method={RequestMethod.GET,RequestMethod.POST})
	public String list(){
		return LIST;
	}
	
	@RequestMapping(value="/search",method=RequestMethod.GET)
	public String search(){
		return null;
	}
	
	@RequestMapping(value="/detail/{id}",method=RequestMethod.GET)
	public String detail(@PathVariable Integer id){
		return null;
	}
	
	@RequestMapping(value="/create",method=RequestMethod.GET)
	public String preCreate(){
		return CREATE;
	}
	
	@RequestMapping(value="/create",method=RequestMethod.POST)
	public String create(){
		return null;
	}
	
	@RequestMapping(value="/update/{id}",method=RequestMethod.GET)
	public String preUpdate(@PathVariable Integer id){
		return UPDATE;
	}
	
	@RequestMapping(value="/update",method=RequestMethod.PUT)
	public String update(){
		return null;
	}
	
	@RequestMapping(value="/delete/{id}",method=RequestMethod.DELETE)
	public String delete(Integer id){
		return null;
	}
	
	@RequestMapping(value="/delete/{ids}",method=RequestMethod.DELETE)
	public String delete(List<Integer> ids){
		return null;
	}
		
}
