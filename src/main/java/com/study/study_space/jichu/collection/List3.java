//package com.study.study_space.jichu.collection;
//
//import utils.Domain;
//import utils.Generator;
//
//import java.lang.reflect.InvocationTargetException;
//import java.util.*;
//
//public class List3 implements Generator{
//
//    public static void main(String[] args){
//        List<Domain> list=new ArrayList<>();
//
//
//        Set<Domain> fill = fill(new HashSet<Domain>(), Domain.class);
//System.out.println("aaa".hashCode());
////        System.out.println(fill);
//    }
//
//    @Override
//    public Domain next() {
//
//     return null;
//    };
//
//    public static  <T> Set<T> fill(Set<T> set,Class<T> type){
//
//            try {
//                for (int i=0;i<10;i++) {
//                    set.add(type.getConstructor(int.class).newInstance(i));
//                }
//            } catch (InstantiationException e) {
//                e.printStackTrace();
//            } catch (IllegalAccessException e) {
//                e.printStackTrace();
//            } catch (InvocationTargetException e) {
//                e.printStackTrace();
//            } catch (NoSuchMethodException e) {
//                e.printStackTrace();
//            }
//
//            return set;
//    }
//
//}
