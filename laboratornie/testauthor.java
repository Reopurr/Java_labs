package laboratornie;

public class testauthor {
    public static void main(String args[]) {
        author ya = new author("Vitaliy", "kilerxxs@gmail.com", 'M');
        author ona = new author("Sonya","Sonya@gmail.com",'F');
        System.out.println(ya);
        System.out.println(ona.getGender());
        ya.setEmail("workvit2002@gmail.com");
        System.out.println(ya);
    }
}