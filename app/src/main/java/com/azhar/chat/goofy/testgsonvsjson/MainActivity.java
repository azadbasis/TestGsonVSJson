package com.azhar.chat.goofy.testgsonvsjson;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       serializationData();
        deserializationData();
    }

    private void deserializationData() {
        String personString = "{'age':44,'email':'azad@gmail.com','isDeveloper':true,'name':'azharul Islam'}";
        Gson gson = new Gson();
       Person personDeserialization = gson.fromJson(personString,Person.class);
        Log.d("DESERIALIZE",personDeserialization.toString());
    }

    private void serializationData() {


        Person person = new Person("azharul Islam","azad@gmail.com",44,true);
        Gson gson  = new Gson();
        String json= gson.toJson(person);
        Log.d("SERIALIZATION DATA",json);
    }


}
