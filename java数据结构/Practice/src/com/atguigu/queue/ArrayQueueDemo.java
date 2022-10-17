package com.atguigu.queue;

import com.sun.scenario.effect.impl.sw.java.JSWBlend_SRC_OUTPeer;

public class ArrayQueueDemo {
    public static void main(String[] args) {

    }
}
//使用数组模拟队列
class  ArrayQueue{
    private int maxSize;//数组最大容量
    private int rear;//队列尾
    private int front;//队列头
    private int[] arr;//模拟队列

    //创建队列构造器
    public ArrayQueue(int arrMaxSize){
        maxSize=arrMaxSize;
        arr =new int[maxSize];
        front=rear=-1;
    }
    //判断队列是否满
    public boolean isFull(){
        return rear==maxSize-1;
    }
    //判断队列是否空
    public boolean isEmpty(){
        return front==rear;
    }
    //添加数据到队列
    public void addQueue(int n){
        if (isFull()) {
            System.out.println("队列满不能加入数据!");
            return;
        }
        rear++;
        arr[rear]=n;
    }

    //出队列
    public int getQueue(){
        if(isEmpty()){
            //抛出异常
            throw new RuntimeException("队列空，不能取数据!");
        }
        front++;
        return arr[front];
    }
    //显示队列所有数据
    public void showQueue(){
        if(isEmpty()){
            System.out.println("队列为空，不能打印数据");
        }
        for(int i=0;i<arr.length;i++){
            System.out.printf("arr[%d]=%d\n",i,arr[i]);
        }
    }
    //显示队列头数据
    public int headQueue(){
        if(isEmpty()){
            throw new RuntimeException("队列空，不能取数据!");
        }
        return arr[front++];
    }

}
