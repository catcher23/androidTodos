package xyz.dannylau.androidtodos;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class EditTodos extends AppCompatActivity{

    EditText editItem;
    String pos, item;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_todos);

        editItem = (EditText) findViewById(R.id.editItem);
        item = getIntent().getStringExtra("item");
        editItem.setText(item);
        pos = getIntent().getStringExtra("pos");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_edit_todos, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void onEditItem (View view) {
        Intent item = new Intent();
        item.putExtra("item", editItem.getText().toString());
        item.putExtra("pos", pos);
        setResult(RESULT_OK, item);
        finish();
    }
}
