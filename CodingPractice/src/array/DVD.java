package array;

public class DVD {
    String name;
    String Description;
    int relaseYear;
    String director;

    public DVD(String name, String description, int relaseYear, String director) {
        this.name = name;
        Description = description;
        this.relaseYear = relaseYear;
        this.director = director;
    }

    @Override
    public String toString() {
        return "array.DVD{" +
                "name='" + name + '\'' +
                ", Description='" + Description + '\'' +
                ", relaseYear=" + relaseYear +
                ", director='" + director + '\'' +
                '}';
    }
}
