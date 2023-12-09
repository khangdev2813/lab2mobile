package com.example.grid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.GridView;
import android.widget.Spinner;

import com.google.android.material.textfield.TextInputEditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<SpinnerItem> listSpinner;
    GridView gv;
    ArrayList<Integer> listImg = new ArrayList<>();
    ArrayList<String> listName =new ArrayList<>();
    ArrayList<GridItem> listGrid = new ArrayList<>();
    private com.example.grid.SpinnerAdapter mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner spinner = findViewById(R.id.spinner);
        Button btn = findViewById(R.id.buttonAdd);
        CheckBox cb = findViewById(R.id.checkBox);
        initList();
        mAdapter = new SpinnerAdapter(this,listSpinner);
        spinner.setAdapter(mAdapter);

        gv = findViewById(R.id.gridView);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextInputEditText name =  findViewById(R.id.inname);
                SpinnerItem si = (SpinnerItem) spinner.getSelectedItem();
                listGrid.add(new GridItem(name.getText().toString(),si.getImage(),cb.isChecked()));
                listImg.add(si.getImage());
                listName.add(name.getText().toString());
                GridViewAdapter gva = new GridViewAdapter(MainActivity.this,listGrid);
                gv.setAdapter(gva);
            }
        });










    }

    private void initList() {
        listSpinner = new ArrayList<>();
        listSpinner.add(new SpinnerItem("thumbnail 1",R.drawable.images));
        listSpinner.add(new SpinnerItem("thumbnail 2",R.drawable.img2));
        listSpinner.add(new SpinnerItem("thumbnail 3",R.drawable.img3));
        listSpinner.add(new SpinnerItem("thumbnail 4",R.drawable.img4));
    }


}