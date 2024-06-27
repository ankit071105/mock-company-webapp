package mockcompany.controller.webapp;

import com.mockcompany.webapp.model.ProductItem;
import com.mockcompany.webapp.services.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class ReportController {

    @Autowired
    private SearchService searchService;

    @GetMapping("/api/reports/products/search")
    public Collection<ProductItem> searchProductsForReport(@RequestParam("query") String query) {
        return searchService.searchProducts(query);
    }
}
