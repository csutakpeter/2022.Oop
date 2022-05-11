package lab_5.Models;

public class Course {
    String name;
    String description;
    int numHours;

    //constructor
    public Course(String name, String description, int numHours) {
        this.name = name;
        this.description = description;
        this.numHours = numHours;
    }

    //getters
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getNumHours() {
        return numHours;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", numHours=" + numHours +
                '}';
    }
}
