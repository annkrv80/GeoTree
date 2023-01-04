import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Reserch {
    ArrayList<String> result = new ArrayList<>();
    Set<String> res = new HashSet<>();
    ArrayList<Node> tree;

    public Reserch(GeoTree geoTree) {
        tree = geoTree.getTree();
    }

    public ArrayList<String> spend(Person p, Relationship re) {
        for (Node t : tree) {
            if (t.p1.fullName == p.fullName && t.re == re) {
                result.add(t.p2.fullName);
            }
        }
        return result;
    }

    public void whoIsOlder(Person p) {
        for (Node t : tree) {
            if (t.p1.getAge() > p.getAge()) {
                res.add(t.p1.fullName);
            }
        }
        System.out.println(res);
    }

    public Set<String> degreeOfrelatioship(Relationship re) {
        for (Node t : tree) {
            if (t.re == re) {
                res.add(t.p1.fullName);
                
            }
        }
        return res;
    }

}
