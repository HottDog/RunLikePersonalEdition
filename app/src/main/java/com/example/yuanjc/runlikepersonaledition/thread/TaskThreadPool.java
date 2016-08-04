package com.example.yuanjc.runlikepersonaledition.thread;

/**
 * Created by yuanjc on 2016/8/1.
 */
public class TaskThreadPool {
    //当前有多少个线程
    private int count;
    //核心线程数
    private int core_num;
    //缓冲线程数
    private int buff_num;
    //守护线程
    private Thread daemonThread;
    public TaskThreadPool(int core_num,int buff_num){
        this.core_num=core_num;
        this.buff_num=buff_num;
    }
}
