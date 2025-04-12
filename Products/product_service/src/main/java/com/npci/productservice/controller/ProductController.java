package com.npci.productservice.controller;

import com.npci.productservice.entity.Product;
import com.npci.productservice.service.ProductService;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    private static final Logger logger = LoggerFactory.getLogger(ProductController.class);

    @PostMapping("")
    public ResponseEntity<Object> addProduct(@RequestBody @Valid Product product){
        Product p = productService.addProduct(product);
        return new ResponseEntity<>(p, HttpStatus.CREATED);
    }

    @GetMapping("")
    public Page<Product> getAllProduct(@RequestParam(required = false, defaultValue = "0") Integer page, @RequestParam(required = false, defaultValue = "100") Integer pageSize, @RequestParam(required = false, defaultValue = "price") String sortBy, @RequestParam(required = false, defaultValue = "Asc") String dir){
        return productService.getAllProduct(page, pageSize, sortBy, dir);
    }

    @GetMapping("/{id}")
    @Operation(summary = "This API endpoint retrieves the prodet details for the provided product id", description = "description goes here", hidden = true)
    public ResponseEntity<Product> getProduct(@PathVariable("id") Integer id){

        System.out.println("Getting product with ID " + id);

        Product p = productService.getProduct(id);
        if ( p != null){
            return new ResponseEntity<>(p,HttpStatus.OK);
        }else {
            return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable("id") Integer id, @Valid @RequestBody Product product){
        return productService.updateProduct(id,product);
    }

    @DeleteMapping("/{id}")
    public String deleteProduct(@PathVariable("id") Integer  id){
        return productService.deleteProduct(id);
    }

    @GetMapping("/search")
    public List<Product> searchByProductName(@RequestParam("name") @NotBlank String keyword){
        return productService.searchByProductName(keyword);
    }

    // Write an API to list the products with in the given price range
    @GetMapping("/searchByPrice")
    public List<Product> searchByPriceRange(@RequestParam("min") Double min, @RequestParam("max") Double max){
        return productService.searchByProductPrice(min,max);
    }

    @GetMapping("/searchByNameAndPrice/{name}/{price}")
    public List<Product> searchByNamePriceRange(@PathVariable("name") String name,@PathVariable("price") Double price){
        return productService.searchByProductNamePrice(name,price);
    }

    @GetMapping("/searchByDescription")
    public List<Product> searchByDesc(@RequestParam("keyword") String desc){
        return productService.searchByProductDesc(desc);
    }

}
