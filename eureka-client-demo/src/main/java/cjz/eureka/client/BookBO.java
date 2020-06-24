/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package cjz.eureka.client;

import java.math.BigDecimal;

public class BookBO {
    private Long id;
    private String name;
    private String isbn;
    private String author;
    private BigDecimal price;

    public BookBO() {
    }

    public BookBO(Long id, String name, String isdn, String author, BigDecimal price) {
        this.id = id;
        this.name = name;
        this.isbn = isdn;
        this.author = author;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BookBO{");
        sb.append("name='").append(name).append('\'');
        sb.append(", isbn='").append(isbn).append('\'');
        sb.append(", author='").append(author).append('\'');
        sb.append(", price=").append(price);
        sb.append('}');
        return sb.toString();
    }
}
