package com.away.datastructure;

import java.util.HashMap;
import java.util.Map;

/**
 * @author away
 * @date 2021-12-15 14:31
 * 设计实现LRU缓存机制
 * 使用一个HashMap存储对应的节点,key为节点的key,value为节点
 * 使用一个双向链表存储历史访问记录,双向链表可保证o(1)的时间复杂度
 * put有三种情况,存在,不存在且缓存未满,不存在且缓存满了
 * get两种情况 存在 不存在
 *
 */
public class LRUCache {
    /**
     *双向链表
     */
    class DoubleLinkedList{
        int key;
        int value;
        DoubleLinkedList pre;
        public DoubleLinkedList() {
        }
        DoubleLinkedList next;
        DoubleLinkedList(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }
    private int capacity;
    private HashMap<Integer,DoubleLinkedList> cache;
    DoubleLinkedList head;
    DoubleLinkedList tail;
    public LRUCache(int capacity) {
        this.capacity = capacity;
        cache = new HashMap<>(capacity);
        head = new DoubleLinkedList();
        tail = new DoubleLinkedList();
        head.next = tail;
        tail.pre = head;
    }

    /**
     * 两种情况
     * 存在
     * 不存在
     * @param key
     * @return
     */
    public int get(int key) {
        DoubleLinkedList node = cache.get(key);
        if (node==null) {
            return -1;
        }else {

            deleteNode(node);
            addLast(node);
        }
        return node.value;
    }
    /**
     * 分为三种情况：
     * 缓存中存在
     * 缓存不存在：
     *      缓存未满
     *      缓存已满
     * @param key
     * @param value
     */
    public void put(int key, int value) {
        if (cache.containsKey(key)) {
            DoubleLinkedList old = cache.get(key);
            deleteNode(old);
            cache.remove(key);
            DoubleLinkedList newNode = new DoubleLinkedList(key, value);
            cache.put(key,newNode);
            addLast(newNode);
        }else {
            //缓存中不存在
            DoubleLinkedList node = new DoubleLinkedList(key, value);
            if (cache.size() == capacity) {
                cache.remove(head.next.key);
                deleteNode(head.next);
                addLast(node);
            }else {
                addLast(node);
            }
            cache.put(key,node);
        }
    }
    private void addLast(DoubleLinkedList node) {
        tail.pre.next = node;
        node.pre = tail.pre;
        tail.pre = node;
        node.next = tail;
    }
    private void deleteNode(DoubleLinkedList node) {
        node.pre.next = node.next;
        node.next.pre = node.pre;
    }
}
