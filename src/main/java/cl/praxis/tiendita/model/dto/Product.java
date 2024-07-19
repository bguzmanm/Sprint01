package cl.praxis.tiendita.model.dto;

import java.io.Serializable;

public class Product implements Serializable {
  private int id;
  private String name;
  private String description;
  private Double price;
  private String url;

  public Product() {
  }

  public Product(int id, String name, String description, Double price, String url) {
    this.id = id;
    this.name = name;
    this.description = description;
    this.price = price;
    this.url = url;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }
}
