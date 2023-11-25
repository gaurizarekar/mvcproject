package project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import project.dao.resultdao;
import project.model.result;
@Component
@Service
public class resultservice {

	@Autowired
	resultdao rd;
	//insert result
	public void addresult(result r) {
		// TODO Auto-generated method stub
		rd.insert(r);
	}
    //get all result
	public List<result> display()
	{
		return rd.display();
	}
	//get result by id
	public result getresult(Long sid)
	{
		return rd.getresult(sid);
	}
	//update result
	public void update(result r)
	{
		 rd.update(r);
	}
	//delete result
	public void delete(int id)
	{
	
		 rd.delete(id);
	}
}
