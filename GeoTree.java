import java.util.ArrayList;

public class GeoTree {

    private ArrayList<Node> tree = new ArrayList<>();

    public ArrayList<Node> getTree() {
        return tree;
    }

    public void append(Person p1, Person p2, Relationship r1, Relationship r2) {
        tree.add(new Node(p1, r1, p2));
        tree.add(new Node(p2, r2, p1));
    }

    
}