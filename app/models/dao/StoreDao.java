package models.dao;

import models.dto.StoreDto;
import java.util.List;


public interface StoreDao {
    void create(String brand_name, String model_name, Integer year_created, Integer milage, Integer price);
    List<StoreDto> show(String model_name);
    List<StoreDto> all();
    void update(String brand_name, String model_name, Integer year_created, Integer milage, Integer price);
    void delete(String name);
}
