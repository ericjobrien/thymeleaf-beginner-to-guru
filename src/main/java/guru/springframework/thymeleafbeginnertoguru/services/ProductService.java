package guru.springframework.thymeleafbeginnertoguru.services;

import guru.springframework.thymeleafbeginnertoguru.domain.Product;

import java.util.List;

public interface ProductService {

    Product getProduct(Integer id);

    List<Product> listProducts();
}
