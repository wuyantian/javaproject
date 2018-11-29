package com.company;

public class MyArrayList<T> {

    private static final int SIZE_FACTOR=5;

    private Object data[];

    private int index;

    private int size;

    public MyArrayList(){
        this.data=new Object[SIZE_FACTOR];
        this.size=SIZE_FACTOR;
    }

    public void add(T obj){
        System.out.println("index:"+this.index+" "+"size:"+this.size+" "+"data_size:"+this.data.length);
        if(this.index==this.size-1){
            //我们需要加大data[]的大小
            increaseSizeAndReallocate();
        }
        data[this.index]=obj;
        this.index++;

    }

    private void increaseSizeAndReallocate() {
        this.size=this.size+SIZE_FACTOR;
        Object newData[]=new Object[this.size];
        for(int i=0; i<data.length;i++){
            newData[i]=data[i];
        }
        this.data=newData;
        System.out.println("***index:"+this.index+"size:"+this.size+"data size:"+this.data.length);
    }

    public T get(int i) throws Exception{
        if(i>this.index-1){
            throw new Exception("ArrayIndexOutOfBound");
        }
        if(i<0){
            throw new Exception("Negative Value");
        }
        return (T) this.data[i];

    }

    public void remove(int i) throws Exception{
        if(i>this.index-1){
            throw new Exception("ArrayIndexOutOfBound");
        }
        if(i<0){
            throw new Exception("Negative Value");
        }
        System.out.println("Object getting removed:"+this.data[i]);
        for(int x=i; x<this.data.length-1;x++){
            data[x]=data[x+1];
        }
        this.index--;
    }

}

