package com.example.rspisaniempt;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.rspisaniempt.Adapter.AdapterMyLayout2;
import com.example.rspisaniempt.Model.MyLayout2Model;
import com.example.rspisaniempt.Model.PersonModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private AdapterMyLayout2 adapterPerson;
    private List<MyLayout2Model> list;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView=findViewById(R.id.recyclerviewid);
        recyclerView.setHasFixedSize(true);

        list=new ArrayList<>();

        list.add(new MyLayout2Model("Понедельник","Нахимовский","","","Системное программирование","Технология разработки и защиты базы данных","Разработка программных модулей","","Разработка мобильных приложений","Разработка программных модулей","Физическая культуры",""));
        list.add(new MyLayout2Model("Вторник","","ПРАКТИКА","","ПРАКТИКА","","ПРАКТИКА","","ПРАКТИКА","","ПРАКТИКА",""));
        list.add(new MyLayout2Model("Среда","","ПРАКТИКА","","ПРАКТИКА","","ПРАКТИКА","","ПРАКТИКА","","ПРАКТИКА",""));
        list.add(new MyLayout2Model("Четверг","Неженская","Инструментальные средства разработки ПО","","Технология разработки ПО","","Иностранный язык","","Технология разработки и защиты БД","","",""));
        list.add(new MyLayout2Model("Пятница","Нахимовский","","","Системное программирование","","Разработка программных модулей","","Технология разработки ПО","Инструментальные средства разработки ПО","Разработка мобильных приложений",""));

        LinearLayoutManager layoutManager = new LinearLayoutManager(MainActivity.this,LinearLayoutManager.HORIZONTAL,false);
        recyclerView.setLayoutManager(layoutManager);

        adapterPerson=new AdapterMyLayout2(MainActivity.this,this.list);
        recyclerView.setAdapter(adapterPerson);
    }


}