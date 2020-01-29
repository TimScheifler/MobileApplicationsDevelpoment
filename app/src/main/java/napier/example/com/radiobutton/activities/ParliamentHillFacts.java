package napier.example.com.radiobutton.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import napier.example.com.radiobutton.R;

public class ParliamentHillFacts extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.parliament_hills);
        ListView listViewDetails = (ListView)findViewById(R.id.listView3);

        Toast.makeText(getBaseContext(),"In ParliamentHillFacts",Toast.LENGTH_LONG).show();

        final String[] attractionDetailsArray = new String[]{"Even more fun facts! 1","2","3","4"};

        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                attractionDetailsArray);

        listViewDetails.setAdapter(adapter);

        String stringToReturn = "Message back from ParliamentHillFacts";
        Intent returnIntent = new Intent();
        returnIntent.putExtra("String",stringToReturn);
        setResult(1,returnIntent);
    }
}
