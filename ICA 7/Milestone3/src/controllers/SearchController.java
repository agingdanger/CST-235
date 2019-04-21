package controllers;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

import beans.Scripture;
import beans.Search;
import business.SearchBusinessInterface;

@ManagedBean
@SessionScoped
public class SearchController {
	@Inject
	SearchBusinessInterface service;
	
	public void findVerse(Search surch) {
		//Search search = new Search(surch.getName(), surch.getChapter(), surch.getVerse());
		
		//System.out.println(surch.getChapter());
		
		String link = "https://bible-api.com/" + surch.getName() + "+" + surch.getChapter() + ":" + surch.getVerse() + "?callback=func";
		System.out.println(link);
		
		System.out.println(service.findVerse(link));
		Scripture holy = new Scripture();
		holy.setScripture(service.findVerse(link));
		service.findVerse(link);
		System.out.println("The verse is:" + holy.getScripture());
	}
	
	
	
}
