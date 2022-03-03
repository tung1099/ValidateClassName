public class ClassNameTest {
    public static ClassName className;
    public static final String[] validateName = new String[]{"C1221H","P1234M","C12345it initH","#1234H"};

    public static void main(String[] args) {
        className = new ClassName();
        for (String name:validateName
             ) {
            boolean isValid = className.validate(name);
            if (isValid == true){
                System.out.println("Tên lớp: '" + name + '\'' + "hợp lệ!");
            } else {
                System.out.println("Tên lớp: '" + name + '\'' + "không hợp lệ...");
            }
        }
    }
}
