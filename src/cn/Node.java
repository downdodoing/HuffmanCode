package cn;

public class Node {
	public char element;
	public Node leftChild;
	public Node rightChild;
	public String code = "";// 用于存储huffman编码
	public int weight;// 元素的权重值

	public Node() {

	}

	public Node(int weight, char element) {
		this.weight = weight;
		this.element = element;
	}
}
