package com.uc56.designmode_android;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.LinkedList;

//原地址：http://blog.csdn.net/banketree/article/details/24985607
public class MainActivity extends AppCompatActivity {
    private LinkedList<DesignModel> designModels = new LinkedList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
    }

    public void onClickView(View view) {
        Bundle bundle = new Bundle();
        switch (view.getId()) {
            case R.id.tv_SingleMode://单例
                bundle.putSerializable("designModel", designModels.get(0));
                break;
            case R.id.tv_FactoryMethodModel://工厂方法
                bundle.putSerializable("designModel", designModels.get(1));
                break;
            case R.id.tv_AbstractFactoryModel: //抽象工厂
                bundle.putSerializable("designModel", designModels.get(2));
                break;
            case R.id.tv_TemplateMethodModel://模版方法
                bundle.putSerializable("designModel", designModels.get(3));
                break;
            case R.id.tv_BuilderMode://建造者
                bundle.putSerializable("designModel", designModels.get(4));
                break;
            case R.id.tv_ProxyMode://代理
                bundle.putSerializable("designModel", designModels.get(5));
                break;
            case R.id.tv_CloneMode://原型
                bundle.putSerializable("designModel", designModels.get(6));
                break;
            case R.id.tv_IntermediaryModel://中介者
                bundle.putSerializable("designModel", designModels.get(7));
                break;
            case R.id.tv_CommandMode://命令
                bundle.putSerializable("designModel", designModels.get(8));
                break;
            case R.id.tv_ChainOfResponsibilityModel://责任链
                bundle.putSerializable("designModel", designModels.get(9));
                break;
            case R.id.tv_DecorativeMode://装饰
                bundle.putSerializable("designModel", designModels.get(10));
                break;
            case R.id.tv_StrategyMode://策略
                bundle.putSerializable("designModel", designModels.get(11));
                break;
            case R.id.tv_AdapterMode://适配器
                bundle.putSerializable("designModel", designModels.get(12));
                break;
            case R.id.tv_IteratorModel://迭代器
                bundle.putSerializable("designModel", designModels.get(13));
                break;
            case R.id.tv_CombinationMode://组合
                bundle.putSerializable("designModel", designModels.get(14));
                break;
            case R.id.tv_ObserverMode://观察者
                bundle.putSerializable("designModel", designModels.get(15));
                break;
            case R.id.tv_WindowMode://门面
                bundle.putSerializable("designModel", designModels.get(16));
                break;
            case R.id.tv_MemoMode://备忘录
                bundle.putSerializable("designModel", designModels.get(17));
                break;
            case R.id.tv_VisitorMode://访问者
                bundle.putSerializable("designModel", designModels.get(18));
                break;
            case R.id.tv_StateModel://状态
                bundle.putSerializable("designModel", designModels.get(19));
                break;
            case R.id.tv_ParserMode://解释器
                bundle.putSerializable("designModel", designModels.get(20));
                break;
            case R.id.tv_FlyweightMode://享元
                bundle.putSerializable("designModel", designModels.get(21));
                break;
            case R.id.tv_BridgeMode://桥梁
                bundle.putSerializable("designModel", designModels.get(22));
                break;
            case R.id.tv_MVC:
                bundle.putSerializable("designModel", designModels.get(23));
                break;
            case R.id.tv_MVP:
                bundle.putSerializable("designModel", designModels.get(24));
                break;
            case R.id.tv_MVVP:
                bundle.putSerializable("designModel", designModels.get(25));
                break;
            default:
                break;
        }

        Intent intent = new Intent(this, DesignActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }

    private void initData() {

        DesignModel designModel = new DesignModel(getString(R.string.SingleMode), getString(R.string.SingleMode_demo), getString(R.string.SingleMode_brief), getString(R.string.SingleMode_description));
        designModels.add(designModel);//单例
        designModel = new DesignModel(getString(R.string.FactoryMethodModel), getString(R.string.FactoryMethodModel_demo), getString(R.string.FactoryMethodModel_brief), getString(R.string.FactoryMethodModel_description));
        designModels.add(designModel);//工厂方法
        designModel = new DesignModel(getString(R.string.AbstractFactoryModel), getString(R.string.AbstractFactoryModel_demo), getString(R.string.AbstractFactoryModel_brief), getString(R.string.AbstractFactoryModel_description));
        designModels.add(designModel);//抽象工厂
        designModel = new DesignModel(getString(R.string.TemplateMethodModel), getString(R.string.TemplateMethodModel_demo), getString(R.string.TemplateMethodModel_brief), getString(R.string.TemplateMethodModel_description));
        designModels.add(designModel);//模版方法
        designModel = new DesignModel(getString(R.string.BuilderMode), getString(R.string.BuilderMode_demo), getString(R.string.BuilderMode_brief), getString(R.string.BuilderMode_description));
        designModels.add(designModel);//建造者
        designModel = new DesignModel(getString(R.string.ProxyMode), getString(R.string.ProxyMode_demo), getString(R.string.ProxyMode_brief), getString(R.string.ProxyMode_description));
        designModels.add(designModel);//代理
        designModel = new DesignModel(getString(R.string.CloneMode), getString(R.string.CloneMode_demo), getString(R.string.CloneMode_brief), getString(R.string.CloneMode_description));
        designModels.add(designModel);//原型
        designModel = new DesignModel(getString(R.string.IntermediaryModel), getString(R.string.IntermediaryModel_demo), getString(R.string.IntermediaryModel_brief), getString(R.string.IntermediaryModel_description));
        designModels.add(designModel);//中介者
        designModel = new DesignModel(getString(R.string.CommandMode), getString(R.string.CommandMode_demo), getString(R.string.CommandMode_brief), getString(R.string.CommandMode_description));
        designModels.add(designModel);//命令
        designModel = new DesignModel(getString(R.string.ChainOfResponsibilityModel), getString(R.string.ChainOfResponsibilityModel_demo), getString(R.string.ChainOfResponsibilityModel_brief), getString(R.string.ChainOfResponsibilityModel_description));
        designModels.add(designModel);//责任链
        designModel = new DesignModel(getString(R.string.DecorativeMode), getString(R.string.DecorativeMode_demo), getString(R.string.DecorativeMode_brief), getString(R.string.DecorativeMode_description));
        designModels.add(designModel);//装饰
        designModel = new DesignModel(getString(R.string.StrategyMode), getString(R.string.StrategyMode_demo), getString(R.string.StrategyMode_brief), getString(R.string.StrategyMode_description));
        designModels.add(designModel);//策略
        designModel = new DesignModel(getString(R.string.AdapterMode), getString(R.string.AdapterMode_demo), getString(R.string.AdapterMode_brief), getString(R.string.AdapterMode_description));
        designModels.add(designModel);//适配器
        designModel = new DesignModel(getString(R.string.IteratorModel), getString(R.string.IteratorModel_demo), getString(R.string.IteratorModel_brief), getString(R.string.IteratorModel_description));
        designModels.add(designModel);//迭代器
        designModel = new DesignModel(getString(R.string.CombinationMode), getString(R.string.CombinationMode_demo), getString(R.string.CombinationMode_brief), getString(R.string.CombinationMode_description));
        designModels.add(designModel);//组合
        designModel = new DesignModel(getString(R.string.ObserverMode), getString(R.string.ObserverMode_demo), getString(R.string.ObserverMode_brief), getString(R.string.ObserverMode_description));
        designModels.add(designModel);//观察者
        designModel = new DesignModel(getString(R.string.WindowMode), getString(R.string.WindowMode_demo), getString(R.string.WindowMode_brief), getString(R.string.WindowMode_description));
        designModels.add(designModel);//门面
        designModel = new DesignModel(getString(R.string.MemoMode), getString(R.string.MemoMode_demo), getString(R.string.MemoMode_brief), getString(R.string.MemoMode_description));
        designModels.add(designModel);//备忘录
        designModel = new DesignModel(getString(R.string.VisitorMode), getString(R.string.VisitorMode_demo), getString(R.string.VisitorMode_brief), getString(R.string.VisitorMode_description));
        designModels.add(designModel);//访问者
        designModel = new DesignModel(getString(R.string.StateModel), getString(R.string.StateModel_demo), getString(R.string.StateModel_brief), getString(R.string.StateModel_description));
        designModels.add(designModel);//状态
        designModel = new DesignModel(getString(R.string.ParserMode), getString(R.string.ParserMode_demo), getString(R.string.ParserMode_brief), getString(R.string.ParserMode_description));
        designModels.add(designModel);//解释器
        designModel = new DesignModel(getString(R.string.FlyweightMode), getString(R.string.FlyweightMode_demo), getString(R.string.FlyweightMode_brief), getString(R.string.FlyweightMode_description));
        designModels.add(designModel);//享元
        designModel = new DesignModel(getString(R.string.BridgeMode), getString(R.string.BridgeMode_demo), getString(R.string.BridgeMode_brief), getString(R.string.BridgeMode_description));
        designModels.add(designModel);//桥梁
        designModel = new DesignModel(getString(R.string.MVC), getString(R.string.MVC_demo), getString(R.string.MVC_brief), getString(R.string.MVC_description));
        designModels.add(designModel);//MVC
        designModel = new DesignModel(getString(R.string.MVP), getString(R.string.MVP_demo), getString(R.string.MVP_brief), getString(R.string.MVP_description));
        designModels.add(designModel);//MVP
        designModel = new DesignModel(getString(R.string.MVVP), getString(R.string.MVVP_demo), getString(R.string.MVVP_brief), getString(R.string.MVVP_description));
        designModels.add(designModel);//MVVP
    }
}
