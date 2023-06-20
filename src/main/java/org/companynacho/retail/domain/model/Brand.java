package org.companynacho.retail.domain.model;

import lombok.Data;

import javax.persistence.*;

/**
 * Represents a brand entity.
 */
@Entity
@Table(name = "BRANDS")
@Data
public class Brand {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME")
    private String name;

}
