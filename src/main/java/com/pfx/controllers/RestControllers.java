package com.pfx.controllers;

import com.pfx.models.Product;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class RestControllers {
    @PostMapping(value = "/product")
    public ResponseEntity acceptProductList(@RequestBody List<Product> productList){
        return ResponseEntity.ok("list ok");

    }

}
