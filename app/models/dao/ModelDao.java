package models.dao;

import models.dto.ModelDto;
import java.util.List;

public interface ModelDao {
    void create(String name, Integer yearStart, Integer yearEnd);
    ModelDto show(String name);
    List<ModelDto> all();
    void update(String name, Integer yearStart, Integer yearEnd);
    void delete(String name);
}
