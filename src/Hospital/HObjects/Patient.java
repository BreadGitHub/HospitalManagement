package Hospital;

import java.util.List;

public class Patient extends Person
{
    private List<String> disease;
    public Patient(String Fullname, int Age, String Gender)
    {
        super(Fullname, Age, Gender);
    }
}
