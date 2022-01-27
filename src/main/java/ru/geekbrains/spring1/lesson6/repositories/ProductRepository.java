package ru.geekbrains.spring1.lesson6.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.geekbrains.spring1.lesson6.entities.Product;
import ru.geekbrains.spring1.lesson6.projection.ProductDetail;

import java.util.List;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {
    Product findOneById(Long id);

    @Query(value = "select p.id, p.title, c.title as category from hiber.products p inner join hiber.categories c on p.id_category =c.id", nativeQuery = true)
    List<ProductDetail> showAllProducts();

}
