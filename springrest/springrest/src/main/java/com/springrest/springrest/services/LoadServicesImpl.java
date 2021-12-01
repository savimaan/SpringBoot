package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import org.springframework.stereotype.Component;
import com.springrest.springrest.dao.LoadDao;
import com.springrest.springrest.entities.Load;
@Service
public class LoadServicesImpl implements LoadService {
	@Autowired
	private LoadDao loadDao;
    //List<Load> list;
	public LoadServicesImpl()
	{
		//list=new ArrayList<>();
		//list.add(new Load(123,"delhi","jaipur","safe","canter",1,100,"comment","123"));
		//list.add(new Load(143,"mumbai","alwar","ass","canter",2,200,"savi","1234"));
	}
	
	
	
	
	@Override
	public List<Load> payLoad() {
		// TODO Auto-generated method stub
		//return list;
		return loadDao.findAll();
	}




	@Override
	public Load payLoads(long loadId) {
		// TODO Auto-generated method stub
//	Load c=null;
	//	for(Load load:list)
		//{
			//if(load.getshipperId()==loadId)
			//{
				//c=load;
			//	break;
		//	}
		//}
 	//	return c;
		return loadDao.getById(loadId);
	}




	@Override
	public Load addLoad(Load load) {
		// TODO Auto-generated method stub
		//list.add(load);
		//return load;
		loadDao.save(load);
       return  load;
	}




	@Override
	public Load updateLoad(Load load) {
		// TODO Auto-generated method stub
		//list.forEach(e-> {
			//if(e.getshipperId()==load.getshipperId()) {
				//e.setloadingPoint(load.getloadingPoint());
				//e.setunloadingPoint(load.getunloadingPoint());
				//e.setnoOfTrucks(load.getnoOfTrucks());
				//e.settruckType(load.gettruckType());
				//e.setproductType(load.getproductType());
				//e.setoptional(load.getoptional());
				//e.setweight(load.getweight());
				//e.setDate(load.getDate());
				
			//}
			
		//});
		loadDao.save(load);
		return load;
	}


	@Override
	public void deleteLoad(long parseLong) {
		// TODO Auto-generated method stub
		
//	list=this.list.stream().filter(e->e.getshipperId()!=parseLong).collect(Collectors.toList());
	Load entity=	loadDao.getById(parseLong);
		loadDao.delete(entity);
	}
	

}
