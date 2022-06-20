package com.example.demo.controller;

import static org.junit.Assert.assertFalse;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import com.example.demo.entity.Policies;
import com.example.demo.service.PoliciesService;

@SpringBootTest
public class PoliciesRestControllerTest {

	@InjectMocks 
	private PoliciesRestController policiesRestController;

	
	@Mock
	private PoliciesService policiesService;

	
	
	@Test
	@DisplayName("Se comprueba que el servicio retorna datos")
	void comprobacionRestController() {
		
		List<Policies> listaPolizas= new ArrayList<Policies>();
		
		Policies poliza1= new Policies("poliza1", "11111", "v1", "01/01/1980");
		Policies poliza2= new Policies("poliza2", "22222", "v1", "01/01/1980");
		Policies poliza3= new Policies("poliza3", "33333", "v1", "01/01/1980");

		listaPolizas.add(poliza1);
		listaPolizas.add(poliza2);
		listaPolizas.add(poliza3);
   
        Mockito.when(policiesService.findAll()).thenReturn(listaPolizas);
        
        assertFalse(policiesRestController.findAll().isEmpty());
        
        verify(policiesService,times(1)).findAll();
        

	}

	
}
