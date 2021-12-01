package com.springrest.springrest.services;
import java.util.List;

import com.springrest.springrest.entities.Load;

public interface LoadService {
	public List<Load> payLoad();
	
	public Load payLoads(long loadId);
	
	public Load addLoad(Load load);

	public Load updateLoad(Load load);
	
	public void deleteLoad(long pareseLong);


}
