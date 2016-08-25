package ssm;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.itcast.entity.User;
import cn.itcast.service.IUserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext-core.xml")
public class TestPage {
	
	@Autowired
	private IUserService userServiec;
	
	@Test
	public void test(){
		List<User> users = userServiec.selectUsers();
		System.out.println(users);
	}
}
