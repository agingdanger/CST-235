package Models;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ViewScoped
@ManagedBean
public class SearchID {


	int ID;
	
	/**
	 * constructor
	 */
	public SearchID() {
		this.ID = this.getID();
	}
	
	/**
	 * constructor
	 * @param ID
	 */
	public SearchID(int ID) {
		this.ID = ID;
	}
	
	

	/**
	 * @return the iD
	 */
	public int getID() {
		return ID;
	}

	/**
	 * @param iD the iD to set
	 */
	public void setID(int ID) {
		this.ID = ID;
	}
}
