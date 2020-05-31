## 哈希表Hash Table
+ 又叫散列表
+ 哈希函数
+ 哈希碰撞
+ 查询O(1)
+ Map:key-value对，key不重复
+ Set：不重复元素集合

#### Java HashMap总结
+ 查看源码
http://docs.oracle.com/en/java/javase/12/docs/api/java.base/java/util/Set.html
https://docs.oracle.com/en/java/javase/12/docs/api/java.base/java/util/Map.html


## 树和二叉树
+ 链表是特化的树，树是特化的图
+ 树的遍历：使用递归
    + 前序preorder：根-左-右
    + 中序inorder：左-根-右
    + 后序postorder：左-右-根

## 二叉搜索树Binary Search Tree
+ 左节点均小于根节点，右节点均大于根节点
+ 中序遍历是升序遍历
+ 查找O(logN)
+ 创建O(logN)
+ 删除O(logN)
    + 叶子节点，直接删除
    + 中间节点，取其右子树最小值来替换
    
## 堆Heap
+ 迅速找到一堆数中的最大或最小值
    + 根节点最大：大顶堆
    + 根节点最小：小顶堆
+ 查最大：O(1)
+ 删除最大：O(logN)
+ 插入：O(logN)或O(1)

## 二叉堆Binary Heap
+ 通过完全二叉树来实现
+ 满足以下性质：
    + 是一颗完全树
    + 树中任意节点的值总是>=其子节点的值
+ 通过"数组"来实现
+ 插入O(logN)
+ 删除O(logN)
    

## 图Graph
+ 临接矩阵
+ 无向无权图
+ 有向无权图
+ 无向有权图
+ 有向有权图
+ 高级算法
    + 连通图个数：https://leetcode-cn.com/problems/number-of-islands/
    + 拓扑排序（Topological Sorting）： https://zhuanlan.zhihu.com/p/34871092'
    + 最短路径（Shortest Path）：Dijkstra https://www.bilibili.com/video/av25829980?from=search&seid=13391343514095937158
    + 最小生成树（Minimum Spanning Tree）： https://www.bilibili.com/video/av84820276?from=search&seid=17476598104352152051