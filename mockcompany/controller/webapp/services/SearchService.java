
package mockcompany.controller.webapp.services;

import com.mockcompany.webapp.model.ProductItem;
import com.mockcompany.webapp.repository.ProductItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class SearchService {

    @Autowired
    private ProductItemRepository productItemRepository;

    public Collection<ProductItem> searchProducts(String query) {
        Iterable<ProductItem> allProducts = productItemRepository.findAll();
        return StreamSupport.stream(allProducts.spliterator(), false)
                .filter(product -> product.getName().toLowerCase().contains(query.toLowerCase()))
                .collect(Collectors.toList());
    }
}
