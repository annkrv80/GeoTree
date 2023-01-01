public class Main {
    public static void main(String[] args) {
        Person irina = new Person("Ирина Петрова",30);
        Person vasya = new Person("Василий Петров",33);
        Person masha = new Person("Маша Петрова",8);
        Person lena = new Person("Елена Кошкина",55);
        Person ivan = new Person("Иван Кошкин",57);
        Person olga=new Person("Ольга Петрова",60);
        Person sergey=new Person("Сергей Петров",62);

        GeoTree gt = new GeoTree();
        gt.appendMother(irina, masha);
        gt.appendDad(vasya, masha);
        gt.appendGranny(lena, masha);
        gt.appendGrandpa(ivan, masha);
        gt.appendGranny(olga, masha);
        gt.appendGrandpa(sergey, masha);
        gt.appendMother(lena, irina);
        gt.appendDad(ivan, irina);
        gt.appendMother(olga, vasya);
        gt.appendDad(sergey, vasya);
        gt.appendSpouse(olga, sergey);
        gt.appendSpouse(lena, ivan);
        gt.appendSpouse(irina, vasya);

        System.out.println(new Reserch(gt).spend(irina,
                Relationship.mother));

        new Reserch(gt).whoIsOlder(ivan);

        System.out.println(new Reserch(gt).degreeOfrelatioship(Relationship.granny));
    }
    
}
