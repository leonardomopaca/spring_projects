package controller;

import ch.qos.logback.core.spi.LogbackLock;
import model.dto.StockDTO;
import org.apache.coyote.Response;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/stock")
public class StockController {


    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,
                 produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<StockDTO> save(@RequestBody StockDTO dto){
        return ResponseEntity.ok(dto);
    }

    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE,
                produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<StockDTO> update(@RequestBody StockDTO dto){
        return ResponseEntity.ok(dto);
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<StockDTO>> findAll(){
        List<StockDTO> listaStockDTO = new ArrayList<>();
        StockDTO stockDTO = new StockDTO();
        stockDTO.setId(1L);
        stockDTO.setName("ABC0");
        stockDTO.setPrice(new BigDecimal(100));
        stockDTO.setVariation(new BigDecimal(10));
        stockDTO.setDate(LocalDate.now());
        listaStockDTO.add(stockDTO);
        return ResponseEntity.ok(listaStockDTO);
    }

    public ResponseEntity<StockDTO> findById(@PathVariable Long id){
        List<StockDTO> listaStockDTO = new ArrayList<>();
        StockDTO stockDTO1 = new StockDTO();
        stockDTO1.setId(1L);
        stockDTO1.setName("ABC0");
        stockDTO1.setPrice(new BigDecimal(100));
        stockDTO1.setVariation(new BigDecimal(10));
        stockDTO1.setDate(LocalDate.now());
        listaStockDTO.add(stockDTO1);

        StockDTO stockDTO2 = new StockDTO();
        stockDTO2.setId(2L);
        stockDTO2.setName("DEF7");
        stockDTO2.setPrice(new BigDecimal(200));
        stockDTO2.setVariation(new BigDecimal(5));
        stockDTO2.setDate(LocalDate.now());
        listaStockDTO.add(stockDTO2);

        StockDTO dtoSelected = listaStockDTO.stream().filter(x -> x.getId().compareTo(id) == 0).findFirst().get();

        return ResponseEntity.ok(dtoSelected);
    }
}
