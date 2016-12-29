package com.example.recyclerviewtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private List<Fruit> fruitList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initFruits();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        StaggeredGridLayoutManager layoutManager = new
                StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL);
        //LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        // 把linear变成横向
        recyclerView.setLayoutManager(layoutManager);
        FruitAdapter adapter = new FruitAdapter(fruitList);
        recyclerView.setAdapter(adapter);
    }

    private void initFruits() {
        for (int i = 0; i < 2; i++) {
            Fruit apple = new Fruit(getRandomLengthName("apple"), R.mipmap.ic_launcher);
            fruitList.add(apple);
            Fruit banana = new Fruit(getRandomLengthName("banana"), R.mipmap.ic_launcher);
            fruitList.add(banana);
            Fruit orange = new Fruit(getRandomLengthName("orange"), R.mipmap.ic_launcher);
            fruitList.add(orange);
            Fruit watermelon = new Fruit(getRandomLengthName("watermelon"), R.mipmap.ic_launcher);
            fruitList.add(watermelon);
            Fruit pear = new Fruit(getRandomLengthName("pear"), R.mipmap.ic_launcher);
            fruitList.add(pear);
            Fruit grape = new Fruit(getRandomLengthName("grape"), R.mipmap.ic_launcher);
            fruitList.add(grape);
            Fruit pineapple = new Fruit(getRandomLengthName("pineapple"), R.mipmap.ic_launcher);
            fruitList.add(pineapple);
            Fruit strawberry = new Fruit(getRandomLengthName("strawberry"), R.mipmap.ic_launcher);
            fruitList.add(strawberry);
            Fruit cherry = new Fruit(getRandomLengthName("cherry"), R.mipmap.ic_launcher);
            fruitList.add(cherry);
            Fruit Mango = new Fruit(getRandomLengthName("Mango"), R.mipmap.ic_launcher);
            fruitList.add(Mango);
        }
    }

    private String getRandomLengthName(String name) {
        Random random = new Random();
        int length = random.nextInt(20) + 1;
        StringBuilder builder = new StringBuilder();
        for (int i = 0 ; i < length; i++) {
            builder.append(name);
        }
        return builder.toString();
    }
}
