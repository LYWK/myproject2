package com.cycle.web.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import com.cycle.web.domain.CycleDTO;
import com.cycle.web.entities.Cycle;
import com.cycle.web.repository.CycleRepository;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ProductController
 */
@CrossOrigin(origins = "http://localhost:8080", maxAge = 3600)
@RestController
@RequestMapping("/cycles")
public class CycleController {
    @Autowired
    CycleRepository repo;
    @Autowired
    ModelMapper modelMapper;

    @Bean
    public ModelMapper modelMapper() {

        ModelMapper modelMapper = new ModelMapper ();

        return modelMapper;

    }
    @PostMapping("")
    public List<CycleDTO> CycleRegist(@RequestBody CycleDTO dto) {
        System.out.println("regist test");
        HashMap<String,String> map = new HashMap<>();
        Cycle entity = new Cycle();
        entity.setModelName(dto.getModelName());
        entity.setSort(dto.getSort());
        entity.setPrice(dto.getPrice());
        entity.setBrand(dto.getBrand());
        entity.setGear(dto.getGear());
        entity.setRent(dto.getRent());
        repo.save(entity);
        Iterable<Cycle> entities =  repo.findAll();
        List<CycleDTO> list = new ArrayList<>();

        for (Cycle s: entities){
            CycleDTO cust  = modelMapper.map(s, CycleDTO.class);
            list.add(cust);
        }
        System.out.println("regist test");
       // map.put("result", "SUCCESS");
        return list;
    }

    @GetMapping("")
    public List<CycleDTO>  CycleList(){
        System.out.println("======findAll()====");
        Iterable<Cycle> entities = repo.findAll();
        List<CycleDTO> list = new ArrayList<>();
        for (Cycle s: entities){
            CycleDTO cust  = modelMapper.map(s, CycleDTO.class);
            list.add(cust);
        }
        return list;
    }

    @PutMapping("/{id}")
    public HashMap<String,String> CycleModify(@PathVariable String id, @RequestBody CycleDTO dto) {
        System.out.println("id : " + id);
        System.out.println("dto : " + dto);
        
        Cycle entity = repo.findById(Long.parseLong(id)).get();
        entity.setPrice(dto.getPrice());
        entity.setGear(dto.getGear());
        entity.setRent(dto.getRent());
        
        repo.save(entity);

        HashMap map = new HashMap<>();
        map.put("result", "SUCCESS");
        return map;
    }

    @DeleteMapping("/{id}")
    public void CycleDelete(@PathVariable String id) {
           System.out.println(id);
           repo.deleteById(Long.parseLong(id));
    
        }
    
    
}