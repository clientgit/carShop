package models.dao;

import models.dto.BrandDto;
import java.util.List;

public interface BrandDao {
    void create(String name, String country);
    BrandDto show(String name);
    List<BrandDto> all();
    void update(String name, String country);
    void delete(String name);
}
