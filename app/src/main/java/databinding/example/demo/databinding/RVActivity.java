package databinding.example.demo.databinding;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;

/*
created by suheb on 24/11/16
*/

public class RVActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<UserClass> al = new ArrayList<>();
    private AdapterRv adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rv);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        al.clear();
        al.add(new UserClass("aaa", "city",true));
        al.add(new UserClass("name", "city",false));
        al.add(new UserClass("name", "city",true));
        al.add(new UserClass("name", "city",false));
        al.add(new UserClass("name", "city",true));

        adapter = new AdapterRv(this, al);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        recyclerView.setAdapter(adapter);

    }

}
