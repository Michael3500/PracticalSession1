package com.example.practicals;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MenuListActivity extends ListActivity {

    //setting up the menu variables in array
    String[] menu = {"Portal", "Settings", "Help", "About"};
    ListView l;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_list);
        l = getListView();
        //sending the array to the ListView so they can be shown in a list order
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, menu);
        l.setAdapter(adapter);
    }

        //actions to be done if one of the menu list items is clicked on
        @Override
        protected void onListItemClick(ListView l, View v, int position, long id)
        {
            TextView temp = (TextView) v;
            Toast.makeText(this, ""+temp.getText()+" "+position,Toast.LENGTH_SHORT).show();
            switch(position)
            {
                //redirection to Add a new Post if "Portal" is selected
                case 0: Intent postintent = new Intent(getApplicationContext(), PostActivity.class);
                    startActivity(postintent);
            }

        }

}
