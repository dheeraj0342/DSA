package com.dheeraj.DSA.Hashing;

import java.util.LinkedList;

public class HashMapImplementation{
    private static class MyhashMap<K , V>{
        public static final int DEFAULT_CAPACITY = 4;
        public static final float LOAD_FACTOR = 0.75f;
        private int n;
        private LinkedList<Node>[] buckets;

        private void initBucket(int N){
            buckets = new LinkedList[N];
            for (int i = 0; i < buckets.length; i++) {
                buckets[i] = new LinkedList<>();
            }
        }
        private int HashFunc(K key){
            int hc = key.hashCode();
            return Math.abs(hc) % buckets.length;
        }

        MyhashMap(){
            initBucket(DEFAULT_CAPACITY);
        }


        private class Node{
            K key;
            V val;
            Node(K key , V val){
                this.key = key;
                this.val = val;
            }
        }
        public int size(){
            return n;
        }
        private int searchInBucket(LinkedList<Node> ll , K key){
            for (int i = 0; i < ll.size(); i++) {
                if(ll.get(i).key == key)
                    return i;
            }
            return -1;
        }
        public void put(K key , V val){
            int bindex = HashFunc(key);
            LinkedList<Node> currentBucket = buckets[bindex];
            int entryIndex = searchInBucket(currentBucket,key);
            if(entryIndex == -1){
                Node node = new Node(key , val);
                currentBucket.add(node);
                n++;
            }
            else{
                Node node = currentBucket.get(entryIndex);
                node.val = val;

            }
            if(n >= LOAD_FACTOR * buckets.length){
                reHash();
            }

        }
        private void reHash(){
            LinkedList<Node>[] oldBuckets = buckets;
            initBucket(oldBuckets.length* 2);
            n=0;
            for(var bucket : oldBuckets){
                for(var node : bucket){
                    put(node.key, node.val);
                }
            }
        }
        public V get(K key){
            int bi = HashFunc(key);
            int ei = searchInBucket(buckets[bi] , key);
            if(ei ==-1)
                return null;
            return buckets[bi].get(ei).val;
        }
        public V remove(K key){
            int bi = HashFunc(key);
            LinkedList<Node> currBucket = buckets[bi];
            int ei = searchInBucket(currBucket,key);
            if(ei !=-1){
                Node currnode = currBucket.get(ei);
                V val = currnode.val;
                currBucket.remove(ei);
                n--;
                return val;
            }
            return null;

        }


    }

    public static void main(String[] args) {
        MyhashMap<String , Integer> hm = new MyhashMap<>();
        hm.put("a",1);
        hm.put("b",2);
        hm.put("c",2);
        hm.put("d",2);
        hm.put("e",2);
        hm.put("f",2);
        hm.put("g",2);
        hm.remove("a");

        System.out.println(hm.size());
        System.out.println(hm.get("a"));

    }

}
