
package Helpdesk.Smart.ServicesImpl;

import Helpdesk.Smart.Entidades.Department;
import Helpdesk.Smart.Repositories.DepartmentRepository;
import Helpdesk.Smart.Services.DepartmentService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public List<Department> getAllDepartments() {
        return departmentRepository.findAll();
    }

}
