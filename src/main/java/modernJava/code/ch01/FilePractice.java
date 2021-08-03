package modernJava.code.ch01;

import java.io.File;
import java.util.Arrays;

public class FilePractice {
    public static void main(String[] args) {

        //        File[] hiddenFiles = new File("../../").listFiles(new FileFilter() {
        //            public boolean accept(File file) {
        //                return file.isHidden(); // 숨겨진 파일 필터링
        //            }
        //        });

        File[] hiddenFiles = new File("../../").listFiles(File::isHidden);

        assert hiddenFiles != null;
        Arrays.stream(hiddenFiles).forEach(file -> System.out.println(file.getName()));

    }
}
