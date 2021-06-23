package com.leo.testproject.model.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

//import javax.validation.constraints.DecimalMin;
//import javax.validation.constraints.Digits;
//import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDateTime;

public class StockDto {

    private Long id;

//    @NotNull
    private String name;

//    @NotNull
//    @DecimalMin("0.00")
//    @Digits(integer = 6, fraction = 2)
    private BigDecimal price;

//    @NotNull
//    @Digits(integer = 6, fraction = 2)
    private BigDecimal variation;

//    @NotNull
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private LocalDateTime date;

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

    public BigDecimal getPrice() {
        return price;
    }

    public void setValue(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getVariation() {
        return variation;
    }

    public void setVariation(BigDecimal variation) {
        this.variation = variation;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setData(LocalDateTime date) {
        this.date = date;
    }
}
