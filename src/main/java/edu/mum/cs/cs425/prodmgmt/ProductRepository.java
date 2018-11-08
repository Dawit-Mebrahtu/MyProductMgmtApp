package edu.mum.cs.cs425.prodmgmt;

import edu.mum.cs.cs425.prodmgmt.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
