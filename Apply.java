package com.company;

import jdk.nashorn.internal.runtime.regexp.joni.constants.OPCode;

/**
 * Created by Legat on 25.04.2016.
 */
public class Apply {



    public int Apply (int[] arr, Operation oper){
        int temp =0;
        for (int i=0; i<arr.length-1; i++){
            temp+=oper.Operation(arr[i],arr[i+1]);
        }
        return temp;
    }

    public void TestLambda (){
        int [] arr = new int[10];
        for (int i=0; i<10; i++){
            arr[i]=((int)(Math.random()*10));
            System.out.println(arr[i]);
        }
//

        int temp = Apply(arr, (a,b)->a+b);
        System.out.println("---------------");
        System.out.print(temp);
    }
}
