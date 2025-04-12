package com.npci.productservice.repository;

import com.npci.productservice.entity.ProdCat;
import com.npci.productservice.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Integer> {

    public Optional<Product> findByName(String name);

    public List<Product> findByNameContains(String name);

    public Page<Product> findByNameContainsIgnoreCaseOrderByPrice(String name, Pageable pageable);

    public List<Product> findByPriceBetween(Double min, Double mx);

    public List<Product> findByNameAndPrice(String name, Double price);

    public List<Product> findByNameContainsIgnoreCaseAndPriceBetween(String name, Double priceMin,  Double priceMax);

    public List<Product> findByNameAndDescriptionLikeIgnoreCase(String name, String desc);

    @Query(value = "select * from products where descr like %?1%" , nativeQuery = true)
    public List<Product> getAllProductsMatchingDesc(String desc);

    public Long countByPriceBetween(Double min, Double max);


//    @Query(value = "select ProdCat(Product.Name, Category.Name) FROM Product, Category where Product.catId = Category.Id", nativeQuery = false)
//    public List<ProdCat> findAllProductsByCategory();


}
