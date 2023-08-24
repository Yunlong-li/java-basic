//package org.example;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpEntity;
//import org.springframework.http.HttpHeaders;
//import org.springframework.http.HttpMethod;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.client.RestTemplate;
//
//import java.io.File;
//import java.io.FileOutputStream;
//import java.io.IOException;
//
///**
// * @author 刘伟
// * @program: test
// * @description:
// * @date 2023-04-25 15:20:54
// */
//public class test1 {
//
//
//    public static void main(String[] args) {
//        HttpHeaders headers = new HttpHeaders();
//        headers.add("Content-Type", "application/json");
//        String jsonString = "{\"timeStamp\":\"1678864850526\",\"file\":\"YWJjZA==\",\"data\":\"04bd383f0adaa7256931bac91b727b06048b50253522243bed0d018370d2135c315196fd568957fa57617b657385b70a4efbf3c0fb1ffa9cb7eef4c0d3ae3e584b5fc8cc0272d5ecc9a62cb1560ece6387222bae7d3d70879f37e0a934fcb824dd1e0485e502061cd421a71fa88c2bc1dbf46ee5d600a19f93c83bb1a03d9cacdbba7c3d0f4bcc872f267f8cfb09df148c56bd8d77f84535a017a3f3f8a25bcc9e1bac4f597444e64961c5d1e27e7b8ecd52ec507012f85dd860f21156ca14adeb531cdd96dca98d1afb046a0ad21ebc65f35b0495caf45fda4c54fef596985544b4ac2f28b54add21b951c89312ed238abd14df2009163f68074a4e284848cad83084b68bc3879130b5902516c2ada352160cee94c753433d8dd80e03e06081cbc9db17ddaefa690782a0c94b4277148555b79832bba5c63e6ba8e89bfd1552a3\",\"encrypt\":\"1\",\"sign\":\"MEQCICr+3ASlBCfu1XlLB/cr1rSaqCoNvUlFdioWcgerULqjAiBlE2MAIwPDTxIXpKlR85WUQGB4rwZGwbjPniOKMf0Ynw==\",\"nonceStr\":\"7je2i7t833\"}\n";
//        HttpEntity<String> entity = new HttpEntity<>(jsonString, headers);
//
//        ResponseEntity<byte[]> exchange = restTemplate.exchange("http://10.21.14.65/afrsserver/v2/credit/report", HttpMethod.POST, entity, byte[].class);
//        byte[] body = exchange.getBody();
//        File file = new File("response.pdf");
//        try {
//            if (!file.exists()) {
//
//                file.createNewFile();
//
//            }
//            FileOutputStream outputStream = new FileOutputStream(file);
//            outputStream.write(body, 0, body.length);
//            outputStream.flush();
//            outputStream.close();
//        } catch (IOException e) {
//
//            e.printStackTrace();
//        }
//    }
//}
