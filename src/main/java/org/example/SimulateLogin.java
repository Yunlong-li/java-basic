package org.example;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * @author 刘伟
 * @program: java-basic
 * @description: 模拟验证登录
 * @date 2023-08-25 16:04:54
 */
public class SimulateLogin {
    public static void main(String[] args) throws IOException {
        String loginUrl = "http://127.0.0.1:8099/login"; // 替换为实际的登录URL
        String username = "your_username"; // 替换为实际的用户名
        String password = "your_password"; // 替换为实际的密码

        // 构建登录请求
        String loginData = "username=" + username + "&password=" + password; // 根据实际的登录参数构建请求体
        HttpURLConnection loginConnection = (HttpURLConnection) new URL(loginUrl).openConnection();
        loginConnection.setRequestMethod("POST");
        loginConnection.setDoOutput(true);
        loginConnection.getOutputStream().write(loginData.getBytes());

        // 获取登录响应的 Set-Cookie 头部中的 JSESSIONID
        String jsessionId = null;
        if (loginConnection.getResponseCode() == HttpURLConnection.HTTP_OK) {
            String setCookieHeader = loginConnection.getHeaderField("Set-Cookie");
            if (setCookieHeader != null) {
                String[] cookies = setCookieHeader.split(";");
                for (String cookie : cookies) {
                    if (cookie.contains("JSESSIONID")) {
                        jsessionId = cookie.split("=")[1];
                        break;
                    }
                }
            }
        }
        if(jsessionId!=null){
            System.out.println(jsessionId);
        }

        if (jsessionId != null) {
            System.out.println("JSESSIONID: " + jsessionId);

            // 使用获取到的 JSESSIONID 发起后续请求
            String apiUrl = "http://127.0.0.1:8099/test/saveFile"; // 替换为实际的接口URL
            HttpURLConnection apiConnection = (HttpURLConnection) new URL(apiUrl).openConnection();
            apiConnection.setRequestMethod("POST");
            apiConnection.setRequestProperty("Cookie", "JSESSIONID=" + jsessionId);

            // 继续后续操作...
        } else {
            System.out.println("Login failed.");
        }

        loginConnection.disconnect();
    }
}
