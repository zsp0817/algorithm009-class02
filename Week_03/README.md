## 递归
+ 实现的代码模板
```
public void resur(int level, int param) {
    1、递归终止条件
    if (level > MAX_LEVEL) return; 
    
    2、当前层逻辑
    process(level, param);
    
    3、进入下一层
    resur(level+1, param);
    
    4、清理（可选）
}
```
+ 思维要点
    + 不要人肉进行递归
    + 找到最近最简方法，将其拆解为可重复解决的问题（最近重复子问题）
    + 数学归纳法思维

## 分治Divide & Conquer

## 回溯Backtracking