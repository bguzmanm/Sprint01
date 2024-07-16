package cl.praxis.tiendita.controller;

import cl.praxis.tiendita.model.dto.Product;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
public class ProductController {


  @GetMapping
  public String findAll(Model model){

    // private ProductService service = new ProductService();
    List<Product> list = new ArrayList<Product>();

    list.add(new Product(1, "iPhone 10", "Un celular que funciona muy bien pero está viejito", 700d));
    list.add(new Product(2, "iPhone 11", "Un celular que funciona muy bien pero está viejito", 800d));
    list.add(new Product(3, "iPhone 12", "Un celular que funciona muy bien pero está viejito", 900d));

    model.addAttribute("products", list);

    return "index";
  }
}
