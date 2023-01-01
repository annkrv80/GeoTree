import java.util.ArrayList;

public class GeoTree {
    
    private ArrayList<Node> tree=new ArrayList<>();

    public ArrayList<Node> getTree() {
        return tree;
    }

    public void appendDad(Person dad, Person children){
        tree.add(new Node(dad,Relationship.dad, children));
        tree.add(new Node(children,Relationship.children, dad));        
    }

    public void appendMother(Person mother, Person children){
        tree.add(new Node(mother,Relationship.mother,children));
        tree.add(new Node(children,Relationship.children, mother));
    }

    public void appendGranny(Person granny, Person grandchild){
        tree.add(new Node(granny,Relationship.granny, grandchild));
        tree.add(new Node(grandchild,Relationship.grandchild, granny));
    }

    public void appendGrandpa(Person grandpa, Person grandchild){
        tree.add(new Node(grandpa,Relationship.grandpa, grandchild));
        tree.add(new Node(grandchild,Relationship.grandchild,grandpa));
    }
    public void appendSpouse(Person wife, Person husband){
        tree.add(new Node(wife,Relationship.spouses, husband));
        tree.add(new Node(husband,Relationship.spouses,wife));
    }
    
    @Override
    public String toString() {
        
        return tree.toString();
    }
                                                                                               
}