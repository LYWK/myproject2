package com.cycle.web.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Product
 */

@NoArgsConstructor(access = AccessLevel.PUBLIC)
@Entity
@Getter
@Setter
@ToString
@Table(name = "cycles")
public class Cycle implements Serializable{

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    @Column(name="model_name") private String modelName; 
    @Column(name="sort") private String sort;
    @Column(name="price") private String price;
    @Column(name="brand") private String brand;
    @Column(name="gear") private String gear;
    @Column(name="rent") private String rent;

    @Override
    public String toString(){
        return "Cycles :[id:"+id+",modelName:" +modelName+", sort:"+sort+", price:"+price+", brand:"+brand+
       ", gear:"+gear+", rent:"+rent+"]";
    }
     
    @Builder
    public Cycle(String modelName,String sort,
    String price,String brand,String gear,String rent){
        this.modelName = modelName;
        this.sort = sort;
        this.price = price;
        this.brand = brand;
        this.gear = gear;
        this.rent = rent;
     
    }

}