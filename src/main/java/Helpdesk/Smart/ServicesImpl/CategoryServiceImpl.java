
package Helpdesk.Smart.ServicesImpl;

import Helpdesk.Smart.Entidades.Category;
import Helpdesk.Smart.Entidades.Ticket;
import Helpdesk.Smart.Repositories.CategoryRepository;
import Helpdesk.Smart.Services.CategoryService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class CategoryServiceImpl implements CategoryService{
     @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public Category create(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public Optional<Category> getById(String id) {
        return categoryRepository.findById(id);
    }

    @Override
    public Category update(String id, Category category) {
        Optional<Category> existing = categoryRepository.findById(id);
        if (existing.isPresent()) {
            category.setId(id);
            return categoryRepository.save(category);
        } else {
            throw new ResourceNotFoundException("Not found with id: " + id);
        }
    }

    @Override
    public void delete(String id) {
        Optional<Category> existing = categoryRepository.findById(id);
        if (existing.isPresent()) {
            categoryRepository.deleteById(id);
        } else {
            throw new ResourceNotFoundException("Not found with id: " + id);
        }
    }

    @Override
    public List<Category> getAll() {
        return categoryRepository.findAll();
    }
}
