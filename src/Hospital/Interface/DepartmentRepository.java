package Hospital;

import java.util.List;

public interface DepartmentRepository
{
    Department find(Long id);
    List<Department> list();

    void save(Department department);

    void remove(Department department);

    void remove();

    void save();
}
