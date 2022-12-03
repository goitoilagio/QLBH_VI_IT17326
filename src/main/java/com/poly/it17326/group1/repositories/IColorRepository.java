/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.it17326.group1.repositories;

import com.poly.it17326.group1.domainmodel.Color;
import java.util.List;

/**
 *
 * @author goito
 */
public interface IColorRepository {

    List<Color> findAll();

    Color finById(Integer code);

    Color insertColor(Color color);

    Integer deleteColor(Integer code);
}
