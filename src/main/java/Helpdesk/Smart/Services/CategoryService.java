
package Helpdesk.Smart.Services;

import Helpdesk.Smart.Entidades.Category;
import java.util.List;
import java.util.Optional;


public interface CategoryService {
    Category create(Category category);
    Optional<Category> getById(String id);  
    Category update(String id, Category category);
    void delete(String id);
    List<Category> getAll();
}
