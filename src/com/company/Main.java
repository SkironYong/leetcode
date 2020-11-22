package com.company;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.*;
import java.util.concurrent.*;


public class Main {

//    private static final int CORE_POOL_SIZE = 5;
//    private static final int MAX_POOL_SIZE = 10;
//    private static final int QUEUE_CAPACITY = 100;
//    private static final Long KEEP_ALIVE_TIME = 1L;
//
//    public static void main(String[] args) {
//        // write your code here
////    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
////    Date date = simpleDateFormat.parse("2020-8-11");
////        System.out.println(date);
//
//        ThreadPoolExecutor executor = new ThreadPoolExecutor(
//                CORE_POOL_SIZE,
//                MAX_POOL_SIZE,
//                KEEP_ALIVE_TIME,
//                TimeUnit.SECONDS,
//                new ArrayBlockingQueue<>(QUEUE_CAPACITY),
//                new ThreadPoolExecutor.CallerRunsPolicy());
//
//        for (int i = 0; i < 10; i++) {
//            executor.execute(() -> {
//                try {
//                    Thread.sleep(2000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                System.out.println("CurrentThread name:" + Thread.currentThread().getName() + "date：" + Instant.now());
//            });
//        }
//        //终止线程池
//        executor.shutdown();
//        try {
//            executor.awaitTermination(5, TimeUnit.SECONDS);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println("Finished all threads");
//
//        /**
//         * newFixedThreadPool
//         */
//        ThreadPoolExecutor newFixedThreadPool = new newFixedThreadPool();
//
//    }
    public int eraseOverlapIntervals(int[][] intervals) {
        int cnt = 1;
        if(intervals[0].length == 0) {
            return 0;
        }
        int []dp = new int[intervals[0].length];
        //根据区间结尾升序
        Arrays.sort(intervals,Comparator.comparing((o)->o[1]));
        int end = intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {
            //重叠
            if(intervals[i][0] < end) {
                continue;
            }
            end = intervals[i][1];
            cnt++;
        }
        return intervals.length - cnt;
    }

//    public void quickSort(int[] nums,int left,int right)
//    {
//        int pivot = 0;
//        if(left<right)
//        {
//            pivot = partition(nums,left,right);
//            quickSort(nums,left,pivot-1);
//            quickSort(nums,pivot+1,right);
//        }
//
//    }
//    public int partition(int[] nums,int left,int right)
//    {
//        int key = nums[left];
//        while(left < right)
//        {
//            while(left < right && nums[right] >= key)
//            {
//                right --;
//            }
//            nums[left]=nums[right];
//            while (left < right && nums[left] <= key)
//            {
//                left++;
//            }
//            nums[right] = nums[left];
//        }
//        nums[left] = key;
//        return left;
//    }
    public static void main(String[] args) {
        Main main = new Main();
        int []nums1 = {1,2,3,0,0,0};
        int []nums2 = {2,5,6};
        main.merge(nums1,3,nums2,3);
        for (int i = 0; i < 3; i++) {
            System.out.println(nums1[i]);
        }
    }



}
