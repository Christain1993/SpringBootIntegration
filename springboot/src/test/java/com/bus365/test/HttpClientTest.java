package com.bus365.test;

import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.apache.http.ParseException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.util.EntityUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bus365.root.RootController;
import com.fasterxml.jackson.databind.ObjectMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@ContextConfiguration(
classes=RootController.class)	
public class HttpClientTest {
	@Autowired
	private CloseableHttpClient client; 
	
	@Autowired
	private HttpClientBuilder clientbuilder; 
	
	@Autowired
	private ObjectMapper objectMapper;
	
	@Autowired
	private PoolingHttpClientConnectionManager manager;
	
	@Test
	public void test1() throws InterruptedException, ClientProtocolException, IOException {
		final String[] urisToGet = {
                "https://blog.csdn.net/weixin_38413579/article/details/82722321",
                "https://blog.csdn.net/weixin_38413579/article/details/82722321",
                "https://blog.csdn.net/weixin_38413579/article/details/82722321",
                "https://blog.csdn.net/weixin_38413579/article/details/82722321",
                "https://blog.csdn.net/weixin_38413579/article/details/82722321",
                "https://blog.csdn.net/weixin_38413579/article/details/82722321",
                "https://blog.csdn.net/weixin_38413579/article/details/82722321",
                "https://blog.csdn.net/weixin_38413579/article/details/82722321",
                "https://blog.csdn.net/weixin_38413579/article/details/82722321",
                "https://blog.csdn.net/weixin_38413579/article/details/82722321",
                "https://blog.csdn.net/weixin_38413579/article/details/82722321",
                "https://blog.csdn.net/weixin_38413579/article/details/82722321" };
		
		
		ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
		
		for (int i = 0; i <urisToGet.length; i++) {
			Thread.currentThread().sleep(1000L);
			newCachedThreadPool.execute(new Runnable() {
				
				@Override
				public void run() {
					while(true) {
						try {
							CloseableHttpClient build = clientbuilder.build();
							CloseableHttpResponse execute = client.execute(new HttpGet(urisToGet[0]));
							System.out.println(manager.getRoutes());
							String string = EntityUtils.toString(execute.getEntity(), "utf-8");
//						System.out.println(string);
							EntityUtils.consume(execute.getEntity());
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
			});
			
			
		}
	}
	
}
