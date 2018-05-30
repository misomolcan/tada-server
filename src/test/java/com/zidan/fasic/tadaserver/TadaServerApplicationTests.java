package com.zidan.fasic.tadaserver;

import com.zidan.fasic.tadaserver.repo.DictionaryEntity;
import com.zidan.fasic.tadaserver.repo.DictionaryRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TadaServerApplicationTests {

    @Autowired
    DictionaryRepository repo;

    @Test
    public void contextLoads() {
        List<DictionaryEntity> all = repo.findAll();
        for (DictionaryEntity dictionaryEntity : all) {
            System.out.println(dictionaryEntity.getAbbreviation());
        }

    }

}
