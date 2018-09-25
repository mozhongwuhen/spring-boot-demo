package cn.xiaozhao.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloWorldController {
	@Autowired
	private Environment env;
	/**
	 * 控制器
	 * @param args
	 */
	@RequestMapping("/helloworld")
	public String helloWorld(){
		return "helloword"+env.getProperty("url");
	}

}
