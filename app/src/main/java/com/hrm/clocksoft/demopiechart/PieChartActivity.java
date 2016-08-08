package com.hrm.clocksoft.demopiechart;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.utils.ColorTemplate;
import java.util.ArrayList;

public class PieChartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pie_chart);
        PieChart chart = (PieChart) findViewById(R.id.chart);
        PieData data = new PieData(getXAxisValues(),getDataSet());
        chart.setData(data);
        chart.setDescription("My Chart");
        /*chart.animateXY(2000, 2000);
        */
        chart.invalidate();
    }
    private PieDataSet getDataSet() {
        ArrayList<PieDataSet> dataSets = null;

        ArrayList<Entry> valueSet1 = new ArrayList<>();
        Entry v1e1 = new Entry(110.000f, 0); // Jan
        valueSet1.add(v1e1);
        Entry v1e2 = new Entry(40.000f, 1); // Feb
        valueSet1.add(v1e2);
        Entry v1e3 = new Entry(60.000f, 2); // Mar
        valueSet1.add(v1e3);
        Entry v1e4 = new Entry(30.000f, 3); // Apr
        valueSet1.add(v1e4);
        Entry v1e5 = new Entry(90.000f, 4); // May
        valueSet1.add(v1e5);
        Entry v1e6 = new Entry(100.000f, 5); // Jun
        valueSet1.add(v1e6);
        ArrayList<Entry> valueSet2 = new ArrayList<>();
        Entry v2e1 = new Entry(150.000f, 0); // Jan
        valueSet2.add(v2e1);
        Entry v2e2 = new Entry(90.000f, 1); // Feb
        valueSet2.add(v2e2);
        Entry v2e3 = new Entry(120.000f, 2); // Mar
        valueSet2.add(v2e3);
        Entry v2e4 = new Entry(60.000f, 3); // Apr
        valueSet2.add(v2e4);
        Entry v2e5 = new Entry(20.000f, 4); // May
        valueSet2.add(v2e5);
        Entry v2e6 = new Entry(80.000f, 5); // Jun
        valueSet2.add(v2e6);
        PieDataSet barDataSet1 = new PieDataSet(valueSet1, "Brand 1");
        barDataSet1.setColor(Color.rgb(0, 155, 0));
        PieDataSet barDataSet2 = new PieDataSet(valueSet2, "Brand 2");
        barDataSet2.setColors(ColorTemplate.COLORFUL_COLORS);
        dataSets = new ArrayList<>();
        dataSets.add(barDataSet1);
        dataSets.add(barDataSet2);
        return barDataSet2;
    }
    private ArrayList<String> getXAxisValues() {
        ArrayList<String> xAxis = new ArrayList<>();
        xAxis.add("JAN");
        xAxis.add("FEB");
        xAxis.add("MAR");
        xAxis.add("APR");
        xAxis.add("MAY");
        xAxis.add("JUN");
        return xAxis;
    }
}
