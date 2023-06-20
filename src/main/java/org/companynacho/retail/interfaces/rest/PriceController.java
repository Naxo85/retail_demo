package org.companynacho.retail.interfaces.rest;

import org.companynacho.retail.domain.model.Price;
import org.companynacho.retail.service.PriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.Optional;

@RestController
@RequestMapping("/prices")
public class PriceController {

	private final PriceService priceService;

    @Autowired
    public PriceController(PriceService priceService) {
        this.priceService = priceService;
    }

    @GetMapping
    public ResponseEntity<Price> getPriceByDateAndProductAndBrand(
            @RequestParam("date") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime date,
            @RequestParam("productId") Long productId,
            @RequestParam("brandId") Long brandId) {

        Optional<Price> price = priceService.getPriceByDateAndProductAndBrand(date, productId, brandId);

        if (price.isPresent()) {
            return ResponseEntity.ok(price.get());
        } else {
            return ResponseEntity.notFound().build();
        }
        
    }
    

    @GetMapping("/dummy")
    public ResponseEntity<Price> getdummy() {
        return ResponseEntity.status(HttpStatus.I_AM_A_TEAPOT).build();
    }
    
}
