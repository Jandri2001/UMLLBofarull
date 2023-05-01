package com.company;

import java.util.Date;
import java.util.List;

public class UMLBofarulll {

    public static void main(String[] args) {
            }
        }

class User extends Product {
    private int id;
    private String name;
    private String surname;
    private String email;
    private String password;
    private String phone;
    private String address;
    private String dni;

    public User(int id, String name, String surname, String email, String password, String phone, String address, String dni) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
        this.phone = phone;
        this.address = address;
        this.dni = dni;
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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
}
        class Product {
            private int idProduct;
            private String name;
            private String brand;
            private List<String> images;
            private String description;
            private float basePrice;
            private float discount;
            private String category;
            private String subCategory;
            private String dni;


                    public Product(int idProduct, String name, String brand, List<String> images, String description, float basePrice, float discount, String category, String subCategory) {
                        this.idProduct = idProduct;
                        this.name = name;
                        this.brand = brand;
                        this.images = images;
                        this.description = description;
                        this.basePrice = basePrice;
                        this.discount = discount;
                        this.category = category;
                        this.subCategory = subCategory;
                    }

            Product() {
            }

                    public int getIdProduct() {
                        return idProduct;
                    }

                    public String getName() {
                        return name;
                    }

                    public String getBrand() {
                        return brand;
                    }

                    public List<String> getImages() {
                        return images;
                    }

                    public String getDescription() {
                        return description;
                    }

                    public float getBasePrice() {
                        return basePrice;
                    }

                    public float getDiscount() {
                        return discount;
                    }

                    public String getCategory() {
                        return category;
                    }

                    public String getSubCategory() {
                        return subCategory;
                    }

                    // Setters
                    public void setIdProduct(int idProduct) {
                        this.idProduct = idProduct;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public void setBrand(String brand) {
                        this.brand = brand;
                    }

                    public void setImages(List<String> images) {
                        this.images = images;
                    }

                    public void setDescription(String description) {
                        this.description = description;
                    }

                    public void setBasePrice(float basePrice) {
                        this.basePrice = basePrice;
                    }

                    public void setDiscount(float discount) {
                        this.discount = discount;
                    }

                    public void setCategory(String category) {
                        this.category = category;
                    }

        class Order extends Product {
            private int idOrder;
            private Date orderDate;
            private float totalPrice;
            private int quantity;

            public Order(int idProduct, String name, String brand, List<String> images, String description, float basePrice, float discount, String category, String subCategory) {
                super(idProduct, name, brand, images, description, basePrice, discount, category, subCategory);
            }

            public int getIdOrder() {
                return idOrder;
            }

            public void setIdOrder(int idOrder) {
                this.idOrder = idOrder;
            }

            public Date getOrderDate() {
                return orderDate;
            }

            public void setOrderDate(Date orderDate) {
                this.orderDate = orderDate;
            }

            public float getTotalPrice() {
                return totalPrice;
            }

            public void setTotalPrice(float totalPrice) {
                this.totalPrice = totalPrice;
            }

            public int getQuantity() {
                return quantity;
            }

            public void setQuantity(int quantity) {
                this.quantity = quantity;
            }
        }

        class Review extends Product {
            private int id;
            private int userId;
            private int productId;
            private int rating;
            private String comment;

            public Review(int idProduct, String name, String brand, List<String> images, String description, float basePrice, float discount, String category, String subCategory) {
                super(idProduct, name, brand, images, description, basePrice, discount, category, subCategory);
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getUserId() {
                return userId;
            }

            public void setUserId(int userId) {
                this.userId = userId;
            }

            public int getProductId() {
                return productId;
            }

            public void setProductId(int productId) {
                this.productId = productId;
            }

            public int getRating() {
                return rating;
            }

            public void setRating(int rating) {
                this.rating = rating;
            }

            public String getComment() {
                return comment;
            }

            public void setComment(String comment) {
                this.comment = comment;
            }
        }

        class SpecialProduct extends Product {
            private String subCategory;

            public SpecialProduct(int idProduct, String name, String brand, List<String> images, String description, float basePrice, float discount, String category, String subCategory) {
                super(idProduct, name, brand, images, description, basePrice, discount, category, subCategory);
            }

            public String getSubCategory() {
                return subCategory;
            }

            public void setSubCategory(String subCategory) {
                this.subCategory = subCategory;
            }
        }

        class WishList extends User {
            private List<Product> productWishList;

            public WishList(int id, String name, String surname, String email, String password, String phone, String address, String dni) {
                super(id, name, surname, email, password, phone, address, dni);
            }

            public void setProductWishList(List<Product> productWishList) {
                this.productWishList = productWishList;
        }

    }
}








