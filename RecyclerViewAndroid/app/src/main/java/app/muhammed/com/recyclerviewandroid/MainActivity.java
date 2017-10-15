package app.muhammed.com.recyclerviewandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private RecyclerView mContactRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initUI();
    }

    private void initUI() {
        mContactRecyclerView = (RecyclerView) findViewById(R.id.contact_recycler_view);


        InfoAdapter infoAdapter = new InfoAdapter(this, getInfo());


        mContactRecyclerView.setLayoutManager(new GridLayoutManager(this, 3));


        mContactRecyclerView.setAdapter(infoAdapter);


    }


    public ArrayList<String> getInfo() {
        ArrayList<String> infos = new ArrayList<>();


        infos.add("ccxcxczcscxczxczxc");
        infos.add("12");
        infos.add("ccxcxczcscxczxczxc");
        infos.add("ccxcxczcscxczxczxc");
        infos.add("ccxcxczcscxczxczxc");
        infos.add("ccxcxczcscxczxczxc");
        infos.add("ccxcxczcscxczxczxc");
        infos.add("ccxcxczcscxczxczxc");
        infos.add("ccxcxczcscxczxczxc");
        infos.add("ccxcxczcscxczxczxc");
        infos.add("ccxcxczcscxczxczxc");
        infos.add("ccxcxczcscxczxczxc");
        infos.add("ccxcxczcscxczxczxc");
        infos.add("ccxcxczcscxczxczxc");
        infos.add("ccxcxczcscxczxczxc");
        infos.add("ccxcxczcscxczxczxc");
        infos.add("ccxcxczcscxczxczxc");
        infos.add("ccxcxczcscxczxczxc");
        infos.add("a");
        infos.add("a");
        infos.add("a");
        infos.add("a");
        infos.add("a");
        infos.add("a");
        infos.add("a");
        infos.add("a");
        infos.add("a");

        return infos;
    }
}
