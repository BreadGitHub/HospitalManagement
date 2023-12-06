package Hospital;

import java.util.List;
import java.util.Objects;

public class Department
{
    private Long id;
    private String name;
    private List<Patient> patients;

    public Department(Long id, String name, List<Patient> patients)
    {
        this.id = id;
        this.name = name;
        this.patients = patients;
    }
    public Department(String name)
    {

        this.name = name;
        this.patients = patients;
    }

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public void setPatients(List<Patient> patients) {this.patients = patients;}
    public int hashcode()
    {
        return Objects.hash(id);
    }
//    @Override
//    public boolean equals(Object o) {}
}
