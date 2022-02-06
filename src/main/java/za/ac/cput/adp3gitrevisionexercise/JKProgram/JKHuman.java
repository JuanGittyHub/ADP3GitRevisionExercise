package za.ac.cput.adp3gitrevisionexercise.JKProgram;
/**
 * @author Juan-Lee Klink 218236883
 * Person class
 *
 */

public class JKHuman {
    private String personName;
    private String personGender;
    private String personFavFood;
    private String personFavShow;

    public JKHuman(String personName, String personGender, String personFavFood, String personFavShow) {
        this.personName = personName;
        this.personGender = personGender;
        this.personFavFood = personFavFood;
        this.personFavShow = personFavShow;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getPersonGender() {
        return personGender;
    }

    public void setPersonGender(String personGender) {
        this.personGender = personGender;
    }

    public String getPersonFavFood() {
        return personFavFood;
    }

    public void setPersonFavFood(String personFavFood) {
        this.personFavFood = personFavFood;
    }

    public String getPersonFavShow() {
        return personFavShow;
    }

    public void setPersonFavShow(String personFavShow) {
        this.personFavShow = personFavShow;
    }

    @Override
    public String toString() {
        return "JKHuman{" +
                "personName='" + personName + '\'' +
                ", personGender='" + personGender + '\'' +
                ", personFavFood='" + personFavFood + '\'' +
                ", personFavShow='" + personFavShow + '\'' +
                '}';
    }
}
