package br.com.alura.loja.http;

import java.io.IOException;
import java.util.Map;

public interface HttpAdapter {

	void post(String url, Map<String, Object> dados);
}
