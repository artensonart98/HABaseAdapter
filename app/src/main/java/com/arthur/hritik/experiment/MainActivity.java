package com.arthur.hritik.experiment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.RelativeLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
RelativeLayout r;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<MyItem> list = new ArrayList<MyItem>() {{
            add(new MyItem("1", "One"));
            add(new MyItem("2", "Two"));
            add(new MyItem("3", "Three"));
            add(new MyItem("4", "Four"));
            add(new MyItem("5", "Five"));
            add(new MyItem("6", "Six"));
        }};

        MyAdapter a = new MyAdapter();
        a.setList(list);

        RecyclerView view = findViewById(R.id.rv);
        view.setAdapter(a);
        view.setLayoutManager(new LinearLayoutManager(this));


    }

    public class MyItem {
        private String title;
        private String description;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public MyItem(String title, String description) {
            this.title = title;
            this.description = description;
        }
    }
}
