package com.example.shopping.base;

import java.lang.ref.WeakReference;

public class BasePresenter<V> {
    //弱引用
    private WeakReference<V> weakReference;
    private V mView;
    public void attach(V view){
        weakReference=new WeakReference<>(view);
        mView=weakReference.get();
    }
    public void detachView(){
        if (weakReference!=null){
            weakReference.clear();
        }
    }
}
