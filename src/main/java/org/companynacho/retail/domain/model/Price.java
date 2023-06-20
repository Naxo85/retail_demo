package org.companynacho.retail.domain.model;

import lombok.Data;

import javax.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * Represents the price information for a product from a specific brand.
 */
@Entity
@Table(name = "PRICES")
@Data
public class Price {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    // LAZY load if we don't want to show the brand entity in our response
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "BRAND_ID", referencedColumnName = "ID")
    private Brand brand;
    
    @Column(name = "START_DATE")
    private LocalDateTime startDate;

	@Column(name = "END_DATE")
    private LocalDateTime endDate;

    @Column(name = "PRICE_LIST")
    private Integer priceList;

    // esta sería otra foreign key si se creara la tabla producto, igualmente se podrían crear tablas maestras para currency, prioridades y priceList
    @Column(name = "PRODUCT_ID")
    private Long productId;

    @Column(name = "PRIORITY")
    private Integer priority;

    // BigDecimal is used to provide precision for arithmetic operations with this field
    @Column(name = "PRICE")
    private BigDecimal price;

    @Column(name = "CURR")
    private String currency;   
    
}
