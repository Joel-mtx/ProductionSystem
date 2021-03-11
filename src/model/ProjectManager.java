package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Joel Martinez-Gonzalez - jmartinezgonzale
 * CIS175 - Spring 2021
 * Mar 10, 2021
 */

@Entity
@Table(name="PROJECT_MANAGER")
public class ProjectManager {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="MANAGER_ID")
	private int idNumber;
	@Column(name="MANAGER_NAME")
	private String managerName;
	
	public ProjectManager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProjectManager(String managerName) {
		super();
		this.managerName = managerName;
	}

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	@Override
	public String toString() {
		return "ProjectManager [idNumber=" + idNumber + ", managerName=" + managerName + "]";
	}
	
	
	
	
	
	

}
