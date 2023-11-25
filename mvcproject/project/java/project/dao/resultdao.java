package project.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import project.model.result;

@Repository
public class resultdao {

	
	@Autowired
	HibernateTemplate ht;
    @Transactional
	public void insert(result r) {
		// TODO Auto-generated method stub
		ht.save(r);
	}

	public List<result> display() {
		// TODO Auto-generated method stub
		return ht.loadAll(result.class);
	}

	public result getresult(Long sid) {
		// TODO Auto-generated method stub
		return ht.load(result.class, sid);
	}

	public void  update(result r) {
		// TODO Auto-generated method stub
		ht.update(r);
	}
   @Transactional
	public void delete(int r) {
		// TODO Auto-generated method stub
	  // Integer id1=id;
	   ht.delete(r);
   }
	  
	    
	  
	}

	
	
	

