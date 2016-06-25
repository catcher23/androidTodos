package xyz.dannylau.androidtodos;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;

public class EditTodos extends AppCompatActivity{
    EditText editItem;
    String pos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_todos);

        editItem = (EditText) findViewById(R.id.editItem);
    }
}
