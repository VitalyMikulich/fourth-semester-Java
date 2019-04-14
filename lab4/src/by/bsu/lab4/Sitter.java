package by.bsu.lab4;

public class Sitter extends Сuckoo{
    private String name;
    public Sitter (String name){
        this.name = name;
    }
    public void broodСhicks() {
        System.out.println("Высиживать птенцов");
    }
    public String getName() {
        return name;
    }
    @Override
    public int hashCode() {
        return (int)(((name == null) ? 0 : name.hashCode()));
    }

    @Override
    public String toString() {
        return getClass().getName() + "@name" + name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Sitter other = (Sitter) obj;
        if (name != other.name)
            return false;
        return true;
    }
}
