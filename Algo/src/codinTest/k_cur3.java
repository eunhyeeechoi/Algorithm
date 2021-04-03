package codinTest;


import java.util.LinkedList;

public class k_cur3 {
    public int[] solution(int n, int[] passenger, int[][] train) {
        int[] answer = {};
        Grapch g = new Grapch(n);
        for(int i=0; i<train.length;i++){
            int st = train[i][0];
            int end = train[i][1];
            g.addEdge(st,end); // 모든 다리 연결
        }
        return answer;
    }

    class Grapch {
        class Node{
            int data;
            LinkedList<Node> adjacent; //인접한 데이터
            boolean marked; // 방문여부

            Node( int data){
            this.data = data;
            this.marked = false;
            adjacent = new LinkedList<Node>();
        }
        }

        Node[] nodes;
        Grapch(int size){
            nodes = new Node[size];
            for(int i =0; i<size;i++){
                nodes[i] = new Node(i);
            }
        }
        void addEdge(int i1, int i2){
            Node n1 = nodes[i1];
            Node n2 = nodes[i2];

            if(!n1.adjacent.contains(n2)){
                n1.adjacent.add(n2);
            }
            if(!n2.adjacent.contains(n1)){
                n2.adjacent.add(n1);
            }
        }
    }


    public static void main(String[] args) {
        k_cur3 aa = new k_cur3();
        int n = 6;
        int passenger[] = {1, 1, 1, 1, 1, 1};
        int[][] train = {{1, 2}, {1, 3}, {1, 4}, {3, 5}, {3, 6}};
        aa.solution(n, passenger, train);
    }
}
