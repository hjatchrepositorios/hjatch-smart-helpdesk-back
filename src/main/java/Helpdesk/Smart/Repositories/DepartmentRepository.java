
package Helpdesk.Smart.Repositories;

import Helpdesk.Smart.Entidades.Department;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface DepartmentRepository extends MongoRepository<Department, String> {

}
