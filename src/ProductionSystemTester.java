import java.util.List;

import controller.ProjectManagerHelper;
import model.ProjectManager;

/**
 * @author Joel Martinez-Gonzalez - jmartinezgonzale
 * CIS175 - Spring 2021
 * Mar 10, 2021
 */
public class ProductionSystemTester {
	static ProjectManagerHelper dao = new ProjectManagerHelper();
	
	public static void main(String[] args) {
		
		ProjectManager john = new ProjectManager("John Mith");
		dao.insertProjectManager(john);
		
		List<ProjectManager> managersList = dao.managersList();
		for(ProjectManager manager : managersList) {
			System.out.println(manager.toString());
		}
	}

}
