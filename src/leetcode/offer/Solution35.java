package leetcode.offer;

import leetcode.common.list.Node;

import java.util.HashMap;

/**
 * 复制链表，用map记录<旧的node, 新的node>的映射关系
 */
public class Solution35 {
    public Node copyRandomList(Node head) {
        HashMap<Node, Node> map = new HashMap<>();
        Node index = head;
        while(index!=null){
            Node newNode = new Node(index.val);
            map.put(index, newNode);
            index = index.next;
        }
        Node index2 = head;
        while(index2!=null){
            Node newNode = map.get(index2);
            newNode.next=map.get(index2.next);
            newNode.random=map.get(index2.random);
            index2 = index2.next;
        }
        return map.get(head);
    }
}
