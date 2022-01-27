package ru.geekbrains.spring1.lesson6.services;

import org.springframework.stereotype.Service;
import ru.geekbrains.spring1.lesson6.entities.Product;
import ru.geekbrains.spring1.lesson6.projection.ProductDetail;
import ru.geekbrains.spring1.lesson6.repositories.ProductRepository;

import java.util.List;

@Service
public class ProductServices {
    private ProductRepository productRepository;

    public ProductServices(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product findOneById(Long id){
        return productRepository.findOneById(id);
    }

    public List<ProductDetail> showAllProducts(){
        return productRepository.showAllProducts();
    }
}
