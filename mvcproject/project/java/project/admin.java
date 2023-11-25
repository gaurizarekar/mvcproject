package project;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import project.model.result;
import project.service.resultservice;

@Controller
public class admin {

	result r;
	@Autowired
	private resultservice rv;
	//to add student result
	@RequestMapping("/")
	public String addresult()
	{
		return "";
	}
	
	//login admin
	@RequestMapping("/login")
	public String login()
	{
		return "login";
	}
	//login admin
	@RequestMapping("/vlogin")
		public String vlogin(@RequestParam("em")String em,@RequestParam("psd")String psd)
		{


			if(em.equals("gauri@gmail.com")&&psd.equals("gauri"))
			{
				 return "addform";
				 
			}
			else
			{
				 return "login";
			}
			
		}
		
		//add user
		@PostMapping("/insert")
		public String insert(@ModelAttribute("result") result r,Model m)
		{
			rv.addresult(r);
			System.out.println("insert");
			return "addform";
			
		}
		//fetch all records
		@RequestMapping("/display")
		public String display(Model m)
		{
			List l=rv.display();
			 m.addAttribute("list",l);
			return "result";
			
		}		
		@RequestMapping("/delete")
		public String delete(HttpServletRequest req)
				
		{
			int id=Integer.parseInt(req.getParameter("id"));
			//System.out.println(id);
			rv.delete(id);
			return "result";
			
		}
			
		
}
