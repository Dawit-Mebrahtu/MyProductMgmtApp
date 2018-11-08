package edu.mum.cs.cs425.prodmgmt;

import java.util.Date;

import edu.mum.cs.cs425.prodmgmt.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping(path="/product")
public class ProductMgmtApp {
    @Autowired
    private ProductRepository productRepository;

    @GetMapping(path="/save")
    public @ResponseBody String saveProduct(@RequestParam Long productNumber, @RequestParam String name,
                                            @RequestParam float unitPrice, @RequestParam Date dateMfd) {
        Product product = new Product(productNumber, name, unitPrice, dateMfd);
        productRepository.save(product);

        return "saved";

    }
}
