package thangok.icommerce.brandmanager.service;

import org.springframework.data.domain.Page;
import thangok.icommerce.brandmanager.dto.BrandDTO;

import java.util.Optional;

public interface BrandService {

    Page<BrandDTO> getAllBrands();

    Page<BrandDTO> searchBrands(String searchText);

    Optional<BrandDTO> getByCode(String brandCode);

    BrandDTO createBrand(BrandDTO brandDTO);

    BrandDTO updateBrand(BrandDTO brandDTO);

    BrandDTO deleteBrand(String brandCode);

}
