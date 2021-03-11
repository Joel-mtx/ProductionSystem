package model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author Joel Martinez-Gonzalez - jmartinezgonzale
 * CIS175 - Spring 2021
 * Mar 10, 2021
 */
@Entity
@Table(name="JOB_NUMBER")
public class JobNumber {
	@Id
	@Column(name="JOB_NUMBER")
	private int jobNumber;
	@Column(name="QUANTITY_OF_PANELS")
	private int quantityOfPanels;
	@Column(name="SHIP_OUT_DATE")
	private LocalDate shippingDate;
	@ManyToOne
	@JoinColumn(name="MANAGER_NAME")
	private ProjectManager manager;
	
	
	public JobNumber() {
		super();
		// TODO Auto-generated constructor stub
	}


	public JobNumber(int jobNumber, int quantityOfPanels, LocalDate shippingDate, ProjectManager manager) {
		super();
		this.jobNumber = jobNumber;
		this.quantityOfPanels = quantityOfPanels;
		this.shippingDate = shippingDate;
		this.manager = manager;
	}


	public int getJobNumber() {
		return jobNumber;
	}


	public void setJobNumber(int jobNumber) {
		this.jobNumber = jobNumber;
	}


	public int getQuantityOfPanels() {
		return quantityOfPanels;
	}


	public void setQuantityOfPanels(int quantityOfPanels) {
		this.quantityOfPanels = quantityOfPanels;
	}


	public LocalDate getShippingDate() {
		return shippingDate;
	}


	public void setShippingDate(LocalDate shippingDate) {
		this.shippingDate = shippingDate;
	}


	public ProjectManager getManager() {
		return manager;
	}


	public void setManager(ProjectManager manager) {
		this.manager = manager;
	}


	@Override
	public String toString() {
		return "JobNumber [jobNumber=" + jobNumber + ", quantityOfPanels=" + quantityOfPanels + ", shippingDate="
				+ shippingDate + ", manager=" + manager + "]";
	}
	
	
	
	

}
