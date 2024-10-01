public class App {
    public static void main(String[] args){
        DbConnectionImpl connection = new DbConnectionImpl() ;

        connection.insert(new User("user","1234"));
        connection.insert(new User("user1","dhghvkj"));
        connection.insert(new User("user2","4387548"));
        connection.insert(new User("user3","fdoo589"));
        connection.select();



        /*EncryptionPass pass = new EncryptionPass();
        var password = "12345";
        var encrypt = pass.encrypt(password);
        System.out.println("Encrypt pass - " + encrypt);
        System.out.println("Decrypt pass - "+  pass.decrypt(encrypt));*/

    }
}