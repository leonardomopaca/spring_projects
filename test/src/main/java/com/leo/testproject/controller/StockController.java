package com.leo.testproject.controller;

import com.leo.testproject.model.dto.StockDto;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

//import javax.validation.Valid;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/stock")
public class StockController {

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<StockDto> save(@RequestBody StockDto dto){
        return ResponseEntity.ok(dto);
    }

    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<StockDto> udpate(@RequestBody StockDto dto){
        return ResponseEntity.ok(dto);
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<StockDto>> findAll(){
        List<StockDto> list = new ArrayList<>();
        StockDto stockDto = new StockDto();
        stockDto.setId(1L);
        stockDto.setName("ABC123");
        stockDto.setValue(new BigDecimal(100));
        stockDto.setValue(new BigDecimal(10));
        stockDto.setData(LocalDateTime.now());

        list.add(stockDto);

        return ResponseEntity.ok(list);
    }

    @GetMapping(value = "/{id}",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<StockDto> findById(@PathVariable Long id){
        List<StockDto> list = new ArrayList<>();
        StockDto stockDto = new StockDto();
        stockDto.setId(1L);
        stockDto.setName("ABC123");
        stockDto.setValue(new BigDecimal(100));
        stockDto.setVariation(new BigDecimal(10));
        stockDto.setData(LocalDateTime.now());
        list.add(stockDto);

        StockDto stockDto2 = new StockDto();
        stockDto2.setId(2L);
        stockDto2.setName("DEF456");
        stockDto2.setValue(new BigDecimal(200));
        stockDto2.setVariation(new BigDecimal(5));
        stockDto2.setData(LocalDateTime.now());
        list.add(stockDto2);

        StockDto stockSelected = list.stream().filter(x -> x.getId().compareTo(id) == 0).findFirst().get();

        return ResponseEntity.ok(stockSelected);
    }
}
