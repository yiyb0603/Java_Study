class Node {
    /* 하나의 점을 의미하는 Node 클래스를 만들고, Node 클래스를 이용하여 두 점사이의 중점을 구하기. */
    private int x;
    private int y;

    public Node(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Node getCenter(Node other) {
        return new Node((this.x + other.getX()) / 2, (this.y + other.getY()) / 2);
    }
}

public class ClassExample1 {
    public static void main(String[] args) {
        Node one = new Node(10, 20);
        Node two = new Node(30, 40);
        Node result = one.getCenter(two);
        System.out.println("x : " + result.getX() + ", y : " + result.getY());
    }
}
