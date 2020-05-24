## 数组Array
+ 内存中连续的地址
+ 查找O(1)
+ 新增删除O(n)
+ Java源码：http://developer.classpath.org/doc/java/util/ArrayList-source.html

## 链表Linked List
+ 由Value和Next指针组成
+ 查找O(n)
+ 新增删除O(1)
+ 双向链表，添加Pre指针
+ 循环链表，结尾Tail的Next指向Head
```
// 链表最简结构
class LinkedList {
    Node head;
    
    class Node {
        int data;
        Node next;
        
        Node(int d) {data = d}
    }
}
```
+ java源码：LinkedList是一个双向链表，http://developer.classpath.org/doc/java/util/LinkedList-source.html

## 跳表Skip List
+ 1989年出现
+ 只能应用于链表有序的情况
+ 对标的是平衡树(AVL Tree)和二分查找
+ 查找/新增/删除：O(log n)
+ Redis使用跳表来设计：https://redisbook.readthedocs.io/en/latest/internal-datastruct/skiplist.html

## 栈Stack
+ todo

## 队列Queue
+ todo

## 双端队列Deque
+ todo

## 优先队列Priority Queue
+ todo



