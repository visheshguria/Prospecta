package com.prospecta.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.prospecta.Dto.ResultDto;
import com.prospecta.exceptions.EntryException;
import com.prospecta.model.Data;
import com.prospecta.model.Entry;

@RestController
public class CustomController {
		
	@Autowired
	RestTemplate rTemp;

	
	
	@GetMapping("/entries/{category}")
	public List<ResultDto> getEntriesHandler(@PathVariable String category)throws EntryException{
		
		String url= "https://api.publicapis.org/entries";
		
		Data dta = rTemp.getForObject(url, Data.class);
		List<Entry> ent= dta.getEntries();
		
		List<ResultDto> lst= new ArrayList<>();
		
		for(Entry en : ent ) {
			if(en.getCategory().equals(category)) {
				lst.add(new ResultDto(en.getApi(),en.getDescription()));
			}
			else {
				throw new EntryException("No Category Match");
			}
		}
		
		if(lst.size()>0) {
			return lst;
		}
		else {
			throw new EntryException("No List of Items found");
		}
	}
}
