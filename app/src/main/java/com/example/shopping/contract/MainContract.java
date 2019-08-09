package com.example.shopping.contract;

public class MainContract {
    interface MainModel{
        void getData();
        interface CallBack<T>{
            void showSuccess(T data);
            void showError(String error);
        }
    }
    interface MainView<T>{
        void showSuccess(T data);
        void showError(String error);
    }
    interface MainPresenter{
        void http();
    }
}
