package com.restaurant.restaurant_management.dao;
import java.util.List;

import com.restaurant.restaurant_management.dto.Messagesdto;
import com.restaurant.restaurant_management.model.Messages;

public interface MessageDAO {

	public List<Messagesdto> getMessages();
	
	public Messages findById(Long id);
	
	public void save(Messages message);
	
	public void deleteMeassageById(Long id);
}
