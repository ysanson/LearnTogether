package Types;

import java.io.Serializable;

/**
 * This class represents a course in the database.
 * @author Solene SERAFIN
 */
public class CourseType implements Serializable {
    private int id;
    private String name;
    private String description;
    private int nbTotalHour;
    private int idTeacher;
    private int idPromo;

    public CourseType(int id, String name, String description, int totalHours, int idTeacher,int idPromo){
        this.id = id;
        this.name = name;
        this.description = description;
        this.setNbTotalHour(totalHours);
        this.idTeacher=idTeacher;
        this.setIdPromo(idPromo);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Name: " + name;
    }

	public int getIdTeacher() {
		return idTeacher;
	}

	public void setIdTeacher(int idTeacher) {
		this.idTeacher = idTeacher;
	}

	public int getNbTotalHour() {
		return nbTotalHour;
	}

	public void setNbTotalHour(int nbTotalHour) {
		this.nbTotalHour = nbTotalHour;
	}

	public int getIdPromo() {
		return idPromo;
	}

	public void setIdPromo(int idPromo) {
		this.idPromo = idPromo;
	}
}
