package com.shopcompare.datamanagement.persistence.domain;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class ProductId implements Serializable {

    private String name;

    private String link;

}
