package com.example.template;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.jgrapht.Graph;
import org.jgrapht.graph.DefaultDirectedGraph;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.DefaultWeightedEdge;
import org.jgrapht.graph.SimpleDirectedWeightedGraph;
import org.jgrapht.graph.*;
import org.jgrapht.graph.SimpleWeightedGraph;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private MyViewModel viewModel;
    ArrayList<ArrayList<Integer>> arrayList = new ArrayList<ArrayList<Integer>>();
    EditText editText1;
    EditText editText2;
    TextView resultTextView,rawtext;
    Button btn;
    String tag;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewModel = new ViewModelProvider(this).get(MyViewModel.class);
        viewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(String newText) {
                rawtext.setText(newText);
            }
        });
        btn = findViewById(R.id.btn);
        editText1 = findViewById(R.id.editTextText);
        editText2 = findViewById(R.id.editTextText2);
        rawtext = findViewById(R.id.textView3);
        resultTextView = findViewById(R.id.textView);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double value1 = Double.parseDouble(editText1.getText().toString());
                double value2 = Double.parseDouble(editText2.getText().toString());
                double result = value1 + value2;
                Log.d(tag,"");
                resultTextView.setText(Double.toString(result));
            }
        });
        RawData rawData = new RawData();
        rawData.fillArrayList(arrayList);
        rawtext.setText(Integer.toString(arrayList.size()));
    }
    @Override
    protected void onResume() {
        super.onResume();
        // Update the text when the activity is resumed
        // (this could also be done in a listener or other event)
        //viewModel.setText("Hello, World!");
    }
    public void processingData(){
    }
}