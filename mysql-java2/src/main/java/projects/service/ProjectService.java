/**
 * 
 */
package projects.service;

import project.dao.DbException;
import project.dao.ProjectDao;
import projects.entity.Project;

/**
 * This class implements the service layer in the 3-tier application. The CRUD operations that the
 * application performs are so simple that this class acts mostly as a pass-through from the input
 * layer to the data layer.
 * 
 * @author Promineo
 *
 */
public class ProjectService {
  private ProjectDao projectDao = new ProjectDao();

  /**
   * This method simply calls the DAO class to insert a project row.
   * 
   * @param project The {@link Project} object.
   * @return The Project object with the newly generated primary key value.
   */
  public Project addProject(Project project) {
    try {
      return projectDao.insertProject(project);
    } catch (DbException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    return project;
  }


}
