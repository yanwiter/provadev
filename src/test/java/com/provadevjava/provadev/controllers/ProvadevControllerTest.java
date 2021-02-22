package com.provadevjava.provadev.controllers;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.BDDMockito;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.provadevjava.provadev.services.ProvadevService;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc

public class ProvadevControllerTest {

	@Autowired
	private MockMvc mvc;

	@MockBean
	private ProvadevService provadev;

	private final static String URL_BASE = "/api/valor/";

	private static final String String = null;

	@Test
	public void testProvadev() throws Exception {

		BDDMockito.given(this.provadev.verificaParImpar(Mockito.anyInt())).willReturn(String);
		mvc.perform(MockMvcRequestBuilders.get(URL_BASE)).andExpect(MockMvcResultMatchers.status().isOk());
	}
}
