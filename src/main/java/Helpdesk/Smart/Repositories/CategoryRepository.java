
package Helpdesk.Smart.Repositories;

import Helpdesk.Smart.Entidades.Category;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface CategoryRepository extends MongoRepository<Category, String> {

}
