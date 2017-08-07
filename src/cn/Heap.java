package cn;

import java.util.ArrayList;

public class Heap<E> {
	private ArrayList<E> list = new ArrayList<>();

	// ɾ�������ضѶ�����Ԫ��
	public E remove() {
		return list.remove(getSize() - 1);
	}

	// ��ȡ�Ѷ���Ԫ��
	public E pop() {
		return list.get(getSize() - 1);
	}

	// ����Ԫ����ӽ��ѣ�����Ԫ�ؽ�����С���������
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
