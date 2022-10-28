
public class CatHouse {
    private Cat cat1;
    private Cat cat2;
    private String owner;

    public CatHouse(Cat cat1, Cat cat2, String owner) {
        this.cat1 = cat1;
        this.cat2 = cat2;
        this.owner = owner;
    }

    public void rollCall() {
        if (cat1.getAge() == cat2.getAge()){
            String cat1Name = cat1.getName();
            String cat2Name = cat2.getName();
            if (cat1Name.compareTo(cat2Name) <= 0){
                cat1.introduce();
                cat2.introduce();
            } else {
                cat2.introduce();
                cat1.introduce();
            }
        } else if (cat1.getAge() > cat2.getAge()) {
            cat1.introduce();
            cat2.introduce();
        } else {
            cat2.introduce();
            cat1.introduce();
        }
    }

    public void catNoise() {
        System.out.println(cat1.speak());
        System.out.println(cat2.speak());
    }

    // MODIFY this so that it returns a string with each Cat's AGE next to its name
    // e.g. Cat 1's Name: Petunia, Age: 3
    public String houseInfo() {
        String str = "Welcome to " + owner + "'s Cat House!\n";
        str += "Cat 1's Name: " + cat1.getName() + ", Age: " + cat1.getAge() + "\n";
        str += "Cat 2's Name: " + cat2.getName() + ", Age: " + cat2.getAge();
        return str;
    }
}