package com.kittichanr.inventoryservice;

import com.kittichanr.inventoryservice.model.Inventory;
import com.kittichanr.inventoryservice.repository.InventoryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventoryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryServiceApplication.class, args);
    }

    @Bean
    public CommandLineRunner loadData(InventoryRepository inventoryRepository) {
        return args -> {
            Inventory inventory = new Inventory();
            inventory.setSkuCode("Iphone15");
            inventory.setQuantity(3);

            Inventory inventory1 = new Inventory();
            inventory1.setSkuCode("Iphone15_Pro_max");
            inventory1.setQuantity(5);

            inventoryRepository.save(inventory);
            inventoryRepository.save(inventory1);
        };
    }
}
