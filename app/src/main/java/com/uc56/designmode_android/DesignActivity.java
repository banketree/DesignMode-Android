package com.uc56.designmode_android;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;


//原地址：http://blog.csdn.net/banketree/article/details/24985607
public class DesignActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView briefTextView, demoTextView, descriptionTextView;
    private LinearLayout imgsLinearLayout;

    private DesignModel designModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        try {
            designModel = (DesignModel) getIntent().getSerializableExtra("designModel");
        } catch (Exception e) {
            designModel = null;
        }

        if (designModel == null) {
            finish();
            return;
        }

        setContentView(R.layout.activity_design);
        setTitle(designModel.getName());
        findViewById(R.id.btn_run).setOnClickListener(this);

        briefTextView = (TextView) findViewById(R.id.tv_brief);
        demoTextView = (TextView) findViewById(R.id.tv_demo);
        descriptionTextView = (TextView) findViewById(R.id.tv_description);
        imgsLinearLayout = (LinearLayout) findViewById(R.id.linear_imgs);

        initData();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_run:
                Toast.makeText(this, "开发中", Toast.LENGTH_SHORT).show();
                break;
        }
    }

    private void initData() {
        briefTextView.setText("   "+designModel.getBrief());
        demoTextView.setText("   "+designModel.getDemo());
        descriptionTextView.setText("   "+designModel.getDescription());
        //
        //        imgsLinearLayout
    }

}
