package com.git;

import java.util.List;

public class DataUtility {

    public static List<Data> getData(){
        return List.of(new DataUtility.Data(101,"Suresh"),new DataUtility.Data(102,"Rajesh"),new DataUtility.Data(103,"Naresh"));
    }

    static class Data {
        private int no;
        private String name;
        public Data(int no,String name){
            this.no=no;
            this.name=name;
        }

        @Override
        public String toString() {
            return "Data{" +
                    "no=" + no +
                    ", name='" + name + '\'' +
                    '}';
        }
    }

}
