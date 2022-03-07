package 常见的异常举例.运行时异常RunTimeException;

import java.util.Scanner;

/**
 * @author 温黎明
 * @version 1.0
 * @date 2022/3/7 15:02
 */
public class InputMismatchExceptionTest {

    //输入类型不匹配异常  InputMismatchException
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextInt();

    }
}
