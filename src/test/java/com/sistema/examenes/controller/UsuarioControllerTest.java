package com.sistema.examenes.controller;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.sistema.examenes.modelo.Usuario;
import com.sistema.examenes.servicios.UsuarioService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;


public class UsuarioControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private UsuarioService usuarioService;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    void guardarUsuario() throws Exception{

        //given
        Usuario usuario = Usuario.builder()
                .id(1L)
                .username("manuel")
                .password("12345")
                .nombre("Manuel")
                .apellido("Rodríguez")
                .email("mr@gmail.com")
                .telefono(978345678)
                .enabled(true)
                .perfil("Admin")
                .build();
    }

    @Test
    void obtenerUsuario() throws Exception{

        //Given

        //When

        //Then
    }

    @Test
    void eliminarUsuario() throws Exception{

    }







}
