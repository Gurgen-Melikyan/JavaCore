package classwork.compareList;

import java.util.Objects;

public final class Company {

    private String id;
    private String name;
    private Person director;

    public Company(String id, String name, Person director) {
        this.id = id;
        this.name = name;
        this.director = new Person(director.getName(),director.getSurname());
    }

    public Company() {
    }

    public String getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public Person getDirector() {
        return new Person(director.getName(),director.getSurname());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Company company = (Company) o;

        if (!Objects.equals(id, company.id)) return false;
        if (!Objects.equals(name, company.name)) return false;
        return Objects.equals(director, company.director);
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (director != null ? director.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Company{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", director=" + director +
                '}';
    }
}
