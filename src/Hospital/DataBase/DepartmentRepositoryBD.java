package Hospital;

import Hospital.Interface.DepartmentRepository;
import com.sun.jdi.connect.spi.Connection;

import java.util.List;

public class DepartmentRepositoryBD implements DepartmentRepository
{
    private final Connection connection;

    public DepartmentRepositoryBD(Connection connection) {
        this.connection = (Connection) connection;
    }
    // GIVE
    @Override
    public Department giveDepartment(String name) {
        return null;
    }
    @Override
    public Department giveDepartmentByID(Long id) {
        return null;
    }
    @Override
    public Patient givePatient(String name) {
        return null;
    }
    public Patient givePatientByID(Long id) {
        return null;
    }
    // ADD / REMOVE
    @Override
    public void addPatient(Patient patient) {}
    @Override
    public List<Department> giveDepartmentList()
    {
        return null;
    }
    @Override
    public void removePatient(Patient patient) {}

    @Override
    public void addDepartment(Department department) {}

    @Override
    public void removeDepartment(Department department) {}
}
