package com.npci.productservice.service;

import com.npci.productservice.entity.Product;
import com.npci.productservice.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.client.support.BasicAuthenticationInterceptor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Stream;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Product addProduct(Product product){

        productRepository.save(product);

        return product;
    }

    public Page<Product> getAllProduct(int page, int pageSize, String sortBy, String sortDir){

        Sort.Direction direction = Sort.DEFAULT_DIRECTION;

        if (sortDir.equalsIgnoreCase("Asc") ){
            direction = Sort.Direction.ASC;
        }
        if (sortDir.equalsIgnoreCase("Desc") ){
            direction = Sort.Direction.DESC;
        }

        Sort sort = Sort.by(direction,sortBy);
        PageRequest pageRequest = PageRequest.of(page,pageSize,sort);
        return productRepository.findAll(pageRequest);
    }

    public Product getProduct(Integer id){
        Optional<Product> productOptional = productRepository.findById(id);
        return productOptional.get();
    }

    public Product updateProduct(Integer id,Product product){
        Product p = productRepository.findById(id).get();
        if (p == null) return null;
        p.setName(product.getName());
        p.setPrice(product.getPrice());
        p.setDescription(product.getDescription());
        productRepository.save(p);
        return p;
    }

    public String deleteProduct(Integer  id){
        Product p = productRepository.findById(id).get();

        Optional<Product> productOptional = productRepository.findById(1);


        if (p == null) return "Product Not Found";
        productRepository.delete(p);
        return "Product Deleted Successfully";
    }


    public Page<Product> searchByProductName(String name, int page, int pageSize) {
        return productRepository.findByNameContainsIgnoreCaseOrderByPrice(name, PageRequest.of(page,pageSize));
    }

    public List<Product> searchByProductName(String name) {
        return productRepository.findByNameContains(name);
    }

    public List<Product> searchByProductPrice(Double min, Double max) {

        return productRepository.findByPriceBetween(min,max);
    }

    public List<Product> searchByProductNamePrice(String name, Double price) {
        return productRepository.findByNameAndPrice(name, price);
    }

    public List<Product> searchByProductDesc(String desc) {
        return productRepository.getAllProductsMatchingDesc(desc);
    }
}
