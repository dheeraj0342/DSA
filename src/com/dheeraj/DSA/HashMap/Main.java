package com.dheeraj.DSA.HashMap;


import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static class HashMap<K,V>{
        private class HMNode{
            K key;
            V value;

            HMNode(K key , V value){
                this.key = key;
                this.value=value;
            }
        }

        private int size; //n
        private LinkedList<HMNode>[] buckets; // N

        HashMap(){
            initbucket(4);
            size=0;
        }
        private void initbucket(int N){
            buckets = new LinkedList[N];
            for (int i = 0; i < buckets.length; i++) {
                buckets[i] = new LinkedList<>();
            }
        }
        private int hashfn(K key){
            int hc = key.hashCode();
            return Math.abs(hc) % buckets.length;
        }

        private int getIndexWithInBucket(K key , int bi){
            int di=0;
            for(HMNode node : buckets[bi]){
                if(node.key.equals(key)){
                    return di;
                }
                di++;
            }
            return -1;
        }
        private void reHash(){
            LinkedList<HMNode> []oba = buckets;
            initbucket(oba.length * 2);
            size =0;
            for (int i = 0; i < oba.length; i++) {
                for(HMNode node : oba[i]){
                    put(node.key,node.value);
                }
            }
        }

        public void put(K key , V value){
            int bi = hashfn(key);
            int di = getIndexWithInBucket(key,bi);
            if(di==-1){
                HMNode node = new HMNode(key,value);
                buckets[bi].add(node);
                size++;
            }else{
                HMNode node = buckets[bi].get(di);
                node.value = value;
            }
            double lambda = size * 1.0 / buckets.length;
            if(lambda > 2.0){
                reHash();
            }
        }

        public V get(K key){
            int bi = hashfn(key);
            int di = getIndexWithInBucket(key,bi);
            if(di==-1) {
                return null;
            }else{
                return buckets[bi].get(di).value;
            }
        }

        public boolean containsKey(K key){
            int bi = hashfn(key);
            int di = getIndexWithInBucket(key,bi);
            if(di==-1){
                return false;
            }else{
                return true;
            }
        }
        public V remove(K key){
            int bi = hashfn(key);
            int di = getIndexWithInBucket(key,bi);
            if(di==-1){
                return null;
            }else{
                HMNode node = buckets[bi].remove(di);
                size--;
                return node.value;
            }
        }

        public ArrayList<K> keySet(){
            ArrayList<K> keys = new ArrayList<>();
            for (int i = 0; i < buckets.length; i++) {
                for(HMNode node : buckets[i]){
                    keys.add(node.key);
                }
            }
            return keys;
        }

        public int size(){
            return size;
        }


    }
}
