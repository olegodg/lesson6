package ru.geekbrains.spring1.lesson6.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.geekbrains.spring1.lesson6.projection.ProductDetail;
import ru.geekbrains.spring1.lesson6.services.ProductServices;

import java.util.List;

@Controller
public class ProductController {
    private ProductServices productServices;

    public ProductController(ProductServices productServices) {
        this.productServices = productServices;
    }

    @RequestMapping("/products")
    public String showProducts(Model model) {
        List<ProductDetail> productList = productServices.showAllProducts();
        model.addAttribute("products", productList);
        return "products";
    }

}
