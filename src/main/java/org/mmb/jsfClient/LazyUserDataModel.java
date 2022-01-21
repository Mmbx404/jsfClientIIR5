package org.mmb.jsfClient;

import java.util.List;
import java.util.Map;

import org.primefaces.model.FilterMeta;
import org.primefaces.model.LazyDataModel;
import org.primefaces.model.SortMeta;

import metier.beans.User;

public class LazyUserDataModel extends LazyDataModel<User> {
	
	private List<User> datasource;
	
	
	public LazyUserDataModel(List<User> datasource) {
        this.datasource = datasource;
    }
	
	@Override
	public int count(Map<String, FilterMeta> filterBy) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<User> load(int first, int pageSize, Map<String, SortMeta> sortBy, Map<String, FilterMeta> filterBy) {
		// TODO Auto-generated method stub
		return null;
	}

}
