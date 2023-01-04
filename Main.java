public class Main {
    public static void main(String[] args) {
        Person irina = new Person("Ирина Петрова", 30);
        Person vasya = new Person("Василий Петров", 33);
        Person masha = new Person("Маша Петрова", 8);
        Person lena = new Person("Елена Кошкина", 55);
        Person ivan = new Person("Иван Кошкин", 57);
        Person olga = new Person("Ольга Петрова", 60);
        Person sergey = new Person("Сергей Петров", 62);

        GeoTree gt = new GeoTree();
        gt.append(irina, masha, Relationship.mother, Relationship.children);;
        gt.append(vasya, masha, Relationship.dad, Relationship.children);
        gt.append(lena, masha,Relationship.granny, Relationship.grandchild);
        gt.append(ivan, masha,Relationship.grandpa,Relationship.grandchild);
        gt.append(olga, masha, Relationship.granny, Relationship.grandchild);
        gt.append(sergey, masha,Relationship.grandpa, Relationship.grandchild);
        gt.append(lena, irina, Relationship.mother, Relationship.children);
        gt.append(ivan, irina, Relationship.dad, Relationship.children);
        gt.append(olga, vasya, Relationship.mother, Relationship.children);
        gt.append(sergey, vasya, Relationship.dad, Relationship.children);
        gt.append(olga, sergey, Relationship.spouses, Relationship.spouses);
        gt.append(lena, ivan, Relationship.spouses, Relationship.spouses);
        gt.append(irina, vasya, Relationship.spouses, Relationship.spouses);

        System.out.println(new Reserch(gt).spend(masha,
                Relationship.children));

        new Reserch(gt).whoIsOlder(olga);

        System.out.println(new Reserch(gt).degreeOfrelatioship(Relationship.spouses));
    }

}
