package Chap_01;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import javafx.scene.chart.BubbleChart;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class IO_and_Operation {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello, world!");

        // BufferedReader
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine(); // Enter 단위로 입력받기
        int i = Integer.parseInt(bf.readLine()); // 정수 입력 형변환 하기
        String arr[] = str.split(" "); // Space 단위로 입력받기
    }
}
