package cn;

public class HUffmanCode {

	// 获取输入的text中字符出现的次数
	public static int[] getCount(String text) {
		int[] count = new int[256];
		int length = text.length();

		for (int i = 0; i < length; i++) {
			count[(int) text.charAt(i)]++;
		}
		return count;
	}

	// 获取Huffman编码树
	public static Tree getHuffmanTree(int[] count) {
		int length = count.length;
		Heap<Tree> heap = new Heap<>();

		for (int i = 0; i < length; i++) {
			if (count[i] > 0) {
				heap.add(new Tree(count[i], (char) i));
			}
		}

		while (heap.getSize() > 1) {
			Tree t1 = heap.remove();
			Tree t2 = heap.remove();
			Tree tree = new Tree(t1, t2);
			heap.add(tree);
		}
		return heap.remove();
	}

	public static String[] getCodes(Node node) {
		if (null == node)
			return null;
		String[] codes = new String[2 * 128];
		assignCode(node, codes);

		return codes;
	}

	public static void assignCode(Node node, String[] codes) {
		if (null == node.leftChild) {
			node.leftChild.code = node.code + "0";
			assignCode(node.leftChild, codes);

			node.rightChild.code = node.code + "1";
			assignCode(node.rightChild, codes);
		} else {
			codes[(int) node.element] = node.code;
		}
	}

	public static void main(String[] args) {
		String text = "welcome";

		int[] count = getCount(text);
		Tree tree = getHuffmanTree(count);
		String[] codes = getCodes(tree.node);
	}
}
