package org.companynacho.retail.service;

import org.companynacho.retail.domain.model.Price;

import java.time.LocalDateTime;
import java.util.Optional;

/**
 * Service interface for retrieving price information.
 */
public interface PriceService {

    /**
     * Retrieves the price based on the specified date, product ID, and brand ID.
     *
     * @param date      The date for which the price is requested.
     * @param productId The ID of the product.
     * @param brandId   The ID of the brand.
     * @return An optional containing the price if found, or an empty optional if not found.
     */
    Optional<Price> getPriceByDateAndProductAndBrand(LocalDateTime date, Long productId, Long brandId);

}
