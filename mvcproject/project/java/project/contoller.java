package project;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class contoller {

	@RequestMapping("/search")
	public String search()
	{
		return "searchpage";
	}

 
public String handleform()
{
	
	return "";
}
}