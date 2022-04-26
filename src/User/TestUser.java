package User;

public class TestUser {
    public static void main(String[] args) {
        User dono = new User();
        //dono.username = "Dono"; //error tidak bisa secara langsung mengakses atribut
        dono.setUsername("Dono");
        dono.setPassword("12345");

        System.out.println("Info akun");
        System.out.println("---------------");
        System.out.println("Nama : " + dono.getUsername());
        System.out.println("Password : " + dono.getPassword());
    }
}
