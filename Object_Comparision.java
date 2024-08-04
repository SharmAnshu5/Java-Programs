import java.util.Objects;

public class Object_Comparision {
    private int regno;
    private String name;

    public Object_Comparision(int regno, String name) {
        this.name = name;
        this.regno = regno;
    }

    public int getRegno() {
        return regno;
    }

    public void setRegno(int regno) {
        this.regno = regno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Object_Comparision other = (Object_Comparision) obj;
        return regno == other.regno && Objects.equals(name, other.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regno, name);
    }
}