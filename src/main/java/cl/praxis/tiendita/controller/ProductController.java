package cl.praxis.tiendita.controller;

import cl.praxis.tiendita.model.dto.Product;
import cl.praxis.tiendita.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
public class ProductController {

  private ProductService service = new ProductService();

  @GetMapping
  public String findAll(Model model){

    model.addAttribute("products", service.getAll());

    return "index";
  }

  // así se recibe un parámetro por la query
  @GetMapping("/{id}")
  public String findOne(@PathVariable("id") int id, Model model){

    System.out.println(id);
    return "index";
  }
}
