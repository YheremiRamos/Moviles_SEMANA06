package com.example.moviles_semana06.service;

import com.example.moviles_semana06.entity.Categoria;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ServiceCategoriaLibro {

    @GET("servicio/util/listaCategoriaDeLibro")
    public Call<List<Categoria>> listaTodos();


}
