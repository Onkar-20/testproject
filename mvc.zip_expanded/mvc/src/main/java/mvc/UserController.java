package mvc;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
	
	@RequestMapping("home")
	public String home()
	{
		return "home";
	}

	@RequestMapping("login")
	public String login()
	{
		return "login";
	}
	
	@RequestMapping("accept")
	public String accept(Model m)
	{
	//	String name = "ONKAR";
		m.addAttribute("name", "Onkar Deshmukh");
		return "accept";
	}
	
	@RequestMapping("help")
	public ModelAndView help()
	{
		
		ModelAndView modelview=new ModelAndView();
		modelview.addObject("name","Hitman");
		modelview.addObject("rollno",45);
		
		modelview.setViewName("help");
		return modelview;
	}
	
	
	@RequestMapping("spel")
	public ModelAndView spel()
	{
		
		ModelAndView modelview=new ModelAndView();
		modelview.addObject("name","virat");
		modelview.addObject("rollno",18);
		
		
		// marks
		List<Integer> list=new ArrayList<Integer>();
		list.add(300);
		list.add(700);
		list.add(200);
		list.add(600);
		list.add(500);
		modelview.addObject("marks",list);
		
		modelview.setViewName("spel");
		return modelview;
	}
	
	@RequestMapping("form")
	public String form()
	{
		return "form";
	}
	
	@RequestMapping(path="/process",method=RequestMethod.POST)
	public String process(@RequestParam("email") String email,@RequestParam("uname") String uname,@RequestParam("pass") String pass
			,Model m)
	{
		m.addAttribute("email", email);
		m.addAttribute("uname", uname);
		m.addAttribute("pass", pass);
		return "process";
	}
	
	@RequestMapping(path="/modelattribute",method=RequestMethod.POST)
	public String modelattribute(@ModelAttribute user u)
	
	{
		String email = u.getEmail();
		String name = u.getUname();
		String pass = u.getPass();
		
		ApplicationContext con = new ClassPathXmlApplicationContext("mvc/config.xml");
		
		JdbcTemplate jt = con.getBean("jdbc",JdbcTemplate.class);
		
		String s = "insert into register(email,uname,pass)value(?,?,?)";
		
		int r =jt.update(s,email,name,pass);
		
		
		
		System.out.println(r);
		System.out.println("inserted successfully");
		
		return "modelattribute";
	}
	
	
	
	
	
	@RequestMapping(path="/quiz",method=RequestMethod.POST)
	public String quiz(@ModelAttribute quiz q)
	
	{
		
		String qn=q.getQ1();
		String qn2=q.getQ2();
		String qn3=q.getQ3();
		
		
		System.out.println(qn);
		System.out.println(qn2);
		System.out.println(qn3);
		ApplicationContext con = new ClassPathXmlApplicationContext("mvc/config.xml");
		
		JdbcTemplate jt = con.getBean("jdbc",JdbcTemplate.class);
		
		String s = "insert into quiz(q1,q2,q3)value(?,?,?)";
		
		int r=jt.update(s,qn,qn2,qn3);
		
		
		
		System.out.println(r);
		System.out.println("inserted successfully");
		
		return "quiz";
	}


}
