package cn;

import java.util.ArrayList;

public class Heap<E> {
	private ArrayList<E> list = new ArrayList<>();

	// 删除并返回堆顶部的元素
	public E remove() {
		return list.remove(getSize() - 1);
	}

	// 获取堆顶的元素
	public E pop() {
		return list.get(getSize() - 1);
	}

	// 将新元素添加进堆，并对元素进行重小到大的排序
	public void add(E e) {
		if (getSize() == 0) {
			list.add(e);
			return;
		}
		int i = 0;
		for (; i < getSize(); i++) {
			if (((Tree) list.get(i)).compareTo((Tree) e) < 0) {
				list.add(i, e);
				break;
			}
		}
		if (i == getSize()) {
			list.add(e);
		}
	}

	public int getSize() {
		return list.size();
	}
}
