package org.companynacho.retail.service;

import org.companynacho.retail.domain.model.Price;
import org.companynacho.retail.domain.repository.PriceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

/**
 * Service implementation for retrieving price information.
 */
@Service
public class PriceServiceImpl implements PriceService {

    private final PriceRepository priceRepository;

    @Autowired
    public PriceServiceImpl(PriceRepository priceRepository) {
        this.priceRepository = priceRepository;
    }

    /**
     * Retrieves the price based on the specified date, product ID, and brand ID.
     *
     * @param date      The date for which the price is requested.
     * @param productId The ID of the product.
     * @param brandId   The ID of the brand.
     * @return An optional containing the price if found, or an empty optional if not found.
     */
    @Override
    public Optional<Price> getPriceByDateAndProductAndBrand(LocalDateTime date, Long productId, Long brandId) {
        return priceRepository.findFirstByBrandIdAndProductIdAndStartDateLessThanEqualAndEndDateGreaterThanEqualOrderByPriorityDesc(brandId, productId, date, date);
    }

}
