
public class TestCourse {
    public static void main(String[] args) {
        Course video , text;
        video = new VideoCourse();
        text = new TextCourse();
        System.out.println("==========================");
        System.out.println("-------Text Course -------");
        System.out.println("enroll : "+text.enroll());
        System.out.println("unenroll : "+text.unenroll());
        System.out.println("getProgress : "+text.getProgress());
        System.out.println("-------Text Course -------");
        System.out.println("enroll : "+video.enroll());
        System.out.println("unenroll : "+video.unenroll());
        System.out.println("getProgress : "+video.getProgress());
        System.out.println("==========================");
    }
}