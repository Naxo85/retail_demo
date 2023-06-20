	package org.companynacho.retail.domain.repository;
	

	import org.companynacho.retail.domain.model.Price;
import org.springframework.data.jpa.repository.JpaRepository;
	import org.springframework.stereotype.Repository;

	import java.time.LocalDateTime;
	import java.util.Optional;

	@Repository
	public interface PriceRepository extends JpaRepository<Price, Long> {


		Optional<Price> findFirstByBrandIdAndProductIdAndStartDateLessThanEqualAndEndDateGreaterThanEqualOrderByPriorityDesc(
	            Long productId, Long brandId, LocalDateTime date, LocalDateTime date2);
		
	}