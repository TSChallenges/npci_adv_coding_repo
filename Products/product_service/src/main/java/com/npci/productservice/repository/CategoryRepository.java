package com.npci.productservice.repository;

import com.npci.productservice.entity.Category;
import com.npci.productservice.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface CategoryRepository extends JpaRepository<Category, Integer> {


    public List<Category> findByCatGroup(String group);

}
