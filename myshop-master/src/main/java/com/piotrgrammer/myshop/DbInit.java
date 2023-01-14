package com.piotrgrammer.myshop;

import com.piotrgrammer.myshop.model.Item;
import com.piotrgrammer.myshop.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.math.BigDecimal;
import java.util.List;

@Configuration
public class DbInit implements CommandLineRunner {

    private final ItemRepository itemRepository;

    @Autowired
    public DbInit(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        itemRepository.saveAll(List.of(
                new Item("Długopis", new BigDecimal("2.10"), "https://img.freepik.com/free-vector/vector-fountain-writing-pen-contract-signing_1284-41915.jpg"),
                new Item("Ołówek", new BigDecimal("1.50"), "https://iheartcraftythings.com/wp-content/uploads/2021/05/Pencil-DRAWING-%E2%80%93-STEP-10.jpg"),
                new Item("Pióro", new BigDecimal("8.60"), "https://m.media-amazon.com/images/I/515dpPXii2L._AC_SX679_.jpg")
        ));
    }
}
