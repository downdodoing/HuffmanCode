package cn;

public class Tree implements Comparable<Tree> {
	public Node node;

	public Tree() {

	}

	public Tree(int weight, char element) {
		node = new Node(weight, element);
	}

	public Tree(Tree t1, Tree t2) {
		node = new Node();
		node.leftChild = t1.node;
		node.rightChild = t2.node;
		node.weight = t1.node.weight + t2.node.weight;
	}

	@Override
	public int compareTo(Tree o) {
		// ��ǰtreeԪ�ص�Ȩ��ֵС�ڴ����tree��Ȩ��ֵ
		if (this.node.weight > o.node.weight) {
			return 1;
		} else if (this.node.weight < o.node.weight) {
			return -1;
		}
		return 0;
	}

}
