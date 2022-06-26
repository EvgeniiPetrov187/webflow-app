package com.petrov.webflowapp.controller;

import com.petrov.webflowapp.persist.Product;
import com.petrov.webflowapp.persist.ProductRepository;
import com.petrov.webflowapp.persist.ProductRepositoryImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/products")
public class ProductController {

//    ApplicationContext context = new ClassPathXmlApplicationContext("dispatcher-servlet.xml");

    private static final Logger logger = LoggerFactory.getLogger(ProductController.class);


//    private ProductRepository productRepository = context.getBean("productRepository", ProductRepositoryImpl.class);

    @Autowired
    private ProductRepository productRepository;

    public ProductController(ProductRepositoryImpl productRepository) {
        this.productRepository = productRepository;
    }


    public ProductController() {
    }

    public void setProductRepository(ProductRepositoryImpl productRepository) {
        this.productRepository = productRepository;
    }

//    @GetMapping
//    public String listPage(Model model) {
//        logger.info("Product list page requested");
//        model.addAttribute("products", productRepository.findAll());
//        return "products";
//    }

    @GetMapping("/all")
    public ModelAndView findAll() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("products", productRepository.findAll());
        modelAndView.setViewName("products");
        return modelAndView;
    }

//    @GetMapping("/new1")
//    public String newProductFormFirst(Model model) {
//        logger.info("New product page 1 requested");
//        model.addAttribute("product", new Product());
//        return "flows/product_new1";
//    }
//
//    @GetMapping("/new2")
//    public String newProductFormSecond(Model model) {
//        logger.info("New product page 2 requested");
//        model.addAttribute("product", new Product());
//        return "product_url";
//    }
//
//    @GetMapping("/{id}")
//    public String editProduct(@PathVariable("id") Long id, Model model) {
//        model.addAttribute("product", productRepository.findById(id));
//        return "new_product_form";
//    }
//
//    @PostMapping
//    public String update(Product product) {
//        logger.info("Saving product");
//        productRepository.update(product);
//        return "redirect:/products";
//    }
//
//    @GetMapping("/delete/{id}")
//    public String delete(@PathVariable("id") Long id, Model model) {
//        logger.info("Deleting product");
//        model.addAttribute("product", productRepository.findById(id));
//        productRepository.delete(id);
//        return "redirect:/products";
//    }
}
