package cn;

public class Node {
	public char element;
	public Node leftChild;
	public Node rightChild;
	public String code = "";// ���ڴ洢huffman����
	public int weight;// Ԫ�ص�Ȩ��ֵ

	public Node() {

	}

	public Node(int weight, char element) {
		this.weight = weight;
		this.element = element;
	}
}
