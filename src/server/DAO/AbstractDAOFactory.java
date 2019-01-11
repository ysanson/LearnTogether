package server.DAO;

/**
 * 
 */
public abstract class AbstractDAOFactory extends AbstractDAOUser{

    private AbstractDAOUser userDAO;
    private AbstractDAODepartment departmentDAO;
    /**
     * Default constructor
     */
    public AbstractDAOFactory() {
    }

    public void createDAOUser(){
    }

    /**
     * @param cred
     * @param cred1
     * @param cred2
     */
    public void createDAODepartment(String cred, String cred1, String cred2){


    }

    /**
     * @param cred
     * @param cred1
     * @param cred2
     */
    public void updateDAODepartment(String cred, String cred1, String cred2){

    }

    /**
     * @param cred
     */
    public void deleteDAODepartment(String cred){

    }

}