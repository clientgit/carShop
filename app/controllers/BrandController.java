package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import models.dto.BrandDto;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;
import service.BrandService;
import javax.inject.Inject;
import java.util.List;


public class BrandController extends Controller {

    @Inject
    private BrandService brandService;

    public Result create(Http.Request request) {
        JsonNode json = request.body().asJson();
        if(json != null) {
            String name = json.get("name").asText();
            String country = json.get("country").asText();
            brandService.create(name, country);
            return ok(  "CREATE OK");
        }
        return ok("NO CREATE");
    }

    public Result show(String name) {
        return ok(Json.toJson(brandService.show(name)));
    }

    public Result all() {
        List<BrandDto> result = brandService.all();
        return ok(Json.toJson(result));
    }

    public Result update(Http.Request request) {
        JsonNode json = request.body().asJson();
        if(json != null) {
            String name = json.get("name").asText();
            String country = json.get("country").asText();
            brandService.update(name, country);
            return ok(  "UPDATE OK");
        }
        return ok("NO");
    }

    public Result delete(String name) {
        brandService.delete(name);
        return ok("DELETE OK");
    }

}
