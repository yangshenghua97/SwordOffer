package com.nowcoder.offer.problem5;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import com.nowcoder.offer.node.ListNode;

/**
 * 从尾到头打印单链表
 * @author hztaoran
 *
 */
public class ReversePrintNode {

    // 使用栈
	public List<ListNode> print(ListNode head) {
		List<ListNode> list = new ArrayList<>();
		if (null == head) {
			return null;
		}
		Stack<ListNode> stack = new Stack<>();
		while (null != head) {
			stack.push(head);
			head = head.next;
		}
		while (!stack.isEmpty()) {
			list.add(stack.pop());
		}
		return list;
	}

    // 递归的方式
    public List<ListNode> print2(ListNode head) {
        List<ListNode> list = new ArrayList<>();
        if (null == head) {
            return null;
        }
        printRecursively(head, list);

        return list;
    }

    private void printRecursively(ListNode head, List<ListNode> list) {
        if (null != head) {
            if (null != head.next) {
                printRecursively(head.next, list);
            }
            list.add(head);
        }
    }
}
