package org.companynacho.retail.domain.repository;
	

import org.companynacho.retail.domain.model.Price;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.Optional;

/**
 * Repository interface for managing prices.
 */
@Repository
public interface PriceRepository extends JpaRepository<Price, Long> {

    /**
     * Retrieves the first price that matches the given brand ID, product ID, and date range.
     *
     * @param productId The ID of the product.
     * @param brandId   The ID of the brand.
     * @param date      The date for which the price is requested.
     * @param date2     The end date for the price validity range.
     * @return The optional price matching the criteria.
     */
	Optional<Price> findFirstByBrandIdAndProductIdAndStartDateLessThanEqualAndEndDateGreaterThanEqualOrderByPriorityDesc(
			Long productId, Long brandId, LocalDateTime date, LocalDateTime date2);
		
}