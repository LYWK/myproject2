package com.cycle.web.domain;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import lombok.Data;

/**
 * ProductDTO
 */
@Data @Component @Lazy
public class CycleDTO {
    
       private String modelName,
                            sort,
                            price,
                            brand,
                            gear,
                            rent;
    
}