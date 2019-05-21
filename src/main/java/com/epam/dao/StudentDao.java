package com.epam.dao;

import com.epam.db.DBCPDataSource;
import com.epam.model.Student;

import java.sql.Connection;

public class StudentDao {

    public Student findAll(){
        try(Connection connection = DBCPDataSource.getConnection()
        ) {

        }catch (Exception e){

        }
        return null;
    }
}
