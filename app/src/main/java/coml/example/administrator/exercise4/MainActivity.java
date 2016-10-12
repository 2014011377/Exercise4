package coml.example.administrator.exercise4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] name = {"屈亮亮","陈越级","马丁"};
        String[] classes = {"软工1401","软工1401","网工1401"};
        String[] number = {"2014011377","2014011367","2014011375"};

        List<Map<String,Object>> items = new ArrayList<Map<String,Object>>();

        for(int i=0; i<name.length; i++) {
            Map<String,Object> item = new HashMap<String, Object>();
            item.put("NAME",name[i]);
            item.put("CLASSES",classes[i]);
            item.put("NUMBER",number[i]);
            items.add(item);
        }

        SimpleAdapter adapter = new SimpleAdapter(this,items, R.layout.item,
                new String[]{"NAME","CLASSES","NUMBER"},
                new int[]{R.id.txtname,R.id.txtclasses,R.id.txtnumber});
        ListView list = (ListView) findViewById(R.id.list);
        list.setAdapter(adapter);
    }
}
