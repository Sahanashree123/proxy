package proxy;
public class Client {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("photo1.jpg");
        Image image2 = new ProxyImage("photo2.jpg");

        // Image will be loaded from disk and displayed
        image1.display();

        // Image will not be loaded from disk again, only displayed
        image1.display();

        // Image will be loaded from disk and displayed
        image2.display();
    }
}