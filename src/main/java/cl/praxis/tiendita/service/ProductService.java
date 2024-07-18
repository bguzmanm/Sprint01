package cl.praxis.tiendita.service;

import cl.praxis.tiendita.model.dto.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductService {
  public List<Product> getAll() {
    List<Product> list = new ArrayList<Product>();
    list.add(new Product(1, "iPhone 10", "Un celular que funciona muy bien pero está viejito", 700d, "https://cdsassets.apple.com/live/SZLF0YNV/images/sp/111864_iphonex.png"));
    list.add(new Product(2, "iPhone 11", "Un celular que funciona muy bien pero está viejito", 800d, "https://www.apple.com/newsroom/images/product/iphone/standard/Apple_iphone_11-rosette-family-lineup-091019_big.jpg.large_2x.jpg"));
    list.add(new Product(3, "iPhone 12", "Un celular que funciona muy bien pero está viejito", 900d, "https://cdsassets.apple.com/live/SZLF0YNV/images/sp/111864_iphonex.png"));
    list.add(new Product(4, "iPhone 13", "Este no está viejito, y funciona como un campeón", 1000d, "https://cdsassets.apple.com/live/SZLF0YNV/images/sp/111864_iphonex.png"));
    list.add(new Product(5, "iPhone 14", "Filete, este está filete. Caro, pero wueno wueno", 1100d, "https://www" +
            ".apple.com/newsroom/images/product/iphone/geo/Apple-iPhone-14-iPhone-14-Plus-hero-220907-geo_Full-Bleed-Image.jpg.xlarge_2x.jpg"));

    return list;
  }

}
